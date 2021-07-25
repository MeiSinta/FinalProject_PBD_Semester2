/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokokarunia;

/**
 *
 * @author Hamba Notbook
 */
public class UserSession {
    private static String type;
    private static String data;
 
    public static String getType() {
        return type;
    }
 
    public static void setType(String type) {
        UserSession.type = type;
    }
    
    public static String getData() {
        return data;
    }
 
    public static void setData(String data) {
        UserSession.data = data;
    }
}
