import java.awt.Graphics;
import java.util.ArrayList;

public class TeacherGamePiece extends GamePiece{

	public TeacherGamePiece(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval(getX(), getY(), cellSize, cellSize);
		
	}
	
	public void chase(ArrayList<PlayerGamePiece> players) {
		setX(getX()/cellSize+ 1);
	}

}
