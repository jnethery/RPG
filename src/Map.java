import java.util.ArrayList;

public class Map {
	ArrayList<Entity> entities = new ArrayList<Entity>();
	char[][] mapObjects = new char[Global.map_width][Global.map_height];
	final int [] index = new int[2];
	
	public Map(int i, int j)
	{
		index[0] = i;
		index[1] = j;
	}
	
	public void setMapCharacters()
	{
		for (int i = 0; i < Global.map_width; i++)
		{
			for (int j = 0; j < Global.map_height; j++)
			{
				mapObjects[i][j] = 'x';
			}
		}
	}
	
	public void addEntity(Entity e)
	{
		entities.add(e);
	}
	
	public void removeEntity(Entity e)
	{
		entities.remove(e);
	}
	
	public void setEntityPositions()
	{
		for (Entity e: entities)
		{
			mapObjects[e.movement.x][e.movement.y] = e.characterRepresentation;
		}
	}
}
