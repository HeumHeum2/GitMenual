package haksa;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Haksa extends JFrame{

	public Haksa() {
		this.setTitle("�л����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�й�"));
		JTextField tfId = new JTextField(20);
		c.add(tfId);
		c.add(new JLabel("�̸�"));
		JTextField tfName = new JTextField(20);
		c.add(tfName);
		
		c.add(new JLabel("�а�"));
		JTextField tfDept = new JTextField(20);
		c.add(tfDept);
		
		c.add(new JLabel("�ּ�"));
		JTextField tfAdress = new JTextField(20);
		c.add(tfAdress);
		
		JTextArea taList = new JTextArea(14,25);
		JScrollPane sp = new JScrollPane(taList);
		c.add(sp);
		
		JButton btnInsert = new JButton("���");
		c.add(btnInsert);
		JButton btnList = new JButton("���");
		c.add(btnList);
		JButton updateBtn = new JButton("����");
		c.add(updateBtn);
		JButton deleBtn = new JButton("����");
		c.add(deleBtn);
		taList.append("==============================\n");
		taList.append("�й�       �̸�       �а�       �ּ� \n");
		taList.append("==============================\n");
		
		this.setSize(300,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Haksa();
	}
	
	
	
}
