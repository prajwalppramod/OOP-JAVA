import javax.swing.*;
public class FirstSwingExample
{	public static void main(String args[])
	{	JFrame f= new JFrame(); //creating instance of jframe
		JButton b= new JButton("click"); //creatinh insdtance of jbutton
		b.setBounds(130,100,100,40); //xaxis yaxis width height
		f.add(b); //adding button in jframe
		f.setSize(400,500); //width height
		f.setLayout(null); //using no layout manager
		f.setVisible(true); //making frame visible
	}
}
