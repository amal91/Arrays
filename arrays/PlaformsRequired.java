//
//Minimum Number of Platforms Required for a Railway/Bus Station
//
//Given arrival and departure times of all trains that reach a railway station,
//find the minimum number of platforms required for the railway station so that
//no train waits.
//We are given two arrays which represent arrival and departure times of 
//trains that stop.
//
//Examples:
//
//Input:  arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
//        dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
//Output: 3
//There are at-most three trains at a time (time between 11:00 to 11:20)

import java.util.Arrays;

public class PlaformsRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
	    int[] dep = {950, 1000, 1120, 1130, 1900, 2000};
	    int platforms=findPlatforms(arr,dep);
	    System.out.println(platforms);

	}

	private static int findPlatforms(int[] arr, int[] dep) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int platforms=0,maxPlatforms=0;
		int i=0,j=0;
		while(i<arr.length&&j<arr.length)
		{
			if(arr[i]<=dep[j])
			{
				platforms++;
				i++;
				if(maxPlatforms<platforms)
					maxPlatforms=platforms;
			}
			else {
				platforms--;
				j++;
			}
		}
		return maxPlatforms;
	}

}
