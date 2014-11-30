//
//Find Index of 0 to be replaced with 1 to get longest continuous 
//sequence of 1s in a binary array
//
//Given an array of 0s and 1s, 
//find the position of 0 to be replaced with 1 to get longest continuous sequence
//of 1s. Expected time complexity is O(n) and auxiliary space is O(1).
//Example:
//
//Input: 
//   arr[] =  {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1}
//Output:
//  Index 9
//Assuming array index starts from 0, replacing 0 with 1 at index 9 causes
//the maximum continuous sequence of 1s.
//
//Input: 
//   arr[] =  {1, 1, 1, 1, 0}
//Output:
//  Index 4
//  
public class LongestContinousSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,1,1,0,0,1,0,1,1,1,0,0,1,1};
		int index=maxOnesIndex(arr);
		
		System.out.println(index);
	}

	private static int maxOnesIndex(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		int maxCount=0;
		int maxIndex=0;
		int prevZero=-1;
		int prevPrevZero=-1;
		
		for(int i=0;i<len;i++)
		{
			if(arr[i]==0)
			{
				if(i-prevPrevZero>maxCount)
				{
					maxCount=i-prevPrevZero;
					maxIndex=prevZero;
				}
				
				prevPrevZero=prevZero;
				prevZero=i;
			}
		}
		
		if(len-prevPrevZero>maxCount)
			maxIndex=prevZero;
		
		return maxIndex;
	}

}
