import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
        String s="Mike Zamansky";
        int index = s.indexOf(" ");
	//	System.out.println(s);
	//	System.out.println(index);
	String firstname = s.substring(0,index);
	String lastname = s.substring(index+1);
	System.out.println("First name: "+firstname);
	System.out.println("Last name: "+lastname);
	

    }
}
