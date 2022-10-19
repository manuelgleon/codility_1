package test;
import solutions.Solution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	/*Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].*/
	
	
	@Test
	void testSolution1() {
		int A[] =  {1, 3, 6, 4, 1, 2};
		assertEquals(5,new Solution().solution(A));
		
	}
	
	@Test
	void testSolution2() {
		int A[] =  {1, 2, 3};
		assertEquals(4,new Solution().solution(A));
		
	}
	
	@Test
	void testSolution3() {
		int A[] =  {-1, -3};
		assertEquals(1,new Solution().solution(A));
		
	}
	

	

}
