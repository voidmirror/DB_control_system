package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AccountList {
    private HashMap dataBaseHashMap;

    public void createHashMap() {
        dataBaseHashMap = new HashMap();
    }

    public HashMap getDataBaseHashMap() {
        return dataBaseHashMap;
    }
}
