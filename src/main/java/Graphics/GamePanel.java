package Graphics;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class GamePanel extends JPanel implements MouseListener{

	private BufferedImage background;
	private CascadiaFrame frame;
	public GamePanel(int playerCount, CascadiaFrame frame) {
        try {
            background = ImageIO.read(GamePanel.class.getResource("/Images/Screens/GameBoard.png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        addMouseListener(this);
        this.frame = frame;
       
    }
	
	public void paint(Graphics g) {
		drawBackground(g);
	}
	
	public void drawBackground(Graphics g) {
		g.drawImage(background, 0, 0, 1920, 1080, null);
	}
	
	 public void mouseClicked(MouseEvent e) {
	        int x = e.getX();
	        int y = e.getY();
	
	        System.out.println(x +", "+ y);
	        //arrows(up,right,down,left)
	        if(x>= 430 && x<=460 && y>=900 && y <= 945) {
	         
	        }
	        
	        
	        if(x>= 430 && x<=460 && y>=900 && y <= 945) {
		         
	        }
	    }

	    public void mousePressed(MouseEvent e) {
	        
	    }

	    public void mouseReleased(MouseEvent e) {

	    }

	    public void mouseEntered(MouseEvent e) {

	    }

	    public void mouseExited(MouseEvent e) {

	    }
}