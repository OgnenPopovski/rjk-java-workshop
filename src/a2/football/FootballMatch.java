package a2.football;

import java.util.ArrayList;
import java.util.List;

public class FootballMatch {

  private Team homeTeam;
  private Team awayTeam;

  private List<Igrach> homeTeamScorers = new ArrayList<>();
  private List<Igrach> awayTeamScorers = new ArrayList<>();

  private boolean ongoing;

  public FootballMatch(Team homeTeam, Team awayTeam) {
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
  }

  public void printMatchStatus() {
    String homeTeamName = homeTeam.getName();
    String awayTeamName = awayTeam.getName();

    String matchStatus = "ongoing";

    if (!ongoing) {
      matchStatus = "finished";
      int winner = matchResult();
      if (winner == 1) {
        homeTeamName = homeTeamName.toUpperCase();
      }
      if (winner == 2) {
        awayTeamName = awayTeamName.toUpperCase();
      }
    }
    System.out.println(homeTeamName + " " + homeTeamScorers.size() + ":" + awayTeamScorers.size() + " " + awayTeamName + " - " + matchStatus);
  }

  public void printMatchScorrers() {
    if (homeTeamScorers.size() > 0) {
      String scorrers = getScorersInString(homeTeamScorers);
      System.out.println("Home Scorers: " + scorrers);
    }
    if (awayTeamScorers.size() > 0) {
      String scorrers = getScorersInString(awayTeamScorers);
      System.out.println("Away Scorers: " + scorrers);
    }
  }

  private String getScorersInString(List<Igrach> scorrers) {
    String text = "";
    for (int i = 0; i < scorrers.size(); i++) {
      Igrach igrach = scorrers.get(i);
      text += igrach.getName() + " (" + igrach.getPosition() + ")";
      if (i < scorrers.size() - 1) {
        text += ", ";
      }
    }
    return text;
  }

  public int matchResult() {
    int winner = 0;
    if(homeTeamScorers.size() > awayTeamScorers.size()) {
      winner = 1;
    } else if (awayTeamScorers.size() > homeTeamScorers.size()) {
      winner = 2;
    }
    return winner;
  }

  public void addHomeTeamScorrer(Igrach igrach) {
    homeTeamScorers.add(igrach);
  }

  public void addAwayTeamScorrer(Igrach igrach) {
    awayTeamScorers.add(igrach);
  }

  public void setOngoing(boolean ongoing) {
    this.ongoing = ongoing;
  }

  public boolean isOngoing() {
    return ongoing;
  }
}
