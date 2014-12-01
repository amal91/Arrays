//
//How to check if two given sets are disjoint?
//
//Given two sets represented by two arrays, how to check if the given
//two sets are disjoint or not? 
//It may be assumed that the given arrays have no duplicates.
//
//Difficulty Level: Rookie
//
//Input: set1[] = {12, 34, 11, 9, 3}
//       set2[] = {2, 1, 3, 5}
//Output: Not Disjoint
//3 is common in two sets.
//
//Input: set1[] = {12, 34, 11, 9, 3}
//       set2[] = {7, 2, 1, 5}
//Output: Yes, Disjoint
//There is no common element in two sets.


import java.util.Arrays;

public class DisjointSets {
	public static void main(String[] ar) {
		int[] set1={10,6,3,8,5};
		int[] set2={7,2,1};
		boolean disjoint=areDisjoint(set1,set2);
		System.out.println(disjoint);
	}

	private static boolean areDisjoint(int[] set1, int[] set2) {
		// TODO Auto-generated method stub
		Arrays.sort(set1);
		Arrays.sort(set2);
		int len1=set1.length;
		int len2=set2.length;
		int i=0,j=0;
		while(i<len1&&j<len2)
			if(set1[i]<set2[j])
				i++;
			else if(set1[i]>set2[j])
				j++;
			else
				return false;
		return true;
	}	
}
