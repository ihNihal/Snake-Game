
package snake.game;



import javax.swing.*;
public class Snake extends JFrame {

	Snake(){
		super("Snake Game");
		add(new Board());// add function adds things in frame
		pack();//pack fucntion is used to set size of frame
		
		setLocationRelativeTo(null); // to bring the jframe in center
		
		setResizable(false);// to prevent Jframe from resizing
	}
	public static void main (String[] args)
	{
		new Snake().setVisible(true);
	}
	
}

