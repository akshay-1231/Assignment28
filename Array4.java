package Assignment28;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int []arr= {1,2,3,4,5,6,6,6,6};
     int n=6;
     int count =0;
     
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==n)
    	  {
    		  count++;
    		  
    	  }
      }
	 
	System.out.println("The number of occurane are="+count);
	}
}
