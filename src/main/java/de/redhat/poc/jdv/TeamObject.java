package de.redhat.poc.jdv;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karsten Gresch on 07.02.17.
 */
public class TeamObject {

  private String teamName;
  private List<String> players = new ArrayList<String>();

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public List<String> getPlayers() {
    return players;
  }

  public void setPlayers(List<String> players)
  {
    this.players = players;
  }

  // public List getPlayersById(String playersId) {
  //  return players;
  // }


}
