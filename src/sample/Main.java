package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static javafx.application.Application.launch;

public class Main extends Application {

    public static void main(String[] args) {
        AccountList accountList = new AccountList();
        accountList.createHashMap();
        accountList.getDataBaseHashMap().put("stop", "step");
        accountList.getDataBaseHashMap().get("stop");
        System.out.println(accountList.getDataBaseHashMap().get("stop"));
        System.out.println(accountList.getDataBaseHashMap().keySet().toArray());
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root = loader.load();

        ArrayList<UserAccount> accountArrayList = new ArrayList<UserAccount>();

        primaryStage.setScene(new Scene(root, 609,361));
        primaryStage.setTitle("My DataBase");
        primaryStage.show();


    }
}


