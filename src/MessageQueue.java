import java.util.Queue;
import java.util.LinkedList;

public class MessageQueue {
	public static Queue<String> messageQueue = new LinkedList<String>();;
	
	public static void addMessage(String message)
	{
		messageQueue.add(message);
	}
	
	public static String getMessage()
	{
		return messageQueue.remove();
	}
}
