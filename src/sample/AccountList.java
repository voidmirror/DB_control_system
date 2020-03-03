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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountList that = (AccountList) o;
        return dataBaseHashMap.equals(that.dataBaseHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataBaseHashMap);
    }

    public int accountsNumber() {
        int i = 0;
        for (Object o : dataBaseHashMap.keySet()) {
            //System.out.println(o);
            i++;
        }
        return i;
    }


    //TODO: removing accounts by field value (new ArrayList, if values equals then key-->ArrayList. Remove from hashMap by ArrayList)
}
