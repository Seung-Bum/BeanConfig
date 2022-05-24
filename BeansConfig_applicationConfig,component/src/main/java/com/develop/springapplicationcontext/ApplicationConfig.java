package com.develop.springapplicationcontext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.develop.springapplicationcontext")
@ComponentScan(basePackageClasses = ApplicationConfig.class)    // 위에 보다 더 type safe한 방법
public class ApplicationConfig {
}

//        Java 설정 파일 클래스에 @ComponentScan 애노테이션을 붙인다.
//        Scan을 시작하는 패키지를 지정하는 방법으로 basePackages와 basePackagesClasses의 두 가지 속성을 사용할 수 있는데
//        basePackages에는 패키지 이름을 문자열로, basePackagesClasses에는 scan을 시작할 위치의 클래스를 지정한다.
//        basePackagesClasses가 더 type safe한 방법이다.
//        다시 BookService와 BookRepository에 @Service, @Repository 애노테이션을 붙여준다.
//        이렇게 설정해주면 XML 설정 파일에서 <context:component-scan...>을 설정한 것과 동일하게 동작한다.



