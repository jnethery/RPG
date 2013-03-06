
public class Entity {
	
	public Movement movement = new Movement();
	public String name;
	public char characterRepresentation;
	public boolean isPlayer;
	
	public Entity(String name)
	{
		this.characterRepresentation = '@';
		this.name = name;
		this.isPlayer = true;
	}
}
