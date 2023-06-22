// Java program of the
// above approach
import java.util.*;
import java.io.*;

class GFG{
	
// Function to find the rock
// samples in the ranges
static ArrayList<Integer>findRockSample(int ranges[][],
										int n, int r,
										int arr[])
{
	ArrayList<Integer> a = new ArrayList<>();
	
	// Iterate over the ranges
	for(int i = 0; i < r; i++)
	{
	int c = 0;
	int l = ranges[i][0];
	int h = ranges[i][1];
		
	for(int j = 0; j < arr.length; j++)
	{
		if (l <= arr[j] && arr[j] <= h)
			c += 1;
		}
		a.add(c);
	}
	return a;
}

// Driver Code
public static void main(String args[])
{
	int n = 5;
	int r = 2;
	int arr[] = { 400, 567, 890, 765, 987 };
	int ranges[][] = { { 300, 380 }, { 800, 1000 } };
	
	ArrayList<Integer> answer = new ArrayList<>();
	
	// Function call
	answer = findRockSample(ranges, n, r, arr);

	for(int i = 0; i < answer.size(); i++)
		System.out.print(answer.get(i) + " ");
		
	System.out.println();
}
}

// This code is contributed by bikram2001jha
