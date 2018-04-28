import java.awt.*;
import javax.swing.*;
public class login extends JFrame{
	JTextField name;
	JPasswordField pwd;
	JButton login;
	public login()
	{
		super("Login");
		GridBagConstraints gbc=new GridBagConstraints();
		name=new JTextField(20);
		pwd=new  JPasswordField(20);
		login=new JButton("Login");
		
		Container c=getContentPane();
		c.setLayout(new GridBagLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		c.add(new JLabel("UserName : "),gbc);
		
		gbc.gridwidth=2;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.insets=new java.awt.Insets(2, 2, 2, 2);
		c.add(name,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		c.add(new JLabel("Password : "),gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.insets=new java.awt.Insets(2, 2, 2, 2);
		c.add(pwd,gbc);
		
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridwidth=3;
		gbc.fill= GridBagConstraints.NONE;
		gbc.insets=new java.awt.Insets(2,2,2,2);
		c.add(login,gbc);
	}

	public static void main(String[] args) {
		login l=new login();
		l.setSize(400,300);
		l.setVisible(true);

	}

}
