import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	//test
	//t2
	
	public Main () {
		super("EOY");
		setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		
		Game play = new Game();
		((Component) play).setFocusable(true);
		
		//background
		//Color orange = new Color(255, 131, 0);
		//setBackground(orange);
		
		
		getContentPane().add(play);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		Main run = new Main();
		

	}


}
