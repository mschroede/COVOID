import java.awt.Graphics;

public abstract class GamePiece {
	private int x;
	private int y;
	protected final static int cellSize = 20;
	
	public GamePiece(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x * cellSize;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y * cellSize;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract void draw(Graphics g);
}