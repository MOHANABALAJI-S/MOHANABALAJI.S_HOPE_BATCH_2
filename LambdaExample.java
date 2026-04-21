class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread running using Thread Class");
    }
}
class SampleThread2 implements Runnable{
    @Override
    public void run(){//3.RUNNING state
        System.out.println("Thread running using runnable");
    }
}
public class ThreadExample {
    public static void main(String[] args){
        SampleThread t = new SampleThread();
        t.start();
        SampleThread2 s = new SampleThread2();
        Thread t2 = new Thread(new SampleThread2());1.//NEW THREAD
        t2.start();//2.RUNNABLE state
    }
}
