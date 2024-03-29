/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javax.swing.JLabel;
import javax.swing.JToggleButton;
import controleur.CtrlAbstrait;
import controleur.CtrlMenu;
import controleur.EnumAction;
/**
 *
 * @author btssio
 */
public class VueMenu extends VueAbstraite {

    /**
     * Creates new form V_Connexion
     */
    public VueMenu(CtrlAbstrait ctrlAbstrait) {
        super(ctrlAbstrait);
        initComponents();
    }

    /**
     *
     */
 

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbGsb = new javax.swing.JLabel();
        btnMedicament = new javax.swing.JToggleButton();
        btnQuitter = new javax.swing.JToggleButton();
        btnRapport = new javax.swing.JToggleButton();
        btnPraticien = new javax.swing.JToggleButton();
        btnVisiteur = new javax.swing.JToggleButton();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        lbGsb.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lbGsb.setText("Application GSB");

        btnMedicament.setText("Medicament");
        btnMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentActionPerformed(evt);
            }
        });

        btnQuitter.setText("Quitter");
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });

        btnRapport.setText("Rapport");
        btnRapport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapportActionPerformed(evt);
            }
        });

        btnPraticien.setText("Praticien");
        btnPraticien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPraticienActionPerformed(evt);
            }
        });

        btnVisiteur.setText("Visiteur");
        btnVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisiteurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRapport, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnMedicament, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnPraticien, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnVisiteur, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(btnQuitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(lbGsb)
                .addGap(336, 336, 336))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbGsb)
                .addGap(39, 39, 39)
                .addComponent(btnMedicament)
                .addGap(18, 18, 18)
                .addComponent(btnPraticien)
                .addGap(18, 18, 18)
                .addComponent(btnVisiteur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRapport)
                .addGap(105, 105, 105)
                .addComponent(btnQuitter)
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentActionPerformed
       ((CtrlMenu)controleur).medicament();
          
    }//GEN-LAST:event_btnMedicamentActionPerformed

    private void btnPraticienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPraticienActionPerformed
       ((CtrlMenu)controleur).praticien();
    }//GEN-LAST:event_btnPraticienActionPerformed

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
         ((CtrlMenu)controleur).fichierQuitter();
    }//GEN-LAST:event_btnQuitterActionPerformed

    private void btnVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisiteurActionPerformed
         ((CtrlMenu)controleur).visiteur();
    }//GEN-LAST:event_btnVisiteurActionPerformed

    private void btnRapportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapportActionPerformed
         ((CtrlMenu)controleur).rapport();
    }//GEN-LAST:event_btnRapportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnMedicament;
    private javax.swing.JToggleButton btnPraticien;
    private javax.swing.JToggleButton btnQuitter;
    private javax.swing.JToggleButton btnRapport;
    private javax.swing.JToggleButton btnVisiteur;
    private javax.swing.JLabel lbGsb;
    // End of variables declaration//GEN-END:variables
}
