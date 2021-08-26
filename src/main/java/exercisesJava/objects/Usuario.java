package exercisesJava.objects;

public class Usuario extends Persona {
	
	private String id;
	
	public Usuario (String name) {
		//super(name);
		setName(name);
	}
	
	public Usuario(String name, String lastname, String id) {
		//super(name, lastname);
		setName(name);
		setLastname(lastname);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
