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
	    for (int i=0;i<10;i++)  {
		s.add(i,"JEANNEEEE");
	    }
	    // for s
	    s.set(5,"DERRICK");
	    s.set(8,"ZAMANSKY");
	    s.set(2,"CAR");
	    s.set(7,"APPLE");
	    s.set(9,"EUREKA");
	    sarray r = s;
	    sarray t = s;
	    

	    
	    

	   

	    System.out.println();
	    long startTime = System.nanoTime();
	    r.ssortAscending();
	    long endTime = System.nanoTime();
	    System.out.println("ssort took " + ((endTime - startTime)*.000001) + " milliseconds");
	    System.out.println("num of comparisons: "+r.selcount);
	    System.out.println(r.toString());
	    long startTime2 = System.nanoTime();
	    t.isort();
	    long endTime2 = System.nanoTime();
	    System.out.println("isort took " + ((endTime2 - startTime2)*.000001) + " milliseconds");
	    System.out.println("num of comparisons: "+t.inscount);
	    System.out.println(t.toString());
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("An error has occured: "+e);
	}

	// isort is a lot faster
    }
	
	
}
