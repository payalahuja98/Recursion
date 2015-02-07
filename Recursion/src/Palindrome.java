import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word or sentence");
		String pal = input.nextLine();
		pal = pal.toLowerCase();
		boolean result = isPal(pal,0,pal.length() - 1);
		System.out.println(result);
	}
	private static boolean isPal(String p, int startIndex, int endIndex){
	  if(startIndex < endIndex){
		if(p.charAt(startIndex) != p.charAt(endIndex)){
			return false;
		}
		else{
			startIndex++;
			endIndex--;
			isPal(p,startIndex,endIndex);
		}
	  }
		return true;
	}
}
