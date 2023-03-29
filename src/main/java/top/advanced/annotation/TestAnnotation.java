package top.advanced.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

//定义子类是否可继承父类定义的注解 元注解就是用于修饰其他注解的注解。
@Inherited
@Target(ElementType.TYPE)
public @interface TestAnnotation {
    String value() default "test";
}
