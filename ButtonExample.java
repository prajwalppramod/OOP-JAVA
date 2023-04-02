import java.awt.event.*;
import javax.swing.*;
public class ButtonExample
{	public static void main(String args[])
	{	JFrame f = new JFrame("Button example");
		JTextField j1 = new JTextField();
		JTextField j2 = new JTextField();
		final JTextField tf = new JTextField();
		j1.setBounds(50,50,150,20);
		j2.setBounds(50,100,150,20);
		tf.setBounds(50,150,150,20);
		JButton b = new JButton("ADD");;
		b.setBounds(50,200,95,30);
		b.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{	String num1= j1.getText();
				int n1= Integer.parseInt(num1);
				String num2= j2.getText();
				int n2= Integer.parseInt(num2);
				int n3=n1+n2;
				tf.setText(String.valueOf(n3));
			}
		});
		f.add(j1);
		f.add(j2);
		f.add(b);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}


/*
import java.awt.event.*;
import javax.swing.*;
public class ButtonExample
{	public static void main(String args[])
	{	JFrame f = new JFrame("Button example");
		final JTextField tf = new JTextField();
		tf.setBounds(50,50,150,20);
		JButton b = new JButton("Click here");;
		b.setBounds(50,100,95,30);
		b.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{	tf.setText("Welcome to javatpoint");
			}
		});
		f.add(b);
		f.add(tf);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
*/
