package jp.ac.uryukyu.ie.e225735;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {
    @Test void appHasAGreeting() {
    int attack=6;
    int dhitPoint=90;
    Warrior warrior = new Warrior("www",10,attack);
    Enemy enemy = new Enemy("スライム", dhitPoint, 3);
    for(int i=0;i<4;i++){
        warrior.attackWithWeponSkill(enemy);

    }
    assertEquals( attack * 1.5, 9);
    
}
}


