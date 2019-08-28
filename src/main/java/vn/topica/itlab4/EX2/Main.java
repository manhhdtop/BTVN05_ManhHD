package vn.topica.itlab4.EX2;

public class Main
{
	public static void main(String[] args)
	{
		/*
		 * Init store and trash
		 */
		Store store = new Store();
		Trash trash = new Trash();
		/*
		 * Init 2 thread
		 */
		Thread1 thread1 = new Thread1(store);
		Thread2 thread2 = new Thread2(store, trash);
		Thread3 thread3 = new Thread3(store, trash);
		
		/*
		 * Run thread
		 */
		thread1.start();;
		thread2.start();
		thread3.start();
	}
}
