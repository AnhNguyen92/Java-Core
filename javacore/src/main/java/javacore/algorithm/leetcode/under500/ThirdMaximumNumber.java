package javacore.algorithm.leetcode.under500;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Leetcode 414
 */

public class ThirdMaximumNumber {
    private static final Logger logger = LoggerFactory.getLogger(ThirdMaximumNumber.class);

    public static void main(String[] args) throws URISyntaxException {
        ThirdMaximumNumber app = new ThirdMaximumNumber();
        String fileName = "test_case_leetcode_414.txt";

        File file = app.getFileFromResource(fileName);
        try (Scanner s = new Scanner(file).useDelimiter(",\\s*")) {
            int[] array = new int[s.nextInt()];
            for (int i = 0; i < array.length; i++) {
                array[i] = s.nextInt();
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            if (list.size() < 3) {
                logger.info("{}", list.get(list.size() - 1));
            } else {
                logger.info("{}", list.get(list.size() - 3));
            }
        } catch (FileNotFoundException e) {
            logger.error("{}", e.getMessage());
        }
    }

    private File getFileFromResource(String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return new File(resource.toURI());
        }

    }

}
