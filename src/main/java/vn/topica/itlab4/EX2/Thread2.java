package vn.topica.itlab4.EX2;

import java.util.List;

public class Thread2 extends Thread
{
	/*
	 * Create store and trash
	 */
	private Store store;
	private Trash trash;
	
	/*
	 * Assign @param store
	 * Assign @param trash
	 */
	public Thread2(Store store, Trash trash)
	{
		this.store = store;
		this.trash = trash;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			System.out.println("Thread 2 running");
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			/*
			 * Get list lamps with status is OFF or REPAIR
			 */
			List<Lamp> lamps = store.trashLamp();
			/*
			 * Add list lamps to trash
			 */
			trash.addAll(lamps);
			/*
			 * Call to run function of Thread
			 */
			super.run();
		}
	}
}