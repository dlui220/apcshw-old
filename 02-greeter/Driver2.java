public class Driver2 {
    public static void main(String[] args) {

	Greeter g1 = new Greeter();
	// the above line is the same as 
	// Greeter g1;
	// g1 = new Greeter();
	
	Greeter g2,g3;
	g2 = new Greeter();

	g3 = g1;

	g1.greet();
	g2.greet();
	g3.greet();

	// make a new greeter and set g1 to refer to it
	// Note: this does not re-assign g3.
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);

    }
}
