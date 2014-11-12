import java.io.*;
import java.util.*;

public class Driver {
    ArrayList<Integer> al = new ArrayList();
    for (int i = 0;i<20;i++) {
	Random r = new Random();
	al.add(r.nextInt(5));
	System.out.println(al);
	
    }

}
