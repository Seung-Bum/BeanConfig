package com.mono.lesson1.config;

import com.mono.lesson1.LessonApplication;
import org.springframework.context.annotation.ComponentScan;

// 서비스 리파지토리 컨트롤러 @ 다찾는다.
// 다른 폴더는 안뒤짐 하위 혹은 간은 공간에 둬야함
@ComponentScan(basePackageClasses = LessonApplication.class)
public class ApplicationConfig3 {

}
