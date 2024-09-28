package Assignment28;

public class ReversArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = { 1, 2, 3, 4, 5 };
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		 System.out.println("Reversed Array:");
	        for (int num : arr) {
	            System.out.print(num + " "); 
	}
}
}


//Condition: The while loop runs as long as start is less than end.
//Swapping: Inside the loop:
//The value at the start index is temporarily stored in temp.
//The value at the end index is assigned to the start index.
//The value stored in temp is then assigned to the end index.
//Moving Indices: After swapping, start is incremented and end is decremented,