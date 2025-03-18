import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreKeeperKataTest {

    private ScoreKeeperKata toTest;

    @BeforeEach
    public void init() {
        toTest = new ScoreKeeperKata();
    }

    @Test
    public void scoreTeamA1() {
        toTest.scoreTeamA1();
        assertEquals("001:000", toTest.getScore());
    }

    @Test
    public void scoreTeamA2() {
        toTest.scoreTeamA2();
        assertEquals("002:000", toTest.getScore());
    }

    @Test
    public void scoreTeamA3() {
        toTest.scoreTeamA3();
        assertEquals("003:000", toTest.getScore());
    }

    @Test
    public void scoreTeamB1() {
        toTest.scoreTeamB1();
        assertEquals("000:001", toTest.getScore());
    }

    @Test
    public void scoreTeamB2() {
        toTest.scoreTeamB2();
        assertEquals("000:002", toTest.getScore());
    }

    @Test
    public void scoreTeamB3() {
        toTest.scoreTeamB3();
        assertEquals("000:003", toTest.getScore());
    }

    @Test
    public void getScore() {
        assertEquals("000:000", toTest.getScore());
    }
}