package org.anudip.multithread;

public class PrintNumber implements Runnable{
	 @Override
	    public void run() {
	        for (int i = 1; i <= 26; i++) {
	            System.out.print(i + " ");
	            try {
	                
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
