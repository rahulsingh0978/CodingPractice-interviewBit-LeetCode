package backtracking;

import java.util.Arrays;

public class Nqueen {
	class Position {
		int row,col;
		Position(int row,int col){
			this.row=row;
			this.col=col;
		}
	}
		
		private Position[] showNqueenResults(int n) {
			
			Position[] result = new Position[n];
			if(nqueencheck(n,0,result)) {
				return result;
			}else {
				return new Position[n];
			}
			
		}
		
		
		
		private boolean nqueencheck(int n,int row,Position[] pos) {
			//termination condition
			if(n==row) {
				return true;
			}
			int col;
			for(col =0;col<n;col++) {
				boolean isSafe = true;
				
				for(int queen=0;queen<row;queen++) {
					if(pos[queen].col==col || pos[queen].col - pos[queen].row == col-row || 
							pos[queen].col + pos[queen].row == col+row) {
						isSafe = false;
						break;
					}
				}
				if(isSafe) {
					pos[row]= new Position(row,col);
					if(nqueencheck(n,row+1,pos)) {
						return true;
					}
				}
			}
			return false;	
		}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*class position {
		int row, col;

		position(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	public position[] printNqueen(int n) {
		position[] pos = new position[n];
		boolean hasPath = showNqueen(n, 0, pos);
		if (hasPath) {
			return pos;
		} else {
			return new position[n];
		}

	}

	private boolean showNqueen(int n, int row, position[] pos) {
		if (n == row) {
			return true;
		}
		int col;
		for (col = 0; col < n; col++) {
			boolean issafe = true;

			// check in previous queen
			for (int queen = 0; queen < row; queen++) {
				if (pos[queen].col == col || pos[queen].row - pos[queen].col == row - col
						|| pos[queen].row + pos[queen].col == row + col) {
					issafe = false;
					break;
				}

			}
			if (issafe) {
				pos[row] = new position(row, col);
				if (showNqueen(n, row + 1, pos)) {
					return true;
				}
			}
		}
		return false;

	}*/

	
	public static void main(String[] args) {
		Nqueen obj = new Nqueen();
		Position[] positions = obj.showNqueenResults(4);
        Arrays.stream(positions).forEach(position -> System.out.println(position.row + " " + position.col));
		
		
	}
}
