
package hogwardsapplication;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.*;
import java.util.*;

public class Admin extends javax.swing.JFrame {

    private static InfDB idb; 
    private ArrayList<String> enlista;
    private ArrayList<HashMap<String, String>> lista;
    
    public Admin(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.enlista = new ArrayList<>();
        this.lista = new ArrayList<HashMap<String,String>>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRedigeraElev = new javax.swing.JButton();
        btnAndraLosen = new javax.swing.JButton();
        lblNuvarandeLosen = new javax.swing.JLabel();
        lblNyttLosen = new javax.swing.JLabel();
        txtNuvarandeLosen = new javax.swing.JPasswordField();
        txtNyttLosen = new javax.swing.JPasswordField();
        btnAndraPoang = new javax.swing.JButton();
        lvlElevhem = new javax.swing.JLabel();
        txtElevhem = new javax.swing.JTextField();
        lblAntalPoang = new javax.swing.JLabel();
        txtPoang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRedigeraElev.setText("Redigera elevlista");
        btnRedigeraElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraElevActionPerformed(evt);
            }
        });

        btnAndraLosen.setText("Ändra lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
            }
        });

        lblNuvarandeLosen.setText("Nuvarande lösenord:");

        lblNyttLosen.setText("Nytt lösenord:");

        btnAndraPoang.setText("Ändra huspoäng");
        btnAndraPoang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraPoangActionPerformed(evt);
            }
        });

        lvlElevhem.setText("Elevhem:");

        lblAntalPoang.setText("Antal poäng:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAndraPoang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedigeraElev, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnAndraLosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlElevhem)
                    .addComponent(lblNuvarandeLosen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(txtElevhem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNyttLosen)
                    .addComponent(lblAntalPoang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNyttLosen, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txtPoang))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnRedigeraElev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraLosen)
                    .addComponent(lblNuvarandeLosen)
                    .addComponent(lblNyttLosen)
                    .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraPoang)
                    .addComponent(lvlElevhem)
                    .addComponent(txtElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAntalPoang)
                    .addComponent(txtPoang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedigeraElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraElevActionPerformed
        new Redigering(idb).setVisible(true);
    }//GEN-LAST:event_btnRedigeraElevActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        if(Validering.tomText(txtNyttLosen) && Validering.enString(txtNuvarandeLosen)){
        try{
        enlista = idb.fetchColumn("SELECT LOSENORD FROM LARARE");
        for(int i = 0; i < enlista.size(); i++){
            if(enlista.get(i).equalsIgnoreCase(txtNuvarandeLosen.getText())){
                idb.update("UPDATE LARARE SET LOSENORD="+ "'"+txtNyttLosen.getText()+"'" +"WHERE LOSENORD="+ "'"+txtNuvarandeLosen.getText()+"'");
                JOptionPane.showMessageDialog(null, "Lösenordet har ändrats");
            }
          }
        }
       catch(InfException e){
           JOptionPane.showMessageDialog(null, e.getMessage() + "Lösenordet har inte ändrats");
       } 
     }   
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void btnAndraPoangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraPoangActionPerformed
        String add = "+";
        if(txtPoang.getText().substring(0).equals("-")){
            add = "-";
        }
        if(Validering.enString(txtElevhem) && Validering.tomText(txtElevhem) && Validering.heltal(txtPoang) && Validering.tomText(txtElevhem)){
            try{
                enlista = idb.fetchColumn("SELECT ELEVHEMSNAMN FROM ELEVHEM");
                for(int i = 0; i < enlista.size(); i++){
                    if(enlista.get(i).equalsIgnoreCase(txtElevhem.getText())){
                        idb.update("UPDATE ELEVHEM SET HUSPOANG= HUSPOANG" + add + txtPoang.getText() + "WHERE ELEVHEMSNAMN = '" + txtElevhem.getText()+"'");
                        JOptionPane.showMessageDialog(null, "Poängen har registrerats");
                    }
                }
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }       
    }//GEN-LAST:event_btnAndraPoangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnAndraPoang;
    private javax.swing.JButton btnRedigeraElev;
    private javax.swing.JLabel lblAntalPoang;
    private javax.swing.JLabel lblNuvarandeLosen;
    private javax.swing.JLabel lblNyttLosen;
    private javax.swing.JLabel lvlElevhem;
    private javax.swing.JTextField txtElevhem;
    private javax.swing.JPasswordField txtNuvarandeLosen;
    private javax.swing.JPasswordField txtNyttLosen;
    private javax.swing.JTextField txtPoang;
    // End of variables declaration//GEN-END:variables
}
