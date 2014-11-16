import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) {
	Random r = new Random();

	// Using ArrayLists // 
	// Completed in class with Jeanne during pair-programming //
	ArrayList<Integer> al = new ArrayList();
	ArrayList<Integer> result = new ArrayList();
	for (int i=0;i<10;i++) {
	    al.add(i);
	}
	System.out.println("Default Array thing:");
	System.out.println(al);

	System.out.println(); 

	while (al.size() > 0){
	    for (int x=0;x<al.size();x++) {
		int j = r.nextInt(al.size());
		if (!result.contains(al.get(j))){
		    result.add(al.get(j));
		    al.remove(al.get(j));
		}	    
		    
	    
	    }
	}
	System.out.println("Using ArrayLists:"); 
        System.out.println(result);   


	// Using regular Arrays //

	int[] a = new int[10];
	//	System.out.println(Arrays.toString(a));
	int[] newa = new int[10];

	int counter=0;
	int checker=0;

	for (int i = 0;i<a.length;i++){
	    a[i] = i;
	    counter=counter+a[i];
	}
	//	System.out.println(Arrays.toString(a)); 
	//	System.out.println("Sum of numbers in a: "+counter);
	while (checker != counter) {
	    for (int y=0;y<a.length;y++){
		int w = r.nextInt(a.length);
		if (a[w] != -1){
		newa[y] = a[w];
		checker=checker+a[w];
		a[w] = -1;
		}
	    }
	   
	}
	System.out.println(); 
	System.out.println("Using Arrays:"); 
	System.out.println(Arrays.toString(newa)); 
	
    }
}
