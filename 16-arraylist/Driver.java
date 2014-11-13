import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<40;i++) {
	    al.add(r.nextInt(3));
	}
	System.out.println(al);
	for (int i=0;i<al.size();i++){
	    int countingnum = al.get(i);
	    for (int x=1;x<al.size();x++){
		if ((al.get(x) == countingnum) && (x != i) && ((al.get(x-1) == countingnum))) {
		    al.remove(x);
		}
	    }
	}
	System.out.println(al);
    }
}

	
