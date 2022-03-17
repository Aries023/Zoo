package abstracts;

 /*
  this is interface of all herbivores

  - alive = represents if is animal alive or if it was eaten
  - poisons = If the animal has been eaten, it can poison its enemy
  - dominance = It is the ability to defend or attack.

  - died() = The animal died and was eaten.
   */

public abstract class Herbivoves {
    boolean alive = true;
    boolean poisons = false;
    byte dominance = 2;

    void died() {

    }
}
