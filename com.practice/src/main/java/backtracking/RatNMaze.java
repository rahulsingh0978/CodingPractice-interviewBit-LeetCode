package backtracking;

public class RatNMaze {
	int row[] = {1,-1,0,0};
	int col[] = {0,0,-1,1};
	
	public void dfs(int[][] visited,int[][] maze,int destR,int destC,int moves,int r,int c,int Row,int Col) {
		if(r==destR && c==destC) {
			for(int i=0;i<Row;i++) {
				for(int j=0;j<Col;j++) {
					System.out.print(visited[i][j]);
				}
				System.out.println();
			}
			System.out.println("////////////");
		}else {
			for(int i=0;i<4;i++) {
				int nrow = r+row[i];
				int ncol= c+col[i];
				
				if(isSafe(visited,maze,nrow,ncol,Row,Col)) {
					moves++;
					visited[nrow][ncol]=moves;
					dfs(visited,maze,destR,destC,moves,nrow,ncol,Row,Col);
					moves--;
					visited[nrow][ncol]=0;
				}
			}
		}
	}
	
	public boolean isSafe(int[][] visited,int[][] maze , int r,int c,int R,int C) {
		if(r>=0 && r<R && c>=0 && c<C && visited[r][c] ==0 && maze[r][c]==1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int[][] visited = {{1,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		int[][] maze = {{1,1,0,0},
						{0,1,1,1},
						{0,1,0,1},
						{0,1,1,1}};
		int moves = 1;
		RatNMaze obj = new RatNMaze();
		obj.dfs(visited, maze, 3, 3, moves, 0, 0, 4, 4);
	}
}
