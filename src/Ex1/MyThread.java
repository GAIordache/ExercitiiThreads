package Ex1;


public class MyThread implements Runnable {
	//private Thread t;
	public int rndNr;
	public int threadyName;
	
	public MyThread(int pThreadName) {
		this.threadyName = pThreadName;
	}
	
	
	@Override
	public void run() {
		rndNr =  (int)(Math.random()*100);
		System.out.println("nr random din thread " + rndNr);
		Ex1.nrRand.add(rndNr);
	}
	
	//public void start() {
	//	if (t == null) {
	//		t = new Thread(this,"Thread = " + threadyName);
	//		System.out.println(t.getName());
	//		t.start();
	//	}
	//}

}
