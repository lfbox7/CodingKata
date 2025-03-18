import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameKataTest {

    BowlingGameKata toTest;

    @BeforeEach
    void init() {
        toTest = new BowlingGameKata();
    }

    @Test
    void roll() {
        toTest.roll(1);

        assertEquals(1, toTest.score());
    }

    @Test
    void rollNotSpare() {
        toTest.roll(1);
        toTest.roll(2);

        assertEquals(3, toTest.score());
    }

    @Test
    void rollSpare() {
        toTest.roll(1);
        toTest.roll(9);

        assertEquals(19, toTest.score());
    }

    @Test
    void rollStrike() {
        toTest.roll(10);

        assertEquals(30, toTest.score());
    }

    @Test
    void rollStrikeLastFrameSinglePinSecondBall() {
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);

        toTest.roll(10);
        toTest.roll(9);

        assertEquals(289, toTest.score());
    }

    @Test
    void rollStrikeLastFrameSinglePinThirdBall() {
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);

        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(9);

        assertEquals(299, toTest.score());
    }

    @Test
    void roll3StrikesLastFrame() {
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);

        toTest.roll(10);
        toTest.roll(10);
        toTest.roll(10);

        assertEquals(300, toTest.score());
    }
}