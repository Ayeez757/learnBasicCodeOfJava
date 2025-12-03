package Thread1;

public class ThreadAPI {
    /**
     * Thread类常用方法
     * Start()  启动当前线程的run（）方法
     * run()    通常需要重写Thread类的此方法，将创建的线程要执行的操作声明在此方法中
     * currentThread()  静态方法，返回当前代码执行的线程
     * getName()    获取当前线程的名字
     * setNmae()    设置当前线程的名字
     * yiele()      暂停当前正在执行的线程对象，
     * join()       等待该线程种植的时间（millis毫秒），再可执行其他线程
     * stop()       已过时，当执行此方法时，强制结束该线程
     * sleep(long millitime) 让线程睡眠指定的毫秒数，在指定时间内，线程是阻塞状态
     * isAlive()        判断线程是否处于活动状态
     * setPriority()    更改线程的优先级
     * setDaemon()      将该线程标记为守护线程或者用户线程
     */
}
