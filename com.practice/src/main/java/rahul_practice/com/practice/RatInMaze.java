package rahul_practice.com.practice;

public class RatInMaze {
	public static int[] R= {-1,1,0,0};
	public static int[] C= {0,0,-1,1};
	public static int ROW=4;
	public static int COL=4;
	
	
	public static void FindPath(int[][] maze,int srow,int scol,int drow, int dcol,int[][] isVisited,int moves) {
		if(srow==drow && scol == dcol) {
			for(int i=0;i<ROW;i++) {
				for(int j=0;j<COL;j++) {
					System.out.print(isVisited[i][j]+", ");
				}
				System.out.println();
			}
			System.out.println("/////////////");
		}
		
		for(int i=0;i<R.length;i++) {
			int newRow = srow+R[i];
			int newCol = scol+C[i];
			if(isValid(isVisited,maze,newRow,newCol)) {
				moves++;
				isVisited[newRow][newCol]=moves;
				
				FindPath(maze,newRow,newCol,drow,dcol,isVisited,moves);
				moves--;
				isVisited[newRow][newCol]=0;
			}
		}
	}
	
	
	public static boolean isValid(int[][] isVisited,int[][] isAvailablePath,int r,int c) {
		if(r>=0 && r<ROW && c>=0 && c<COL && isVisited[r][c]==0 && isAvailablePath[r][c]==1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] maze= {{1,1,0,1 },
                {0,1,1,1 },
                {0,1,0,1 },
                {0,1,1,1 } };
		int[][] isVisited = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		isVisited[0][0]=1;
		FindPath(maze,0,0,3,3,isVisited,1);
		
		
	}
}
