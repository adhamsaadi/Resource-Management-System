package update;

import updateAnimal.UpdateAnimal;
import updateLand.UpdateLand;
import updatePerson.UpdatePerson;
import updatePlant.UpdatePlant;

public class UpdatePanel extends javax.swing.JPanel {
    
    UpdatePerson updatePerson = null;
    UpdateAnimal updateAnimal = null;
    UpdatePlant updatePlant = null;
    UpdateLand updateLand = null;
    
    public UpdatePanel() {
        initComponents();
        
        loadPanels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updatePersonButton = new javax.swing.JButton();
        backbonePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        updateAnimalButton = new javax.swing.JButton();
        updatePlantButton = new javax.swing.JButton();
        updateLandButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Z003", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Update Panel");
        jLabel1.setToolTipText("");

        updatePersonButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        updatePersonButton.setText("Update Person");
        updatePersonButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonButtonActionPerformed(evt);
            }
        });

        backbonePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backbonePanelLayout = new javax.swing.GroupLayout(backbonePanel);
        backbonePanel.setLayout(backbonePanelLayout);
        backbonePanelLayout.setHorizontalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backbonePanelLayout.setVerticalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        updateAnimalButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        updateAnimalButton.setText("Update Animal");
        updateAnimalButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateAnimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAnimalButtonActionPerformed(evt);
            }
        });

        updatePlantButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        updatePlantButton.setText("Update Plant");
        updatePlantButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatePlantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePlantButtonActionPerformed(evt);
            }
        });

        updateLandButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        updateLandButton.setText("Update Land");
        updateLandButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updatePersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(updateAnimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(updatePlantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(updateLandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAnimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePlantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateLandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updatePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonButtonActionPerformed
        hidePanels();
        updatePerson.setVisible(true);
    }//GEN-LAST:event_updatePersonButtonActionPerformed

    private void updateAnimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAnimalButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        updateAnimal.setVisible(true);
    }//GEN-LAST:event_updateAnimalButtonActionPerformed

    private void updatePlantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlantButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        updatePlant.setVisible(true);
    }//GEN-LAST:event_updatePlantButtonActionPerformed

    private void updateLandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLandButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        updateLand.setVisible(true);
    }//GEN-LAST:event_updateLandButtonActionPerformed

    private void loadPanels()
    {
        updatePerson = new UpdatePerson();
        backbonePanel.add(updatePerson);
        updatePerson.setSize(1330, 520);
        
        updateAnimal = new UpdateAnimal();
        backbonePanel.add(updateAnimal);
        updateAnimal.setSize(1330, 520);

        updatePlant = new UpdatePlant();
        backbonePanel.add(updatePlant);
        updatePlant.setSize(1330, 520);

        updateLand = new UpdateLand();
        backbonePanel.add(updateLand);
        updateLand.setSize(1330, 520);
        
        hidePanels();
    }
    
    private void hidePanels()
    {
        updatePerson.setVisible(false);
        updateAnimal.setVisible(false);
        updatePlant.setVisible(false);
        updateLand.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backbonePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton updateAnimalButton;
    private javax.swing.JButton updateLandButton;
    private javax.swing.JButton updatePersonButton;
    private javax.swing.JButton updatePlantButton;
    // End of variables declaration//GEN-END:variables
}
