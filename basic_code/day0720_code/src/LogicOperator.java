

public class LogicOperator {
    public static void main(String[] args) {
        //&并且：两边都为真，结果才为真
        System.out.println("&");
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(false & false);
        System.out.println(true & false);

        //|或者,只要有一个真，结果就为真
        System.out.println("|");
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);

        //^逻辑异或，相同为false,不同为true
        System.out.println("^");
        System.out.println(true ^ true);
        System.out.println(true ^ false);

        //!逻辑非，取反
        System.out.println("!");
        System.out.println(!true);

        //短路逻辑运算符&&和||具有短路效果，如果左边能确定结果，就不会对右边进行判断

        //三元逻辑运算符
        //格式：关系表达式？表达式1：表达式2；

        //需求：获取两个数的较大值
        System.out.println("三元运算符");
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 > num2 ? num1 : num2);


        System.out.println(200 | 10);

    }
}
