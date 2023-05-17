import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class YouWin {
	
	JFrame frame = new JFrame("Maze");
	public YouWin(){
		
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS); 
		
		Button play = new Button("Congratulations! You have found your way home.");
		play.setFont(new Font("Verdana", Font.BOLD, 32));
		
		frame.add(play); 

		frame.setLayout(boxLayout);
		frame.setSize(Toolkit. getDefaultToolkit(). getScreenSize());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
	}
}
