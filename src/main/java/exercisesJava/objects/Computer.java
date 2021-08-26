package exercisesJava.objects;

public class Computer {

	//////////////////////////////////////
	// Create a Computer Class with the next variables
	// number of cores (int)
	// Model (String)
	// Desktop (false) or laptop (true)
	//////////////////////////////////////
	
    int ncores;
    String model;
    Boolean type;

    public Computer(int ncores, String model, String type) {
    	setNCores(ncores);
    	setModel(model);
    	setType(type);
    }
    
    public void setNCores(int ncores) {
    	this.ncores = ncores;
    }
    
    public void setModel(String model) {
    	this.model = model;
    }
    
    public void setType(String type) {
    	if (type.equals("Desktop")) this.type = false;
    	else if (type.equals("Laptop")) this.type = true;
    }

    public int getNCores() {
    	return this.ncores;
    }
    
    public String getModel() {
    	return this.model;
    }
    
    public boolean getType() {
    	return this.type;
    }
    ////////////////////////////////////////
	// Create a method that display the characteristics
	///////////////////////////////////////
	public void display() {
		System.out.println(getNCores());
		System.out.println(getModel());
		System.out.println(getType());
	}
}
