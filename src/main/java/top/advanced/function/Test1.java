package top.advanced.function;

public class Test1 {
    public static void main(String[] args) {
        // 使用 Lambda 表达式方式创建函数式接口
        FunctionalInterfaceDemo functionalInterfaceDemo = () -> System.out.println("Lambda 表达式方式创建函数式接口");
        functionalInterfaceDemo.run();
    }
}
