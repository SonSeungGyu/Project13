package innerClass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex7 {
	public static void main(String[] args) {

		// 1.화면 만들기
		Frame frame = new Frame(); // Frame 은 창이다

		frame.setLayout(new FlowLayout()); // setLayout 은 컴포넌트 배치 방법

		frame.setBounds(500, 300, 500, 300); // setBounds는 시작위치와 길이, 너비 지정

		frame.setVisible(true);// setVisible true 값을 주어야 화면 나옴

		// 2.버튼 만들기
//		Button button = new Button("Click");
//		frame.add(button);
		
		//3.키 이벤트 등록하기
		//frame.addKeyListener(new MyKeyListener());
		
		//익명클래스로 키 이벤트 등록
		frame.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				System.out.println("키를 눌렀습니다!");
			}
		});
	}
}

class MyKeyListener extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키를 눌렀습니다!");
	}
	
}
