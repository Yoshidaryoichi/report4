package jp.ac.uryukyu.ie.e225735;
public class LivingThing {
    public String name;
    public int hitPoint;
    public int attack;
    public boolean dead;

    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。", name, maximumHP, attack);
    }

    public void attack(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
