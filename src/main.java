import java.io.IOException;


public class main {
	public static void main(String[] args) throws IOException
	{
		Global global = new Global();
		MessageQueue messageQueue = new MessageQueue();
		World world = new World();
		Graphics graphics = new Graphics();	
		Input input = new Input();
		
		Entity player = new Entity("player");
		
		while(Global.gameIsRunning)
		{
			graphics.render(world.getMap());
			graphics.commandPrompt();
			input.getInput(player);
			graphics.displayMessages();
		}
	}
}
