package vn.topica.itlab4.EX2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import vn.topica.itlab4.EX2.Lamp;

/**
 * 
 * @author ManhHD.
 * Class Store
 *
 */

public class Store
{
	/*
	 * Create variable for lamp list
	 */
	private List<Lamp> lamps;
	
	public Store()
	{
		/*
		 * Init lamps. Synchronized lamps
		 */
		lamps = new ArrayList<Lamp>();
		lamps = Collections.synchronizedList(lamps);
	}
	
	/*
	 * Add a lamp
	 */
	public void add(Lamp lamp)
	{
		lamps.add(lamp);
	}
	
	/*
	 * @param toRemove
	 */
	public void addAll(List<Lamp> lamps)
	{
		this.lamps.addAll(lamps);
	}
	
	/*
	 * Trash lamps with status is OFF and REPAIR
	 */
	public List<Lamp> trashLamp()
	{
		/*
		 * Init an list to save and return Lamps have status is OFF and REPAIR
		 */
		List<Lamp> toRemove = new LinkedList<Lamp>();
		/*
		 * Foreach list to get lamps have status is OFF and REPAIR
		 */
		for (int i = 0; i < lamps.size(); i++)
		{
			/*
			 * If lamp have status is OFF and REPAIR add to list toRemove
			 */
			if (lamps.get(i).getStatus() == Status.OFF || lamps.get(i).getStatus() == Status.REPAIR)
			{
				System.out.println("Remove Lamp " + i + " status " + lamps.get(i).getStatus());
				toRemove.add(lamps.get(i));
			}
		}
		/*
		 * Remove list lamps have status is OFF and REPAIR
		 */
		lamps.removeAll(toRemove);
		/*
		 * Return list lamps have status is OFF and REPAIR
		 */
		return toRemove;
	}
	
	/*
	 * Get lamps in store
	 */
	public List<Lamp> getStore()
	{
		return lamps;
	}

}
