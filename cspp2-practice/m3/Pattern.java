public class Pattern{
	public static void main(String[] args){
		int num = 1,i,j;
		for(i = 1; i <= 5; i++){
			for (j = 1; j<= i; j++){
				System.out.print(j);	
			}
			System.out.print("\n");
		}
	}
}