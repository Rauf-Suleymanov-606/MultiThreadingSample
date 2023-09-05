public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("First thread");
        myThread.start();




        MyThread myThread1 = new MyThread();
        myThread1.setName("Second thread");
        myThread1.start();



        MyThread myThread2 = new MyThread();
        myThread2.setName("Third thread");
        myThread2.start();

    }
}
