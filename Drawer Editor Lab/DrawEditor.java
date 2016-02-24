import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton ;
public class DrawEditor extends JFrame 
{ 
    private static final int FRAME_WIDTH = 130; 
    private static final int FRAME_HIEGHT = 140; 
    
    public static void main(String[] args ) 
    
    { 
        JFrame frame = new JFrame(); 
        JButton circleButton = JButton("Add Circle" ); 
        JButton squareButton = JButton("Add Square"); 
        JButton colorButton = JButton("Pick Color"); 
        frame.add(circleButton) ; 
        frame.add(squareButton); 
    
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT); 
    }}