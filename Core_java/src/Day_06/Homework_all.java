package Day_06;

public class Homework_all {

	public static void main(String[] args) {
		
//		2. Enter 5 array elements and sort them in ascending order.
		int arr7[] = { 5, 7, 9, 6, 8, 4, 1 };
//		Ascending order
		for (int i = 0; i < arr7.length - 1; i++) {
			  for (int j = 0; j < arr7.length - 1 - i; j++) {
			    if (arr7[j] > arr7[j + 1]) {
			    	
			      int temp = arr7[j];
			      arr7[j] = arr7[j + 1];
			      arr7[j + 1] = temp;
			    }
			  }
			}
		System.out.print("asending order : ");
	    for (int j = 0; j < arr7.length; j++) {
	        System.out.print(arr7[j] + "  ");
	      }
	    System.out.println();
	    
//	    descending order
	    for (int i = 0; i < arr7.length - 1; i++) {
			  for (int j = 0; j < arr7.length - 1 - i; j++) {
			    if (arr7[j] < arr7[j + 1]) {
			    	
			      int temp = arr7[j];
			      arr7[j] = arr7[j + 1];
			      arr7[j + 1] = temp;
			    }
			  }
			}
	    System.out.print("decending order : ");
	    for (int j = 0; j < arr7.length; j++) {
	        System.out.print(arr7[j] + "  ");
	      }
	    System.out.println();
	    System.out.println();
	    
//	    3. Enter 10 array elements and find the minimum and maximum number among them.
	    int arr8[] = {50,65,12,75,15,42};
	    
	    int min = Integer.MIN_VALUE;
	    int max = Integer.MAX_VALUE;
	    
	    for(int i=0; i<arr8.length; i++) {
	    	if(arr8[i]>min) {
	    		min = arr8[i];
	    	}
	    	if(arr8[i]<max) {
	    		max = arr8[i];
	    	}
	    }
	    System.out.println("maximun number is : " + min);
	    System.out.println("minimum number is : " + max);
	    System.out.println();
	    
//	    4. Enter 10 array elements and store even and odd numbers among them in different arrays.
	    int arr9[] = {50,65,12,75,15,42};
        int even[] = new int[arr9.length];
        int odd[] = new int[arr9.length];
        
        for(int i=0; i<arr9.length; i++) {
          if(arr9[i] % 2 == 0){
            even[i]= arr9[i];
            
          }
          if(arr9[i] % 2 != 0){
            odd[i]= arr9[i];
          }
        }
        
        System.out.print("even number is ");
        for(int i=0; i<arr9.length; i++) {
        	if(even[i] != 0) {
        		System.out.print(even[i]+" ");
        	}
        }
        System.out.println();
        System.out.print("odd number is ");
        for(int i=0; i<arr9.length; i++) {
        	if(odd[i] != 0) {
    		System.out.print(odd[i]+" ");
    	}
        } 
	}

	}

