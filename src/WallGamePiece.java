import java.awt.Graphics;
import java.awt.Color;


public class WallGamePiece extends GamePiece {
	private final static int wallSize = 15;
	private int length;
	private boolean horizontal;
	
	public WallGamePiece(int x, int y) {
		super(x,y);
		setLength(10);
		setHorizontal(true);
	}

	public WallGamePiece(int x, int y, int length) {
		super(x,y);
		setLength(length);
		setHorizontal(true);
	}
	public WallGamePiece(int x, int y, int length, boolean horizontal) {
		super(x,y);
		setLength(length);
		setHorizontal(horizontal);
	}
	public int getLength() {
		return length * cellSize;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isHorizontal() {
		return horizontal;
	}

	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
	// TODO make the wall size configurable and allow them to appear between the cells.
	public void draw(Graphics g)
	  {
		  int l = getLength();
		  int x = getX();
		  int y = getY();
		  g.setColor(Color.BLACK);
		  if(isHorizontal()) {
			  g.fillRect(x, y, l, wallSize);
		  }
		  else {
			  g.fillRect(x, y, wallSize, l);
	  }
	}

}
