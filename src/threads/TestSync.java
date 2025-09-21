package threads;

class Data {
	 synchronized public void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (Exception ex) {
			}
		}
	}
}

class CThread extends Thread {
	Data obj;

	public CThread(Data obj) {
		this.obj = obj;
	}

	public void run() {
		obj.print();
	}
} // End of CThread

public class TestSync {
	public static void main(String args[]) {
		CThread Thread1, Thread2;
		Data obj = new Data();
		// Make two threads access the same object
		Thread1 = new CThread(obj);
		Thread2 = new CThread(obj);
		Thread1.start();
		Thread2.start();
	}
}