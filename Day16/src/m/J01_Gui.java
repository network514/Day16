package m;

import java.awt.*;

public class J01_Gui {
	
// GUI : Graphic User Interface
// GUI 작성 : 
// 1. 부품을 붙일 수 있는 바닥 역할의 기능이 기본적으로 필요하다. 
//	(=> 컨테이너 계열의 클래스라 한다.)
// 2. 바닥을 생성한 후, 부품을 만들고 부품을 바닥에 붙여야 한다. 
// 3. java.awt 패키지에 위치
	
	public static void main(String[] args) {
		
		Frame fr = new Frame("처음 만드는 화면");
//		fr.setSize(300, 200);	
//		fr.setLocation(500, 200);
		fr.setBounds(500, 200, 300, 200); //setSize와 setLocation을 한꺼번에 줄 수 있다.
		
		Button bt = new Button();
		bt.setLabel("눌러보세요");
		
		fr.add(bt);
//		=> 작성된 버튼 부품을 바닥에 붙이는 명령
		
		Button bt2 = new Button("두번째 버튼입니다.");
		fr.add(bt2);
//		=> 전에 설치한 bt에 대하여 bt2가 덮어쓰기 역할을 하기 때문에
//		첫번째 버튼이 보이지 않는다.
//		=> 바닥에 부품들의 구성을 설정하는 레이아웃 내용을 정의해야 한다.
		
		fr.setLayout(new GridLayout(1,3));
//		=> setLayout() 에는 구성하고 싶은 형태의 레이아웃 객체를 선언하여 넣어준다.
//		GridLayout은 격차 형태 구성을 지원한다. 
//		(1, 3) : 1행 3열 격자구조
		
		Button bt3 = new Button("세번째 버튼입니다.");
		fr.add(bt3);
		
		fr.setVisible(true); // true로 설정해야 보인다.
//		=> Frame을 눈으로 보이도록 하는 명령
//		=> 일반적으로 화면 구성이 모두 완성되면 명령한다.
		
	}
}
