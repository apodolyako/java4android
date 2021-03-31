package lesson12;

public class Mytest12 {

        static final int SIZE = 10000000;
        static final int HALF = SIZE/2;
        float[] arr = new float[SIZE];

    public static void main(String[] args) throws InterruptedException {
      Mytest12 test = new Mytest12();

      Runnable task1 = new Runnable() {
          @Override
          public void run() {
              test.calcArr(0,HALF);
          }
      };

      Runnable task2 = new Runnable() {
          @Override
          public void run() {
              test.calcArr(HALF, SIZE);
          }
      };

        long  startTime, endTime;

        test.initArr();
        startTime = System.currentTimeMillis();
        test.calcArr(0, test.arr.length);
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения в 1 потоке: " + (endTime-startTime));

// тоже самое но пробуем с двумя потоками
        test.initArr();
        startTime = System.currentTimeMillis();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения в 2х потоках: " + (endTime-startTime));

    }

    private void calcArr(int start, int end)  {

        for (int i=start; i<end; i++){
            arr[i]= (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
    }

    private void initArr(){
        for(int i =0; i<arr.length; i++){
            arr[i] = 1;
        }
    }

}
