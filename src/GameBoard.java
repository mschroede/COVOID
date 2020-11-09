import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GameBoard extends JPanel implements ActionListener{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<GamePiece> gamePieces;
	  public GameBoard()
	  {
	    setBackground(Color.WHITE);

	    gamePieces = new ArrayList<GamePiece>();
	    Timer clock = new Timer(1000, this);
	    clock.start();

	  }
	  public void addGamePiece(GamePiece gamePiece)
	  {
	    gamePieces.add(gamePiece);
	    repaint();
	  }
	  public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);
	    g.drawRect(5, 5, 800, 800);

	    for (GamePiece gamePiece : gamePieces)
	    {
	      gamePiece.draw(g);
	    }
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<PlayerGamePiece> players = new ArrayList<PlayerGamePiece>();
		for (GamePiece gamePiece : gamePieces) {
			if (gamePiece instanceof PlayerGamePiece) {
				players.add((PlayerGamePiece) gamePiece);
			}
		}
		for (GamePiece gamePiece : gamePieces) {
			if (gamePiece instanceof TeacherGamePiece) {
				((TeacherGamePiece) gamePiece).chase(players);
			}
		}
		repaint();
	}


	
}
