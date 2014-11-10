// Mr.Z's code from class

import java.util.*;
public class Arraystuff1 {
    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment
    */
    public final int final_example = 123;
    public Arraystuff1(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    public Arraystuff1() {
	this(100);
    }
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }
    public static void main(String[] args) {
	Arraystuff1 as = new Arraystuff1();
	System.out.println(as);
    }
}
