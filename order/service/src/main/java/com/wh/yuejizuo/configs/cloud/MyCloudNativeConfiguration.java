//package com.wh.yuejizuo.configs.cloud;
//
//import com.wh.yuejizuo.configs.Config;
//import org.springframework.aot.hint.MemberCategory;
//import org.springframework.aot.hint.RuntimeHints;
//import org.springframework.aot.hint.RuntimeHintsRegistrar;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.ImportRuntimeHints;
//
//@Configuration(proxyBeanMethods = false)
//@ImportRuntimeHints(MyCloudNativeConfiguration.MyCloudNativeRuntimeHints.class)
//public class MyCloudNativeConfiguration {
//
//    public class MyCloudNativeRuntimeHints implements RuntimeHintsRegistrar {
//        @Override
//        public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
//            // Register the classes and methods for reflection
//            hints.reflection().registerType(Config.class,
//                    hint -> hint.withMembers(
//                            MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
//                            MemberCategory.INVOKE_DECLARED_METHODS,
//                            MemberCategory.DECLARED_FIELDS
//                    ));
//        }
//    }
//
//
//
////    static class MyCloudBeanFactoryInitializationAotProcessor
////            implements BeanFactoryInitializationAotProcessor, BeanRegistrationExcludeFilter {
////
////        private final Set<Class<?>> excludeClasses = new HashSet<>();
////
////        MyCloudBeanFactoryInitializationAotProcessor() {
////            excludeClasses.add(MapperScannerConfigurer.class);
////        }
////
////        @Override
////        public boolean isExcludedFromAotProcessing(RegisteredBean registeredBean) {
////            return excludeClasses.contains(registeredBean.getBeanClass());
////        }
////
////        @Override
////        public BeanFactoryInitializationAotContribution processAheadOfTime(ConfigurableListableBeanFactory beanFactory) {
////            String[] beanNames = beanFactory.getBeanNamesForType(MapperFactoryBean.class);
////            if (beanNames.length == 0) {
////                return null;
////            }
////            return (context, code) -> {
////                RuntimeHints hints = context.getRuntimeHints();
////                for (String beanName : beanNames) {
////                    BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName.substring(1));
////                    PropertyValue mapperInterface = beanDefinition.getPropertyValues().getPropertyValue("mapperInterface");
////                    if (mapperInterface != null && mapperInterface.getValue() != null) {
////                        Class<?> mapperInterfaceType = (Class<?>) mapperInterface.getValue();
////                        if (mapperInterfaceType != null) {
////                            registerReflectionTypeIfNecessary(mapperInterfaceType, hints);
////                            hints.proxies().registerJdkProxy(mapperInterfaceType);
////                            hints.resources()
////                                    .registerPattern(mapperInterfaceType.getName().replace('.', '/').concat(".xml"));
////                            registerMapperRelationships(mapperInterfaceType, hints);
////                        }
////                    }
////                }
////            };
////        }
////
////        private void registerMapperRelationships(Class<?> mapperInterfaceType, RuntimeHints hints) {
////            Method[] methods = ReflectionUtils.getAllDeclaredMethods(mapperInterfaceType);
////            for (Method method : methods) {
////                if (method.getDeclaringClass() != Object.class) {
////                    ReflectionUtils.makeAccessible(method);
////                    registerSqlProviderTypes(method, hints, SelectProvider.class, SelectProvider::value, SelectProvider::type);
////                    registerSqlProviderTypes(method, hints, InsertProvider.class, InsertProvider::value, InsertProvider::type);
////                    registerSqlProviderTypes(method, hints, UpdateProvider.class, UpdateProvider::value, UpdateProvider::type);
////                    registerSqlProviderTypes(method, hints, DeleteProvider.class, DeleteProvider::value, DeleteProvider::type);
////                    Class<?> returnType = MyBatisNativeConfiguration.MyBatisMapperTypeUtils.resolveReturnClass(mapperInterfaceType, method);
////                    registerReflectionTypeIfNecessary(returnType, hints);
////                    MyBatisNativeConfiguration.MyBatisMapperTypeUtils.resolveParameterClasses(mapperInterfaceType, method)
////                            .forEach(x -> registerReflectionTypeIfNecessary(x, hints));
////                }
////            }
////        }
////
////        @SafeVarargs
////        private <T extends Annotation> void registerSqlProviderTypes(
////                Method method, RuntimeHints hints, Class<T> annotationType, Function<T, Class<?>>... providerTypeResolvers) {
////            for (T annotation : method.getAnnotationsByType(annotationType)) {
////                for (Function<T, Class<?>> providerTypeResolver : providerTypeResolvers) {
////                    registerReflectionTypeIfNecessary(providerTypeResolver.apply(annotation), hints);
////                }
////            }
////        }
////
////        private void registerReflectionTypeIfNecessary(Class<?> type, RuntimeHints hints) {
////            if (!type.isPrimitive() && !type.getName().startsWith("java")) {
////                hints.reflection().registerType(type, MemberCategory.values());
////            }
////        }
////
////    }
//}
