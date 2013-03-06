
public class Movement {
	public int last_x;
	public int last_y;
	public int x;
	public int y;
	
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
	
	public void Move(Map map, Entity e, int xDelta, int yDelta)
	{
		last_x = x;
		last_y = y;
		if (x + xDelta < Global.map_width && x + xDelta >= 0 && y + yDelta < Global.map_height && y + yDelta >= 0)
		{
			x += xDelta;
			y += yDelta;
		}
		else
		{
			switchMap(map, e, xDelta, yDelta);
		}
		addMoveMessage(e.name);
	}
	
	public void switchMap(Map map, Entity e, int xDelta, int yDelta)
	{
		int i = 0, j = 0;
		if (x + xDelta == Global.map_width && map.index[0] + 1 < Global.world_width)
		{
			i++;
			last_x = -1;
			x = 0;
		}
		if (y + yDelta == Global.map_height && map.index[1] + 1 < Global.world_height)
		{
			j++;
			last_y = -1;
			y = 0;
		}
		if (x + xDelta < 0 && map.index[0] - 1 >= 0)
		{
			i--;
			last_x = Global.map_width;
			x = Global.map_width - 1;
		}
		if (y + yDelta < 0 && map.index[1] - 1 >= 0)
		{
			j--;
			last_y = Global.map_height;
			y = Global.map_height - 1;
		}
		World.addEntityToMap(map, e, i, j);
	}
}
