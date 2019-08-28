package vn.topica.itlab4.EX1;

import java.util.Random;

public class Lamp
{
	/*
	 * Index of lamp
	 */
	private int index;
	/*
	 * Status of lamp
	 */
	private Status status;
	
	public Lamp()
	{
		
	}
	
	/*
	 * Constructor with index generate a lamp with random status
	 */
	public Lamp(int index)
	{
		/*
		 * Assign value for index
		 */
		this.index = index;
		/*
		 * Random a Integer number, if number = 0 status is OFF, 1 is ON and 2
		 * is REPAIR
		 */
		switch (new Random().nextInt(3))
		{
			case 0:
				this.status = Status.OFF;
				break;
			case 1:
				this.status = Status.ON;
				break;
			default:
				this.status = Status.ON;
				break;
		}
	}
	
	public Lamp(int index, Status status)
	{
		this.index = index;
		this.status = status;
	}
	
	public int getIndex()
	{
		return index;
	}
	
	public void setIndex(int index)
	{
		this.index = index;
	}
	
	public Status getStatus()
	{
		return status;
	}
	
	public void setStatus(Status status)
	{
		this.status = status;
	}
	
}
