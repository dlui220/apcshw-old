
public class Driver {
    public static void main(String[] args) {

	Greeter g;
	g= new Greeter();
	System.out.println(g);

	g.greet();
	g.greet();
	// g.ungreet(); is now private so it's called from the greet method.
    }
}
