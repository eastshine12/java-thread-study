package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "main() start");

        HelloThread ht = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " start() 호출 전");
        ht.start();
        System.out.println(Thread.currentThread().getName() + " start() 호출 후");

        System.out.println(Thread.currentThread().getName() + "main() end");
    }
}
