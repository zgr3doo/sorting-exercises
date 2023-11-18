package zgr.exercises.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class QuickTest {

    @Test
    void basicSortTest() {
        // given
        int[] input = {8,4,3,1,4};
        int[] expected = {1,3,4,4,8};
        // when
        int[] output = Quick.sort(input);
        // then
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }

    @Test
    void randomSortTest() {
        // given
        Random rand = new Random();
        int[] input = rand.ints(10_000_000L,1,2000).toArray();
        int[] expected = Arrays.stream(input).sorted().toArray();
        // when
        int[] output = Quick.sort(input);
        // then
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }
}