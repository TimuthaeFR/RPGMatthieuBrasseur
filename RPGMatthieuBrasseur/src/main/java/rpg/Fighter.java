package rpg;

import static com.example.rpgmatthieubrasseur.Jeu.statutHeros;

public abstract class Fighter {

    private static int PV;

    public static int getLifePoints() {
        return PV;
    }

    public void setLifePoints(int PV) {
        this.PV = PV;
    }

    //    public abstract boolean attack(Fighter fighter);
    public boolean attack(Fighter fighter) {
        return false;
    }

    public boolean receiveAttack(int damages) {
        this.PV -= damages;
        return this.PV <= 0; // Vrai si le combattant est mort
    }

    public boolean isAlive() {
        if (this.PV < 0) {
            statutHeros.setText("Ce héros est mort. Il ne peux plus rien faire");
            return false;
        } else {
            return true;
        }
    }


}
