package rpg;

public class Warrior extends Hero {
    public Warrior(){
        // Le héro guerrier a par défaut 25 points de vie, 5 point d'armure
        this.lifePoints = 25;
        this.armor = 3;
    }
}

/*public class Warrior extends Hero {
    public Warrior() { this.setLifePoints(5); }
    @Override
    public boolean attack(Fighter enemy) {
        return enemy.receiveAttack(5);
    }
}*/
