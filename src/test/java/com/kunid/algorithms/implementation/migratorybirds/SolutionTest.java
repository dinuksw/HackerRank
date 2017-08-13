package com.kunid.algorithms.implementation.migratorybirds;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void migratoryBirds() throws Exception {
        final List<String> input = Files.readAllLines(Paths.get("src/test/resources/migratoryBirds.txt"));

        final int count = Integer.parseInt(input.get(0));
        int[] numbers = Arrays.stream(input.get(1).split(" ")).map(Integer::parseInt).mapToInt(Integer::intValue).toArray();

        assertEquals(2, Solution.migratoryBirds(count, numbers));
    }

}