package thread.control.yield;

import java.time.Duration;
import java.time.LocalDateTime;

import static util.ThreadUtils.sleep;

public class YieldMain {

    static final int THREAD_COUNT = 10;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
//        Thread thread = new Thread(new MyRunnable());
//        thread.start();
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            LocalDateTime startTime = LocalDateTime.now();
            for (int i = 0; i < 10000; i++) {
//                System.out.println(Thread.currentThread().getName() + " - " + i);
//                Thread.yield();
                sleep(0);
            }
            LocalDateTime endTime = LocalDateTime.now();

            // 시간 차이 계산
            Duration duration = Duration.between(startTime, endTime);

            System.out.println("소요 시간 : " + duration.toMillis() + " 밀리초");
        }
    }
}
