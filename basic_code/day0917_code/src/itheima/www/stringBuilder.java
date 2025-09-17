package itheima.www;

public class stringBuilder {
    public static void main(String[] args) {
        //StringBuiler可以看成一个容器，里面内容可变
        //1.创建stringbuiler对象
        StringBuilder sb = new StringBuilder("汉字");

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //反转
        sb.reverse();

        //获取长度
        int len = sb.length();
        System.out.println(len);

        //打印
        System.out.println(sb);
    }
}
