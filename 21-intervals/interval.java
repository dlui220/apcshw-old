import java.util.*;
import java.io.*;
public class interval{
    private int low,high;
    private static Random r = new Random();
 /* public interval(){
	boolean high = false;
	Random rand = new Random();
	data[0]=rand.nextInt(100)-50;
	while(!high){
	    int x = rand.nextInt(100)-49;
	    if (x>data[0]){
		high = true;
		data[1] = x;
	    }
	}
    }
 */
    public interval(){
	int l = r.nextInt(100);
	int h = l + 1 + r.nextInt(100);
	low = l;
	high = h;
    }
    
    public interval(int l, int h){
	low = l;
	high = h;
    }
    

    public String toString(){
	return "[" + low +", "+ high +"]";
    }

    public static void printstuff() {
	System.out.println("Stuff");
    }

    /*   
     public int compareTo(interval other){
	int result = 0;
	if (this.low > other.low){ 
	    result = result + 1;
	} else if (this.low < other.low){
	    result = result - 1;
	} else if (this.high > other.high){
	    result = result + 1;
	} else if (this.high < other.high){
	    result = result - 1;
	}
	return result;
    }
    */

    public int compareTo(Object other){
	
	interval o = (interval)other;
	if (this.low == o.low) {
	    return this.high - o.high;
	} else {
	    return this.low - o.low;
	}
    }
}
