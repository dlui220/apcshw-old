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
	
	if(r+s.length() <= board.length && c+s.length() <=board[r].length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r++;
		c++;
	    }
	}
    }

    public void addDUpL(String s, int row, int col) {
	int r = row, c = col;

	if(r+s.length() <= board.length && c-s.length() >= 0) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r++;
		c--;
	    }
	}
    }
    public void addDDownR(String s, int row, int col) {
	int r = row, c = col;
	
	if(r-s.length() >=0 && c+s.length() <= board[r].length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r--;
		c++;
	    }
	}
    }

    public void addDDownL(String s, int row, int col) {
	int r = row, c = col;

	if(r-s.length() >= 0 && c-s.length() >= 0) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r--;
		c--;
	    }
	}
    }

    public boolean addWord(String W){
	Random r = new Random();
	char[][] testboard = board;
	int randomc = r.nextInt(board[0].length);
	int randomr = r.nextInt(board.length);
	int x = r.nextInt(8);

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
    }
       

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	try {
	    for (int i=0;i<100;i++) {
		w.addWord("Wow");
	    }
	    System.out.println(w);
	} catch (Exception e) {
	    System.out.println(e);
	}

    }
}
