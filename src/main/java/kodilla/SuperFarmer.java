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

import java.util.List;
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
    private Label blueDice = new Label();
    private Label orangeDice = new Label();
    private Label qOfRabbits = new Label();
    private Label qOfPigs = new Label();
    private Label qOfSheep = new Label();
    private Label qofCows = new Label();
    private Label qofHorses = new Label();


    public static void main(String[] args) {
        launch(args);
/*        //Rzut
        Dice dice = new Dice();
        Animal orange = dice.orangeDice();
        Animal blue = dice.blueDice();
        UserAnimalList list = new UserAnimalList();
        System.out.println(orange);
        System.out.println(blue);
        //Rozmnażanie
        Greeding greeding = new Greeding();
        UserAnimalList userAnimalList = greeding.greeding(orange, blue, list);
        //Wymiana
        //userAnimalList.exchangePig();
        Exchange exchange = new Exchange();
        exchange.exchange(userAnimalList,Animal.PIG);*/
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        //Ustawienia etykiety
        totalLabel.setFont(new Font("Arial", 30));
        totalLabel.setTextFill(Color.web("blue"));
        orangeDice.setFont(new Font("Arial", 50));
        orangeDice.setTextFill(Color.web("orange"));
        blueDice.setFont(new Font("Arial", 50));
        blueDice.setTextFill(Color.web("blue"));


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(18, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);
        //Rzut kostkami

        Button throwDice = new Button();
        throwDice.setText("RZUT KOSTKAMI");
        throwDice.setOnAction((e) -> {
            Dice dice = new Dice();
            Animal orange = dice.orangeDice();
            Animal blue = dice.blueDice();
            UserAnimalList list = new UserAnimalList();
            //Dodanie zwierzatek do kolekcji
            Greeding greeding = new Greeding();
            UserAnimalList userAnimalList = greeding.greeding(orange, blue, list);

            grid.add(orangeDice, 2, 5, 3, 5);
            orangeDice.setText(String.valueOf(orange));
            grid.add(blueDice, 2, 5, 3, 5);
            blueDice.setText(String.valueOf(blue));

            //Wyświetlenie zwierzątka i jego ilości
            List animalList = list.startGame();

            if (userAnimalList.checkQuantityRabbit(animalList) > 0) {
                grid.add(rabbits, 4, 42);
            }
        });
        Button throwComputer = new Button();
        throwComputer.setText("Za");
        throwComputer.setOnAction((e) -> {
            grid.clearConstraints(orangeDice);
            grid.clearConstraints(blueDice);
        });

        Button exchangePig = new Button();
        exchangePig.setText("PIG");
        exchangePig.setOnAction((e) -> {
            Exchange exchange = new Exchange();
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

        Button test = new Button();
        test.setText("Test");
        test.setOnAction((event -> {
        }));

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

        grid.getColumnConstraints().add(new ColumnConstraints(30)); // column 0 is 100 wide
        grid.getColumnConstraints().add(new ColumnConstraints(150)); // column 1 is 200 wide
        grid.getColumnConstraints().add(new ColumnConstraints(150)); // column 0 is 100 wide
        grid.getColumnConstraints().add(new ColumnConstraints(150)); // column 1 is 200 wide
        grid.getColumnConstraints().add(new ColumnConstraints(150)); // column 0 is 100 wide
        grid.getColumnConstraints().add(new ColumnConstraints(150)); // column 1 is 200 wide
        grid.getRowConstraints().add(new RowConstraints(100)); // column 0 is 100 wide
        grid.getRowConstraints().add(new RowConstraints(100)); // column 0
        grid.add(rabbits, 1, 10);
        grid.add(sheep1, 1, 11);
        grid.add(pigs, 1, 12);
        grid.add(cows, 1, 13);
        grid.add(horses, 1,14);
        grid.add(exchangePig, 8, 14);
        grid.add(exchangeRabbit, 9, 12);
        grid.add(exchangeSheep, 10, 12);
        grid.add(test, 11, 12);
        grid.add(throwDice, 2, 1);
        grid.add(throwComputer, 3, 1);

        //Dodawanie etykiet
        grid.add(totalLabel, 4, 31, 2, 1);

        Scene scene = new Scene(grid, 1600, 900, Color.YELLOW);

        primaryStage.setTitle("SuperFarmer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
