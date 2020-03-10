class Racer extends Thread {
    static int sharedInt = 0;

    public void run() {
        System.out.printf("Thread %d started! \n", getId());
        for (int i = 0; i < 10000; i++) {
            sharedInt++;
        }
    }
    public static void main (String [] a) throws Exception{
        new Racer().start(); new Racer().start();
        Thread.sleep(1000);
        System.out.println("Value: " + sharedInt);
    }
}







