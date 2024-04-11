public class Encounter {
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

    public void takeDamage() {
        // subtract from hp and set hp to new value
        // works on both player and enemy
        // if hp <1 game over
        // if hp <0, another round of combat
    }

    // attack rolls
    // taking damage
    // if player hp > wolfpack hp && wolfpack hp < 1, set player, print remaining hp
    // continue to next scene

}
