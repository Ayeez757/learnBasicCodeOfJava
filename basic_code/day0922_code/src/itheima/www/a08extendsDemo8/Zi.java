package itheima.www.a08extendsDemo8;

class Zi extends Fu {
    @Override
    public void show() {
        System.out.println("Zi");
    }

    //重写的方法会覆盖了虚方法表里父类的方法
    //重写方法时，重写方法的名称，形参列表必须和父类中的一致
    //子类重写父类方法时，访问权限必须大于等于父类（空着不写<protected<public）（private的方法不在虚方法表里，所以没列出来）
    //子类重写父类方法时，返回值类型子类必须小于等于父类
    //建议：重写的方法尽量和父类保持一致
    //只有被添加到虚方法表中的方法才能被重写
}
