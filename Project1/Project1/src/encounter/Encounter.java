package encounter;

import player.Player;
import enemy.Enemy;

public class Encounter {
    private Player player = null;
    private Enemy enemy = null;

    public Encounter(Player player) {
        this.player = player;
    }

    public Encounter() {
    }

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

    public void run() {
        System.out.println("Prepare for combat!");

        while (player.isAlive() && enemy.isAlive()) {
            // Player's turn
            if (player.isAlive()) {
                playerAttackAndDamage(player.attack(), enemy.getDc());
            }

            // Enemy's turn
            if (enemy.isAlive()) {
                enemyAttackAndDamage(enemy.attack(2), player.getAc());
            }
        }

        if (!player.isAlive()) {
            System.out.println("You have been defeated!");
            // Handle game over
        } else {
            System.out.println("You defeated the enemy!");
            // Handle victory
        }
    }

    private void playerAttackAndDamage(int attackRoll, int acOrDc) {
        if (attackRoll >= acOrDc) {
            int damage = DiceRoller.rollDamage(8);
            enemy.setHp(enemy.getHp() - damage);
            System.out.println(player.getName() + " hit " + enemy.getName() + " for " + damage + " damage!");
        } else {
            System.out.println(player.getName() + " missed " + enemy.getName() + "!");
        }
    }

    private void enemyAttackAndDamage(int attackRoll, int acOrDc) {
        if (attackRoll >= acOrDc) {
            int damage = DiceRoller.rollDamage(8);
            player.setHp(player.getHp() - damage);
            System.out.println(enemy.getName() + " hit " + player.getName() + " for " + damage + " damage!");
        } else {
            System.out.println(enemy.getName() + " missed " + player.getName() + "!");
        }
    }
    // methods for running an encounter
    // skills checks
    // will need 3 subclasses: Swamp, Rocky Terrain, Forest

    // private void skillCheck() {
    //     // Implement skill check logic
    // }

    // attack rolls
    // taking damage
    // if player hp > wolfpack hp && wolfpack hp < 1, set player, print remaining hp
    // continue to next scene
}
