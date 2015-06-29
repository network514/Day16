package gui;

import java.awt.*;

public class J05_BorderLayout {
	
	Frame fr;
	Button bt1, bt2, bt3, bt4;
	Label lb;
	
	public J05_BorderLayout() {
		fr = new Frame();
		fr.setBounds(800, 70, 400, 300);
		fr.setLayout(new BorderLayout());
//		=> BorderLayout :
//		지정된 바닥을(fr)을 동서남북 및 중앙의 형태로 구성
//		(위치 키워드 : 
//			East, west, North, South, Center
//		)
//		위치 키워드의 첫글자는 반드시 대문자로 표기해야 한다.
		
		bt1 = new Button("버튼1111");
		bt2 = new Button("버튼2222");
		bt3 = new Button("버튼3333");
		bt4 = new Button("버튼4444");
		lb = new Label("레이블 메세지 보기");
		
		fr.add("North", bt1);
		fr.add("East", bt2);
		fr.add("West", bt3);
		fr.add("South", bt4);
		fr.add("Center", lb);
		
		fr.setVisible(true);
	}
}
