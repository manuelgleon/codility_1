package solutions;

public class Solution {


	
	 public int solution(int[] A) {
		 int positiveInt = 1;
			for (int j = 1; j < A.length; j++) {
				for (int i = 0; i < A.length; i++) {
					if (A[i] == positiveInt) {
						positiveInt++;
					}
				}
			}
			return positiveInt;
	    }

}
