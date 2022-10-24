
public class Pumpkin {
	
	//properties / attributes
	//make them private
	//add 4 attributes
	private String name;
	private int seeds;
	private double length;
	private int holes;
	private String design;
	
	//add a default constructor
	public Pumpkin() {
		name = "PJ";
		seeds = 120;
		length = 7.2;
		holes = 3;
		design = "curvy";
	}
	
	//constructor with 1 String argument
	//allows setting of the name during
	//object construction
	public Pumpkin(String paramName) {
		this(); //calls default constructor
		name = paramName;
		
	}
	
	public Pumpkin(String paramName, int paramSeeds, double paramLength, 
			int paramHoles, String paramDesign) {
		this();
		name = paramName;
		seeds = paramSeeds;
		length = paramLength;
		holes = paramHoles;
		design = paramDesign;
	}
	
	
	//add a toString
	public String toString() {
		String result = name + "\n";
		result += "seeds: " + seeds + "\n";
		result += "length: " + length + "\n";
		result += "holes: " + holes + "\n";
		result += "design: " + design + "\n";
		return result;
	}
}
