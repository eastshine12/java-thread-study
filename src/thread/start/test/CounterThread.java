package thread.start.test;

import util.MyLogger;

import static util.MyLogger.*;

public class CounterThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log("value: " + i);
        }
    }

}
 