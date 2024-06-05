package lession;

public class CounterAdvance2 {
    private int count;
    public  void increment(){
        this.count++;
    }

    public void runSimulation(){
        /* Create a new thread for background task*/
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    increment();
                    try {
                        Thread.sleep(1);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        System.out.println("Main thread doing some work...");
    }
    public static void main(String[] args) throws InterruptedException {
        CounterAdvance2 counter = new CounterAdvance2();
        counter.runSimulation();
        Thread.sleep(1000);
        System.out.println("Count " + counter.count);
    }
}
