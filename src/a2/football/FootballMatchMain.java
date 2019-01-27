package a2.football;

import java.util.Scanner;

public class FootballMatchMain {

  public static void main(String[] args) {

    System.out.println("Do you want the matches sorted by finished? true/false");
    boolean sortByFinished = nextBoolean();

    Liga liga = new Liga();
    liga.printMatches(sortByFinished);

  }

  private static boolean nextBoolean() {
    Scanner in = new Scanner(System.in);

    while (!in.hasNextBoolean()) {
      in.next();
    }
    return in.nextBoolean();
  }

}
