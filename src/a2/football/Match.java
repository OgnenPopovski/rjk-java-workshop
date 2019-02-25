package a2.football;

import java.util.ArrayList;
import java.util.List;

public class Match {

  private Team home;
  private Team away;
  private List<Player> homeScorers;
  private List<Player> awayScorers;
  private boolean finished;

  public Match(Team home, Team away) {
    this.home = home;
    this.away = away;
    this.homeScorers = new ArrayList<>();
    this.awayScorers = new ArrayList<>();
    this.finished = false;
  }

  public void matchDetails() {
    String status = "ongoing";
    String homeName = home.getName();
    String awayName = away.getName();

    int homeGoals = homeScorers.size();
    int awayGoals = awayScorers.size();

    if (finished) {
      status = "finished";
      if (homeGoals > awayGoals) {
        homeName = homeName.toUpperCase();
      } else if (awayGoals > homeGoals) {
        awayName = awayName.toUpperCase();
      }
    }

    System.out.println(
        homeName + " " + homeGoals + ":" + awayGoals + " "
            + awayName + " - " + status);

    if (homeScorers.size() > 0) {
      System.out.println("Home scorers: " + scorerListToString(homeScorers));
    }
    if (awayScorers.size() > 0) {
      System.out.println("Away scorers: " + scorerListToString(awayScorers));
    }

  }

  private String scorerListToString(List<Player> scorers) {
    String listAsString = "";
    for (int i = 0; i < scorers.size(); i++) {
      Player player = scorers.get(i);
      listAsString += player.getName() + "(" + player.getPosition() + ") ";
    }
    return listAsString;
  }

  public boolean isFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  public void addHomeScorer(int num) {
    homeScorers.add(home.getPlayers().get(num));
  }
  public void addAwayScorer(int num) {
    awayScorers.add(away.getPlayers().get(num));
  }

}
