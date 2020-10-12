package games.board;
import games.board.*;
import games.utilities.FileManager;

public class BoardGameTester {

	public static void main(String[] args) throws java.io.IOException {
		Board tictactoe = new Board(3,3);
		Board connectfour = new Board(6,7);
		Board mastermind = new Board(5,8);
		
		tictactoe.setCell(Mark.NOUGHT, 0, 0);
		connectfour.setCell(Mark.YELLOW, 5, 4);
		mastermind.setCell(Mark.BLUE, 4, 3);
		//System.out.println(tictactoe.toString());
		System.out.println(" ");
	    //System.out.println(connectfour.toString());
		System.out.println(" ");
		//System.out.println(mastermind.toString());
		FileManager.writeToFile(tictactoe.toString(), "ttt.txt");
		FileManager.writeToFileAsync(mastermind.toString(), "mm.txt");
		FileManager.writeToFileAsync(connectfour.toString(), "c4.txt");
	}

}
