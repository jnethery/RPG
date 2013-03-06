
public class Movement {
	private int last_x;
	private int last_y;
	private int x;
	private int y;
	
	public Movement()
	{
		//last_x = last_y = x = y = 0;
	}
	
	public String toString(String name)
	{
		if (x > last_x && y == last_y)
		{
			return (name + " moved EAST");
		}
		else if (x > last_x && y > last_y)
		{
			return (name + " moved SOUTHEAST");
		}
		else if (x == last_x && y > last_y)
		{
			return (name + " moved SOUTH");
		}
		else if (x < last_x && y > last_y)
		{
			return (name + " moved SOUTHWEST");
		}
		else if (x < last_x && y == last_y)
		{
			return (name + " moved WEST");
		}
		else if (x < last_x && y < last_y)
		{
			return (name + " moved NORTHWEST");
		}
		else if (x == last_x && y < last_y)
		{
			return (name + " moved NORTH");
		}
		else if (x > last_x && y < last_y)
		{
			return (name + " moved NORTHEAST");
		}
		else
		{
			return (name + " stayed in place");
		}
	}
	
	public void addMoveMessage(String name)
	{
		MessageQueue.addMessage(toString(name));
	}
	
	public void Move(String name, int xDelta, int yDelta)
	{
		last_x = x;
		last_y = y;
		x += xDelta;
		y += yDelta;
		addMoveMessage(name);
	}
}
