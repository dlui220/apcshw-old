//  mixStart problem
public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  String xix = str.substring(1,3);
  return(xix.equals("ix"));
}

// makeOutWord problem

public String makeOutWord(String out, String word) {
  String newout = out;
  String outer1 = newout.substring(0,2);
  String outer2 = newout.substring(2,3);
  String outer3 = newout.substring(3);
  String complete = outer1 + word + outer2 + outer3;
  return complete;
}

// firstHalf problem

public String firstHalf(String str) {
  int strlength = str.length();
  String firstpart = str.substring(0,((strlength)/2));
  return firstpart;
}
