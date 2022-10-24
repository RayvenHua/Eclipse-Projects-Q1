
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// by-default : a default constructor
		// is provided if non are in the class!
		Ghost casper = new Ghost();
		
		//dot operator allows access to all PUBLIC methods and properties
		System.out.println(casper); //does not know how to print objects
		
		Spider s = new Spider();
		System.out.println(s);
		
		/*
		 * 
		 * Spider s = new Spider("Tarantula");
		 * 
		 * what constructor do you need so the
		 * code above is valid?
		 * 
		 */
		
		Spider s2 = new Spider("Tarantula", true, "solid brown", 5.0, 10);
		System.out.println(s2);
		
		System.out.println(s2.getName());
		System.out.println(s2.getGlide());
		System.out.println(s2.getLength());
		
		//set a new length outside of the class
		s2.setLength(10);
		System.out.println(s2.getLength());
		
		s2.setName("Hi");
		System.out.println(s2.getName());
		
		s2.setGlide(false);
		System.out.println(s2.getGlide());
		
		/*
		 * 
		 * Add another constructor so I can
		 * set the pattern, venomous
		 * name and length of a Spider object
		 * during construction
		 * 
		 */
		
		Pumpkin p = new Pumpkin();
		System.out.println(p);
		
		Pumpkin p2 = new Pumpkin("Lil boy", 88, 5.1, 6, "angry");
		System.out.println(p2);

	}

}
//only 1 public class can exist in a java file
//and it should match the file name!
//Halloween = Fall = thanksgiving
//UNIT 2: class - template for creating objects
class Ghost {
	//Properties - Attributes
	//private - always try to hide properties from outsiders
	public String name;
	private double opacity;
	private double height;
	private boolean isScary;
	
	//add constructor that will set the attributes
	//to some default state
	public Ghost() { //zero-argument constructor (default constructor)
		
		name = "Boo";
		opacity = 0.0;
		height = 5.0;
		isScary = false;
		
	}
	
	
	
	
	//the toStrubg method allows printing of this object
	//it's called everything this object is passed to print or println
	public String toString() {
		
		return name + ":" + isScary;
		
		
	}
	
}






