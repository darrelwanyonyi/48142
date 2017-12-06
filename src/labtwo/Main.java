package labtwo;

public class Main {

    public static int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};

    public static void main (String[] args) {
        // create the threads
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < ages.length; i++){
                    System.out.println("Ages " + ages[i]);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < ages.length; i++){
                    System.out.println("years elapsed " + (ages[i]-18));
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < ages.length; i++){
                    int f = (ages[i]-18)/5 +1;
                    System.out.println("Frequency of voting " + f);
                }
            }
        });
        //run all the thread at the same time
        /*t1.start();
        t2.start();
        t3.start();*/

        //combine thread 1 and 2 then run 3

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
