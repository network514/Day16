package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J08_Handler implements ActionListener{

	public J08_Handler() {

		Frame fr;
		Button bt1, bt2, bt3, bt4;
		Label lb;
		
		fr = new Frame();
		fr.setBounds(300, 400, 500, 500);
		fr.setLocation(500, 500);
		fr.setLayout(new BorderLayout());
		
		bt1 = new Button("버튼1111");
		bt2 = new Button("버튼2222");
		bt3 = new Button("버튼3333");
		bt4 = new Button("버튼4444");
		
		bt1.setBackground(Color.yellow);
		bt2.setBackground(Color.BLUE);
		bt3.setBackground(Color.RED);
		bt4.setBackground(Color.ORANGE);
		
		lb = new Label();
		
		fr.add("North", bt1);
		fr.add("East", bt2);
		fr.add("West", bt3);
		fr.add("South", bt4);
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
