package top.advanced.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Repeatable(Roles.class)
public @interface Role {
    String value() default "";
}

@Target(ElementType.TYPE)
@interface Roles {
    Role[] value();
}

@Role("学生")
@Role("生活委员")
class Student {

}