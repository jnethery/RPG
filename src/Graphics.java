import java.io.IOException;

public class Graphics {
	
	public void render(Map map) throws IOException
	{
		System.out.println("DEBUG: WORLD LOC: " + World.current_map_index[0] + " " + World.current_map_index[1]);
		map.setMapCharacters();
		map.setEntityPositions();
		for (int j = 0; j < Global.map_height; j++)
		{
			for (int i = 0; i < Global.map_width; i++)
			{
				System.out.printf("%c ", map.mapObjects[i][j]);
			}
			System.out.println();
		}
	}
	
	public void commandPrompt()
	{
		System.out.printf("\nENTER COMMAND:\n");
	}
	
	public void displayMessages()
	{
		while (!MessageQueue.messageQueue.isEmpty())
		{
			System.out.println(MessageQueue.getMessage());
		}
	}
}
