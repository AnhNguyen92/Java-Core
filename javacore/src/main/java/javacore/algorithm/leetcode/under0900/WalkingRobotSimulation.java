package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 874. Walking Robot Simulation
 */
public class WalkingRobotSimulation {
	Map<List<Integer>, Boolean> map = new HashMap<>();
	int x = 0;
	int y = 0;
	int ans = 0;

	public int robotSim(int[] commands, int[][] obstacles) {
		for (int i = 0; i < obstacles.length; i++) {
			int[] arr = obstacles[i];
			List<Integer> item = new ArrayList<>();
			item.add(arr[0]);
			item.add(arr[1]);
			map.put(item, true);
		}

		int direct = 0;
		for (int i : commands) {
			if (i == -2)
				direct = (direct + 1) % 4;
			else if (i == -1)
				direct = (direct + 3) % 4;
			else if (i > 0) {
				switch (direct) {
				case 0:
					addY(i);
					break;
				case 1:
					minusX(i);
					break;
				case 2:
					minusY(i);
					break;
				default:
					addX(i);
					break;
				}
			}
		}
		return ans;
	}

	void addY(int i) {
		while (i > 0) {
			List<Integer> item = new ArrayList<>();
			item.add(x);
			item.add(y + 1);
			if (!map.containsKey(item)) {
				y++;
				i--;
				ans = Math.max(ans, x * x + y * y);
			} else {
				break;
			}
		}

	}

	void addX(int i) {
		while (i > 0) {
			List<Integer> item = new ArrayList<>();
			item.add(x + 1);
			item.add(y);
			if (!map.containsKey(item)) {
				x++;
				i--;
				ans = Math.max(ans, x * x + y * y);
			} else {
				break;
			}
		}
	}

	void minusY(int i) {
		while (i > 0) {
			List<Integer> item = new ArrayList<>();
			item.add(x);
			item.add(y - 1);
			if (!map.containsKey(item)) {
				y--;
				i--;
				ans = Math.max(ans, x * x + y * y);
			} else {
				break;
			}
		}
	}

	void minusX(int i) {
		while (i > 0) {
			List<Integer> item = new ArrayList<>();
			item.add(x - 1);
			item.add(y);
			if (!map.containsKey(item)) {
				x--;
				i--;
				ans = Math.max(ans, x * x + y * y);

			} else {
				break;
			}
		}
	}
}
