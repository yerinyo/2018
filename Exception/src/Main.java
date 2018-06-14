
public class Main {
	
	public static void main(String[] args) {
		
	
		
		int Arr[] = {1, 2, 3, 4};
		int i = 10;
		int j = 0;
		
		System.out.println(i+j);
		System.out.println(i-j);
		
		try {
			System.out.println(i/j);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(i*j);
		

		System.out.println(Arr[2]);
		try {
			System.out.println(Arr[4]);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}


