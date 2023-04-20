import javax.swing.ImageIcon;

public class Predators extends Ball {
	public Predators() {
		super();
	}
	public Predators(int x, int y) {
		super(x, y, 40, 40, 2, new ImageIcon("snake.png"));
	}
    public static void move(int width, int height) {
    }
	public void reverseHorz() {
	}
	
}
