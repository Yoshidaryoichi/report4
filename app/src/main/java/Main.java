import jp.ac.uryukyu.ie.e225735.*;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);
        Warrior warrior = new Warrior("www",10,6);
        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(hero);
            System.out.println(enemy.getHitPoint());
        }
        System.out.println("戦闘終了");
    }
}