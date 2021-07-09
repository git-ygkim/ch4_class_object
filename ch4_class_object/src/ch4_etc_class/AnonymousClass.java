package ch4_etc_class;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnonymousClass extends JFrame {
	
	final int FLYING_UNIT = 10;
	JLabel la = new JLabel("☆");
	
	
	// 생성자
	AnonymousClass() {
		setTitle("마우스로 조정하기");
		Container c = getContentPane();
		c.setBackground(Color.yellow);
		c.setLayout(null);
		
		// 아래 구현한 내부 클래스를 주석처리하고 아래 하기
		c.addKeyListener(new MyKeyListener());
		// 익명 클래스
//		c.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			switch (keycode) {
				case KeyEvent.VK_UP: 
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
					break;

				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
					break;

				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
					break;

				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX()+FLYING_UNIT, la.getY());
					break;

//				default:
			}			
		}

		@Override
		public void keyTyped(KeyEvent e) {}

		@Override
		public void keyReleased(KeyEvent e) {}
			
	}
	
	public static void main(String[] args) {
		new AnonymousClass();
		
	}
	

}
