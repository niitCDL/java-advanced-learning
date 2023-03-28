package top.advanced.enums;

/**
 * @description EnumDemo1:Java 5.0 之前自定义枚举类
 **/
public class EnumDemo1 {
    /**
     * 性别枚举类
     */
    static class Gender {

        // 定义常量
        private final String gender;

        // 私有化构造器，不提供外部实例化
        private Gender(String gender) {
            // 在构造器中为属性赋值
            this.gender = gender;
        }

        public static final Gender MALE = new Gender("男");
        public static final Gender FEMALE = new Gender("女");
        public static final Gender UNKNOWN = new Gender("保密");

        /**
         * getter
         */
        public String getGender() {
            return gender;
        }

        /**
         * 重写toString方法，方便外部打印调试
         */
        @Override
        public String toString() {
            return "Gender{" + "gender='" + gender + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(Gender.FEMALE.getGender());
        System.out.println(Gender.MALE.getGender());
        System.out.println(Gender.UNKNOWN.getGender());
    }
}
