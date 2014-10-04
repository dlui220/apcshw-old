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


	

    // if result mod h = 0 ----- add * else new line
}
