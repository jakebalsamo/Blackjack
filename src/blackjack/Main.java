package blackjack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /* Set root window and scene */
        Parent gameRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene gameScene = new Scene(gameRoot, 300, 275);
        primaryStage.setTitle("Blackjack");
        primaryStage.setScene(gameScene);
        primaryStage.show();


    }

    private void startGame() {
        Deck d = new Deck();
        Card testCard1 = new Card(Suit.SPADES,Rank.ACE,11);
        Card testCard2 = new Card(Suit.SPADES,Rank.TWO,2);

        HBox dealerView = new HBox(2);
        HBox playerView = new HBox(2);

        ImageView centerImage = new ImageView();
        centerImage.setImage(new Image("./images/aces.png", 500, 400, true, true));


        ImageView card1View = new ImageView();
        card1View.setImage(testCard1.getFront());
        ImageView card2View = new ImageView();
        card2View.setImage(testCard2.getBack());
        dealerView.getChildren().addAll(card1View, card2View);
        dealerView.setMaxWidth(200);

        //root.setTop(dealerView);
        //root.getTop().maxHeight(100);
        //root.setBottom(playerView);
        //root.setCenter(centerImage);

        card2View.setImage(testCard2.getFront());

        ImageView card3View = new ImageView();
        card3View.setImage(testCard1.getBack());

        dealerView.getChildren().add(card3View);
    }

    public void ConsoleGame() {

        // declare variables
        Deck d;
        ArrayList<Player> listOfPlayers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String div = "__________________________________________________\n";
        boolean replay = false;

        // formatting, show title, get players
        System.out.printf("%n                    BLACKJACK                    %n%s", div);

        // create dealer
        Dealer house;

        //create players
        System.out.printf("%nEnter Player 1 Name: %n");
        String player1Name = input.nextLine();
        Player player1;

        //start game loop
        do {

            // initialize game-dependent variables/objects
            d = new Deck();
            house = new Dealer("House");
            player1 = new Player(player1Name);

            // formatting
            System.out.printf("%s", div,d.toString());

            // deal initial cards
            System.out.printf("%nDealing cards");
            //Thread.sleep(500);
            System.out.printf(".");
            //Thread.sleep(500);
            System.out.printf(".");
            //Thread.sleep(500);
            System.out.printf(".");
            //Thread.sleep(500);
            System.out.printf("%n%s%n",div);
            player1.addCard(d.deal());
            house.addCard(d.deal());
            player1.addCard(d.deal());
            house.addCard(d.deal());

            // allow players to hit/stay
            System.out.printf("%nIt is %s's turn.%n", player1Name);
            while(player1.isHitting(input)) {
                player1.addCard(d.deal());
            } // end while

            // allow dealer to hit/stay
            if (!player1.isBusted()) {
                System.out.printf("%s%nIt is the house's turn.%n", div);
                while(house.isHitting(input)) {
                    house.addCard(d.deal());
                } // end while
            } // end if

            // set player values
            int p1Value = player1.getHandValue();
            int houseValue = house.getHandValue();

            // formatting
            System.out.println(div);

            // calculate winner
            if (player1.isBusted()) {
                house.win();
                player1.lose();
            } else if (house.isBusted()) {
                player1.win();
                house.lose();
            } else if ((21 - p1Value) > (21 - houseValue)) {
                house.win();
                player1.lose();
            } else if ((21 - p1Value) < (21 - houseValue)) {
                player1.win();
                house.lose();
            } else {
                house.win();
                player1.lose();
            } // end if

            // control replay with error handling
            boolean error = true;
            String in = "";
            while (error) {
                try {
                    System.out.printf("%nEnter 'P' to play another round or 'Q' to quit: ");
                    in = input.nextLine();
                    error = false;
                } catch (InputMismatchException e) {
                    System.out.printf("Error: Invalid input.%n");
                    input.nextLine();
                    error = true;
                }

                if (in.equalsIgnoreCase("q")) {
                    replay = false;
                } else if (in.equalsIgnoreCase("p")) {
                    replay = true;
                } else {
                    System.out.printf("Error: Invalid input. ");
                    error = true;
                }
            } // end while

        } while (replay); // end do-while

        // formatting
        System.out.printf("%n%s%n                    GAME OVER                    %n", div);

    } // end game

    public static void main(String[] args) {
        launch(args);
    }
}
