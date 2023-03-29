package top.advanced.function;

public class Test {
    public static void main(String[] args) {
        // 使用匿名内部类方式创建函数式接口
        FunctionalInterfaceDemo functionalInterfaceDemo = new FunctionalInterfaceDemo() {
            @Override
            public void run() {
                System.out.println("匿名内部类方式创建函数式接口");
            }
        };
        functionalInterfaceDemo.run();
    }
}
