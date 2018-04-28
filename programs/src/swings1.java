import javax.swing.*;
import java.awt.*;
import java.util.*;

public class swings1 extends JFrame {
	public swings1()
	{
		super("date&time");
		Container c=getContentPane();
		JLabel lbl=new JLabel();
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setText(new Date().toString());
		c.add(lbl);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		swings1 s1=new swings1();
		s1.setSize(300,200);
		s1.setVisible(true);

	}

}
