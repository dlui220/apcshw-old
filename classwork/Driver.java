public class Driver {
    public static void main(String[] args){
	Greeter g1 = new Greeter();
	Greeter g2 = new Greeter();

	System.out.println(g1.greet());
	System.out.println(g2.greet());

	g1.setGreeting(new String("Sup!"));
	// makes a new block of memory, puts "Sup!" in it and returns
	// it's address
	g1.greet();     
	g2.greet();

	g2.setGreeting("Howdy!");
	// string literal returns address without grabbing a new block
	// of memory. If a bunch of variables ask for g2 they will
	// refer to the same string instead of referring to different
	// newly created strings.
	g1.greet();
	g2.greet();
	System.out.println("g1's greeting is"+s);
    }
}
	   
