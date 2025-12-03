package thread2;

import thread1.myThread;

public class test {
    public static void main(String[] args) {
        new Thread(new mythread()).start();
    }
}
