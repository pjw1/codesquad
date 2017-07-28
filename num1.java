package codesquad1;
import java.util.Scanner;


public class num1 {

	public static void main(String[] args) {
		System.out.println("What?");
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String words[] = str.split(" ");
		
		for(int i = words.length - 1; i >= 0 ; i--){
			System.out.println(words[i]);
		}
		
		System.out.println("전체 수 : " + words.length);
		
		
		scanner.close();
		
		

	}

}
