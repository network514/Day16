package m;

import java.awt.*;

public class J03_Quiz {
	public static void main(String[] args) {
//		문제 : 
//		2행 2열 구조 화면에 버튼 2개, 레이블 2개를 작성.
//		원하는 배경색, 글씨색 적용
		
		Frame fr = new Frame();
		fr.setBounds(600, 400, 400, 400);
		fr.setLayout(new GridLayout(2, 2));
		
		
		Label lb1 = new Label();
		lb1.setText("1행 1열");
		lb1.setBackground(Color.blue);
		lb1.setForeground(Color.yellow); // 글씨색
		fr.add(lb1);
		

		Label lb2 = new Label();
		lb2.setText("1행 2열");
		lb2.setBackground(Color.yellow);
		lb2.setForeground(Color.red); // 글씨색
		fr.add(lb2);
		
		Button bt = new Button();
		bt.setLabel("2행 1열");
		bt.setBackground(Color.yellow);
		bt.setForeground(Color.black);
		fr.add(bt);

		Button bt2 = new Button();
		bt2.setLabel("2행 2열");
		bt2.setBackground(Color.black);
		bt2.setForeground(Color.yellow);
		fr.add(bt2);
		
		fr.setVisible(true);
	}
}
