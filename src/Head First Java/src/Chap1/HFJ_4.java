package Chap1;

public class HFJ_4 {
	
	// output : a-b c-d 
	public static void main(String[] args) {
			int x =3;
			while(x>0) {
				if(x>2) {
					System.out.print("a");
				}
				if(x==2) {
					System.out.print("b c");
				}
				
				x=x-1;
				System.out.print("-");
				
				if(x==1) {
					System.out.print("d");
					x=x-1;	
				}
			}
	}
}
