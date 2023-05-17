import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;

public class MazeFrame {
	
	static JFrame frame = new JFrame("Maze");
	static JPanel p = new JPanel(new BorderLayout());
	
	public MazeFrame(){		
		frame.dispose();
		final Board test = new Board(37,23);
		final Player player = new Player(test);
		
		p.add(test, BorderLayout.CENTER);
		p.setFocusable(true);
		frame.add(p, BorderLayout.CENTER);				
				
		p.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent e){				
				int keyCode = e.getKeyCode();
				if(e.getKeyChar() == 'a' || keyCode == KeyEvent.VK_LEFT) player.moveLeft(test);
				if(e.getKeyChar() == 'd' || keyCode == KeyEvent.VK_RIGHT) player.moveRight(test);
				if(e.getKeyChar() == 'w' || keyCode == KeyEvent.VK_UP) player.moveUp(test);
				if(e.getKeyChar() == 's' || keyCode == KeyEvent.VK_DOWN) player.moveDown(test);
			}
		});	
		
		frame.setSize(Toolkit. getDefaultToolkit(). getScreenSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setBackground(Color.black);
		frame.setVisible(true);
	}
}
