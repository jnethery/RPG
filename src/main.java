import java.io.IOException;


public class main {
	public static void main(String[] args) throws IOException
	{
		Global global = new Global();
		MessageQueue messageQueue = new MessageQueue();
		World world = new World();
		world.setMapIndex(0, 0);
		Graphics graphics = new Graphics();	
		Input input = new Input();
		
		Entity player = new Entity("player");
		world.getMap().addEntity(player);
		
		while(Global.gameIsRunning)
		{
			graphics.render(world.getMap());
			graphics.commandPrompt();
			input.getInput(world.getMap(), player);
			graphics.displayMessages();
		}
	}
}
