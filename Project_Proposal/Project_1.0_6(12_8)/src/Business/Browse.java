/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayur
 */
public class Browse {
    
    public static void openWebpage(URI uri) {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public static void openWebpagel(URL url) {
   
    try {
        openWebpage(url.toURI());
    } catch (URISyntaxException e) {
        e.printStackTrace();
    }
}
public static void openURL(String u){
    try {
    URL myURL = new URL(u);
    openWebpagel(myURL);
    //URLConnection myURLConnection = myURL.openConnection();
    //myURLConnection.connect();
} 
catch (MalformedURLException e) { 
    JOptionPane.showMessageDialog(null, e);
} 
catch (IOException e) {   
     JOptionPane.showMessageDialog(null, e);
}
}
    
}
