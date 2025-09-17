package itheima.www;

public class Method3 {
    public static void main(String[] args){
        int season1 = season(4,5,7);
        int season2 = season(4,5,7);
        int season3 = season(4,5,7);
        int season4 = season(4,5,7);
        System.out.println(season1);
        System.out.println(year(season1,season2,season3,season4));
    }

    public static int getSum(int a ,int b){
        int c = a+b;
        return c;
    }

    public static int season(int a,int b,int c){
        int d = a+b+c;
        return d;
    }
    public static int year(int a,int b,int c,int d){
        int result = a+b+c+d;
        return result;
    }
}
