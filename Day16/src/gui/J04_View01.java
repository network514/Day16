package gui;

import java.awt.*;

public class J04_View01 {
	
	public J04_View01(String msg) {

		Frame fr;
		Button bt1, bt2;
		Label lb;

		fr = new Frame();
		fr.setBounds(800,70,400,300);
		fr.setLayout(new GridLayout(3,1));
		
		bt1 = new Button("버튼1");
		bt2 = new Button("버튼2");
		lb = new Label(msg);
		
		fr.add(bt1);
		fr.add(bt2);
		fr.add(lb);
		
		fr.setVisible(true);
	}
	
}
