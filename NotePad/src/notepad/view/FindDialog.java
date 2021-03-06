package notepad.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import notpad.controller.findreplace.IViewFind;
import notpad.controller.findreplace.FHandler;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class FindDialog extends javax.swing.JDialog implements IViewFind {

    /**
     * Creates new form FindDialog
     */
    JTextArea tarea;

    public FindDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        tarea = ((NotePadForm) parent).getTxtArea();
        FHandler fh = new FHandler(this);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("aaaaa");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtFindWhat = new javax.swing.JTextField();
        btnMatchCase = new javax.swing.JCheckBox();
        btnFind = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUp = new javax.swing.JRadioButton();
        btnDown = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Find what");

        txtFindWhat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindWhatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFindWhatKeyTyped(evt);
            }
        });

        btnMatchCase.setText("Match case");
        btnMatchCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchCaseActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.setEnabled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        btnFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnFindKeyReleased(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnUp);
        btnUp.setText("Up");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnDown);
        btnDown.setSelected(true);
        btnDown.setText("Down");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(txtFindWhat, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMatchCase)
                        .addGap(79, 79, 79)
                        .addComponent(btnUp)
                        .addGap(18, 18, 18)
                        .addComponent(btnDown)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel)
                    .addComponent(btnFind))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFindWhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMatchCase)
                                    .addComponent(btnCancel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUp)
                                    .addComponent(btnDown))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFind)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public JCheckBox getBtnMatchCase() {
        return btnMatchCase;
    }

    @Override
    public JTextArea getArea() {
        return this.tarea;
    }

    @Override
    public JButton getBtnFind() {
        return btnFind;
    }

    public JRadioButton getBtnDown() {
        return btnDown;
    }

    public JRadioButton getBtnUp() {
        return btnUp;
    }

    @Override
    public JTextField getTxtFind() {
        return txtFindWhat;
    }


    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnMatchCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchCaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMatchCaseActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtFindWhatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindWhatKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFindWhatKeyTyped

    private void btnFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFindKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnFindKeyReleased

    private void btnFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFindKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnFindKeyPressed

    private void txtFindWhatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindWhatKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFindWhatKeyReleased


    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JRadioButton btnDown;
    private javax.swing.JButton btnFind;
    private javax.swing.JCheckBox btnMatchCase;
    private javax.swing.JRadioButton btnUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtFindWhat;
    // End of variables declaration//GEN-END:variables

}
