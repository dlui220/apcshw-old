public String stringSplosion(String str) {
    String result = new String();
    for (int i=0;i<str.length();i++){
	result = result + str.substring(0,i);
    }
    result = result + str;
    return result;
}
