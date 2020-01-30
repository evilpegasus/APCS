//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	
	//This one sorts first and runs faster
	public static int go1( List<Integer> ray )
	{
		Collections.sort(ray);
		System.out.println(ray);
		int maxCount = 1;
		int maxValue = ray.get(0);
		int currentCount = 0;
		int currentValue = ray.get(0);
		for (int i = 1; i < ray.size(); i++) {
			if (ray.get(i) == ray.get(i - 1)) {
				currentCount++;
				currentValue = ray.get(i);
			}
			if (currentCount > maxCount) {
				maxCount = currentCount;
				maxValue = currentValue;
			}
		}
		return maxValue;
	}
	public static int go( List<Integer> ray ) {
		int maxCount = -1;
		int maxValue = ray.get(0);
		int currentCount = 1;
		for(int i = 0; i < ray.size(); i++) {
			for(int j = i; j < ray.size(); j++) {
				if (ray.get(i) == ray.get(j)) {
					currentCount++;
				}
				if (currentCount > maxCount) {
					maxCount = currentCount;
					maxValue = ray.get(i);
				}
			}
			currentCount = 0;
		}
		return maxValue;
	}
}