

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
    public String triangle1( int h ) {
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

    public String triangle2(int h) {
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


	

}
