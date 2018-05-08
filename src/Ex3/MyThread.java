package Ex3;

import java.util.ArrayList;

public class MyThread extends Thread{
	private int mNumar;
	public ArrayList<Integer> listaNr = new ArrayList<>();
	public int count;
	public String name;
	
	public MyThread(int pNumar,String pNume) {
		mNumar=pNumar;
		name=pNume;
	}
	
	public void run() {
		listaNr.add(1);
		listaNr.add(1);
		for (int i=2; i<mNumar;i++) {
			count = listaNr.get(i-1)+listaNr.get(i-2);
			listaNr.add(count);
		}
		System.out.println("Lista din threadul: " + name);
		for (int i=0;i<listaNr.size();i++) {
			System.out.print("" + listaNr.get(i) + " / ");
		}
		System.out.println();
		
	}	

}
