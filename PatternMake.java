public class PatternMake {

	public static void main(String[] args) {
		

		
		int num = 0;
		int r = 7 ; 
		
		int mid = (r+1)/2; 
		
		for (int i=1;i<=mid;i++) {
			for(int k=i; k<mid; k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i)-1; j++) {
				num = num+1;
				System.out.print(num);
			}
			System.out.println();
			
		}
		
		
		for (int i=1; i<=(mid-1); i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
						
			for(int j=1;j<=(2*(mid-i))-1; j++) {
				num = num+1;
				System.out.print(num);
			}
			System.out.println();
			
		}
				
	}
	
}
