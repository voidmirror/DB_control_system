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
    public static AccountList accountList = new AccountList();
    public static void main(String[] args) {

        accountList.createHashMap();

        //UserAccount first = new UserAccount();
        accountList.getDataBaseHashMap().put("first", new UserAccount());
//        accountList.getDataBaseHashMap().put("stop", "step");
//        accountList.getDataBaseHashMap().put("caa", "step");
//        accountList.getDataBaseHashMap().put("baa", "step");
//        accountList.getDataBaseHashMap().put("1aaa", "step");
        //accountList.getDataBaseHashMap().get("stop");
//        System.out.println(accountList.getDataBaseHashMap().get("stop"));
        System.out.println(accountList.getDataBaseHashMap().keySet());
        for (Object o : accountList.getDataBaseHashMap().keySet()) {
            System.out.println(o);
        }
        System.out.println(accountList.getDataBaseHashMap().get("first"));
        System.out.println(accountList.accountsNumber());
        accountList.getDataBaseHashMap().remove("first");
        System.out.println(accountList.accountsNumber());

        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root = loader.load();

        //ArrayList<UserAccount> accountArrayList = new ArrayList<UserAccount>();

        primaryStage.setScene(new Scene(root, 609,361));
        primaryStage.setTitle("My DataBase");
        primaryStage.show();


    }
}


