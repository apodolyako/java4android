package lesson13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;

    private CyclicBarrier cb;
    private CountDownLatch cdl;

    private boolean flagWin = false;


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cb, CountDownLatch cdl) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;

        this.cb = cb;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        cdl.countDown();
        checkWin(this);
    }

    private void checkWin(Car car) {


        if (!car.flagWin) {
            if (cdl.getCount() == (CARS_COUNT - 1)) {     //если пересек финиш первым
                car.flagWin = true;
                System.out.println(car.name + " -----ВЫИГРАЛ ГОНКУ!------");
            }

        }
    }
}