public class Driver{
    public static void main(String[] args) {
	try{
	    /* Ordered sarray after this point
	    orderedSarray x = new orderedSarray();
	    System.out.println(x.toString());
	    System.out.println(x.size());
	    x.add("derrick");
	    x.add("jeanne");
	    x.add("alex");
	    System.out.println(x.toString());
	    */




	    // Regular Sarray after this point
	    sarray s = new sarray();
	    System.out.println();
	    System.out.println("Regular Sarray: ");
	    System.out.println(s.toString());
	    System.out.println(s.size());
	    for (int i=0;i<10;i++)  {
		s.add(i,"JEANNEEEE");
	    }
	    s.set(5,"DERRICK");
	    s.set(8,"ZAMANSKY");
	    s.set(2,"CAR");
	    s.set(7,"APPLE");
	    s.set(9,"EUREKA");
	    System.out.println(s.toString());
	    System.out.println(s.size());
	    s.ssortAscending();
	    System.out.println(s.toString());
	    s.ssortDescending();
	    System.out.println(s.toString());
	    
	    
	    
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("An error has occured: "+e);
	}

	
    }
	
	
}
