package itheima.www.creeper;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class creeper1 {
    public static void main(String[] args) {
        //Pattern:表示正则表达式
        //Matcher:文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。
        //          在大串中去找符合匹配规则的子串

        //我乱打的
        String str="aosduihfp0awejfJava7dofigjoiwrfJavawoaiehgjoas;dJava11aerijgJava17";

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        Matcher m = p.matcher(str);
        //m要在str中找符合p规则的小串

        //拿着文本匹配器，从头开始读取，寻找是否有满足规则的字符串，没有就返回false，
        // 有就返回true,在底层记录子串中的起始索引和结束索引+1
        boolean b = m.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString(起始索引，结束索引);包头不包尾
        String s1 = m.group();
        System.out.println(s1);

        //第二次在调用find的时候，会继续读取后面的内容
        b = m.find();
        String s2 = m.group();
        System.out.println(s2);

        //当然也可以循环来写
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }


    }
}
