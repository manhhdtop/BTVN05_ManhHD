package vn.topica.itlab4.EX2;

import java.util.Random;

public class Thread1 extends Thread
{
	/*
	 * Create store
	 */
	private Store store;
	private int index = -1;
	
	public Thread1(Store store)
	{
		/*
		 * Assign store
		 */
		this.store = store;
		index = 0;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			System.out.println("Thread 1 running...");
			/*
			 * Create new lamp
			 */
			Lamp lamp;
			/*
			 * Create object Random to random number of lamp
			 */
			Random random = new Random();
			int n = random.nextInt(20) + 1;
			System.out.println("Add " + n + " lamp");
			for (int i = 0; i < n; i++)
			{
				try
				{
					// Sleep
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				/*
				 * Assign lamp as new Lamp()
				 */
				lamp = new Lamp(index++);
				/*
				 * Print Lamps
				 */
				System.out.println("Add Lamp " + index + " status " + lamp.getStatus());
				/*
				 * Add new lamp to store
				 */
				store.add(lamp);
			}
			/*
			 * Call to run function of Thread object
			 */
			super.run();
		}
	}
}
