class ThreadClass extends Thread {
    public void run() {
        try {
            System.out.println("Thread is inside the ThreadClass which extends The Thread Class");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

class RunnableClass implements Runnable {
    public void run() {
        try {
            System.out.println("Thread is inside the RunnableClass which implements Runnable interface");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

class ThreadPrac {
    public static void main(String args[]) {
        ThreadClass ob = new ThreadClass();
        ob.start();
        RunnableClass o = new RunnableClass();
        Thread ob1 = new Thread(o);
        ob1.start();
    }
}