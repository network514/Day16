package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J07_Event02 {

	Frame fr;
	
	Button bt1, bt2;
	Label lb;
	
	public J07_Event02() {
		setView();	// 화면 구성
		action();	// 이벤트
	}
	
	private void setView() {
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
	}
	
	private void action() {

		bt1.addActionListener(
					new J07_Handler(lb));
		
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("버튼2번 호출됨");
				lb.setText("버튼 2222번의 기능 작동");
			}
		});
	}
	
	
	
	
}














