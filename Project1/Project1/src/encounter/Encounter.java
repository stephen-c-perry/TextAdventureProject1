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

    public void run(int mod) throws InterruptedException {
        System.out.println("Prepare for combat!");
        Thread.sleep(3500);

        while (player.isAlive() && enemy.isAlive()) {
            // Player's turn
            if (player.isAlive()) {
                System.out.println();
                playerAttackAndDamage(player.attack(), enemy.getDc());
                Thread.sleep(1500);
            }

            // Enemy's turn
            if (enemy.isAlive()) {
                System.out.println();
                enemyAttackAndDamage(enemy.attack(mod), player.getAc());
                Thread.sleep(1500);
            }
        }

        if (!player.isAlive()) {
            System.out.println("You have been defeated!");
            System.exit(0);
        } else {
            System.out.println("You defeated the enemy! Your HP is now " + player.getHp());

        }
    }

    private void playerAttackAndDamage(int attackRoll, int acOrDc) {
        if (attackRoll >= acOrDc) {
            System.out.println();
            int damage = DiceRoller.rollDamage(8);
            enemy.setHp(enemy.getHp() - damage);
            System.out.println(player.getName() + " hit " + enemy.getName() + " for " + damage + " damage!");
        } else {
            
            System.out.println(player.getName() + " missed " + enemy.getName() + "!");
        }
    }

    private void enemyAttackAndDamage(int attackRoll, int acOrDc) {
        if (attackRoll >= acOrDc) {
            System.out.println();
            int damage = DiceRoller.rollDamage(8);
            player.setHp(player.getHp() - damage);
            
            System.out.println(enemy.getName() + " hit " + player.getName() + " for " + damage + " damage!");
        } else {
            
            System.out.println(enemy.getName() + " missed " + player.getName() + "!");
        }
    }

 
}
