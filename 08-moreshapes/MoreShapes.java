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
}
