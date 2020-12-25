package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Jim");
        BaseballPlayer pat = new BaseballPlayer("Smith");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team<FootballPlayer> liverpool = new Team("Liverpool");
        liverpool.addPlayer(joe);
        System.out.println(liverpool.numPlayers());
        Team<BaseballPlayer> baseballTeam = new Team("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> brokenTeam = new Team("this won't work");
        brokenTeam.addPlayer(beckham);
        Team<FootballPlayer> ManU = new Team("ManU");
        FootballPlayer salah = new FootballPlayer("Salah");
        ManU.addPlayer(salah);
        Team<FootballPlayer> arsenal = new Team("arsenal");
        Team<FootballPlayer> chelsea = new Team("chelsea");
        arsenal.matchResult(chelsea, 4, 0);
        arsenal.matchResult(liverpool, 3, 5);
        liverpool.matchResult(chelsea, 1, 0);
        liverpool.matchResult(baseballTeam, 1, 1);
    }
}
