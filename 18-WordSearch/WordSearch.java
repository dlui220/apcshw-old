import java.io.*;
import java.util.*;

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
    /*
    public void addWordH(String word,int row,int col){
	int r = row, c = col;
	if(!(c+word.length()>board[0].length)) {
	    for (int i=0;i<word.length();i++) {
		board[r][c] = word.charAt(i);
		c++;
	    }
	}
    }
    public void addWordHBackward(String word, int row, int col){
	int r = row, c = col;
	if(!(c-word.length()<0)){
	    for (int i=word.length()-1;i>=0;i--){
		board[r][c] = word.charAt(i);
		c++;
	    }
	}
    }

    public void addWordV(String word, int row, int col){
	int r = row, c = col;
	if(!(r+word.length()>board.length)){
	    for (int i=0;i<word.length();i++){
		board[r][c] = word.charAt(i);
		r++;
	    }
	}
    }
    public void addWordVBackward(String word, int row, int col){
	int r = row, c = col;
	if(!(r-word.length()<0)){
	    for (int i=word.length()-1;i>=0;i--){
		board[r][c] = word.charAt(i);
		r++;
	    }
	}
    }

    public void addDUpR(String s, int row, int col) {
	int r = row, c = col;
	
	if(r+s.length() < board.length && c+s.length() <board[r].length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r++;
		c++;
	    }
	}
    }

    public void addDUpL(String s, int row, int col) {
	int r = row, c = col;

	if(r+s.length() < board.length && c-s.length() > 0) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r++;
		c--;
	    }
	}
    }
    public void addDDownR(String s, int row, int col) {
	int r = row, c = col;
	
	if(r-s.length() >0 && c+s.length() < board[r].length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r--;
		c++;
	    }
	}
    }

    public void addDDownL(String s, int row, int col) {
	int r = row, c = col;

	if(r-s.length() > 0 && c-s.length() > 0) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r--;
		c--;
	    }
	}
    }
    */
    
    // used Mr. Z's compressed code lol
    
    public boolean addWordHelper(String w,int row, int col,int deltaRow, int deltaCol){
	int r = row, c = col;
				
	for (int i=0;i<w.length();i++){
	    try {
		if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
		    return false;
		}
	    } catch ( Exception e){
		return false;
	    }
	    r = r + deltaRow;
	    c = c + deltaCol;
	}

	r = row;
	c = col;

	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    r = r + deltaRow;
	    c=c+deltaCol;
	}
	return true;
    }

    
    public boolean addWord(String w){
	Random r = new Random();
	int randomc = r.nextInt(board[0].length);
	int randomr = r.nextInt(board.length);
	int deltaRow = -1 + r.nextInt(3);
	int deltaCol = -1 + r.nextInt(3);
	if (deltaRow == deltaCol && deltaCol == 0) {
	    return false;
	}
	w = w.toUpperCase();
	return addWordHelper(w,randomr,randomc,deltaRow,deltaCol);
	    /*
	if (x == 0){
	    addWordH(W,randomr,randomc);
	} else if (x == 1) {
	    addWordHBackward(W,randomr,randomc);
	} else if (x == 2) {
	    addWordV(W,randomr,randomc);
	} else if (x == 3) {
	    addWordVBackward(W,randomr,randomc);
	} else if (x == 4) {
	    addDUpR(W,randomr,randomc);
	} else if (x == 5) {
	    addDUpL(W,randomr,randomc);
	} else if (x == 6) {
	    addDDownR(W,randomr,randomc);
	} else if (x == 7) {
	    addDDownL(W,randomr,randomc);
	}
	if (testboard.equals(board)){
	    return false;
	}else{
	    return true;
	}
	    */
    }

    public void fill(){
	char[] letters = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	Random r = new Random();
	int randomAlpha = r.nextInt(26);
	for (int i=0;i<board.length;i++){
	    for (int x=0;x<board[0].length;x++){
		if (board[i][x] == '.'){
		    board[i][x] = letters[r.nextInt(26)];
		}
	    }
	}
    }

    
	    // Character.toString((char) i);
	    
    public static void main(String[] args) {
	Scanner sc = null;
	WordSearch w = new WordSearch(10,20);
	try {
	    sc = new Scanner(new File("wordbank.txt"));
	} catch (Exception s) {
	    System.out.println("the file cannot be read.");
	    System.exit(0);
	}
	while (sc.hasNext()){
	    String s = sc.next();
	    w.addWord(s);
	}
	try {
	    System.out.println(w);
	    w.fill();
	    System.out.println(w);
	} catch (Exception e) {
	    System.out.println(e);
	}

    }
}
