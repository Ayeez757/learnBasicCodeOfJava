package itheima.www;

public class StringBuilerDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aaa").append("bbb").append("ccc").append("ddd");


        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);


    }
}
