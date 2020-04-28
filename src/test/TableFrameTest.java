package test;

import javax.swing.JFrame;

import view.TableFrame;

public class TableFrameTest {

	public static void main(String[] args) {
		TableFrame app = new TableFrame();
		app.setSize(1000, 825);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);

	}

}
