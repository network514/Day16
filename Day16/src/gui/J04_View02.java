package gui;

import java.awt.*;

public class J04_View02 {

	Frame fr;
	Button bt1, bt2;
	Label lb;
	String msg;
	
	public J04_View02(String msg) {
		this.msg = msg;
		setGui(); //화면구성 메소드
				  // + 기능 구성 메소드 추가
	}
	
	private void setGui(){

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
