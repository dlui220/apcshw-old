import java.util.*;

public class Arraystuff {
    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;
 
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n){
	int result = 0;
	boolean found = false;
	for (int i=0;i<a.length;i++){
	    if (!found){
		if (a[i] == n) {
		    result = i + 1;
		    found = true;
		} else { 
		    result = -1;
		}	    
	    }
	}
	return result;
	
    }

    public int maxVal(){
	int result =a[0];
	for (int i=1;i<a.length;i++){
	    if (a[i]>result){
		result = a[i];
	    }
	}
	return result;
    }

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	
    }


}
