package hogwardsapplication;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.*;

public class HogwardsApplication {

    private static InfDB idb;

    public static void main(String[] args) {
        
        try{
            
        idb = new InfDB("C:\\db\\hogdb1.fdb");
        new LarareELev(idb).setVisible(true);
        
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        
    }
    
//    
}
