public class Driver{
    public static void main(String[] args) {
	try{
	    sarray s = new sarray();
	    orderedSarray x = new orderedSarray();
	    System.out.println(x.toString());
	    System.out.println(x.size());
	    x.add("derrick");
	    x.add("jeanne");
	    x.add("alex");
	    System.out.println(x.toString());




	    // Regular Sarray after this point
	    System.out.println();
	    System.out.println("Regular Sarray: ");
	    System.out.println(s.toString());
	    System.out.println(s.size());
	    for (int i=0;i<10;i++)  {
		s.add(i,"JEANNEEEE");
	    }
	    s.set(5,"DERRICK");
	    System.out.println(s.toString());
	    System.out.println(s.size());
	    
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("An error has occured: "+e);
	}

	
    }
	
	
}
