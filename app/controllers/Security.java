package controllers;

import models.*;

public class Security extends Secure.Security {

    static boolean authentify(String username, String password) {
        return true;
    }
    
    static boolean check(String profile) {
       return true;
    }
    
    static void onDisconnected() {
        Application.index();
    }
    
}

