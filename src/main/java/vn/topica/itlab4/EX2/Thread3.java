package vn.topica.itlab4.EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Thread3 extends Thread
{
	/*
	 * Create store
	 */
	private Store store;
	private Trash trash;
	
	public Thread3(Store store, Trash trash)
	{
		/*
		 * Assign store
		 */
		this.store = store;
		this.trash = trash;
	}
	
	@Override
	public void run()
	{
		while (true)
		{
			/*
			 * Create new lamp
			 */
			Lamp lamp;
			/*
			 * Create object Random to random status
			 */
			Random random = new Random();
			/*
			 * Create list to remove
			 */
			List<Lamp> toRemove = new ArrayList<Lamp>();
			for (int i = 0; i < trash.getTrash().size(); i++)
			{
				System.out.println("Thread 3 running");
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
				lamp = trash.getTrash().get(i);
				/*
				 * Print Lamps
				 */
				System.out.println("Thread 3: Lamp " + i + " status " + lamp.getStatus());
				switch (lamp.getStatus())
				{
					case OFF:
						/*
						 * If new status is ON, add lamp to store
						 */
						if (random.nextInt(2) == 1)
						{
							lamp.setStatus(Status.ON);
							toRemove.add(lamp);
						}
						break;
					case REPAIR:
						/*
						 * If new status is REPAIR, add lamp to store
						 */
						toRemove.add(lamp);
						break;
					default:
						break;
				}
			}
			
			store.addAll(toRemove);
			trash.removeAll(toRemove);
			/*
			 * Call to run function of Thread object
			 */
			super.run();
		}
	}
}
