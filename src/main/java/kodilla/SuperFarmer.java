package kodilla;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.concurrent.Exchanger;

import static javafx.application.Application.launch;

public class SuperFarmer extends Application {
    private Image imageback = new Image("file:src/main/resources/Plansza do gry.png");
    private Image rabbit = new Image("file:src/main/resources/Rabbit.png", 100.0, 100.0, true, true);
    private Image fox = new Image("file:src/main/resources/Fox.png", 100.0, 100.0, true, true);
    private Image sheep = new Image("file:src/main/resources/Sheep.png", 100.0, 100.0, true, true);
    private Image pig = new Image("file:src/main/resources/Pig.png", 100.0, 100.0, true, true);
    private Image cow = new Image("file:src/main/resources/Cow.png", 100.0, 100.0, true, true);
    private Image horse = new Image("file:src/main/resources/Horse.png", 100.0, 100.0, true, true);
    private Image bigDog = new Image("file:src/main/resources/Sheep.png", 100.0, 100.0, true, true);
    private FlowPane animals = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane rabbits = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane sheep1 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pigs = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane cows = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane horses = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
        //Kostka
        Dice dice = new Dice();
        dice.orangeDice();
        dice.blueDice();
        System.out.println("Kostka pomarańczowa: " + dice.blueDice());
        System.out.println("Kostka niebieska: " + dice.orangeDice());
        //Rozmnażanie
        Greeding greeding = new Greeding();
        greeding.greeding();
        //Wymiana
        greeding.exchangePig();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(18, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        Button newbtn = new Button();
        newbtn.setText("Wymiana");
        newbtn.setOnAction((e) -> {
            System.out.println("Przycisk");
        });


        ImageView img = new ImageView(rabbit);
        ImageView img1 = new ImageView(sheep);
        ImageView img2 = new ImageView(pig);
        ImageView img3 = new ImageView(cow);
        ImageView img4 = new ImageView(horse);
        ImageView img5 = new ImageView(rabbit);

        rabbits.getChildren().add(img);
        rabbits.getChildren().add(img5);
        sheep1.getChildren().add(img1);
        pigs.getChildren().add(img2);
        cows.getChildren().add(img3);
        horses.getChildren().add(img4);

        grid.add(rabbits, 5, 42);
        grid.add(sheep1, 5, 43);
        grid.add(pigs, 5, 44);
        grid.add(cows, 5, 45);
        grid.add(horses, 5, 46);
        grid.add(newbtn, 8, 2);


        Scene scene = new Scene(grid, 1600, 900, Color.YELLOW);

        primaryStage.setTitle("SuperFarmer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
