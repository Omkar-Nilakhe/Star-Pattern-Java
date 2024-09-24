package StarPattern;

//*       *
// *     *
//  *   *
//   * *
//    *

public class Program14 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				
			}
			for(int k=5;k>=i;k--) {
				if(k==5 || k==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				if(k>i) {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}

	}

}
