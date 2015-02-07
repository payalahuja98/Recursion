import java.util.Scanner;
public class TowersOfHanoi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of discs");
		int discs = input.nextInt();
		towerRec(discs,1,2,3);
	}
	private static void towerRec(int d, int start, int mid, int end){
		if(d > 0){
			System.out.println(d + " disc(s) from peg " + start + " to peg " + end);
			towerRec(d - 1,start,end,mid);
			System.out.println(d + " disc(s) from peg " + start + " to peg " + end);
			towerRec(d - 1,mid,start,end);
		}
	}
}