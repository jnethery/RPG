import java.util.Scanner;

public class Input {
	
	private String input;
	private final Scanner in = new Scanner(System.in);
	
	public void getInput(Entity player)
	{
		input = in.nextLine();
		input = input.toUpperCase();
		
		int dirs[] = getDir(input);
		
		if (input.contains("MOVE") || input.contains("MV"))
		{
			player.movement.Move(player.name, dirs[0], dirs[1]);
		}
		else if (input.compareTo("QUIT") == 0)
		{
			Global.gameIsRunning = false;
		}
		else if (input.compareTo("HELP") == 0)
		{
			displayHelp();
		}
		else
		{
			MessageQueue.addMessage("I could not understand that command. Type HELP for command options.");
		}
	}
	
	private int[] getDir(String input)
	{
		int x = 0;
		int y = 0;
		if (input.contains("WEST"))
		{
			x -= 1;
		}
		
		if (input.contains("EAST"))
		{
			x += 1;
		}
		
		if (input.contains("NORTH"))
		{
			y -= 1;
		}
		
		if (input.contains("SOUTH"))
		{
			y += 1;
		}
		
		return new int[]{x, y};
	}
	
	private void displayHelp()
	{
		MessageQueue.addMessage("COMMANDS:");
		MessageQueue.addMessage("MOVE: moves your character");
		MessageQueue.addMessage("QUIT: exits the game");
	}
}
