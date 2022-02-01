class X extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            if (i == 1)
                yield();
            System.out.println("\t From thread A : i=" + i);
        }

        System.out.println("Exit from A");
    }
}

class Y extends Thread {

    public void run() {

        for (int j = 1; j <= 5; j++) {

            System.out.println("\t From thread B : j=" + j);
            if (j == 3)
                break;

        }

        System.out.println("Exit from B");
    }
}

class Z extends Thread {

    public void run() {

        for (int k = 1; k <= 5; k++) {

            System.out.println("\t From thread c : k=" + k);
            if (k == 1) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println("After Exception" + "" + e);
                }
            }
            System.out.println("Exit from C");
        }
    }
}

class Threadyield {

    public static void main(String args[]) {
        System.out.println("start thread A");

        new X().start();

        System.out.println("start thread B");

        new Y().start();

        System.out.println("start thread C");

        new Z().start();

        System.out.println("End of main Thread");
    }
}
