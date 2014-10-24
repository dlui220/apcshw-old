

public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    // Worked with Lulu on this in class
    public String tri1( int h ) {
	int x = 1;
	String end = "";
	while ( x <= h ) {
	    int y = 0;
	    while ( y < x ) {
		end = end + "*";
		y = y + 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	}
	return end;
    }

    public String tri2(int h) {
	String result = "\n";
	int newh = h;
	int x = h - 1;
	while (x > 0) {
	    int c = 0;
	    while (c < x) {
		int g = h;
		result = result + " ";
		c = c + 1;
	    }
	    x = x - 1;
	    if (result.substring(h-1) != "*") {
		while (result.length() % (newh + 1) != 0) {
		    result = result + "*";
		}
	    } else {
		result = result + "\n" ;
	    }
	    result = result + "\n";
	}
	while (h>0){
	    h = h - 1;
	    result = result + "*";
	}
	return result;
    }

    public String tri3(int h){
	String result= new String();
	for (int i=1;i<=h;i++){
	    for (int var=0;var<h-i;var++){
		result+=" ";
	    }
	 
	    for (int var=h-i;var<h+i-1;var++){
		result = result + "*";
	    }
	    result = result + "\n";
	}
	return result;
	
    }

    public String tritest(int h){
	String result= new String();
	int counter = 0;
	int i = 1;
	while (counter * 2 - 1 != h){
	    for (int var=0;var<h-i;var++){
		result+=" ";
	    }
	    for (int var=h-i;var<h+i-1;var++){
		result = result + "*";
	    }
	    result = result + "\n";
	    counter = counter + 1;
	    i++;
	}
	int x = h-1;
	counter = counter - 1;
	while (counter > 0){
	    for (int var=x-1;var>0;var--){ // for the spaces
		result+=" ";
	    }
	 
	    for (int var=h-x;var<h+x-1;var++){
		result = result + "*";
	    }
	    result = result + "\n";
	    counter--;
	}
    

    return result; // each time add line, add to new variable
    // when variable  * 2 - 1 then stop 
    }
}

