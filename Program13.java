package StarPattern;

//         *
//        * *
//       *   *
//      *     *
//     *       *



public class Program13 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				if(k==1 || k==i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				if(k<i) {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}

	}

}
