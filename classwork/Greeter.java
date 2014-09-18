public class Greeter {
    // instance variables are almost always private
    // we access them with "accessor methods" get and set
    private String greeting = new String("Hello world!");
    public void setGreeting(String s) {
	greeting = s;
    }

    public Greeter(String g) {
	System.out.println("In the constructor");
	greeting = g;
    }
    // constructors ^^
    /*
      Notes:
        - the name is the same as the class name
	- there is no return type (nothing between public and the name)
	- it's ALWAYS public

	a constructor is run automatically when yo instantiate the class. 
	that is, if you have: Greeter g = new Greeter("Hello")
	then Java will automatically call this constructor sending Hello in
	as parameter g. It will then set the instance variable
	greeting to what g refers to, which is hello.
    */
    public String getGreeting() {
	return greeting;
    }
    // String is the "return type" that is, the type of the data that we
    // will send back using the return statement.
    // void is a special "return type" which means we won't be returning
    // any value.
    public void greet() {
	//uncomment the following line for question 2
	//String greeting = new String("Sup!");
	System.out.println(greeting);
    }
    public void ungreet() {
	System.out.println(greeting);
    }
}
