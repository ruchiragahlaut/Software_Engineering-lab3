import java.util.Scanner;
public class ques2 {
	 static void bubbleSort(int arr[], int n) 
	    { 
	        if (n == 1) {
	            return; 
	        }
	        else {
	        for (int i=0; i<n-1; i++) 
	            if (arr[i] > arr[i+1]) 
	            { 
	                int temp = arr[i]; 
	                arr[i] = arr[i+1]; 
	                arr[i+1] = temp; 
	            } 
	        }
	        bubbleSort(arr, n-1);
	    } 

	 public static void print(int arr[]) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
			 
	 }
		 }
	public static void main(String[] args) {
			ques2 a=new ques2();
		  int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
	       
	        a.bubbleSort(arr, arr.length); 
	          
	        System.out.println("Sorted array : "); 
	        a.print(arr);
	    } 


}
