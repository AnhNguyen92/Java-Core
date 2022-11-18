package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2383. Minimum Hours of Training to Win a Competition
 */
public class MinimumHoursOfTrainingToWinACompetition {

	public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
		int totalExperience = 0;
		int totalEnergy = 0;
		int sumEnergy = 0;
		for (int i = 0; i < energy.length; i++) {
			sumEnergy += energy[i];
			if (totalExperience + initialExperience <= experience[i]) {
				totalExperience += experience[i] + 1 - (initialExperience + totalExperience);
			}
			initialExperience += experience[i];
		}
		if (initialEnergy <= sumEnergy) {
			totalEnergy = sumEnergy + 1 - initialEnergy;
		}
		return totalExperience + totalEnergy;
	}
}
