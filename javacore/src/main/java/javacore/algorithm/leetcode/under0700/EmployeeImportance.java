package javacore.algorithm.leetcode.under0700;

import java.util.List;

import javacore.algorithm.leetcode.model.Employee;

/*
 * LeetCode 690
 */
public class EmployeeImportance {
	public int getImportance(List<Employee> employees, int id) {
        Employee[] memo = new Employee[2001];
        for(Employee e : employees) memo[e.id] = e;
        
        return dfs(memo, id);
    }
    
    private int dfs(Employee[] memo, int id) {
        int ans = 0;
        
        Employee e = memo[id];
        ans += e.importance;
        
        for(int sub_id : e.subordinates) {
            ans += dfs(memo, sub_id);
        }
        
        return ans;
    }
}
