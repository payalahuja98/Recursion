import java.util.Random;
import java.util.Scanner;
public class Blobs{
	static boolean[][] grid;
	static boolean[][] visited;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows");
		int r = input.nextInt();
		System.out.println("Enter columns");
		int c = input.nextInt();
		grid = new boolean[r][c];
		visited = new boolean[r][c];
		System.out.println("Enter percent of blobs");
		int numBlobs = input.nextInt();
		setBlobs(numBlobs);
		printGrid();
		System.out.println("Number of Blobs: " + countBlobs());
		//printVisited();
	}
	private static void setBlobs(int num){
		Random r = new Random();
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(r.nextInt(100) < num){
					grid[i][j] = true;
				}
			}
		}
	}
	private static int countBlobs(){
		int count = 0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j]){
					count++;
					markBlobs(i,j);
				}
			}
		}
		return count;
	}
	private static void markBlobs(int r, int c){
		/*if(grid[r][c] && r < grid.length){
			visited[r][c] = true;
			markBlobs((r + 1),c);
		}*/
	 if(r < grid.length - 1 && c < grid[r].length - 1){
		for(int i = r; i <= r + 1; i++){
			for(int j = c; j <= c + 1; j++){
				if(grid[i][j]){
					visited[i][j] = true;
				}
			}
		}
	 }
	}
	private static void printGrid(){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j]){
					System.out.print("x");
				}
				else{
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	/*private static void printVisited(){
		for(int i = 0; i < visited.length; i++){
			for(int j = 0; j < visited[i].length; j++){
				System.out.print(visited[i][j] + "  ");
			}
			System.out.println();
		}
	}*/
	
}
