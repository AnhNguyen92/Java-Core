package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;

/**
 * 2491. Divide Players Into Teams of Equal Skill
 */
public class DividePlayersIntoTeamsOfEqualSkill {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int sum = skill[0] + skill[skill.length - 1];
        long ans = 0;
        for (int i = 0; i < skill.length / 2; i++) {
            if (skill[i] + skill[skill.length - 1 - i] != sum) {
                return -1;
            }
            ans += (long) skill[i] * skill[skill.length - 1 - i];
        }
        return ans;
    }
}
