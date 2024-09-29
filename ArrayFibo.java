package Assignment28;

public class ArrayFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int[] arr = new int[5]; //       Array size   5
        arr[0] = 0;  // First Fibo num
        arr[1] = 1;  // Second Fibon num
        
        
        System.out.println(arr[0] + " " + arr[1]);
        
        
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];  
        }
        
        
        for (int i = 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  
        }
	}

}
