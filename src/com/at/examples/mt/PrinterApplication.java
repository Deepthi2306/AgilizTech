package com.at.examples.mt;

class Printer {
	void printDocuments(int num_of_copies, String document_name) {
		synchronized (this) {
			for (int i = 1; i < num_of_copies; i++) {
				System.out.println("Printing..." + document_name);
				try {
				Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
class NihalThread extends Thread {
	Printer printer_ref;
	public NihalThread(Printer p) {
		printer_ref = p;
	}
	public void run() {
		printer_ref.printDocuments(10, "...Nihals pdf...");
	}
}

class VinayThread extends Thread {
	Printer printer_ref;
	public VinayThread(Printer p) {
		printer_ref = p;
	}
	public void run() {
		printer_ref.printDocuments(10, "...Vinays pdf...");
	}
}

public class PrinterApplication {

	public static void main(String[] args) {
		System.out.println("*****PRINTER APP*****");
		Printer printer = new Printer();
		NihalThread thread1 = new NihalThread(printer);
		VinayThread thread2 = new VinayThread(printer);
		thread1.start();
		thread2.start();
	}

}
