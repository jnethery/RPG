
public class World {
	private Map maps[][];
	private int current_map_index[] = new int[2];
	
	public World()
	{
		maps = new Map[Global.world_width][Global.world_height];
	}
	
	public void setMapIndex(int i, int j)
	{
		current_map_index[0] = i;
		current_map_index[1] = j;
	}
	
	public Map getMap()
	{
		return maps[current_map_index[0]][current_map_index[1]];
	}
}
