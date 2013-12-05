/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

/**
 *
 * @author btssio
 */
public class V_Medicament extends javax.swing.JPanel {

    /**
     * Creates new form V_Connexion
     */
    public V_Medicament() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuitter = new javax.swing.JToggleButton();
        lbMedicaments = new javax.swing.JLabel();
        lbCode = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        lbFamille = new javax.swing.JLabel();
        lbComposition = new javax.swing.JLabel();
        lbEffetsIndesirables = new javax.swing.JLabel();
        lbContreIndications = new javax.swing.JLabel();
        lbPrixEchantillon = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtFamille = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComposition = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtContreIndications = new javax.swing.JTextArea();
        cbNomCommercial = new javax.swing.JComboBox();
        txtPrixEchantillon = new javax.swing.JTextField();
        btnPrecedent = new javax.swing.JToggleButton();
        btnSuivant = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEffetsIndesirables = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        btnQuitter.setText("quitter");

        lbMedicaments.setText("Medicaments");

        lbCode.setText("Code");

        lbNom.setText("Nom commercial");

        lbFamille.setText("Famille");

        lbComposition.setText("Composition");

        lbEffetsIndesirables.setText("Effets indésirable");

        lbContreIndications.setText("Contre-indications");

        lbPrixEchantillon.setText("Prix échantillon");

        txtComposition.setColumns(20);
        txtComposition.setRows(5);
        jScrollPane1.setViewportView(txtComposition);

        txtContreIndications.setColumns(20);
        txtContreIndications.setRows(5);
        jScrollPane2.setViewportView(txtContreIndications);

        cbNomCommercial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPrecedent.setText("Précedent");

        btnSuivant.setText("Suivant");

        txtEffetsIndesirables.setColumns(20);
        txtEffetsIndesirables.setRows(5);
        jScrollPane3.setViewportView(txtEffetsIndesirables);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(lbMedicaments)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNom)
                                .addGap(286, 286, 286))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCode)
                                    .addComponent(lbFamille)
                                    .addComponent(lbComposition)
                                    .addComponent(lbEffetsIndesirables)
                                    .addComponent(lbContreIndications)
                                    .addComponent(lbPrixEchantillon))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                        .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnPrecedent, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtPrixEchantillon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(8, 8, 8)))))))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFamille)
                    .addComponent(cbNomCommercial, 0, 460, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMedicaments)
                        .addGap(23, 23, 23)
                        .addComponent(lbCode))
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNom)
                    .addComponent(cbNomCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFamille)
                    .addComponent(txtFamille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbComposition)
                        .addGap(40, 40, 40)
                        .addComponent(lbEffetsIndesirables)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbContreIndications)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrixEchantillon)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrixEchantillon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnQuitter))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPrecedent)
                                    .addComponent(btnSuivant))))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPrecedent;
    private javax.swing.JToggleButton btnQuitter;
    private javax.swing.JToggleButton btnSuivant;
    private javax.swing.JComboBox cbNomCommercial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbComposition;
    private javax.swing.JLabel lbContreIndications;
    private javax.swing.JLabel lbEffetsIndesirables;
    private javax.swing.JLabel lbFamille;
    private javax.swing.JLabel lbMedicaments;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbPrixEchantillon;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtComposition;
    private javax.swing.JTextArea txtContreIndications;
    private javax.swing.JTextArea txtEffetsIndesirables;
    private javax.swing.JTextField txtFamille;
    private javax.swing.JTextField txtPrixEchantillon;
    // End of variables declaration//GEN-END:variables
}