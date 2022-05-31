package com.example.rpgmatthieubrasseur;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.w3c.dom.Element;
import rpg.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.rpgmatthieubrasseur.ChoixHerosController.*;

public class Jeu extends Application {

    @FXML
    Button startCombat;
    @FXML
    Label Titre;
    @FXML
    Label lblListEnemis;
    @FXML
    Label lblordreCombat;
    @FXML
    Label heroenjeu;
    @FXML
    public static Label statutHeros;



    @FXML
    public void debutCombat(int nbhero, int nbcombat, List Héros, List heros) {
        ArrayList Enemies = new ArrayList();
        for (int i = 0; i < nbhero; ++i) {
            double type = Math.random();
            if (type > 1 - 0.1 * nbcombat) {
                Enemies.add("wolf king");
            } else {
                Enemies.add("wolf");
            }
        }
        if (nbcombat == 1) {
            Titre.setText("Voici votre premier combat !");
        } else {
            Titre.setText("Voici votre " + nbcombat + "ème combat !");
        }
        lblListEnemis.setText("Vos ennemis sont : " + Enemies);

        ArrayList ordreCombat = new ArrayList();
        ArrayList herosclasse = new ArrayList();
        ArrayList ordreCombat2 = new ArrayList();

        for (i = 0; i < nbhero; ++i) {
            if (Héros.get(i) == "Chasseur") {
                Hero Chasseur = new Hunter();
                herosclasse.add(Chasseur);
            }
            if (Héros.get(i) == "Guerrier") {
                Hero Guerrier = new Warrior();
                herosclasse.add(Guerrier);
            }
            if (Héros.get(i) == "Soigneur") {
                Hero Soigneur = new Healer();
                herosclasse.add(Soigneur);
            }
            if (Héros.get(i) == "Mage") {
                Hero Mage = new Mage();
                herosclasse.add(Mage);
            }
        }
        ordreCombat.addAll(herosclasse);
        ordreCombat.addAll(Enemies);
        Collections.shuffle(ordreCombat);
        for (i = 0; i < ordreCombat.size(); ++i) {
            if (ordreCombat.get(i) == "wolf") {
                ordreCombat2.add("wolf");
            }
            if (ordreCombat.get(i) == "wolf king") {
                ordreCombat2.add("wolf king");
            }
            if (String.valueOf(ordreCombat.get(i)).indexOf("Hunter") != -1) {
                ordreCombat2.add("Chasseur");
            }
            if (String.valueOf(ordreCombat.get(i)).indexOf("Mage") != -1) {
                ordreCombat2.add("Mage");
            }
            if (String.valueOf(ordreCombat.get(i)).indexOf("Healer") != -1) {
                ordreCombat2.add("Soigneur");
            }
            if (String.valueOf(ordreCombat.get(i)).indexOf("Warrior") != -1) {
                ordreCombat2.add("Guerrier");
            }
        }
        lblordreCombat.setText(String.valueOf(ordreCombat2));
        for (i = 0; i <= ordreCombat2.size(); ++i) {

            if (ordreCombat.get(i) == "Chasseur"){
                heroenjeu.setText("Chasseur");
                int lp = rpg.Hunter.getLifePoints();
                //int fleche = rpg.Hunter.getarrows;
            }

        }

    }


    @Override
    public void start(Stage stage) throws Exception {

    }

    public void generateCombat(ActionEvent event) {
        debutCombat(nbHeros, nbcombat, Héros, heros);
    }
}
