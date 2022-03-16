class NewThread implements Runnable {
	String name;
	long time1;
	int x;

	NewThread(String threadname, long time, int x1) {
		name = threadname;
		x = x1;
		time1 = time;
	}

	public void run() {
		try {
			for (int i = x; i > 0; i--) {
				System.out.println(name);
				Thread.sleep(time1);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " Interrupted");
		}
	}
}

class ThreadExam {
	public static void main(String args[]) {
		NewThread a = new NewThread("BMS COLLEGE OF ENGINEERING", 10000, 2);
		NewThread b = new NewThread("CSE", 2000, 10);
		Thread ob = new Thread(a);
		Thread ob1 = new Thread(b);
		ob.start();
		ob1.start();
	}
}