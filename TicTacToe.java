package tictactoegame;
public class TicTacToeGame {

	static int[][] gameboard;
	static final int EMPTY = 0;
	static final int NOUGHT = -1;
	static final int CROSS = 1; 

	/* Set a square on the board must be empty */
	static void set(int val, int row, int col)
	throws IllegalArgumentException {
	    if (gameboard[row][col] == EMPTY)
	        gameboard[row][col] = val;
	    else throw new IllegalArgumentException
	        ("Player already there!");
	}
  
	/* display the board */
	static void displayBoard() {
	    for( int r = 0; r < gameboard.length; r++ ) {
	        System.out.print("|");
	        for (int c = 0; c < gameboard[r].length; c++)
	        {
	            switch(gameboard[r][c]) {
	            case NOUGHT:
	                System.out.print("O" );
	              break;
	            case CROSS:
	                System.out.print("X" );
	                break;
	            default: //Empty
	                System.out.print(" ");
	            }
	            System.out.print("|");
	        }

	        System.out.println("\n-------");
	    }
	}

	static void createBoard(int rows, int cols) {
	    gameboard = new int [rows][cols];
	}

	static int winOrTie() {
	    
		int winTotal = 0;
		for(int row=0;row<gameboard.length;row++) {
		   winTotal =0;
			for(int col=0;col<gameboard[row].length;col++) {
			   if(gameboard[row][col] == 0) {
				   return -2;
		  }
			   winTotal = winTotal + gameboard[row][col];
	   }
			   if(winTotal==gameboard.length){
				   return CROSS;
	 
		   }
			   else if(winTotal==gameboard.length * -1) {
				   return NOUGHT;
				   
			   }
			  		 
			  
	   }    		
	}
	
	public static void main(String[] args) {
		
		

	}

}
