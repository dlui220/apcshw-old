import java.util.*;
import java.io.*;

public class search {

    /*
    word = low + h;
    if a[mid] = what we want, we're done
    if word < a[mid]
    h= mid - 1
    else
    l = mid + 1
    */


    private Comparable[] ca;
    private int nextBlank;

    public search(int i) {
	ca = new Comparable[i];
	nextBlank = 0;
    }

    public String toString() {
	String fin = "[";
	for (int i = 0; i < ca.length; i++) {
	    fin = fin + ca[i] + ", ";
	}
	fin = fin.substring(0, fin.length() - 2) + "]";
	return fin;
    }

    public void add1index() {
	Comparable[] ca2 = new Comparable[ca.length + 1];
	for (int index = 0; index < ca.length; index++) {
	    ca2[index] = ca[index];
	}
	ca = ca2;
    }

    public boolean add(Comparable item) {
	if (ca[ca.length - 1] != null){
	    add1index();
	}
	while (ca[nextBlank] != null) {
	    nextBlank++;
	}
	ca[nextBlank] = item;
	nextBlank++;
	return true;
    }

    public void addItem(int index, Comparable item) {
	//Add at index, shifts everything else down
	if (index > ca.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	if (ca[ca.length - 1] != null){
	    add1index();
	}
	for (int x = ca.length - 1; x > index; x = x - 1) {
	    ca[x] = ca[x - 1];
	}
	ca[index] = item;
    }

    public void sort() {
	Arrays.sort(ca);
    }

    public int size() {
	return ca.length;
    }

    public Comparable lsearch(Comparable c) {
	for (int i = 0; i < ca.length; i++) {
	    if (ca[i].equals(c)) {
		return c;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable c) {
	int low = 0;
	int high = ca.length - 1;
	int mid = (low + high) / 2;
	while (low <= high) {
	    if (ca[mid].equals(c)) {
		return c;
	    } else {
		if (c.compareTo(ca[mid]) > 0) {
		    low = mid + 1;
		} else {
		    high = mid - 1;
		}
	    }
	    mid = (low + high) / 2;
	}
	return null;
    }

    public static void main(String[] args) {
	search s = new search(1000000);
	Random rnd = new Random(6767); 
	for (int i = 0; i < s.size(); i++) {
	    s.add(rnd.nextInt(50));
	}
	s.sort();
	System.out.println(s.bsearch(9));

    }
}

