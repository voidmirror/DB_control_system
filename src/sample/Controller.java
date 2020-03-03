package sample;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.io.*;
import java.net.URI;
import java.nio.file.*;



public class Controller {
    @FXML
    private Tab tabCreateNewUser;
    @FXML
    private Tab tabDataBase;
    @FXML
    private TextField textFieldUserName;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private TextField textFieldBlackMatter;
    @FXML
    private TextField textFieldUserLevel;
    @FXML
    private CheckBox checkBoxVIP;

    // buttons
    @FXML
    private Button btnClear;

    // labels
    @FXML
    private Label labelLog;


    public String getTextFieldUserName() {
        return textFieldUserName.getText();
    }

    public String getPasswordField() {
        return passwordField.getText();
    }

    public String getTextFieldEmail() {
        //TODO: try/catch on '@' and others (regular expression needed)
        return textFieldEmail.getText();
    }

    public int getTextFieldBlackMatter() {
        int i = Integer.parseInt(textFieldBlackMatter.getText());
        //TODO: try/catch NumberFormatException
        return i;
    }

    public boolean getCheckBoxVIP() {
        return checkBoxVIP.isSelected();
    }

    public int getTextFieldUserLevel() {
        int i = Integer.parseInt(textFieldUserLevel.getText());
        //TODO: try/catch NumberFormatException
        return i;
    }

    public void actionBtnClear() {
        labelLog.setText("All fields cleared");

        textFieldUserName.setText("");
        passwordField.setText("");
        textFieldEmail.setText("");
        checkBoxVIP.setSelected(false);
        textFieldBlackMatter.setText("");
        textFieldUserLevel.setText("");


        FadeTransition labelLogFadeInTransition = new FadeTransition(Duration.millis(500), labelLog);
        labelLogFadeInTransition.setFromValue(0.0);
        labelLogFadeInTransition.setToValue(1.0);

        FadeTransition labelLogFadeOutTransition = new FadeTransition(Duration.millis(500), labelLog);
        labelLogFadeOutTransition.setFromValue(1.0);
        labelLogFadeOutTransition.setToValue(0.0);

        PauseTransition pauseTransition = new PauseTransition(Duration.millis(2000));

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(
                labelLogFadeInTransition,
                pauseTransition,
                labelLogFadeOutTransition
        );
        //sequentialTransition.delayProperty().setValue(Duration.millis(1000));

        sequentialTransition.play();
    }

    public void actionBtnSubmit() {
        labelLog.setText("Submit successful");

        FadeTransition labelLogFadeInTransition = new FadeTransition(Duration.millis(500), labelLog);
        labelLogFadeInTransition.setFromValue(0.0);
        labelLogFadeInTransition.setToValue(1.0);

        FadeTransition labelLogFadeOutTransition = new FadeTransition(Duration.millis(500), labelLog);
        labelLogFadeOutTransition.setFromValue(1.0);
        labelLogFadeOutTransition.setToValue(0.0);

        PauseTransition pauseTransition = new PauseTransition(Duration.millis(2000));

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(
                labelLogFadeInTransition,
                pauseTransition,
                labelLogFadeOutTransition
        );

        sequentialTransition.play();

        String path = "src\\sample\\database.txt";
        File dataBase = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(dataBase, true);
            fileWriter.append("hell yeah");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Main.accountList.getDataBaseHashMap().put(getTextFieldUserName(), new UserAccount(
                getTextFieldUserName(),
                getPasswordField(),
                getTextFieldEmail(),
                getTextFieldBlackMatter(),
                getTextFieldUserLevel(),
                getCheckBoxVIP()));
//        System.out.println(Main.accountList.getDataBaseHashMap().get("hey"));
//        System.out.println(Main.accountList.getDataBaseHashMap().get("hep"));

        //TODO: separate function of listing all objects
        for (Object o : Main.accountList.getDataBaseHashMap().keySet()) {
            System.out.println(Main.accountList.getDataBaseHashMap().get(o));
        }
        System.out.println("-----------------------");

        //Path file = Paths.get("D:/Programmes files 7/GitHub/Repositories/JavaFX_test/src/sample/database.txt");
        //File dataBase = new File();

        //FileOutputStream outputStream = new FileOutputStream(dataBase, true);
        //FileWriter fileWriter = new FileWriter("src/database.txt", true);
    }
}
