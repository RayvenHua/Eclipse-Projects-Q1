
public class Spider {
	
	//properties / attributes
	//make them private
	//add 4 attributes
	private String name;
	private boolean venom;
	private int eyes;
	private double length;
	private boolean canGlide;
	private String pattern;
	
	
	//add a default constructor
	public Spider() {
		pattern = "Solid";
		name = "Ray";
		venom = true;
		eyes = 8;
		length = 8.8;
		canGlide = true;
	}
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	//setters - allow for change of instance variables
	public void setLength(double newLength) {
		//has a parameter because you're expecting information from the user
		//to set the new value
		length = newLength;
	}
	
	public void setName(String newName) {
		//has a parameter because you're expecting information from the user
		//to set the new value
		name = newName;
	}
	
	public void setGlide(boolean newcanGlide) {
		//has a parameter because you're expecting information from the user
		//to set the new value
		canGlide = newcanGlide;
	}
	
	//getter for the name
	public String getName() {
		return name; 
	}
	
	public boolean getGlide() {
		return canGlide;
	}
	
	public double getLength() {
		return length;
	}
	
	//constructor with 1 String argument
	//allows setting of the name during
	//object construction
	public Spider(String paramName) {
		this(); //calls default constructor
		name = paramName;
		
	}
	
	public Spider(String paramName, boolean paramVenom, String paramPattern, 
			double paramLength, int paramEyes) {
		this();
		name = paramName;
		pattern = paramPattern;
		venom = paramVenom;
		length = paramLength;
		eyes = paramEyes;
	}
	
	
	//add a toString
	public String toString() {
		String result = name + "\n";
		result += "venomous: "+venom+"\n";
		result += "glider: "+canGlide+"\n";
		result += "pattern: "+pattern+"\n";
		result += "length: "+length+"\n";
		result += "eyes: "+eyes+"\n";
		return result;
	}

}
