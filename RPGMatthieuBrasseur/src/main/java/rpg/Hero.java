package rpg;

import java.util.List;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class Hero extends Fighter {
    public String name;
    protected int lifePoints;
    protected int armor;
    public ArrayList<Potion> potions;
    public ArrayList<Food> lembas;

    public void givePotion(){
        Potion potion = new Potion();
        this.potions.add(potion);
    }

    public void giveFood(){
        Food food = new Food();
        this.lembas.add(food);
    }
}


/*public abstract class Hero extends Fighter {

    private int armor;
    private int weaponDamage;
    private List<Potion> potions;
    private List<Food> lembas;

    public void defend() {}
    public void useConsumable(Consumable consumable) {}

}*/
