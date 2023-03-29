package top.advanced.reflection;

import java.lang.reflect.Method;

public class ReflectionDemo1 {
    public static void main(String[] args) throws Exception{
        // 实例化字符串对象
        String name = "Colorful";
        // 获取 method 对象
        Method method = String.class.getMethod("replace", CharSequence.class, CharSequence.class);
        // 调用 invoke() 执行方法
        String result = (String) method.invoke(name, "ful", "");
        System.out.println(result);
    }
}
