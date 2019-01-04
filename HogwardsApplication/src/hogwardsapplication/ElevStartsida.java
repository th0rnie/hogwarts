package hogwardsapplication;
import oru.inf.*;
import javax.swing.*;
import java.util.*;
import oru.inf.InfException;
import javax.swing.JOptionPane;
        
public class ElevStartsida extends javax.swing.JFrame {

    private static InfDB idb;
    private ArrayList<HashMap<String,String>> lista;
    private HashMap<String,String> lista2;
    private ArrayList<String> lista3;
            
    public ElevStartsida(InfDB idb) {
        initComponents();
        this.idb=idb;
        this.lista = new ArrayList<HashMap<String,String>>();
        this.lista2 = new HashMap<>();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSokBetyg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSokBetyg = new javax.swing.JTextField();
        btnSokPrefekt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSokPrefektElevhem = new javax.swing.JTextField();
        btnSokElever = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSokEleverElevhem = new javax.swing.JTextField();
        btnSokElevKurs = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSokElevKurs = new javax.swing.JTextField();
        btnSokElevhemCup = new javax.swing.JButton();
        btnSokLarareKurser = new javax.swing.JButton();
        lblAngeMellanDatum = new javax.swing.JLabel();
        txtDatum1 = new javax.swing.JTextField();
        txtDatum2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLararNamn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSokBetyg.setText("Sök betyg för en elev");
        btnSokBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokBetygActionPerformed(evt);
            }
        });

        jLabel1.setText("Ange förnamn:");

        txtSokBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSokBetygActionPerformed(evt);
            }
        });

        btnSokPrefekt.setText("Sök prefekt för elevhem");
        btnSokPrefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokPrefektActionPerformed(evt);
            }
        });

        jLabel2.setText("Ange elevhem:");

        btnSokElever.setText("Sök elever från elevhem");
        btnSokElever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokEleverActionPerformed(evt);
            }
        });

        jLabel3.setText("Ange elevhem:");

        btnSokElevKurs.setText("Sök elevs registrerade kurser");
        btnSokElevKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokElevKursActionPerformed(evt);
            }
        });

        jLabel4.setText("Ange förnamn:");

        btnSokElevhemCup.setText("Sök efter elevhemspokalen");
        btnSokElevhemCup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokElevhemCupActionPerformed(evt);
            }
        });

        btnSokLarareKurser.setText("Sök på lärares kurser");
        btnSokLarareKurser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokLarareKurserActionPerformed(evt);
            }
        });

        lblAngeMellanDatum.setText("Ange mellan vilka datum:");

        txtDatum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatum2ActionPerformed(evt);
            }
        });

        jLabel6.setText("-");

        jLabel7.setText("Namn");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtLararNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75))
                        .addComponent(btnSokElevhemCup)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSokLarareKurser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblAngeMellanDatum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSokElevKurs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSokElevKurs, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSokElever, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSokPrefekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSokBetyg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSokBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSokEleverElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSokPrefektElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSokLarareKurser)
                            .addComponent(lblAngeMellanDatum)
                            .addComponent(txtDatum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtDatum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLararNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSokElevhemCup)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnSokElevKurs)
                            .addComponent(txtSokElevKurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSokElever)
                            .addComponent(jLabel3)
                            .addComponent(txtSokEleverElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSokPrefekt)
                            .addComponent(jLabel2)
                            .addComponent(txtSokPrefektElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSokBetyg)
                            .addComponent(txtSokBetyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSokBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSokBetygActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSokBetygActionPerformed

    private void btnSokBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokBetygActionPerformed
        textArea.setText(null);
        String x = "";
        String namn = txtSokBetyg.getText();
        if(Validering.enString(txtSokBetyg) && Validering.tomText(txtSokBetyg)){
        try{
           lista = idb.fetchRows("SELECT KURSBETYG FROM HAR_BETYG_I JOIN ELEV on ELEV.ELEV_ID = HAR_BETYG_I.ELEV_ID WHERE ELEV.FORNAMN =" + "'" + namn + "'");
           for(int i = 0; i < lista.size(); i++){
               String z = lista.get(i).toString();
               x += z + "\n";
           }
           textArea.append(x);
           txtSokBetyg.requestFocus();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kunde inte hitta en elev med förnamn: " + namn);
        }
      }
    }//GEN-LAST:event_btnSokBetygActionPerformed

    private void btnSokPrefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokPrefektActionPerformed
        textArea.setText(null);
        if(Validering.enString(txtSokPrefektElevhem) && Validering.tomText(txtSokPrefektElevhem)){
        String namn = "";
        String elevhem = txtSokPrefektElevhem.getText();
            try{
           lista = idb.fetchRows("SELECT FORNAMN, EFTERNAMN FROM ELEV JOIN ELEVHEM ON ELEV.ELEV_ID=ELEVHEM.PREFEKT WHERE ELEVHEMSNAMN='" + txtSokPrefektElevhem.getText() + "'");
           for(int i = 0; i < lista.size(); i++){
           String x = lista.get(i).toString();
           namn += x + "\n";
           }
           textArea.append(namn);
           txtSokPrefektElevhem.requestFocus();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Kunde inte hitta ett elevhem med namnet: " + elevhem);
         }
        }
    }//GEN-LAST:event_btnSokPrefektActionPerformed

    private void btnSokEleverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokEleverActionPerformed
        textArea.setText(null);
        if(Validering.enString(txtSokEleverElevhem) && Validering.tomText(txtSokEleverElevhem)){
            String forefter = "";
            String elevhem = txtSokEleverElevhem.getText();
            try{
                lista = idb.fetchRows("SELECT EFTERNAMN, FORNAMN FROM ELEV JOIN SOVSAL ON SOVSAL.SOVSAL_ID = ELEV.SOVSAL JOIN ELEVHEM ON SOVSAL.ELEVHEM= ELEVHEM.ELEVHEM_ID WHERE ELEVHEMSNAMN ='" + elevhem + "'");
                for(int i = 0; i < lista.size(); i++){
                    String x = lista.get(i).toString();
                    forefter += x +" "+ "\n";
                }
                textArea.append(forefter);
                txtSokEleverElevhem.requestFocus();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Kunde inte hitta ett elevhem med namnet: " + elevhem);
            }
        }
    }//GEN-LAST:event_btnSokEleverActionPerformed

    private void btnSokElevKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokElevKursActionPerformed
        textArea.setText(null);
        String namn = txtSokElevKurs.getText();
        if(Validering.enString(txtSokElevKurs) && Validering.tomText(txtSokElevKurs)){
            String x = "";
            try{
                lista = idb.fetchRows("SELECT KURSNAMN FROM KURS JOIN REGISTRERAD_PA ON REGISTRERAD_PA.KURS_ID = KURS.KURS_ID JOIN ELEV ON ELEV.ELEV_ID = REGISTRERAD_PA.ELEV_ID WHERE ELEV.FORNAMN ='" + txtSokElevKurs.getText() + "'");
                for(int i = 0; i < lista.size(); i++){
                    x += lista.get(i).toString() + "\n";   
                }
                textArea.append(x);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Kunde inte hitta ett elevhem med namnet: " + namn);
            }
        }
    }//GEN-LAST:event_btnSokElevKursActionPerformed

    private void btnSokElevhemCupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokElevhemCupActionPerformed
        textArea.setText(null);
        String poang = "";
        try{
            lista = idb.fetchRows("SELECT ELEVHEMSNAMN, HUSPOANG FROM ELEVHEM");
            for(int i = 0; i < lista.size(); i++){
                poang += lista.get(i).toString() + "\n";
            }
            textArea.append(poang);
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSokElevhemCupActionPerformed

    private void btnSokLarareKurserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokLarareKurserActionPerformed
        textArea.setText(null);
        if(Validering.tomText(txtDatum1) && Validering.tomText(txtDatum2)){
            String z = "";
            String datum1 = txtDatum1.getText();
            String datum2 = txtDatum2.getText();
            String namn = txtLararNamn.getText();
            try{
               lista2 = idb.fetchRow("SELECT KURSNAMN FROM KURS JOIN LARARE on LARARE.LARAR_ID = KURS.KURSLARARE WHERE KURS.KURSSTART >= '"+datum1+"' AND KURS.KURSSLUT <= '"+datum2+"' "+ "AND LARARE.FORNAMN ='"+namn+"'");
               for(int i = 0; i < lista2.size(); i++){
               String x = lista2.get(i).toString();
               z = x + "\n";
               }
               textArea.append(z);
               txtDatum1.requestFocus();
           }
           catch(InfException e){
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
        }
    }//GEN-LAST:event_btnSokLarareKurserActionPerformed

    private void txtDatum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatum2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSokBetyg;
    private javax.swing.JButton btnSokElevKurs;
    private javax.swing.JButton btnSokElever;
    private javax.swing.JButton btnSokElevhemCup;
    private javax.swing.JButton btnSokLarareKurser;
    private javax.swing.JButton btnSokPrefekt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAngeMellanDatum;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField txtDatum1;
    private javax.swing.JTextField txtDatum2;
    private javax.swing.JTextField txtLararNamn;
    private javax.swing.JTextField txtSokBetyg;
    private javax.swing.JTextField txtSokElevKurs;
    private javax.swing.JTextField txtSokEleverElevhem;
    private javax.swing.JTextField txtSokPrefektElevhem;
    // End of variables declaration//GEN-END:variables
}
