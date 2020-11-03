package project;

import java.awt.*;
import javax.swing.*;

public class ThreadTest {
	static class ThreadGUI extends JFrame implements Runnable {
		JProgressBar bar1, bar2, bar3;
		
		ThreadGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("스레드 응용");
			
			this.setLayout(new GridLayout(3, 1, 10, 10));
			
			bar1 = new JProgressBar();
			bar1.setStringPainted(true);
			bar1.setForeground(Color.BLUE);
			bar1.setValue(50);
			
			bar2 = new JProgressBar();
			bar2.setStringPainted(true);
			bar2.setForeground(Color.RED);
			bar2.setValue(10);
			
			bar3 = new JProgressBar();
			bar3.setStringPainted(true);
			bar3.setForeground(Color.GREEN);
			bar3.setValue(30);
			
			this.add(bar1);
			this.add(bar2);
			this.add(bar3);
			
			setSize(512, 256);
			setVisible(true);
		}
		
		public void run() {
			for (int i = 0; i < 100; ++ i) {
				try {
					Thread.sleep(100);
					bar1.setValue(bar1.getValue() + 1);
					bar2.setValue(bar1.getValue() + 3);
					bar3.setValue(bar1.getValue() + 2);
				} catch (Exception e) {
					
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGUI thGUI= new ThreadGUI();
		Thread th = new Thread(thGUI);
		
		th.start();
	}

}
