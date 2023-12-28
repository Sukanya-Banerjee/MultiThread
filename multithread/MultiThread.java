package org.anudip.multithread;

public class MultiThread {
	public static void main(String[] args) throws InterruptedException {
        
        PrintNumber printNumbers = new PrintNumber();
        PrintAlphabets printAlphabets = new PrintAlphabets();

        
        Thread numbersThread = new Thread(printNumbers);
        Thread alphabetsThread = new Thread(printAlphabets);

        
        numbersThread.start();
        alphabetsThread.start();
        numbersThread.join();
        alphabetsThread.join();
        System.out.println("Bye");       // alphabetsThread.start();
    }
}
