package innerClass.Quiz;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz1 {
	public static void main(String[] args) {
		//화면 생성
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500,300,50,300);
		
		TextArea textArea = new TextArea("텍스트상자",10,50);
		frame.add(textArea);
		
		frame.setVisible(true);
		
		//미리 구현한 클래스로 키 이벤트 등록
		//textArea.addFocusListener(new MyFocusListener());
		
		textArea.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("텍스트에 포커스가 벗어났습니다!");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("텍스트에 포커스가 되었습니다!");
			}
		});
	}
}


//class MyFocusListener implements FocusListener{
//
//	@Override
//	public void focusGained(FocusEvent e) {
//		System.out.println("텍스트에 포커스가 되었습니다!");
//	}
//
//	@Override
//	public void focusLost(FocusEvent e) {
//		System.out.println("텍스트에 포커스가 벗어났습니다!");
//	}
//	
//}
