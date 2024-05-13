package org.example.test18;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {
    private ObservableList<Object> cartItems = FXCollections.observableArrayList();
    private ListView<Object> cartListView = new ListView<>(cartItems);

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label headerLabel = new Label("Kero w 7elmy online shop");
        headerLabel.setStyle("-fx-font-size: 75px; -fx-font-weight: bold;");
        headerLabel.setPadding(new Insets(50, 10, 200, 10));
        Label label1 = new Label("Label 1");
        Label label2 = new Label();
        // Bind the textProperty of label2 to the textProperty of label1
        label2.textProperty().bind(label1.textProperty());
        new Order;
        VBox root = new VBox();
        root.getChildren().addAll(label1, label2);
        Button menuButton1 = new Button("Home");
        Button menuButton2 = new Button("Products");
        Button menuButton3 = new Button("Cart");
        VBox leftSidebar = new VBox(10); // menu , products , cart
        VBox buttonContainer = new VBox(10); // products menu ({"Hoodies","T-shirts","trousers","cap","shoes"})
        leftSidebar.getChildren().addAll(menuButton1, menuButton2, buttonContainer, menuButton3);
        BorderPane pane = new BorderPane();
        pane.setCenter(headerLabel);
        pane.setLeft(leftSidebar);
        leftSidebar.setStyle("-fx-padding: 10px; -fx-background-color: #fc7800;");
        menuButton2.setOnAction(event -> {
            // Load an image
            pane.setTop(null);
            pane.setCenter(null);
            Label prod_label = new Label("select the category u want");
            prod_label.setStyle("-fx-font-size: 75px; -fx-font-weight: bold;");
            pane.setCenter(prod_label);
            if (buttonContainer.getChildren().size() > 1) {
                // Buttons are already displayed, remove them
                buttonContainer.getChildren().remove(0, buttonContainer.getChildren().size());
            } else {

                String[] hoodiesLinks = {"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr4NYQg5XyI_phCI1pW4rGb5e4UZhKpGCFuw&usqp=CAU",
                        "https://huckberry.imgix.net/spree/products/733913/original/40772_Flint_and_Tinder_10-Year_Full_Zip_Hoodie_Black_01.jpg?auto=format%2C%20compress&crop=top&fit=fill&cs=tinysrgb&ar=4%3A5&fill=solid&fill-color=FFFFFF&ixlib=react-9.8.1",
                        "https://m.media-amazon.com/images/I/61uW9OHxOiL._AC_UY1000_.jpg",
                        "https://img.fruugo.com/product/4/14/666294144_max.jpg"};

                String[] tshirtsLinks = {"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZhsDSzNNlIL15ldx0MKLTga4ugbI-mdFO-sTFb-n07A&s",
                        "https://www.thewalkdeal.com/cdn/shop/products/Never-Give-Up-TheFight.jpg?v=1640673347",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqmzYJ9wqyr_1mZvp7WbttcDmklpcMMQAecEPht4G4hQ&s"};

                String[] trousersLinks = {"https://www.newforestclothing.co.uk/cdn/shop/products/CavalryTwillTrouserscharcoal4.jpg?v=1680512442",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8u2FmawQT7yO4RueHNVBwI5KOX2SbGh5TT9HTGc5ilg&s"};

                String[] capsLinks = {"https://eg.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/23/489764/1.jpg?3403",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7Di8sjnvDkodlmXI-lPibog2oriKMymEO91j02ulf_g&s"};

                String[] shoesLinks = {"https://contents.mediadecathlon.com/p2606919/k$a531927e5c71c12f4d3edac227199f78/jogflow-5001-men-s-running-shoes-white-blue-red.jpg?format=auto&quality=40&f=452x452",
                        "https://i5.walmartimages.com/asr/aa500205-ba8a-4b5b-83b3-6fbeef678ddc.480f707bdd92c6873286f95a0e4d324a.jpeg?odnHeight=768&odnWidth=768&odnBg=FFFFFF",
                        "https://static.nike.com/a/images/t_PDP_1280_v1/f_auto,q_auto:eco/99486859-0ff3-46b4-949b-2d16af2ad421/custom-nike-dunk-high-by-you-shoes.png"};

                Button[] categories = {new Button("Hoodies"), new Button("T-shirts"), new Button("trousers"), new Button("cap"), new Button("shoes")};

                for (int key = 0; key < categories.length; key++) {
                    int index = key;

                    buttonContainer.getChildren().add(categories[key]);
                    categories[key].setOnAction(e -> {
                        GridPane gridPane = new GridPane();
                        gridPane.setPadding(new Insets(20));
                        gridPane.setHgap(20); // Horizontal gap between grid cells
                        gridPane.setVgap(20);

                        String[] links;

                        if (index == 0) {
                            links = hoodiesLinks;
                        } else if (index == 1) {
                            links = tshirtsLinks;

                        } else if (index == 2) {
                            links = trousersLinks;

                        } else if (index == 3) {
                            links = capsLinks;

                        } else {
                            links = shoesLinks;
                        }

                        for (int i = 0; i < links.length; i++) {

                            Label nameLabel = new Label("Product " + (i + 1));
                            Label priceLabel = new Label("$" + 10 * (i + 1));
                            Button b = new Button("Add to cart");

                            Image image = new Image(links[i]);
                            ImageView imageView = new ImageView(image);
                            imageView.setFitWidth(100);
                            imageView.setFitHeight(100);

                            // Place the images and labels into the GridPane
                            gridPane.add(imageView, i, 0); // Column 0, Row 0
                            gridPane.add(nameLabel, i, 1); // Column 0, Row 1
                            gridPane.add(priceLabel, i, 2); // Column 0, Row 2
                            gridPane.add(b, i, 3); // Column 0, Row 3

                            b.setOnAction(ev -> {
                                HBox cartItem = new HBox();
                                cartItem.setSpacing(10);
                                cartItem.getChildren().addAll(imageView, nameLabel, priceLabel);
                                categories[index].fire();
                                cartItems.add(cartItem);
                            });
                        }
                        pane.setCenter(gridPane);

                    });
                }

            }
        });
        menuButton1.setOnAction(event -> {
            // Load an image
            pane.setCenter(null);
            VBox login = new VBox(10);
            login.setPadding(new Insets(200, 300, 20, 300)); // Preferred height
            Label loginlabel = new Label("login to our Online Shopping App");
            loginlabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
            Label Firstname = new Label("UserName:");
            Firstname.setStyle("-fx-font-size: 15px;");
            Label Lastname = new Label("Password:");
            Lastname.setStyle("-fx-font-size: 15px;");
            TextField T1 = new TextField();
            String username = T1.getText();
            PasswordField T2 = new PasswordField();
            String password = T2.getText();
            Button Sign_in = new Button("Sign in");
            login.getChildren().addAll(loginlabel, Firstname, T1, Lastname, T2, Sign_in);
            Sign_in.setOnAction(event2 -> {
                String s1 = T1.getText();
                System.out.println(s1);
                String s2 = T1.getText();
                System.out.println(s2);
                T1.setText("");
                T2.setText("");
                menuButton2.fire();
            });
            pane.setCenter(login);
            pane.setAlignment(login, Pos.TOP_CENTER);
        });

        menuButton3.setOnAction(e -> {
            pane.setCenter(null);
            pane.setCenter(cartListView);

        });
        Scene scene = new Scene(pane, 1020, 700);
        stage.setTitle("Online shop");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}