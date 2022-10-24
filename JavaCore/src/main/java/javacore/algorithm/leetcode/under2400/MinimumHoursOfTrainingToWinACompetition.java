package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2338
 */
public class MinimumHoursOfTrainingToWinACompetition {
	public static void main(String[] args) {
		int initialEnergy = 5;
		int initialExperience = 3;
		int[] energy = new int[] { 1, 4, 3, 2 };
		int[] experience = new int[] { 2, 6, 3, 1 };
		System.out.println(true);
		int ans = new MinimumHoursOfTrainingToWinACompetition()
				.minNumberOfHours(initialEnergy, initialExperience, energy,
						experience);
		System.out.println(ans);
	}

	public int minNumberOfHours(int initialEnergy, int initialExperience,
			int[] energy, int[] experience) {
		int totalExperience = 0;
		int totalEnergy = 0;
		for (int i : experience) {
			if (initialExperience <= i) {
				totalExperience += i + 1 - initialExperience;
				initialExperience = i + 1 + initialExperience;
			} else {
				initialExperience += i;
			}
			System.out.println(i + " - " + totalExperience + " - "
					+ initialExperience);
		}
		for (int i : energy) {
			if (initialEnergy <= i) {
				totalEnergy += i + 1 - initialEnergy;
				initialEnergy = 1;
			}
			initialEnergy -= i;
			System.out.println(i + " - " + totalEnergy + " - " + initialEnergy);
		}
		return totalExperience + totalEnergy;
	}
}
