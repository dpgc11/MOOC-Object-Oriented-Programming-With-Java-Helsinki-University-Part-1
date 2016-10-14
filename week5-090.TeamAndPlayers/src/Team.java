
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class Team {
    private String name;
    private ArrayList<Player> team;
    private int maxSize;
    

    public Team(String name) {
        this.name = name;
        this.team = new ArrayList<Player>();
        this.maxSize = 16;
       
    }

    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player) {
        if (size() < this.maxSize)
        this.team.add(player);
    }
    
    public int goals() {
        int goals = 0;
        for (Player player : team) {
            goals += player.goals();
            
        }
        return goals;
    }
    
    public void printPlayers() {
        for (Player player : this.team) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return team.size();
    }
}
