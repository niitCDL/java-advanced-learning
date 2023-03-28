package top.advanced.string;

public class StringDemo5 {
    private static void testApi1(){
        String str1 = "I love Java";

        //* (\\*)  ^ (\\^) : (\\:) | (\\|) . (\\.) \ (\\\\)需要用转义字符
        System.out.println("以空格切割");
        String[] strArr1 = str1.split(" ");
        for (String str : strArr1) {
            System.out.print(str + '\t');
        }

        System.out.println("\n" + "以*切割");
        String str2 = "I*love*Java";
        String[] strArr2 = str2.split("\\*");
        for (String str : strArr2) {
            System.out.print(str + '\t');
        }

        System.out.println("\n" + "以\\切割");
        String str3 = "I\\love\\Java";
        // \字符后面的就是转义的字符
        String[] strArr3 = str3.split("\\\\");
        for (String str : strArr3) {
            System.out.print(str + '\t');
        }

        System.out.println("\n" + "以|切割");
        String str4 = "I|love|Java";
        String[] strArr4 = str4.split("\\|");
        for (String str : strArr4) {
            System.out.print(str + '\t');
        }

        System.out.println("\n" + "以.切割");
        String str5 = "I.love.Java";
        String[] strArr5 = str5.split("\\.");
        for (String str : strArr5) {
            System.out.print(str + '\t');
        }
    }

    private static void testApi2(){
        String str = "我喜欢Java";
        System.out.println("将字符串转换为byte数组：");
        // 将字符串转换为字节数组
        byte[] ascii = str.getBytes();
        // 遍历字节数组，打印每个元素
        for (byte aByte : ascii) {
            System.out.print(aByte + "\t");
        }
        // 此处的ascii为上面通过字符串转换的字节数组
        String s = new String(ascii);
        System.out.print("\n" + s);
    }

    public static void main(String[] args) {
//        testApi1();
        testApi2();
    }
}
