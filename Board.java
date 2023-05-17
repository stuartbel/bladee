import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Board extends JPanel {
	
	private char[][] board;
	private int Xsize;
	private int Ysize;

	public Board(int x, int y){
		board = new char [x][y];
		Xsize = x;
		Ysize = y;
		
		generateBoard();
	}	

	public void generateBoard() {
		File maze = new File("DungeonMazeDesign.txt");
		try{
			Scanner mazeScanner = new Scanner(maze);

			for(int i=0;i<Ysize;i++){
				String line = mazeScanner.nextLine();
				for(int k=0;k<Xsize;k++){
					board[k][i] = line.charAt(k);
				}
			}
		}
		catch(FileNotFoundException error){
			System.out.println(error);
		}

	}
	
	
	public void paint(Graphics g){
		super.paint(g);

		int n = 40;
		for(int i = 0; i < Xsize; i++){
			for( int k = 0; k < Ysize; k++){
				if((board[i][k] == '#')){
					g.setColor(Color.black);
					g.fillRect(i*n, k*n, n, n);
				} else if(board[i][k] == '='){
					g.setColor(Color.black);
					g.fillRect(i*n, k*n, n, n);
				} else if(board[i][k] == '8'){
					g.drawImage(imageLoader("Grass Tile.png"), i*n, k*n, n, n, MazeFrame.p);
				} else if(board[i][k] == 'X'){
					g.drawImage(imageLoader("Dungeon Floor Tile.jpeg"), i*n, k*n, n, n, MazeFrame.p);
					g.drawImage(imageLoader("man.png"), i*n, k*n, n, n, MazeFrame.p);
				} else if(board[i][k] == ' '){
					g.drawImage(imageLoader("Dungeon Floor Tile.jpeg"), i*n, k*n, n, n, MazeFrame.p);
				}
			}
		}
	}

	public char get(int x, int y){
		return board[x][y];
	}
	
	public void set(int x, int y, char value){
		board[x][y] = value;
		repaint();
	}

	public Image imageLoader(String fileName){
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage(fileName);
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img, 0);
		try {
    		mt.waitForAll();
		} catch (InterruptedException ie) {}
		return img;
	}
}