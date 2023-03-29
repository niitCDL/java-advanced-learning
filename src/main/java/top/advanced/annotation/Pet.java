package top.advanced.annotation;

@TestAnnotation("测试注解")
public class Pet {
}

//子类默认也定义了该注解：
class Cat extends Pet {

}
