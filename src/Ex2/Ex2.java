package Ex2;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import Ex1.Ex1;

public class Ex2 {
	//static public int sum = 0;
	
	static ArrayList nrRand = new ArrayList();
	
	
	static Runnable task = new Runnable() {
		@Override
		public void run() {
			int rndNr =  (int)(Math.random()*100);
			//sum+= rndNr;
			System.out.println("nr random din thread " + rndNr);
			nrRand.add(rndNr);
		}
	};
	
	static ArrayList <Thread> Threads = new ArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		int sum = 0;
		
		//ExecutorService execSer =  Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			Thread T1 = new Thread(task);
			//execSer.submit(task);
			Threads.add(T1);
		}
		System.out.println("Am trimis toate task-urile");
		//execSer.shutdown();
		//System.out.println("Am apasat shutdown");
		
		for (int i=0;i<Threads.size();i++) {
			Threads.get(i).join();
		}
			
		for (int i=0;i<nrRand.size();i++) {
			
			System.out.println(nrRand.get(i));
			sum+=(int)nrRand.get(i);
		}
		
		System.out.println("Suma este = " + sum);
		
	}

}
