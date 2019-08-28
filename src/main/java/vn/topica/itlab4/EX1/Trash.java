package vn.topica.itlab4.EX1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vn.topica.itlab4.EX1.Lamp;

/*
 *
 * @author ManhHD
 *
 * Class Trash
 *
 */

public class Trash
{
	/*
	 * Create trash variable
	 */
	private List<Lamp> trash;
	
	public Trash()
	{
		/*
		 * Init trash variable and synchronized it.
		 */
		trash = new ArrayList<Lamp>();
		trash = Collections.synchronizedList(trash);
	}
	
	/*
	 * Add list lamps to trash
	 * 
	 * @param lamps
	 */
	public void addAll(List<Lamp> lamps)
	{
		trash.addAll(lamps);
	}
	
	/*
	 * Remove list lamps from trash
	 * 
	 * @param lamps
	 */
	public void removeAll(List<Lamp> lamps)
	{
		trash.removeAll(lamps);
	}
	
	/*
	 * Add lamp to trash
	 * 
	 */
	public void add(Lamp lamp)
	{
		trash.add(lamp);
	}
	
	/*
	 * @return trash
	 */
	public List<Lamp> getTrash()
	{
		return trash;
	}
}
