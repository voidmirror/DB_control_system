package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
//        accountList.getDataBaseHashMap().put("first", new UserAccount());
//        accountList.getDataBaseHashMap().put("stop", "step");
//        accountList.getDataBaseHashMap().put("caa", "step");
//        accountList.getDataBaseHashMap().put("baa", "step");
//        accountList.getDataBaseHashMap().put("1aaa", "step");
        //accountList.getDataBaseHashMap().get("stop");
//        System.out.println(accountList.getDataBaseHashMap().get("stop"));
//        System.out.println(accountList.getDataBaseHashMap().keySet());
//        for (Object o : accountList.getDataBaseHashMap().keySet()) {
//            System.out.println(o);
//        }
//        System.out.println(accountList.getDataBaseHashMap().get("first"));
//        System.out.println(accountList.accountsNumber());
//        accountList.getDataBaseHashMap().remove("first");
//        System.out.println(accountList.accountsNumber());

        //timeMeasure();
        launch(args);
    }

    public static void addAccount(String s) {

        ArrayList<String> arrayList = new ArrayList<String>();
        for (String retval : s.split(" ")) {
            arrayList.add(retval);
        }
        if (Main.accountList.getDataBaseHashMap().containsKey(arrayList.get(0)) == false) {
            Main.accountList.getDataBaseHashMap().put(arrayList.get(0), new UserAccount(arrayList.get(0), arrayList.get(1), arrayList.get(2), Integer.parseInt(arrayList.get(3)), Integer.parseInt(arrayList.get(4)), Boolean.parseBoolean(arrayList.get(5))));
//            try {
//                FileWriter fileWriter = new FileWriter(dataBase);
//                fileWriter.append(arrayList.get(0) + " " + arrayList.get(1) + " " + arrayList.get(2) + " " + Integer.parseInt(arrayList.get(3)) + " " + Integer.parseInt(arrayList.get(4)) + " " + Boolean.parseBoolean(arrayList.get(5)));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }


    }

    public static void removeAccount(String s) {
//        String s = textFieldSearch.getText();
        if (Main.accountList.getDataBaseHashMap().containsKey(s)) {
            Main.accountList.getDataBaseHashMap().remove(s);
//            System.out.println();
//            System.out.println();
//            System.out.println("remove?");
////            deleteDataBaseMain();
//            //initFromFile();
//            String path = "src\\sample\\database.txt";
//            File dataBase = new File(path);
//            try {
//                FileWriter fileWriter = new FileWriter(dataBase);
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            for (Object o : Main.accountList.getDataBaseHashMap().values()) {
////                ((UserAccount) o)
//
//                try {
//                    FileWriter fileWriter = new FileWriter(dataBase, true);
//                    fileWriter.append(((UserAccount) o).getUserName() + " " + ((UserAccount) o).getPassword() + " " + ((UserAccount) o).getEmail() + " " + ((UserAccount) o).getBlackMatter() + " " + ((UserAccount) o).getUserLevel() + " " + ((UserAccount) o).getUserVIP());
//                    fileWriter.append("\n");
//                    System.out.println();
//                    System.out.println("written?");
//                    fileWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }

//    public static void deleteDataBaseMain() {
//        String path = "src\\sample\\database.txt";
//        File dataBase = new File(path);
//
//        if (dataBase.delete()) {
//            System.out.println("DataBase deleted");
//        } else {
//            System.out.println("File does not exist");
//        }
//    }

    public static void timeMeasure() {
        long start, finish;
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            addAccount(i + "_user pass email " + i + " " + i + " " + "false");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Add100: " + finish);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            removeAccount(i + "_user");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Remove100: " + finish);

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            addAccount(i + "_user pass email " + i + " " + i + " " + "false");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Add1000: " + finish);

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            removeAccount(i + "_user");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Remove1000: " + finish);

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            addAccount(i + "_user pass email " + i + " " + i + " " + "false");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Add10000: " + finish);

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            removeAccount(i + "_user");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Remove10000: " + finish);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            addAccount(i + "_user pass email " + i + " " + i + " " + "false");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Add100000: " + finish);

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            removeAccount(i + "_user");
        }
        finish = System.currentTimeMillis() - start;
        System.out.println("Remove100000: " + finish);
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


