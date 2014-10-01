public class Box {
    public String box(int r, int c){
	String result = new String();
	String result2 = new String();
	while (r > 0){
	    while (c > 0){
		if (c == 1) {
		    result = result + "*";
		    result = result + "\n";
		    c = c - 1;
		} else {
		    result = result + "*";
		    c = c - 1;
		}
	    }
	    result2 = result2 + result;
	    r = r - 1;
	}
	return result2;
    }
}
