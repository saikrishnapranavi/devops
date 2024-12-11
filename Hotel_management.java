package java_Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BackgroundPanel extends JPanel {
    private Image backgroundImage;
    public BackgroundPanel(String imagePath) {
        backgroundImage = new ImageIcon("").getImage();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
class Home extends JFrame implements ActionListener{
	JButton jb1,jb2,jb3,jb4,jb5;
	JLabel l1;
	Home(){
		Container c = getContentPane();
		c.setLayout(null);
		jb1 = new JButton("Display Room");
		jb2 = new JButton("Book a Room");
		jb3 = new JButton("Check - In");
		jb4 = new JButton("Check - Out");
		jb5 = new JButton("Exit");
		l1 = new JLabel("WELCOME TO WAIKIKI");
		jb1.setBounds(50,300,200,30);
		jb2.setBounds(500,300,200,30);
		jb3.setBounds(50,450,200,30);
		jb4.setBounds(500,450,200,30);
		jb5.setBounds(250,600,200,30);
		Font f = new Font("Monospaced", Font.BOLD, 40);
		l1.setFont(f);
		l1.setBounds(180,100,500, 30);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		c.add(l1);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Hotel_management {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home f = new Home();
		f.setSize(800,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	}