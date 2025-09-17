package itheima.www;

import java.util.Random;

public class YanZhengMa {
    //要求随机一串一=验证码，五位，前四位为随机大小写的随机字母，最后一位为随机数字
    public static void main(String[] args) {
        //生成一个包含大小写字母的数组
        char [] alphabet = new char[52];
        for (int i = 0; i < alphabet.length; i++) {
            //0到25插入大写字母，ascll对应65到90
            if(i<=25){
                alphabet[i] = (char)(i+65);
            }else{
                //26到51插入小写字母，ascll对应97到122
                alphabet[i] = (char) (i+97-26);
            }


        }
//        for (int i = 0; i < alphabet.length; i++) {
//            System.out.print(alphabet[i]+" ");
//        }
        //抽取四次随机索引对应的字母并拼接
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            result = result+alphabet[r.nextInt(52)];
        }

        //生成一个随机数字
        result = result +(r.nextInt(10)+1);
        //打印结果
        System.out.println(result);
    }
}
