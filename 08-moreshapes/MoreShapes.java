public class MoreShapes{

    public String line(String c, int n) {
	String s = "";
	for (int i=0;i<n;i++) {
	    s=s+c;
	}
	return s;
    }
    
    public String frameline(String c, int n) {
	String s = c;
	for (int i=0;i<n-2;i++){
	    s = s + " ";
	}
	s = s + c;
	return s;
    }

    
    public String frame(int r, int c) {
	String result = line("*",c)+"\n";
	int height = r;
	int width = c;
	int i;
	for (i=0;i<height-2;i++){
	    result = result + frameline("*",width) + "\n";
	}
	return (result+line("*",c));
    }
    public String stringSplosion(String str) {
	String result = new String();
	for (int i=0;i<str.length();i++){
	    result = result + str.substring(0,i);
	}
	result = result + str;
	return result;
    }
    public String stringX(String str) {
	String result = "";
	for (int i=0; i<str.length(); i++) {
	    if (!(i > 0 && i < (str.length()-1) &&
		  str.substring(i, i+1).equals("x"))) {
		result = result + str.substring(i, i+1);
	    }
	}
	return result;
    }

}
