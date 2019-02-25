package a2.football;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Team manUtd = new Team("Manchester United");
    Team chelsea = new Team("Chelsea");
    Team liverpool = new Team("Liverpool");
    Team arsenal = new Team("Arsenal");
    Team everton = new Team("Everton");
    Team tottenham = new Team("Tottenham");
    Team leichester = new Team("Leichester");
    Team stoke = new Team("Stoke City");
    Team southempton = new Team("Southempton");
    Team newCastle = new Team("New Castle");
    Team westHam = new Team("West Ham");
    Team westBronwich = new Team("West Bronwich");

    Match match1 = new Match(manUtd, chelsea);
    Match match2 = new Match(liverpool, arsenal);
    Match match3 = new Match(everton, tottenham);
    Match match4 = new Match(newCastle, stoke);
    Match match5 = new Match(westHam, southempton);
    Match match6 = new Match(westBronwich, leichester);

    List<Match> matches = new ArrayList<>();
    matches.add(match1);
    matches.add(match2);
    matches.add(match3);
    matches.add(match4);
    matches.add(match5);
    matches.add(match6);

    League league = new League(matches);
    Scanner in = new Scanner(System.in);
    while (!league.allFinished()) {
      league.leagueDetails();

      int numOngoingMatches = league.getOngoingMatches().size()- 1;
      System.out.println("Enter match index (0-" + numOngoingMatches + "):");
      int matchIndex = retryUntilReadPositiveInteger(numOngoingMatches);
      Match match = league.getOngoingMatch(matchIndex);
      System.out.println("goal or end?");
      String action = in.nextLine().trim().toLowerCase();
      if ("end".equals(action)) {
        league.moveToFinished(matchIndex);
        continue;
      } else if ("goal".equals(action)) {
        System.out.println("For what team ? 0 - home, 1 - away");
        int scoringTeamIndex = retryUntilReadPositiveInteger(1);
        System.out.println("Set scorrer (index of the player 0-10)");
        int scorerIndex = retryUntilReadPositiveInteger(10);
        if (scoringTeamIndex == 0) {
          match.addHomeScorer(scorerIndex);
        } else {
          match.addAwayScorer(scorerIndex);
        }
      } else {
        System.out.println("Expected 'goal' or 'end' but received '" + action + "'. No action will be taken");
      }
    }

    league.leagueDetails();
  }


  public static int retryUntilReadPositiveInteger(int maxValue) {
    Scanner in = new Scanner(System.in);
    boolean foundPositiveInteger = false;
    int intResult = 0;

    while (!foundPositiveInteger) {
      String input = in.nextLine();
      if (isInteger(input)) {
        intResult = Integer.parseInt(input);

        if (intResult >= 0 && intResult <= maxValue) {
          foundPositiveInteger = true;
        } else {
          System.out.println("'" + intResult + "' is not positive integer or is larger than " + maxValue + ". Try again");
        }
      } else {
        System.out.println("'" + input + "' is not integer. Try again");
      }
    }
    return intResult;
  }

  public static boolean isInteger(String value) {
    boolean isInteger = true;
    try {
      Integer.parseInt(value);
    } catch (NumberFormatException e) {
      isInteger = false;
    }
    return isInteger;
  }
}
