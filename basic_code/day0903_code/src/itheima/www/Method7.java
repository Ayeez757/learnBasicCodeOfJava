package itheima.www;

public class Method7 {
    public static void main(String[] args) {

    }
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;

            }
        }
        return false;
    }
}

//return break关键字区别
//return 和循环没啥关系，跟方法有关，表示结束方法，返回结果；
//如果方法执行到return，整个方法结束，循环也随之结束
/*break关键字
其实和方法没啥关系，结束循环或者switch的

 */