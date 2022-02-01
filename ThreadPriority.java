class D extends Thread {

    public void run() {

        System.out.println("Thread A started");

        for (int i = 1; i <= 4; i++) {

            System.out.println("\t From  Thread A: i= " + i);
        }

        System.out.println("Exit from A");
    }
}

class E extends Thread {

    public void run() {

        System.out.println("Thread B started");

        for (int j = 1; j <= 4; j++) {

            System.out.println("From Thread B:j=" + j);

        }

        System.out.println("Exit from B");
    }
}

class F extends Thread {

    public void run() {

        System.out.println("Thread C started");

        for (int k = 1; k <= 4; k++)

        {

            System.out.println("\t From thread C : K=" + k);
        }

        System.out.println("Exit from C");
    }
}

class ThreadPriority {

    public static void main(String args[]) {

        D tha = new D();
        E thb = new E();

        F thc = new F();

        tha.setPriority(Thread.MIN_PRIORITY);
        thb.setPriority(tha.getPriority() + 1);
        thc.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Start Thread A");

        tha.start();

        System.out.println("Start Thread B");
        thb.start();

        System.out.println("Start Thread C");

        thc.start();

        System.out.println("End of main Thread");
    }
}
