package itheima.www;

public class GoodsTest {
    public static void main(String[] args) {

        //创建对象
        Goods [] arr = new Goods[3];

        //创建三个商品对象
        Goods g1 = new Goods("001","华为p40",5999.0,100);
        Goods g2 = new Goods("002","保温杯",227.0,50);
        Goods g3 = new Goods("003","枸杞",12.7,70);

        //把对象加入数组
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId()+arr[i].getName()+arr[i].getPrice()+arr[i].getCount());
        }
    }
}
