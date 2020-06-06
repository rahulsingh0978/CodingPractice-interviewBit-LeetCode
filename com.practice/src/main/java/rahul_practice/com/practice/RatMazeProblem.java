package rahul_practice.com.practice;

public class RatMazeProblem {

	public boolean isPath(int[][] maze, int[][] isVerified, int row, int col, int r,int c) {
		if (row >=0 && row < r&& col >=0 && col < c && 
 (maze[row][col] ==1 )) {
			return true;
		}
		return false;
	}
	
	static void printMaze(int[][] maze , int r,int c) {
		/*int c = maze[0].length;
		int r = maze.length;*/
		for (int i=0;i<r;i++) {
			for(int j = 0 ; j < c ; j++) {
				System.out.print(" "+ maze[i][j]);
			}
			System.out.println();
		}
	}
	
	boolean solveMaze(int[][] maze, int r,int c) {
		int[][] path = new int[r][c];
		if(solveMazeUtil(maze,0,0,r,c,path) ==false) {
			System.out.println("Path does not exist");
			return false;
		}
		printMaze(maze,r,c);
		return true;
	}

	 boolean solveMazeUtil(int[][] maze, int i, int j,int r,int c, int[][] path) {
		if(i==r-1 && j==c-1) {
			path[i][j] =1;
			return true;
		}
		if(isPath(maze, path, i, j, r, c)) {
			path[i][j] = 1;
			if(solveMazeUtil(maze, i, j+1, r, c, path)) {
				return true;
			}
			if(solveMazeUtil(maze, i+1, j, r, c, path)) {
				return true;
			}
			path[i][j] = 0;
			return false;
		}
		return false;
		
		
		
	}
	
	public static void main(String[] args) {
		RatMazeProblem r = new RatMazeProblem();
		int[][] maze = {{ 1, 0, 0, 0 }, 
                { 1, 1, 0, 1 }, 
                { 0, 1, 0, 0 }, 
                { 1, 1, 1, 1 } };
		int r1 = 4;
		int c1 = 4;
		r.solveMaze(maze, r1, c1);
		
	}
	
}
