package rpg;


public class Healer extends SpellCaster {
    public Healer(){
        // Le héro prêtre a par défaut 10 points de vie, 1 point d'armure,
        // 20 points de mana et consomme 3 points de mana par sort

        this.lifePoints = 10;
        this.armor = 1;
        this.manaPoints = 20;
        this.manaConsomme = 3;
    }
}