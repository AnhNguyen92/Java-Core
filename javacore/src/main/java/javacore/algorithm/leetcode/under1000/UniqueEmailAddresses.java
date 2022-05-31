package javacore.algorithm.leetcode.under1000;

import java.util.HashSet;
import java.util.Set;

/*
 * Leetcode 929
 */
public class UniqueEmailAddresses {
	public int numUniqueEmails(String[] emails) {
		Set<String> seen = new HashSet<>();
		for (String email : emails) {
			int i = email.indexOf('@');
			String local = email.substring(0, i);
			String rest = email.substring(i);
			if (local.contains("+")) {
				local = local.substring(0, local.indexOf('+'));
			}
			local = local.replace("\\.", "");
			seen.add(local + rest);
		}

		return seen.size();
	}
	
	public int numUniqueEmails1(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] emailPart = email.split("@");            
            String localName = emailPart[0];
            while (localName.contains(".")) {
                localName = localName.replace(".", "");
            }
            int plusPos = localName.indexOf("+");
            if (plusPos > 0) {
                localName = localName.substring(0, plusPos);
            }
            set.add(localName + "@" + emailPart[1]);
        }
        return set.size();
    }
}
