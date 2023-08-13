import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EscMenu extends JFrame{
    public EscMenu() {
	super("Esc-Menu");
	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	add(new JLabel("Press 'Esc' to close."), BorderLayout.NORTH);
	addKeyListener(new KeyAdapter() {
	    @Override
	    public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) dispose();
	    }
	});
	
	setSize(400, 450);
	setVisible(true);
    }
    
    public static void main(String[] args) {
	new EscMenu();
    }
}
