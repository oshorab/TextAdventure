package ca.dobervich.graph.HW5;

public class Entity {

	protected String name, description;
	
	public void tick();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
