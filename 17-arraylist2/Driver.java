import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) {
	Random r = new Random();
	ArrayList<Integer> al = new ArrayList();
	ArrayList<Integer> result = new ArrayList();
	for (int i=0;i<10;i++) {
	    al.add(i);
	}
	System.out.println(al);
	/*
	  while (result.size() < al.size()){
	  }
	*/
	while (al.size() > 0){
	    for (int x=0;x<al.size();x++) {
		int j = r.nextInt(al.size());
		if (!result.contains(al.get(j))){
		    result.add(al.get(j));
		    al.remove(al.get(j));
		}	    
		    
	    
	    }
	}
        System.out.println(result);   
    }
}
