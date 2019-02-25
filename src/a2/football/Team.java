package a2.football;

import java.util.ArrayList;
import java.util.List;

public class Team {

  private String name;
  private List<Player> players;

  public Team(String name) {
    this.name = name;
    this.players = createPlayers(name);
  }

  public String getName() {
    return name;
  }

  public List<Player> getPlayers() {
    return players;
  }

  private List<Player> createPlayers(String team) {
    List<Player> players = new ArrayList<>();
    for (int i = 0; i < 11; i++) {
      players.add(new Player(team + " player" + i, "AMF"));
    }
    return players;
  }
}
