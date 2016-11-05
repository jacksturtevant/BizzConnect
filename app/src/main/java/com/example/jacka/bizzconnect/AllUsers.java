package com.example.jacka.bizzconnect;

import android.util.Log;

import java.io.*;
import java.util.HashMap;

/**
 * Created by ekansh on 11/5/16.
 */

public class AllUsers implements Serializable {

    private HashMap<String, UserInfo> users = new HashMap<>();
    private static final String fil = "users.ini";
    private static AllUsers a = new AllUsers();
    public void saveUser() {
        try {
            FileOutputStream f = new FileOutputStream(fil);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(a);
        } catch (Exception e) {
            Log.e("error", e.getMessage());
        }
    }

    public static AllUsers restoreUser() {
        try {
            FileInputStream f = new FileInputStream(fil);
            ObjectInputStream o = new ObjectInputStream(f);
            a = (AllUsers) o.readObject();
            return a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static AllUsers getIns() {
        return a;
    }

    public HashMap<String, UserInfo> getMap() {
        return a.users;
    }
}
