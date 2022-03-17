package abstracts;

  /*
  this is interface of all carnivores

  - alive = represents if is animal alive or if it was eaten
  - poisons = If the animal has been eaten, it can poison its enemy
  - dominance = It is the ability to defend or attack.

  - kill() = Attempted attack
  - died() = The animal died and was eaten.
   */

public abstract class Carnivores {
    boolean alive = true;
    boolean poisons = false;
    byte dominance = 1;

    boolean kill() {
        return false;
    }

    void died() {

    }
}
