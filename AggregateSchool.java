// Player class 
class Player { 

  String name; 
  int id; 
  String team; 

  Player(String name, int id, String team) { 
    this.name = name; 
    this.id = id; 
    this.team = team;
  } 

} 

/* Team class contains a list of Player
Objects.*/
class Team { 

  String name; 
  private List<Player> players; 

  Team(String name, List<Player> players) { 
    this.name = name; 
    this.players = players; 
  } 

  public List<Player> getPlayers() { // This function returns the "players"
    return players; 
  } 

} 

/* School class contains a list of Team 
Objects.*/
class School { 

  String schoolName; 
  private List<Team> teams; 

  School(String schoolName, List<Team> teams) { 
    this.schoolName = schoolName; 
    this.teams = teams; 
  } 

  /* Count total players of all teams 
    in a given school */
  public int getTotalPlayersInSchool() { 
    int noOfPlayers = 0; 
    List<Player> players;

    for(Team team : teams) { 
      players = team.getPlayers(); 
      for(Player p : players) { 
        noOfPlayers++; 
      } 
    } 
    return noOfPlayers; 
  } 

}  

// Main class
class AggregateSchool { 

  public static void main (String[] args) { 
    /* Declaring all the players */
    Player p1 = new Player("Harris", 1, "Red");
    Player p2 = new Player("Carol", 2, "Red");
    Player p3 = new Player("Johnny", 1, "Blue");
    Player p4 = new Player("Sarah", 2, "Blue");

    /* Making a List of  
        "Red" team Players. */
    List <Player> red_players = new ArrayList<Player>(); 
    red_players.add(p1); 
    red_players.add(p2); 

    /* Making a List of  
        "Blue" team Players. */ 
    List <Player> blue_players = new ArrayList<Player>(); 
    blue_players.add(p3); 
    blue_players.add(p4);  

    /* Declaring Team objects */
    Team red = new Team("Red", red_players); 
    Team blue = new Team("Blue", blue_players);  

    // Creating a list of teams and adding "red" and "blue" teams to it.
    List <Team> teams = new ArrayList<Team>(); 
    teams.add(red); 
    teams.add(blue); 

    // Creating an instance of School. 
    School mySchool = new School("ABC", teams); 

    System.out.println("Total players in my school: "); 
    // Getting total prayers in the school.
    System.out.println(mySchool.getTotalPlayersInSchool()); 
  } 

} 


/*ou have to implement 3 classes:

class School {
}

class Team {
}

class Player {
}
in such a way that an instance of a School should contain instances of Team objects. Similarly, a Team object can contain instances of Player class.

Consider this diagram for clarification:

svg viewer
School, Team, Player: Class Representation
You have to implement a School class containing a list of Team objects, a Team class comprising of a list of Player objects and a Player class having an id, name, and team.

The School class will also have an implemented getTotalPlayersInSchool() function which eventually counts the total players in all of the teams in the school and returns the count!

So, your school should have these players in their respective teams:

Player ID’s	Player Names	Teams
1	Harris	Red
2	Carol	Red
1	Johnny	Blue
2	Sarah	Blue*/