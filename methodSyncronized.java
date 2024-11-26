class Counter{
    private int count=0;

    // Synchronized method to increment the count
     public synchronized void increment(){
         count++;
     }

     // Method to get the current count
    public int getCount(){
         return count;
    }
}

class CounterThread extends Thread{
    private Counter counter;

    public CounterThread(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}

public class methodSync {
    public static void main(String[]args) throws InterruptedException{
        Counter counter=new Counter();
        CounterThread thread1=new CounterThread(counter);
        CounterThread thread2=new CounterThread(counter);

        thread1.start();

        thread1.join();

        System.out.println("Final Count: "+counter.getCount());


    }
}
