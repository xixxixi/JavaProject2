package references;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] Arys = new int [5];
		for ( int i = 0; i < Arys.length; i++) {
			Arys[i]=(int) (Math.random() * 10 + 1);
			System.out.println(Arys[i]);
			
		}
		
		int maxValue = 0;
		for ( int i =0; i < Arys.length; i++) {
			Arys[i]=(int) (Math.random() * 10 + 1);
			if ( Arys[i]==maxValue) {
				System.out.println("�ִ밪: " + maxValue);
			}
		}
		

	}

}
