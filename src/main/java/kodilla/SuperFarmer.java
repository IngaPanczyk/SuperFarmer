package kodilla;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.concurrent.Exchanger;

import static javafx.application.Application.launch;

public class SuperFarmer extends Application {
    private Image imageback = new Image("file:src/main/resources/Plansza do gry (2).png");
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
    private Label totalLabel = new Label();

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
        //Ustawienia etykiety
        totalLabel.setFont(new Font("Arial", 30));
        totalLabel.setTextFill(Color.web("blue"));

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(18, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        Button exchangePig = new Button();
        exchangePig.setText("PIG");
        exchangePig.setOnAction((e) -> {
            System.out.println("Przycisk");
        });

        Button exchangeRabbit = new Button();
        exchangeRabbit.setText("RABBIT");
        exchangeRabbit.setOnAction((e) -> {
            System.out.println("Przycisk");
        });

        Button exchangeSheep = new Button();
        exchangeSheep.setText("SHEEP");
        exchangeSheep.setOnAction((e) -> {
            System.out.println("Przycisk");
        });


        ImageView img = new ImageView(rabbit);
        ImageView img1 = new ImageView(sheep);
        ImageView img2 = new ImageView(pig);
        ImageView img3 = new ImageView(cow);
        ImageView img4 = new ImageView(horse);
        //Zdjęcia
        rabbits.getChildren().add(img);
        sheep1.getChildren().add(img1);
        pigs.getChildren().add(img2);
        cows.getChildren().add(img3);
        horses.getChildren().add(img4);
        //Etykiety
        totalLabel.setText("Mateusz");

        grid.add(rabbits, 4, 42);
        grid.add(sheep1, 4, 43);
        grid.add(pigs, 4, 44);
        grid.add(cows, 4, 45);
        grid.add(horses, 4, 46);
        grid.add(exchangePig, 8, 12);
        grid.add(exchangeRabbit, 9, 12);
        grid.add(exchangeSheep, 10, 12);
        grid.add(totalLabel, 4, 31, 2, 1);


        Scene scene = new Scene(grid, 1600, 900, Color.YELLOW);

        primaryStage.setTitle("SuperFarmer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
