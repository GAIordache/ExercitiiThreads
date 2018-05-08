package Ex3;

public class Ex3 {
	//static int sleepTime;
	public static void main(String[] args) throws InterruptedException {
			
			for (int i=0;i<5;i++) {
			MyThread t = new MyThread(7,"thread = " + i);
			t.start();
			//sleepTime=(int)(Math.random()*100);
			//t.sleep(sleepTime);
			//System.out.println(sleepTime);
			
			t.join();
			}

	}

}
