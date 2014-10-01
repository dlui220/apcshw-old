public class Box {
    public String box( int r, int c ) {
	int x = 0;
	String f = new String();
	while ( x < c ) {
	    f = f + "*";
	    x = x + 1;
	}
	int y = 0;
	String g = new String();
	while ( y < r ) {
	    g = g + f + "\n";
	    y = y + 1;
	}
	return g;
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
	int x = 0;
	String end = "";
	while ( x <= h ) {
	    int y = 0;
	    while ( y < h-1) {
		end = end + " ";
		y = y + 1;
	    }
	    int y = 0;
	    while (y < x){
		end = end + "*";
		y = y + 1;
	    }
	    end = end + "\n";
	    x = x + 1;
	}
	return end;
    }
    	
}
