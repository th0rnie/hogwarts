package hogwardsapplication;

import javax.swing.*;

public class Validering {
    
    //Validerings metod som undersöker om textrutan är tom
    public static boolean tomText(JTextField enruta){
        boolean searching = true;
        
        if(enruta.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Du måste ange ett värde");
          searching = false;
          enruta.requestFocus();
        }
        return searching;
    }
    //Validerings metod som undersöker om det angivna värdet är ett heltal
    public static boolean heltal(JTextField enruta){
        boolean searching = true;
        
        try{
            String enString = enruta.getText();
            Integer.parseInt(enString);
            enruta.requestFocus();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ange ett heltal");
            searching = false;
        }
        return searching;
    }
    //Validerings metod som undersöker om det angivna värdet är en String
    public static boolean positivtTal(JTextField enruta){
        boolean searching = true;
        if(enruta.getText().substring(0).equals("-")){
           searching = false;
           enruta.requestFocus();  
        }
        else{
            JOptionPane.showMessageDialog(null, "Endast positiva värden");
        }
        return searching;
    }
    
    //Validerings metod som undersöker om det angivna int talet är positivt
    public static boolean enString(JTextField enruta){
        boolean searching = true;
        if(!enruta.getText().matches("[a-zA-Z]+")){
            JOptionPane.showMessageDialog(null, "Endast bokstäver mellan A-Z tillåtna");
            searching = false;
        }
        return searching;
    }
}
