package Chap1;

public class HFJ_5 {
	public static void main(String[] args) {
		
		  int x= 1; 
		  while(x<10){ 
		  	if(x>3){ 
		  		System.out.print(x+ " big x");
		  		if(x<9) {
			  		System.out.print(", ");
			  	}
		  	}
		  	x=x+1;
		  }// output : 4 big x, 5 big x, 6 big x, 7 big x, 8 big x, 9 big x 

	}
}
