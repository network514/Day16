package gui;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J06_Input {

	Frame fr;
	TextArea ta; // 긴 글을 쓸 때사용
	TextField tf; // 한 문장을 쓸 때 사용
	List li; // 리스트(목록) 정보
	Label lb; // 날짜 보여줄 레이블
	
	public J06_Input() {
		fr = new Frame();
		fr.setBounds(800, 70, 400, 300);
		fr.setLayout(new BorderLayout());
		
		ta = new TextArea();
		tf = new TextField();
		li = new List();
		lb = new Label();
		
		li.add("음식정보");
		li.add("국가정보");
		li.add("인사정보");
		li.add("자동차 정보");
//		=> List에 목록을 만드는 경우 add()를 사용해야 한다.
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (EEEE)");
		String rcv = sdf.format(date);
		lb.setText(rcv);
		fr.add("North", lb);
		fr.add("Center", ta);
		fr.add("East", li);
		fr.add("South", tf);
		
		fr.setVisible(true);
	}
}
