/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pramo
 */
public class View_Edit_databases extends javax.swing.JPanel {

    /**
     * Creates new form View_Edit_databases
     */
    public View_Edit_databases() {
        initComponents();
          if (Maincombo.getSelectedItem().toString() == "Green Leaf") {
            GL.setVisible(true);
            PRCR.setVisible(false);
            ACC.setVisible(false);
            BSTRS.setVisible(false);
            PRD.setVisible(false);
            STK.setVisible(false);
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VED_content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Maincombo = new javax.swing.JComboBox();
        GL = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        PRCR = new javax.swing.JComboBox();
        ACC = new javax.swing.JComboBox();
        BSTRS = new javax.swing.JComboBox();
        PRD = new javax.swing.JComboBox();
        STK = new javax.swing.JComboBox();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0), 4));

        javax.swing.GroupLayout VED_contentLayout = new javax.swing.GroupLayout(VED_content);
        VED_content.setLayout(VED_contentLayout);
        VED_contentLayout.setHorizontalGroup(
            VED_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        VED_contentLayout.setVerticalGroup(
            VED_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        jLabel1.setText("Select Section");

        Maincombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green Leaf", "Payroll Checkroll", "Accounts", "Bogoda Stores", "Production", "Stock" }));
        Maincombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaincomboActionPerformed(evt);
            }
        });

        GL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Leaf Transactions", "Suppliers", "Advances", "Loans", "Categories", "Leaf Categories", " " }));

        jLabel2.setText("Database");

        PRCR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green Leaf", "Payroll Ckeckroll", "Accounts", "Bogoda Stores", "Production", "Stock" }));

        ACC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green Leaf", "Payroll Ckeckroll", "Accounts", "Bogoda Stores", "Production", "Stock" }));

        BSTRS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green Leaf", "Payroll Ckeckroll", "Accounts", "Bogoda Stores", "Production", "Stock" }));
        BSTRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSTRSActionPerformed(evt);
            }
        });

        PRD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green Leaf", "Payroll Ckeckroll", "Accounts", "Bogoda Stores", "Production", "Stock" }));
        PRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRDActionPerformed(evt);
            }
        });

        STK.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Green Leaf", "Payroll Ckeckroll", "Accounts", "Bogoda Stores", "Production", "Stock" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VED_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Maincombo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PRCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ACC, 0, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSTRS, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PRD, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(STK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Maincombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(GL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PRCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ACC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BSTRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PRD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(STK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VED_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRDActionPerformed

    private void MaincomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaincomboActionPerformed
        if (Maincombo.getSelectedItem().toString() == "Green Leaf") {
            GL.setVisible(true);
            PRCR.setVisible(false);
            ACC.setVisible(false);
            BSTRS.setVisible(false);
            PRD.setVisible(false);
            STK.setVisible(false);
            
            
             
        }
        if (Maincombo.getSelectedItem().toString() == "Payroll Checkroll") {
             GL.setVisible(false);
            PRCR.setVisible(true);
            ACC.setVisible(false);
            BSTRS.setVisible(false);
            PRD.setVisible(false);
            STK.setVisible(false);
        }
        if (Maincombo.getSelectedItem().toString() == "Accounts") {
            
            GL.setVisible(false);
            PRCR.setVisible(false);
            ACC.setVisible(true);
            BSTRS.setVisible(false);
            PRD.setVisible(false);
            STK.setVisible(false);
        }
        if (Maincombo.getSelectedItem().toString() == "Bogoda Stores") {
            
            GL.setVisible(false);
            PRCR.setVisible(false);
            ACC.setVisible(false);
            BSTRS.setVisible(true);
            PRD.setVisible(false);
            STK.setVisible(false);
        }
        if (Maincombo.getSelectedItem().toString() == "Production") {
            
            GL.setVisible(false);
            PRCR.setVisible(false);
            ACC.setVisible(false);
            BSTRS.setVisible(false);
            PRD.setVisible(true);
            STK.setVisible(false);
        }
        if (Maincombo.getSelectedItem().toString() == "Stock") {
            
            GL.setVisible(false);
            PRCR.setVisible(false);
            ACC.setVisible(false);
            BSTRS.setVisible(false);
            PRD.setVisible(false);
            STK.setVisible(true);
        }
        

    }//GEN-LAST:event_MaincomboActionPerformed

    private void BSTRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSTRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSTRSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ACC;
    private javax.swing.JComboBox BSTRS;
    private javax.swing.JComboBox GL;
    private javax.swing.JComboBox Maincombo;
    private javax.swing.JComboBox PRCR;
    private javax.swing.JComboBox PRD;
    private javax.swing.JComboBox STK;
    private javax.swing.JPanel VED_content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
