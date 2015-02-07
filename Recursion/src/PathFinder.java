import java.util.Scanner;
import java.util.Random;
public class PathFinder{
	static int destRow;
	static int destCol;
	static boolean[][] grid;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		System.out.println("Enter length");
		int length = input.nextInt();
		System.out.println("Enter width");
		int width = input.nextInt();
		grid = new boolean[width][length];
		System.out.println("Enter percent of blocked squares");
		int percent = input.nextInt();
		for(int i = 0; i < length; i++){
			for(int j = 0; j < width; j++){
			    if(num.nextInt(100) <= percent){
			    	grid[i][j] = false;
			    }
			    else{
			    	grid[i][j] = true;
			    }
			}
			System.out.println();
		}
		destRow = width;
		destCol = length;
		System.out.println(recPath(0,0));
		for(int i = 0; i < length; i++){
			for(int j = 0; j < width; j++){
			    if(grid[i][j]){
			    	System.out.print("-");
			    }
			    else{
			    	System.out.print("x");
			    }
			}
			System.out.println();
		}
	}
	private static boolean recPath(int row, int col){
		if(row == grid.length - 1 || col == grid[row].length - 1){
			System.out.println("ENTERED");
			return true;
		}
		else{
			if(grid[row][col]){
				row = row + 1;
				col = col + 1;
				System.out.println("entered");
				recPath(row,col);
				if(recPath(row,col)){
					return true;
				}
			}
			//return true;
		}
		return false;
		
	}
}

