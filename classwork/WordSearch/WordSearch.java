public class WordSearch{

    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
				
    }

    public WordSearch(){
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordH(String word,int row,int col){
	int r = row, c = col;
	
	for (int i=0;i<word.length();i++) {
	    board[r][c] = word.charAt(i);
	    c++;
	}
	    
    }
    public void addWordHBackward(String word, int row, int col){
	int r = row, c = col;
	
	for (int i=word.length()-1;i>=0;i--){
	    board[r][c] = word.charAt(i);
	    c++;
	}
    }
    public void addWordV(String word, int row, int col){
	int r = row, c = col;
	
	for (int i=0;i<word.length();i++){
	    board[r][c] = word.charAt(i);
	    r++;
	}
    }
    public void addWordVBackward(String word, int row, int col){
	int r = row, c = col;
	
	for (int i=word.length()-1;i>=0;i--){
	    board[r][c] = word.charAt(i);
	    r++;
	}
    }
    public void addDUpL(String word, int row, int col){
	int r = row, c = col;
	
	for (int i=0;i<word.length();i++){
	    board[r][c] = word.charAt(i);
	    r--;
	    c++;
	}
    }
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	try {
	System.out.println(w);
	w.addWordH("hello",100,5);
	w.addWordHBackward("hello",4,6);
	w.addWordV("HELLO",6,1);
	w.addWordVBackward("whoaaaaa",7,10);
	w.addDUpL("zamansky",10,5);
	System.out.println(w);
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("Your error is: "+e);
	}

    }
}
