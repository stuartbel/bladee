import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StartPage {
	
	JFrame frame = new JFrame("Maze");
	public StartPage(){
		
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS); 
		
		Button play = new Button("You Have Been Captured By Bandits");
		play.setFont(new Font("Verdana", Font.BOLD, 32));
		
		frame.add(play); 

		frame.setLayout(boxLayout);
		frame.setSize(Toolkit. getDefaultToolkit(). getScreenSize());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		
		play.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{	
				frame.dispose();
				new Story();
			}
		});
	}
}
