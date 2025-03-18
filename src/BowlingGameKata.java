public class BowlingGameKata {

    private static final int MAX_FRAMES = 10;
    private static final int STRIKE_SCORE = 30;

    private int currentRoll;
    private int previousRoll;
    private int totalScore;
    private int currentFrame;

    public void roll(int pins) {
        currentRoll++;

        if (isFinalFrameWithBonusRoll(pins)) {
            totalScore += pins;
        } else if (isStrikeFirstBall(pins)) {
            handleStrike();
        } else if (isFirstRollOfFrame(pins)) {
            totalScore += pins;
        } else if (isSecondRollOfFrame()) {
            handleSecondRoll(pins);
        } else { //handles third ball in last frame if not a strike
            totalScore += pins;
            currentFrame++;
        }

        previousRoll = pins;
    }

    public int score() {
        return totalScore;
    }

    private boolean isFinalFrameWithBonusRoll(int pins) {
        return currentFrame == MAX_FRAMES - 1
                && currentRoll <= 3
                && pins == 10;
    }

    private boolean isStrikeFirstBall(int pins) {
        return currentRoll == 1 && pins == 10;
    }

    private boolean isFirstRollOfFrame(int pins) {
        return currentRoll == 1 && pins < 10;
    }

    private boolean isSecondRollOfFrame() {
        return currentRoll == 2;
    }

    private void handleStrike() {
        totalScore += STRIKE_SCORE;
        advanceFrame();
    }

    private void handleSecondRoll(int pins) {
        totalScore += pins;
        if (isSpare(pins)) {
            totalScore += pins;
        }
        advanceFrame();
    }

    private boolean isSpare(int pins) {
        return previousRoll + pins == 10;
    }

    private void advanceFrame() {
        currentFrame++;
        currentRoll = 0;
    }
}
