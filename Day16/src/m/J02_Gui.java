package m;

import java.awt.*;

public class J02_Gui {
	public static void main(String[] args) {
		
		Frame fr = new Frame();
		fr.setBounds(900, 70, 400, 300);
		fr.setLayout(new GridLayout(3, 1));

		Label lb = new Label();
		lb.setText("그래픽 유저 인터페이스");
		lb.setBackground(Color.yellow);
		lb.setForeground(new Color(1, 0, 255)); // 글씨색
		fr.add(lb);
		
		Button bt1 = new Button();
//		Button bt1 = new Button("버튼1");
		bt1.setLabel("버튼1");
		bt1.setBackground(Color.yellow);
		bt1.setForeground(Color.black);
		fr.add(bt1);
		
		fr.setVisible(true);
	}
}
