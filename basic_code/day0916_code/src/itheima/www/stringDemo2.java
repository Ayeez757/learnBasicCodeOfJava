package itheima.www;

public class stringDemo2 {
    public static void main(String[] args) {

        //测试charAt用法
//        String temp ="123456";
//        for (int i = 0; i < temp.length(); i++) {
//            System.out.println(temp.charAt(i));
//
//        }
        String str = "uynixilnauhixoahednehzow";
        System.out.println(reverser(str));

    }
    
    public static String reverser(String str){
        String strResult ="";
        if(str.length()>=1){
            for (int i = str.length()-1; i >= 0; i--) {
                strResult = strResult+str.charAt(i);
            }
            return strResult;

        }
        else return "非法输入";
    }
}
