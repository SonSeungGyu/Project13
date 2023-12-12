package innerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//awt: 화면 기반 어플리케이션을 개발하기 위한 라이브러리이다.

public class Ex6 {
	public static void main(String[] args) {
		
		//1.화면 만들기
		Frame frame = new Frame(); // Frame 은 창이다
		
		frame.setLayout(new FlowLayout()); //setLayout 은 컴포넌트 배치 방법
		
		frame.setBounds(500,300,500,300); //setBounds는 시작위치와 길이, 너비 지정
		
		frame.setVisible(true);//setVisible true 값을 주어야 화면 나옴
		
		//2.버튼 만들기
		Button button = new Button("Click");
		frame.add(button);
		
		//3.버튼 이벤트 등록하기
		//button.addActionListener(new EventHandler());
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다....");
			}
			
			
		});
		
	}
}

class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다!");
	}
	
}
