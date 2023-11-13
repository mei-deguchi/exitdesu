package curriculum_B;

public class Qes5 {
	
	public static void main(String[] args) {
		
		int [] [] kuku = new int [21][10];
		//
		for(int i=1; i<21; i++) {
			for(int j=1; j<10; j++) {
				kuku [i][j] = (i+1) * (j+1);
			
				
			
			System.out.print(kuku[i][j]);
			System.out.print(" ");
				
			}
			
			System.out.println("");
		}
		
	}

}
