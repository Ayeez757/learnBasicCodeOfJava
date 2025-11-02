package genericity;

/**
 * 泛型更深入的知识：
 * Java中的泛型是伪泛型，只在编译期间有效
 * 当数据添加进集合的时候，他会检查数据类型，但是在集合里面存储的时候，还是会当成object处理，
 * 当取出数据的时候，再根据泛型将数据类型强转回原来的类型
 * 泛型的擦除：在Java文件里面，是真的存在泛型的，但是编译过去成为class以后，这个泛型就不存在了
 * 如果不定义泛型，就默认Object
 */
/**
 * 泛型可以在很多地方进行定义：
 *      泛型类，泛型方法，泛型接口
 */

import java.util.Arrays;

/**
 * 泛型类
 * 当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类
 * 此处E可以理解为变量，但是不是用来记录数据的，而是记录数据的类型，可以写成：T、E、K、V等
 */
//这里写一个简易的ArrayList来演示
public class myArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    /*
    E:表示是不确定的类型，该类型在类名后面已经定义了。
    e:形参的名字，变量名
     */
    public boolean add(E e){
        obj[size++] = e;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString(){
        return Arrays.toString(obj);
    }
}
