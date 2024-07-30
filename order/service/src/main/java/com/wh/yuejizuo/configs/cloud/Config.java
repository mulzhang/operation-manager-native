//package com.wh.yuejizuo.configs.cloud;
//
//import org.springframework.aot.hint.MemberCategory;
//import org.springframework.aot.hint.RuntimeHints;
//import org.springframework.aot.hint.RuntimeHintsRegistrar;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.ImportRuntimeHints;
//
//@Configuration(proxyBeanMethods = false)
//@ImportRuntimeHints(Config.MyCloudNativeRuntimeHints.class)
//public class Config {
//
//    @Value("${name}")
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static class MyCloudNativeRuntimeHints implements RuntimeHintsRegistrar {
//        @Override
//        public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
//            hints.reflection().registerType(Config.class,
//                    hint -> hint.withMembers(
//                            MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
//                            MemberCategory.INVOKE_DECLARED_METHODS,
//                            MemberCategory.DECLARED_FIELDS
//                    ));
//        }
//    }
//}
