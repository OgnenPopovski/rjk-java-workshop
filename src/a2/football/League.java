package a2.football;

import java.util.ArrayList;
import java.util.List;

public class League {

  private List<Match> matches;
  private List<Match> finishedMatches;
  public League(List<Match> matches) {
    this.matches = matches;
    finishedMatches = new ArrayList<>();
  }

  public void leagueDetails() {

    System.out.println("Finished:");
    printMatches(finishedMatches);
    System.out.println();
    System.out.println("----------");
    System.out.println();
    System.out.println("Ongoing");
    printMatches(matches);

  }

  private List<Match> extractMatchByStatus(boolean status) {
    List<Match> list = new ArrayList<>();
    for (int i = 0; i < matches.size(); i++) {
      Match match = matches.get(i);
      if (match.isFinished() == status) {
        list.add(match);
      }
    }
    return list;
  }

  private void printMatches(List<Match> matches) {
    for (int i = 0; i < matches.size(); i++) {
      Match match = matches.get(i);
      match.matchDetails();
      System.out.println();
    }
  }

  public boolean allFinished() {
    for (int i = 0; i < matches.size(); i++) {
      Match match = matches.get(i);
      if (!match.isFinished()) {
        return false;
      }
    }

    return true;
  }

  public void moveToFinished(int index) {
    Match match = matches.get(index);
    match.setFinished(true);
    finishedMatches.add(match);
    matches.remove(index);
  }

  public List<Match> getOngoingMatches() {
    return matches;
  }

  public Match getOngoingMatch(int index) {
    return matches.get(index);
  }

}
