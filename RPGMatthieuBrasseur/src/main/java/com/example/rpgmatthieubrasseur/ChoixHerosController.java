package com.example.rpgmatthieubrasseur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import rpg.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Objects;


public class ChoixHerosController {

    @FXML
    TextField tfNbHeros;
    @FXML
    Label Equipe, lblChoixClasse, lblDebut;
    @FXML
    Button ChoixNbHero, réinit, Debut, choixClasse;
    @FXML
    public static int nbHeros = 0, i = 0;
    @FXML
    public static ArrayList Héros = new ArrayList();
    @FXML
    public static ArrayList heros = new ArrayList();
    @FXML
    RadioButton rbChasseur, rbGuerrier, rbSoigneur, rbMage;
    @FXML
    public static int nbcombat = 1;
    @FXML
    ImageView imgHero;

    @FXML
    private void submit(ActionEvent event) throws IOException {
        try {
            nbHeros = Integer.parseInt(tfNbHeros.getText());
        } catch (NumberFormatException e) {
            tfNbHeros.setText("Veuillez entrer un nombre s'il vous plaît.");
        }
    }

    @FXML
    private void réinitialiser() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader
                (HelloApplication.class.getResource("choix-heros.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        HelloApplication.stage.setScene(scene);
        HelloApplication.stage.show();
    }

    @FXML
    private void debutrpg() throws IOException {

        if (nbHeros != 0) {
            if (i == nbHeros) {
                FXMLLoader fxmlLoader = new FXMLLoader
                        (HelloApplication.class.getResource("RPGDébut.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 600, 400);
                HelloApplication.stage.setScene(scene);
                HelloApplication.stage.show();
                //int nbcombat = 1;
                //Jeu.generateCombat(nbHeros, nbcombat, Héros);
            } else {
                lblDebut.setText("Choisissez une classe pour chacun de vos héros d'abord !");
            }
        }

    }

    @FXML
    private void imgHunter() throws MalformedURLException {
        File file = new File("C:\\Users\\Timuthae\\IdeaProjects\\RPGMatthieuBrasseur\\src\\main\\java\\images\\archer.png");
        String localUrl = file.toURI().toURL().toString();
        Image img = new Image(localUrl);
        imgHero.setImage(img);
        imgHero.setFitWidth(150);
        imgHero.setPreserveRatio(true);
        imgHero.setCache(true);
    }

    @FXML
    private void imgMage() throws MalformedURLException {
        File file = new File("C:\\Users\\Timuthae\\IdeaProjects\\RPGMatthieuBrasseur\\src\\main\\java\\images\\mage.png");
        String localUrl = file.toURI().toURL().toString();
        Image img = new Image(localUrl);
        imgHero.setImage(img);
        imgHero.setFitWidth(150);
        imgHero.setPreserveRatio(true);
        imgHero.setCache(true);
    }

    @FXML
    private void imgWarrior() throws MalformedURLException {
        File file = new File("C:\\Users\\Timuthae\\IdeaProjects\\RPGMatthieuBrasseur\\src\\main\\java\\images\\warrior.png");
        String localUrl = file.toURI().toURL().toString();
        Image img = new Image(localUrl);
        imgHero.setImage(img);
        imgHero.setFitWidth(150);
        imgHero.setPreserveRatio(true);
        imgHero.setCache(true);
    }

    @FXML
    private void imgHealer() throws MalformedURLException {
        File file = new File("C:\\Users\\Timuthae\\IdeaProjects\\RPGMatthieuBrasseur\\src\\main\\java\\images\\healer.png");
        String localUrl = file.toURI().toURL().toString();
        Image img = new Image(localUrl);
        imgHero.setImage(img);
        imgHero.setFitWidth(150);
        imgHero.setPreserveRatio(true);
        imgHero.setCache(true);
    }

    @FXML
    private void choixClasseHero() {

        if (nbHeros != 0 && i < nbHeros) {

            if (rbChasseur.isSelected()) {
                String classe = "Chasseur";
                Héros.add(classe);
                ++i;
                Equipe.setText(String.valueOf(Héros));
            }
            if (rbGuerrier.isSelected()) {
                String classe = "Guerrier";
                Héros.add(classe);
                ++i;
                Equipe.setText(String.valueOf(Héros));
            }
            if (rbMage.isSelected()) {
                String classe = "Mage";
                Héros.add(classe);
                ++i;
                Equipe.setText(String.valueOf(Héros));
            }
            if (rbSoigneur.isSelected()) {
                String classe = "Soigneur";
                Héros.add(classe);
                ++i;
                Equipe.setText(String.valueOf(Héros));
            }

            lblChoixClasse.setText("Quelle est la classe du " + (i + 1) + "ème héros ?");
            if ((1 + i) > nbHeros) {
                lblChoixClasse.setText("Vous avez choisis les classes de vos héros !");
                rbSoigneur.setVisible(false);
                rbMage.setVisible(false);
                rbGuerrier.setVisible(false);
                rbChasseur.setVisible(false);
                choixClasse.setVisible(false);
            }

        }

    }
}
