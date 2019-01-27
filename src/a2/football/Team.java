package a2.football;

import java.util.ArrayList;
import java.util.List;

public class Team {

  private String name;
  private List<Igrach> players = new ArrayList<>();
  private String coach;

  public Team(String name, List<Igrach> players, String coach) {
    this.name = name;
    this.players = players;
    this.coach = coach;
  }

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public List<Igrach> getPlayers() {
    return players;
  }

  public void setPlayers(List<Igrach> players) {
    this.players = players;
  }
}
