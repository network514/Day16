package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class J07_Handler implements ActionListener{
	
	Label lb;
	
	public J07_Handler(Label lb) {
		this.lb=lb;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		lb.setText("버튼 111번이 작동함");
	}
	
}
