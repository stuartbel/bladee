import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Story {
	
	JFrame frame = new JFrame("Maze");
	public Story(){
		
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS); 
		
		Button play = new Button("Use your arrow keys to escape the dungeon and find your way home!");
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
				new MazeFrame();
			}
		});
	}
}
