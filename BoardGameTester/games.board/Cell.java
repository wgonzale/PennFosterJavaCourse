package games.board;

public class Cell {

	private Mark content;
	private int row;
	private int column;
	
	public Cell(int row, int column) {
		this.row = row;
		this.column =column;
		content=Mark.EMPTY;
	}

	public Mark getContent() {
		return content;
	}
	
	public void setContent(Mark content) {
		this.content = content;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}




}
