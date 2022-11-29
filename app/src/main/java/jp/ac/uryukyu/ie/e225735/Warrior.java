package jp.ac.uryukyu.ie.e225735;


public class Warrior extends LivingThing  {

    public Warrior(String name,int maximumHP, int attack){
        super.LivingThing( name,maximumHP,attack);
    }
    public void attackWithWeponSkill(Enemy e){
        if (this.dead == false){
            int damage = (int)(attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n\n", name,super.getName(), damage);
            super.wounded(damage);
        }
    }
}