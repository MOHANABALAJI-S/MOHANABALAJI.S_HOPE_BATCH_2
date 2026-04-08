public class CompileTimeException {
    public static void main(String[] args){
    Thread t = new Thread(()->{
        try{
            System.out.println("thread sleep");
            Thread.sleep(2000);
            System.out.println("thread wake");  
        }
        catch(InterruptedException e){
            System.out.println("Sleep Interrupted");
        }
    });
    t.start();
    try{
            Thread.sleep(4000);
    }
    catch(Exception e){
        System.out.println("NOT t");
    }
    t.interrupt();
}
}