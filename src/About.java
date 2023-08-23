import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
	
	public About() {
		
		setBounds(400, 100, 600, 500);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("NotepadIcons/windows.png"));
		Image i2=i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel headerIcon=new JLabel(i3);
		headerIcon.setBounds(70, 40, 400, 80);
		add(headerIcon);
		
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("NotepadIcons/notepad.png"));
		Image i5=i4.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel sideIcon=new JLabel(i6);
		sideIcon.setBounds(50, 180, 70, 70);
		add(sideIcon);
		
		JLabel text=new JLabel("<html>Microsoft Notepad<br>Version Notepad++ v7 on Windows 10<br>Microsoft Corporation <br> All Rights are reserved</html>");
		text.setBounds(150, 100, 500, 200);
		text.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		add(text);
		
		JButton b1=new JButton("OK");
		b1.setBounds(350,350,90,25);
		b1.addActionListener(this);
		add(b1);
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
		
	}
	
	
	public static void main(String[] args)
	{
		new About();
	}
	
	
}
