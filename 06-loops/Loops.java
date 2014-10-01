public class Loops {
    // 10 minutes
    public String frontTimes(String str, int n) {
	String result = new String();
	if (str.length()<=3){
	    String front = str;
	    while (n > 0) {
		result = result + front;
		n=n-1;
	    }
	} else {
	    String front = str.substring(0,3);
	    while (n > 0) {
		result = result + front;
		n=n-1;
	    }
	}
	return result;
    }
    // 10 minutes, I googled and found the charAt method on stack overflow.
    public String stringBits(String str) {
	String result = new String();
	int place = 0;
	while (place < str.length()){
	    result = result + str.charAt(place);
	    place = place + 2;
	}
	return result;     
     
    }

    // 20 minutes, got stuck on the if statement
    public String stringYak(String str) {
	int place = 0;
	int len = str.length();
	String result = str;
	while (place<len-2){
	    if (result.substring(place, place+3).equals("yak")){
		result = result.substring(0,place)+result.substring(place+3);
		len=result.length();
	    }
	    place=place + 1;
	}
	return result;
    }
    /*
     20 minutes, got stuck on the use of the 'min' method and having to look
       at the different lengths of each string
    */
    public int stringMatch(String a, String b) {
	int shorter = Math.min(a.length(), b.length());
	int x = 0;
	int place = 0;
	while (x < (shorter - 1)) {
	    String suba = a.substring (x, (x+2));
	    String subb = b.substring (x, (x+2));
	    if (suba.equals(subb)) {
		place = place + 1;
	    }
	    x = x + 1;
	}
	return place;
    }
}
