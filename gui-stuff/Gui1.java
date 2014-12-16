import javax.swing.*;
import java.awt.*;

public class Gui1 extends JFrame {

    private Container pane;
    private JButton b1,b2;
    private JLabel l;
    private JTextArea text;
    
    public Gui1(){

	setTitle("My First Gui");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	//	pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	l = new JLabel("The Label: ");
	pane.add(l);
	b1 = new JButton("button");
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);
	text = new JTextArea();
	pane.add(text);
	/*
	pane.add(new JButton("button1"));
	pane.add(new JButton("button2"));
	pane.add(new JButton("button3"));
	pane.add(new JButton("button4"));
	pane.add(new JButton("button5"));
	pane.add(new JButton("button6"));
	JPanel f2 = new JPanel();
	*/
				
    }
    public static void main(String[] args) {
	Gui1 f = new Gui1();
	f.setVisible(true);
    }
}
