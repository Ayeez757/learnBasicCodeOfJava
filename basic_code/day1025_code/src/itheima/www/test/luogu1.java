package itheima.www.test;
import java.math.BigInteger;//还能再压！！！！！！！！！！！！！！！！！！！
import java.util.Scanner;
public class luogu1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String m = sc.next();
        BigInteger num = new BigInteger(m,n);
        for(int i =0;i<=30;i++){
            if(ishws(num.toString(n).toUpperCase())){
                System.out.println("STEP="+i);
                return;
            }
            if(i==30){break;}
            num = num.add(new BigInteger(new StringBuilder(num.toString(n).toUpperCase()).reverse().toString(),n)); //反转成字符串，然后转n进制的biginteger，然后相加
        }//循环结束都没搞定
        System.out.println("Impossible!");
    }
    public static boolean ishws(String str){//判断回文数
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}

