
public class World {
	public static Map maps[][] = new Map[Global.world_width][Global.world_height];
	public static int current_map_index[] = new int[2];
	
	public static void createMap(int i, int j)
	{
		maps[i][j] = new Map(i, j);
	}
	
	public static void setMapIndex(int i, int j)
	{
		current_map_index[0] = i;
		current_map_index[1] = j;
		if (maps[i][j] == null)
		{
			createMap(i, j);
		}
	}
	
	public Map getMap()
	{
		return maps[current_map_index[0]][current_map_index[1]];
	}
	
	public static void addEntityToMap(Map map, Entity e, int i, int j)
	{
		if (maps[map.index[0] + i][map.index[1] + j] == null)
		{
			createMap(map.index[0] + i, map.index[1] + j);
			maps[map.index[0] + i][map.index[1] + j].addEntity(e);
			maps[map.index[0]][map.index[1]].removeEntity(e);
			if (e.isPlayer)
			{
				setMapIndex(map.index[0] + i, map.index[1] + j);
			}
		}
		else
		{
			maps[map.index[0] + i][map.index[1] + j].addEntity(e);
			maps[map.index[0]][map.index[1]].removeEntity(e);
			if (e.isPlayer)
			{
				setMapIndex(map.index[0] + i, map.index[1] + j);
			}
		}
	}
}
