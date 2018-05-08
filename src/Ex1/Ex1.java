package Ex1;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	static public int sum = 0;
	//static ArrayList<Thread> threads = new ArrayList<Thread>();
	static ArrayList nrRand = new ArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		
		List<Thread> threads = new ArrayList<>();
		for(int i=0;i<5;i++) {
			Thread t = new Thread(new MyThread(i));
			threads.add(t);
			t.start();
		}
		
		for (int i=0;i<threads.size();i++) {
			threads.get(i).join();
		}
		
		System.out.println("am iesit");
		
		for (int i=0;i<nrRand.size();i++) {
			sum+=(int)nrRand.get(i);
		}
		System.out.println("Suma este = " + sum);
		
	}

}
