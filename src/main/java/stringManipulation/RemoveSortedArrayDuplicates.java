package stringManipulation;

public class RemoveSortedArrayDuplicates {
	

	 public int removeDuplicates(int[] nums) {
		 
		 
		 int secondIterator = 1; //start 2nd iterator one after current index
		 
		 for(int i = 0; i < nums.length; i++) {
			 
			 	if(i < nums.length - 1){

					 int current =  nums[i];
					 int next = nums[secondIterator++];
		
					 if(current == next) {
						 nums[i++] = nums[i];
					 }
			 	}
		 }
		 
		 return nums.length;
	  }
}
