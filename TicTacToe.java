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
	    
		int colTotal = 0; // need to implement a colTotal to check columns
		int rowTotal = 0;
		int diagTotal = 0;
		int reverseDiagTotal = 0;
		
		
		for(int row=0;row<gameboard.length;row++) {
		   rowTotal =0;
		   	colTotal = 0;
			for(int col=0;col<gameboard[row].length;col++) { //Navigates the column first checking if X, or 0 has won
			   
			   rowTotal = rowTotal + gameboard[row][col]; //Stores value win total to see if it equals gameboard length to determine winner based on rows and columns
			   colTotal = colTotal + gameboard[col][row]; //Stores value 
			   
					   if(row == col) {
				   diagTotal = diagTotal + gameboard[row][col];
			   }
               if(row + col == gameboard.length -1) {
            	   reverseDiagTotal = reverseDiagTotal + gameboard[row][col];
               }
			}
			   if(rowTotal==gameboard.length){ 
				   return CROSS;
			   }
			   else if(rowTotal==gameboard.length * -1) {
				   return NOUGHT;  
			   }
			   else if(colTotal == gameboard.length) {
				   return CROSS;
			   }
			   else if(colTotal == gameboard.length * -1) {
				   return NOUGHT;
			   }
			   else if(diagTotal == gameboard.length) {
				   return CROSS;
			   }
			   else if(diagTotal == gameboard.length * -1) {
				   return NOUGHT;
			   }
			   else if(reverseDiagTotal == gameboard.length) {
				   return CROSS;
			   }
			   
			   else if(reverseDiagTotal == gameboard.length * -1) {
				   return NOUGHT;
			   }
			  	 
		}	 
		
		for(int row=0;row<gameboard.length;row++) {
				for(int col=0;col<gameboard[row].length;col++) { //Navigates the column first checking if X, or 0 has won
				   if(gameboard[row][col] == 0) {
					   return -2;
				   }
				}
		}   
				return 0;  		
				
		    
	}
	
	public static void main(String[] args) {
		
		createBoard(3,3);
		int turn = 0;
		int playerVal;
		int outcome;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		do {
		    displayBoard();
		    playerVal = (turn % 2 == 0)? NOUGHT : CROSS;
		    if (playerVal == NOUGHT)
		        System.out.println ("\n—O's turn—");
		    else System.out.println("\n—X's turn—" );
		    System.out.print("Enter row and column:" );
		    try {
		        set(playerVal, scan.nextInt(), scan.nextInt());
		    } catch (Exception ex)
		    {System.err.println(ex); turn--;}
		    
		    turn ++;
		    outcome = winOrTie();
		} while ( outcome == -2 );

		displayBoard();

		switch (outcome) {
		case NOUGHT:
		    System.out.println("O wins!");
		    break;
		case CROSS:
		    System.out.println("X wins!");
		    break;
		case 0:
		    System.out.println("Tie.");
		    break;
		}
		
		

	}

}
