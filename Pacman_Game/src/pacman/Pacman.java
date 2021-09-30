package pacman;

import javax.swing.JFrame;

import com.sun.jdi.event.EventQueue;

public class Pacman extends JFrame {

	public Pacman() { // interface
		initUI();
	}

	private void initUI() {
		add(new Board());
		setTitle("Pacman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(380, 420);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Pacman().setVisible(true);

				String filepath = "pacmanMusic.wav";
				Board musicObject = new Board();
				musicObject.playMusic(filepath);
			}
		});

	}

};
