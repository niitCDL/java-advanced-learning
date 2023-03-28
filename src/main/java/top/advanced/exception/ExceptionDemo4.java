package top.advanced.exception;

public class ExceptionDemo4 {
    static class MyCustomException extends RuntimeException {
        /**
         * 无参构造方法
         */
        public MyCustomException() {
            super("我的自定义异常");
        }
    }

    public static void main(String[] args) {
        // 直接抛出异常
        throw new MyCustomException();
    }
}
