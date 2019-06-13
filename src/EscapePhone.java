import javax.swing.JFrame;

public class EscapePhone {
	JFrame frame;
	public static final int WIDTH = 640;
	public static final int HEIGHT = 1136;

	public EscapePhone() {
		frame = new JFrame();
	}

	void setup() {
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EscapePhone ep = new EscapePhone();
		ep.setup();
	}
}
//use league invaders recipe as base ??