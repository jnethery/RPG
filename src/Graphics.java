import java.io.IOException;

public class Graphics {
	
	public void render(Map map) throws IOException
	{
		for (int j = 0; j < Global.map_height; j++)
		{
			for (int i = 0; i < Global.map_width; i++)
			{
				System.out.printf("x ");
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
