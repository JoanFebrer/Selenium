package exercisesJava.objects;

public class House {

	//////////////////////////////////////
	// Create a House Class with the next variables
	// number of plants (int)
	// Street (String)
	// house (false) or flat (true)
	//////////////////////////////////////

	private int nplants;
	private String street;
	private Boolean type;
	
	public House() {}
	
	public House(int nplants, String street, String type) {
		setNPlants(nplants);
		setStreet(street);
		setType(type);
	}
	
	public void setNPlants(int nplants) {
		this.nplants = nplants;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setType(String type) {
		if (type.equals("house")) this.type = false;
		else if (type.equals("flat")) this.type = true;
	}
	
	public int getNPlants() {
		return this.nplants;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public Boolean getType() {
		return this.type;
	}
	////////////////////////////////////////
	// Create a method that display the characteristics
	///////////////////////////////////////
	public void display() {
		System.out.println(getNPlants());
		System.out.println(getStreet());
		System.out.println(getType());
	}

}
