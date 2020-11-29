package Amazon;

import java.util.ArrayList;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int X = 10;
		String s ="";
		ArrayList<Integer> binary = new ArrayList<>() ;
        
        while(X>0){
         binary.add(X%2);
         X=X/2;
        }
        
        System.out.println(binary);
        for(int i :binary){
        	s+= i;
        }
        
        
        Long result = Long.parseLong(s,2);
        System.out.println(result);

	}

}
