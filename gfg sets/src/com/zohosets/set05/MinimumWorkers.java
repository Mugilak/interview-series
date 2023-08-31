package com.zohosets.set05;

//With the starting and ending time of work given find the minimum no of workers needed
//Start time         end time
//1230            0130
//1200            0100
//1600            1700
//Output:
//2

public class MinimumWorkers {

	public static void main(String[] args) {
		new MinimumWorkers().getInput();
	}

	private void getInput() {
		int startTime[] = { 1230, 1200, 1600 };
		int[] endTime = { 1330, 1300, 1700 };
		System.out.println(findMinimumWorkers(startTime, endTime));
	}

	private int findMinimumWorkers(int[] startTime, int[] endTime) {
		if (startTime.length <= 0) {
			return 0;
		}
		int minWorkers = 1, temp;
		for (int i = 1; i < startTime.length; i++) {
			temp = 1;
			for (int j = 0; j < startTime.length; j++) {
				if (startTime[i] <= endTime[j] && startTime[i] >= startTime[j]) {
					temp++;
				}
			}
			if (minWorkers < temp) {
				minWorkers = temp;
			}
		}
		return minWorkers;
	}

}