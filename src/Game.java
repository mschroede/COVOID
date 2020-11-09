import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Game {
	private JFrame window;
	private GameBoard board;
	
	public Game() {
		window = new JFrame("COVID Game");
	    window.setBounds(300, 300, 810, 810);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    board = new GameBoard();
	    board.setBackground(Color.WHITE);
	    Container c = window.getContentPane();
	    c.add(board);
	    window.setVisible(true);		
	}
	public void startGame() {
		board.addGamePiece(new WallGamePiece(10, 20, 4));
		board.addGamePiece(new WallGamePiece(20, 10, 20, false));
		board.addGamePiece(new TeacherGamePiece(1, 15));
	}


	public GameBoard getBoard() {
		return board;
	}

	public void setBoard(GameBoard board) {
		this.board = board;
	}

	public static void main(String[] args) {
		{
		   new Game().startGame();
		  }

	}
}
