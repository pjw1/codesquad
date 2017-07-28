package codesquad1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	    int strike = 0;
	    int ball = 0;
	    String nums[];
	    int nu[] = new int[3];
		
        Collections.shuffle(Arrays.asList(array));
         
        int com[] = new int[3];
        com[0] = Integer.parseInt(array[0]);
        com[1] = Integer.parseInt(array[1]);
        com[2] = Integer.parseInt(array[2]);
        
        do{
        System.out.println("what number?");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        nums = num.split("");
        nu[0] = Integer.parseInt(nums[0]);
        nu[1] = Integer.parseInt(nums[1]);
        nu[2] = Integer.parseInt(nums[2]);

        
        for(int i = 0 ; i < 3 ; i++){
        	if(nu[i] == com[i]){
        		strike++;
        	}
        	else if(nu[i] == com[(i+1) % 3] || nu[i] == com[(i+2)%3]){
        		ball++;
        	}
        }
        if (strike == 0 && ball == 0 ){
        	System.out.println("낫싱");
        }
        else{
        	System.out.println(strike + "스트라이크" + ball + "볼");
        }
        strike = 0;
        ball = 0;
        
        }while(com[0] != nu[0] || com[1] != nu[1] || com[2] != nu[2]);
           
		
	}
}
