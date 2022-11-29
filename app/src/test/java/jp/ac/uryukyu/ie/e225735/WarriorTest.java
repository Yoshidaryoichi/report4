package jp.ac.uryukyu.ie.e225735;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {
    @Test void appHasAGreeting() {
    int attack=6;
    int dhitPoint=27;
    Warrior warrior = new Warrior("www",10,attack);
    Enemy enemy = new Enemy("スライム", dhitPoint, 3);
    for(int i=0;i<3;i++){
        warrior.attackWithWeponSkill(enemy);
    }
    assertEquals( enemy.dead=true, enemy.isDead());

}
}



