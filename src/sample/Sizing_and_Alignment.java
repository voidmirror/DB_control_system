//package sample;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXMLLoader;
//import javafx.geometry.HPos;
//import javafx.geometry.Insets;
//import javafx.geometry.Orientation;
//import javafx.geometry.Pos;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.*;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//import javax.swing.*;
//
//import static javafx.application.Application.launch;
//
//public class Main extends Application {
//
//    /*MAIN CLASS DUMP*/
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    private Button btnApply = new Button("Apply");
//    private Button btnContinue = new Button("Continue");
//    private Button btnExit = new Button("Exit");
//
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//
////        Canvas canvas = new Canvas(400, 300);
////        GraphicsContext context = canvas.getGraphicsContext2D();
////        drawShapes(context);
//
////        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
////        primaryStage.setScene(new Scene(root, 300, 400));
////        root.getChildren().add(canvas);
//
////        HBox hBox = new HBox();
////        hBox.getChildren().addAll(new Button("one"), new Button("two"));
////        hBox.setSpacing(5);
////        hBox.setPadding(new Insets(5));
////
////        GridPane gridPane = new GridPane();
////        gridPane.setHgap(10);
////        gridPane.setVgap(10);
////        gridPane.setPadding(new Insets(0, 10, 0, 10));
////
////        Text category = new Text("Sales:");
////        category.setFont(Font.font("Arial", FontWeight.BOLD, 20));
////        gridPane.add(category, 1, 0);
//
//
//        btnExit.setStyle("-fx-font-size: 15pt;");
//
//        TabPane tabs = new TabPane();
//        Tab tabSize = new Tab();
//        tabSize.setText("Sizing");
//        tabSize.setContent(sizingSample());
//
//        Tab tabAlign = new Tab();
//        tabAlign.setText("Alignment");
//        tabAlign.setContent(alignmentSample());
//
//        tabs.getTabs().addAll(tabSize, tabAlign);
//
//        primaryStage.setTitle("Sizing and Alignment");
//        //Group root = new Group();
//        //root.getChildren().addAll(hBox, gridPane);
//        primaryStage.setScene(new Scene(tabs, 300, 400));
//        primaryStage.show();
//
//
//    }
//
//    private Pane sizingSample() {
//        BorderPane borderPane = new BorderPane();
//        borderPane.setPadding(new Insets(20,0,20,20));
//
//        ListView<String> lvList = new ListView<String>();
//        ObservableList<String> items = FXCollections.observableArrayList("Hot Dog",
//                "Hamburger",
//                "French fries",
//                "Carrot Sticks",
//                "Chicken Salad");
//        lvList.setItems(items);
//        lvList.setMaxHeight(Control.USE_PREF_SIZE);
//        lvList.setPrefWidth(150.0);
//
//        borderPane.setLeft(lvList);
//        borderPane.setRight(createButtonColumn());
//        borderPane.setBottom(createButtonRow());
////        borderPane.setBottom(createButtonColumn());
//
//        return borderPane;
//    }
//
//    private Pane alignmentSample() {
//        GridPane gridPane = new GridPane();
//        gridPane.setAlignment(Pos.CENTER);
//        gridPane.setHgap(10);
//        gridPane.setVgap(20);
//
//        ColumnConstraints column1 = new ColumnConstraints();
//        column1.setHalignment(HPos.RIGHT);
//        gridPane.getColumnConstraints().add(column1);
//
//        ColumnConstraints column2 = new ColumnConstraints();
//        column1.setHalignment(HPos.LEFT);
//        gridPane.getColumnConstraints().add(column2);
//
//        HBox hbButtons = new HBox();
//        hbButtons.setSpacing(10);
//        hbButtons.setAlignment(Pos.CENTER);
//
//        Button btnSubmit = new Button("Submit");
//        Button btnClear = new Button("Clear");
//        Button btnExit2 = new Button("Exit");
//        btnSubmit.setStyle("-fx-font-size: 15pt;");
//
//        Label lblName = new Label("User Name");
//        TextField tfName = new TextField();
//        Label lblPassword = new Label("Password");
//        PasswordField pfPassword = new PasswordField();
//
//        btnClear.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                tfName.setText("");
//                pfPassword.setText("");
//            }
//        });
//
//        btnExit2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                Stage stage = (Stage) btnExit2.getScene().getWindow();
//                stage.close();
//            }
//        });
//
//        hbButtons.getChildren().addAll(btnSubmit, btnClear, btnExit2);
//        gridPane.add(lblName, 0, 0);
//        gridPane.add(tfName, 1, 0);
//        gridPane.add(lblPassword, 0,1);
//        gridPane.add(pfPassword, 1, 1);
//        gridPane.add(hbButtons, 0,2,2,1);
//
//        return gridPane;
//    }
//
//    private VBox createButtonColumn() {
//        Button btnAdd = new Button("Add");
//        Button btnDelete = new Button("Delete");
//        Button btnMoveUp = new Button("Move Up");
//        Button btnMoveDown = new Button("Move Down");
//
//        btnAdd.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        btnDelete.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        btnMoveUp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        btnMoveDown.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        btnMoveDown.setMinWidth(Control.USE_PREF_SIZE);
//
//        VBox vbButtons = new VBox();
//        vbButtons.setSpacing(10);
//        vbButtons.setPadding(new Insets(0,20,10,20));
//
//        vbButtons.getChildren().addAll(btnAdd, btnDelete, btnMoveUp, btnMoveDown);
//
//        return vbButtons;
//    }
//
//    private TilePane createButtonRow() {
//        btnApply.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        btnContinue.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        btnExit.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//
//        TilePane tileButtons = new TilePane(Orientation.HORIZONTAL);
//        tileButtons.setPadding(new Insets(20,10,20,0));
//        tileButtons.setHgap(10);
//        tileButtons.setVgap(8);
//
//        tileButtons.getChildren().addAll(btnApply, btnContinue, btnExit);
//
//        return tileButtons;
//    }
//
//    private HBox createButtonBox() {
//        HBox hbButtons = new HBox();
//        hbButtons.setSpacing(10);
//        hbButtons.setPadding(new Insets(20,10,20,0));
//        hbButtons.getChildren().addAll(btnApply, btnContinue, btnExit);
//
//        return hbButtons;
//    }
//
//
//
////    private void drawShapes(GraphicsContext gc) {
////        gc.setFill(Color.GREEN);
////        gc.setStroke(Color.BLUE);
////        gc.setLineWidth(5);
////        gc.strokeLine(40, 10, 10, 40);
////        gc.fillOval(10, 60, 30, 30);
////        gc.strokeOval(60, 60, 30, 30);
////        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
////        gc.strokeRoundRect(160, 60,30,30,10,10);
////        gc.fillArc(10,110,30,30,45,240, ArcType.OPEN);
////        gc.fillArc(60,110,30,30,45,240, ArcType.CHORD);
////        gc.fillArc(110,110,30,30,45,240, ArcType.ROUND);
////        gc.strokeArc(10,160,30,30,45,240, ArcType.OPEN);
////        gc.strokeArc(60,160,30,30,45,240, ArcType.CHORD);
////        gc.strokeArc(110,160,30,30,45,240,ArcType.ROUND);
////        gc.fillPolygon(new double[]{10, 40, 10, 40}, new double[]{210, 210, 240, 240}, 4);
////        gc.strokePolygon(new double[]{60, 90, 60, 90}, new double[]{210, 210, 240, 240}, 4);
////        gc.strokePolyline(new double[]{110, 140, 110, 140}, new double[]{210, 210, 240, 240}, 4);
////    }
//
//}
