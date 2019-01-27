package a2.football;

import java.util.ArrayList;
import java.util.List;

public class Liga {

  private List<FootballMatch> matches = new ArrayList<>();

  public Liga() {
    Team homeTeam1 = new Team("Manchester United");
    Team awayTeam1 = new Team("Chelsea");
    FootballMatch match1 = new FootballMatch(homeTeam1, awayTeam1);
    match1.addHomeTeamScorrer(new Igrach("Igrach 1", 2, "uk", "AMF", 22));
    match1.addHomeTeamScorrer(new Igrach("Igrach 1", 2, "uk", "AMF", 22));
    match1.addHomeTeamScorrer(new Igrach("Igrach 1", 2, "uk", "AMF", 22));

    Team homeTeam2 = new Team("Arsenal");
    Team awayTeam2 = new Team("Liverpool");
    FootballMatch match2 = new FootballMatch(homeTeam2, awayTeam2);
    match2.addAwayTeamScorrer(new Igrach("Igrach 2", 7, "fr", "CF", 25));
    match2.addAwayTeamScorrer(new Igrach("Igrach 3", 10, "es", "LM", 25));
    match2.addAwayTeamScorrer(new Igrach("Igrach 4", 15, "it", "CF", 25));
    match2.setOngoing(true);

    Team homeTeam3 = new Team("Everton");
    Team awayTeam3 = new Team("Tottenham");
    FootballMatch match3 = new FootballMatch(homeTeam3, awayTeam3);
    match3.addHomeTeamScorrer(new Igrach("Igrach 5", 7, "uk", "CM", 23));
    match3.addHomeTeamScorrer(new Igrach("Igrach 6", 5, "ch", "RW", 30));
    match3.addHomeTeamScorrer(new Igrach("Igrach 5", 7, "uk", "CM", 23));
    match3.addAwayTeamScorrer(new Igrach("Igrach 7", 7, "uk", "CM", 23));
    match3.addAwayTeamScorrer(new Igrach("Igrach 7", 7, "uk", "CM", 23));
    match3.addAwayTeamScorrer(new Igrach("Igrach 7", 7, "uk", "CM", 23));

    Team homeTeam4 = new Team("Newcastle");
    Team awayTeam4 = new Team("Stoke City");
    FootballMatch match4 = new FootballMatch(homeTeam4, awayTeam4);
    match4.addHomeTeamScorrer(new Igrach("Igrach 8", 7, "uk", "CM", 23));
    match4.addHomeTeamScorrer(new Igrach("Igrach 8", 7, "uk", "CM", 23));
    match4.addHomeTeamScorrer(new Igrach("Igrach 8", 7, "uk", "CM", 23));
    match4.addAwayTeamScorrer(new Igrach("Igrach 9", 20, "uk", "CM", 23));
    match4.addAwayTeamScorrer(new Igrach("Igrach 9", 20, "uk", "CM", 23));
    match4.addAwayTeamScorrer(new Igrach("Igrach 9", 20, "uk", "CM", 23));
    match4.setOngoing(true);

    Team homeTeam5 = new Team("West Ham");
    Team awayTeam5= new Team("Southampton");
    FootballMatch match5 = new FootballMatch(homeTeam5, awayTeam5);
    match5.addHomeTeamScorrer(new Igrach("Igrach 10", 12, "pt", "AMF", 23));
    match5.addAwayTeamScorrer(new Igrach("Igrach 11", 25, "it", "RWF", 31));
    match5.addAwayTeamScorrer(new Igrach("Igrach 11", 25, "it", "RWF", 31));
    match5.addAwayTeamScorrer(new Igrach("Igrach 11", 25, "it", "RWF", 31));

    Team homeTeam6 = new Team("West Bromwich");
    Team awayTeam6= new Team("Leichester");
    FootballMatch match6 = new FootballMatch(homeTeam6, awayTeam6);
    match5.addHomeTeamScorrer(new Igrach("Igrach 12", 12, "fr", "LMF", 23));
    match5.addHomeTeamScorrer(new Igrach("Igrach 13", 10, "nl", "RMF", 23));
    match5.addAwayTeamScorrer(new Igrach("Igrach 14", 17, "ru", "RWF", 31));
    match6.setOngoing(true);


    matches.add(match1);
    matches.add(match2);
    matches.add(match3);
    matches.add(match4);
    matches.add(match5);
    matches.add(match6);
  }

  public void printMatches(boolean sortByFinished) {

    if (sortByFinished) {
      List<FootballMatch> finishedMatches = getMatchesByStatus(matches, false);
      List<FootballMatch> ongoingMatches = getMatchesByStatus(matches, true);
      System.out.println("finished matches:");
      printMatches(finishedMatches);

      System.out.println("------------------------------");
      System.out.println(); // does nothing, leaves empty row

      System.out.println("ongoing matches:");
      printMatches(ongoingMatches);
    } else {
      printMatches(matches);
    }

  }

  private List<FootballMatch> getMatchesByStatus(List<FootballMatch> matches, boolean matchStatus) {
    List<FootballMatch> result = new ArrayList<>();
    for (int i = 0; i < matches.size(); i++) {
      FootballMatch match = matches.get(i);
      if(match.isOngoing() == matchStatus) {
        result.add(match);
      }
    }
    return result;
  }

  private void printMatches(List<FootballMatch> matches) {
    for (int i = 0; i < matches.size(); i++) {
      FootballMatch match = matches.get(i);
      match.printMatchStatus();
      match.printMatchScorrers();
      System.out.println();
    }
  }
}
