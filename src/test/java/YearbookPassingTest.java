import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class YearbookPassingTest {

    YearbookPassing yearbookPassing;

    @BeforeEach
    void setup (){

        yearbookPassing = new YearbookPassing();
    }

    @Test
    void findSignatureCountsExample1() {

        int[] input = {2, 1};
        int [] output = {2,2};

        assertTrue(Arrays.equals(output,yearbookPassing.findSignatureCounts(input)));
    }

    @Test
    void findSignatureCountsExample2() {

        int[] input = {1, 2};
        int [] output = {1,1};

        assertTrue(Arrays.equals(output,yearbookPassing.findSignatureCounts(input)));
    }
}