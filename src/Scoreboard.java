public class Scoreboard
{
    public int team1Score;
    public int team2Score;
    public String activeTeam;
    public String firstTeam;
    public String secondTeam;
    public Scoreboard(String team1, String team2)
    {
        firstTeam = team1;
        secondTeam = team2;
        activeTeam = team1;
    }
    public void recordPlay(int score)
    {
        if (score >= 1 && activeTeam.equals(firstTeam))
        {
            team1Score += score;
        }
        if (score == 0 && activeTeam.equals(firstTeam))
        {
            activeTeam = secondTeam;
        }
        if (score >= 1 && activeTeam.equals(secondTeam)) {
            team2Score += score;
        }
        if (score == 0 && activeTeam.equals(secondTeam)) {
            activeTeam = firstTeam;
        }

    }
    public void String  getScore()
    {
        System.out.println(team1Score + "-" + team2Score + "-" + activeTeam);
    }

}
