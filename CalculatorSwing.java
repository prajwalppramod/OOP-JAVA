import javax.swing.*;
import java.awt.event.*;
public class CalculatorSwing
{	public static void main(String args[])
	{
	try
	{	JFrame f= new JFrame();
		JLabel jtf = new JLabel("Enter values");
		JTextField j1 = new JTextField();
		JTextField j2 = new JTextField();
		final JTextField tf = new JTextField();
		
		JButton add= new JButton("+");
		JButton sub= new JButton("-");
		JButton mul= new JButton("*");
		JButton div= new JButton("/");
		JButton rem= new JButton("%");
		jtf.setBounds(175,0,100,40);
		j1.setBounds(50,50,350,40);
		j2.setBounds(50,90,350,40);
		tf.setBounds(50,150,350,40);
		add.setBounds(200,200,50,40);
		sub.setBounds(200,250,50,40);
		mul.setBounds(200,300,50,40);
		div.setBounds(200,350,50,40);
		rem.setBounds(200,400,50,40);
		add.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{	String num1= j1.getText();
				int n1= Integer.parseInt(num1);
				String num2= j2.getText();
				int n2= Integer.parseInt(num2);
				int n3=n1+n2;
				tf.setText(String.valueOf(n3));
			}
		});
		sub.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{	String num1= j1.getText();
				int n1= Integer.parseInt(num1);
				String num2= j2.getText();
				int n2= Integer.parseInt(num2);
				int n3=n1-n2;
				tf.setText(String.valueOf(n3));
			}
		});
		mul.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{	String num1= j1.getText();
				int n1= Integer.parseInt(num1);
				String num2= j2.getText();
				int n2= Integer.parseInt(num2);
				int n3=n1*n2;
				tf.setText(String.valueOf(n3));
			}
		});
		div.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{	String num1= j1.getText();
				int n1= Integer.parseInt(num1);
				String num2= j2.getText();
				int n2= Integer.parseInt(num2);
				int n3=n1/n2;
				tf.setText(String.valueOf(n3));
			}
		 
		});
		rem.addActionListener(new ActionListener()
		{	public void actionPerformed(ActionEvent e)
			{	String num1= j1.getText();
				int n1= Integer.parseInt(num1);
				String num2= j2.getText();
				int n2= Integer.parseInt(num2);
				int n3=n1%n2;
				tf.setText(String.valueOf(n3));
			}
		});
		f.add(jtf);
		f.add(j1);
		f.add(j2);
		f.add(tf);
		f.add(add);
		f.add(sub);
		f.add(mul);
		f.add(div);
		f.add(rem);
		f.setSize(450,500);
		f.setLayout(null);
		f.setVisible(true);
	}
	catch(Exception k)
	{	System.out.println(""+k.toString());
	}
	}
}
