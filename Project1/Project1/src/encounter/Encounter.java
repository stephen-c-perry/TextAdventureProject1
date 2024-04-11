package encounter;


import player.*;
import enemy.*;

public class Encounter {
    Player player = null;
    Enemy enemy = null;
 
    public Encounter(Player player){
        this.player = player;
        }
 
    
    public Encounter(){}
        
    public Player getPlayer() { 
        return player;
    }
 
    
    public void setPlayer(Player player) {
        this.player = player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    
    public void run(Player player, Enemy enemy){


    }

    // methods for running an encounter
    // skills checks
    // will need 3 subclasses: Swamp, Rocky Terrain, Forest

    private void skillCheck() {
        // accept param for which skill is being tested
        // roll d20 add skill mod
        // compare result against DC (swamp poisoning, rocky terrain, navigation)
        // if hit print you hit roll for damage
        // if miss print you miss
    }

    private void hitCheck() {
        // compare attack roll from one party against the ac or dc of the other party
        // if hit print you hit roll for damage
        // if miss print you miss
    }

    private void takeDamage() {
        // subtract from hp and set hp to new value
        // works on both player and enemy
        // if player hp <1 game over
        // if enemy hp ...
        // if player hp >0, another round of combat
    }

    // attack rolls
    // taking damage
    // if player hp > wolfpack hp && wolfpack hp < 1, set player, print remaining hp
    // continue to next scene

}
