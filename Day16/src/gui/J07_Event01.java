package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class J07_Event01 {
	
	Frame fr;
	Button bt1, bt2;
	Label lb;
	
	public J07_Event01() {
		fr = new Frame();
		fr.setBounds(800, 70, 400, 300);
		fr.setLayout(new BorderLayout());
		
		
		bt1 = new Button("버튼1111");
		bt2 = new Button("버튼2222");
		lb = new Label();
		
		fr.add("East", bt2);
		fr.add("West", bt1);
		fr.add("Center", lb);
		
		fr.setVisible(true);
		
//		1. 인터페이스 구현 클래스 이용하기
//		=> 부품에 기능을 작성하는 경우
//		부품.addActionListener(기능 메소드를 가진 객체); 형식의 메소드를 명시한다.
//		=> 기능 메소드를 가지고 잇는 객체는 ActionListener 인터페이스를 implements 해야한다.
//		=> 인터페이스가 지정한 메소드를 오버라이드 해야 하는데,
//		이 메소가 기능 메소드 이며 이름은 actionPerformed 이다.
//		=> 부품이 대기상태에 있다가 장동이 감지되면, 지정된 객체 안에 
//		만들어진 actionPerformed 메소드를 호출하게 된다.
		bt1.addActionListener(new J07_Handler(lb));
		
//		2. 부품을 작동시키는 또 하나의 방법 : 
//		익명클래스 사용하기
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}
	
	

}
