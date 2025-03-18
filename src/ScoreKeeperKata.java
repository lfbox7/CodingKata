public class ScoreKeeperKata {

    private int scoreTeamA;
    private int scoreTeamB;

    public ScoreKeeperKata() {
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;
    }

    public void scoreTeamA1() {
        this.scoreTeamA+=1;
    }

    public void scoreTeamA2() {
        this.scoreTeamA+=2;
    }

    public void scoreTeamA3() {
        this.scoreTeamA+=3;
    }

    public void scoreTeamB1() {
        this.scoreTeamB+=1;
    }

    public void scoreTeamB2() {
        this.scoreTeamB+=2;
    }

    public void scoreTeamB3() {
        this.scoreTeamB+=3;
    }

    // Response is seven characters i.e. "000:000"
    public String getScore() {
        StringBuilder stringBuilder = new StringBuilder();

        String scoreTeamAStr = convertInt(scoreTeamA);
        String scoreTeamBStr = convertInt(scoreTeamB);

        return stringBuilder.append(scoreTeamAStr + ":" + scoreTeamBStr).toString();
    }

    private String convertInt(int score) {
        return buildScore(Integer.toString(score));
    }

    private String buildScore(String score) {
        StringBuilder stringBuilder = new StringBuilder();

        switch (score.length()) {
            case 1:
                return stringBuilder.append("00" + score).toString();
            case 2:
                return stringBuilder.append("0" + score).toString();
            default:
                return score;
        }
    }
}