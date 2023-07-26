package main;

import login.Login;
import addAnimal.NewAnimalPanel;
import addLand.NewLandPanel;
import addPerson.NewPersonPanel;
import addPlant.NewPlantPanel;
import search.SearchAnimal;
import search.SearchLand;
import search.SearchPerson;
import search.SearchPlant;
import update.UpdatePanel;

public class MainFrame extends javax.swing.JFrame {

    Login login=null;
    NewPersonPanel newPerson = null;
    NewAnimalPanel newAnimal = null;
    NewPlantPanel newPlant = null;
    NewLandPanel newLand = null;
    SearchPerson searchPerson = null;
    SearchAnimal searchAnimal = null;
    SearchPlant searchPlant = null;
    SearchLand searchLand = null;
    UpdatePanel updatePanel = null;
    
    public MainFrame(Login login, String userName) {
        this.login = login;
        initComponents();
        loadPanels();
        usernameLabel.setText("Username: "+userName);
    }

    
    
    private void loadPanels()
    {
        //add
        newPerson = new NewPersonPanel();
        backbonePanel.add(newPerson);
        newPerson.setSize(1359, 675);
        
        newAnimal = new NewAnimalPanel();
        backbonePanel.add(newAnimal);
        newAnimal.setSize(1359, 675);

        newPlant = new NewPlantPanel();
        backbonePanel.add(newPlant);
        newPlant.setSize(1359, 675);

        newLand = new NewLandPanel();
        backbonePanel.add(newLand);
        newLand.setSize(1359, 675);
        
        //search
        searchPerson = new SearchPerson();
        backbonePanel.add(searchPerson);
        searchPerson.setSize(1349, 675);
        
        searchAnimal = new SearchAnimal();
        backbonePanel.add(searchAnimal);
        searchAnimal.setSize(1349, 675);

        searchPlant = new SearchPlant();
        backbonePanel.add(searchPlant);
        searchPlant.setSize(1349, 675);

        searchLand = new SearchLand();
        backbonePanel.add(searchLand);
        searchLand.setSize(1349, 675);
        
        //update
        updatePanel = new UpdatePanel();
        backbonePanel.add(updatePanel);
        updatePanel.setSize(1349, 675);
        
        hidePanels();
    }
    
    private void hidePanels()
    {
        newPerson.setVisible(false);
        newAnimal.setVisible(false);
        newPlant.setVisible(false);
        newLand.setVisible(false);
        searchPerson.setVisible(false);
        searchAnimal.setVisible(false);
        searchPlant.setVisible(false);
        searchLand.setVisible(false);
        updatePanel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        goBackButton = new javax.swing.JButton();
        newAnimalButton = new javax.swing.JButton();
        searchAnimalButton = new javax.swing.JButton();
        newPlantButton = new javax.swing.JButton();
        searchPlantButton = new javax.swing.JButton();
        newLandButton = new javax.swing.JButton();
        searchLandButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        newPersonButton = new javax.swing.JButton();
        searchPersonButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        backbonePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameLabel.setText("Username");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        goBackButton.setBackground(new java.awt.Color(153, 255, 102));
        goBackButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(102, 0, 0));
        goBackButton.setText("Logout");
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        newAnimalButton.setBackground(new java.awt.Color(153, 255, 102));
        newAnimalButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        newAnimalButton.setText("Add New Animal");
        newAnimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAnimalButtonActionPerformed(evt);
            }
        });

        searchAnimalButton.setBackground(new java.awt.Color(153, 255, 102));
        searchAnimalButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        searchAnimalButton.setText("Search Animal");
        searchAnimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAnimalButtonActionPerformed(evt);
            }
        });

        newPlantButton.setBackground(new java.awt.Color(153, 255, 102));
        newPlantButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        newPlantButton.setText("Add New Plant");
        newPlantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPlantButtonActionPerformed(evt);
            }
        });

        searchPlantButton.setBackground(new java.awt.Color(153, 255, 102));
        searchPlantButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        searchPlantButton.setText("Search Plant");
        searchPlantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPlantButtonActionPerformed(evt);
            }
        });

        newLandButton.setBackground(new java.awt.Color(153, 255, 102));
        newLandButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        newLandButton.setText("Add New Land");
        newLandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLandButtonActionPerformed(evt);
            }
        });

        searchLandButton.setBackground(new java.awt.Color(153, 255, 102));
        searchLandButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        searchLandButton.setText("Search Land");
        searchLandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLandButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(153, 255, 102));
        updateButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        newPersonButton.setBackground(new java.awt.Color(153, 255, 102));
        newPersonButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        newPersonButton.setText("Add New Person");
        newPersonButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonButtonActionPerformed(evt);
            }
        });

        searchPersonButton.setBackground(new java.awt.Color(153, 255, 102));
        searchPersonButton.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        searchPersonButton.setText("Search Person");
        searchPersonButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(newPersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(newAnimalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newPlantButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newLandButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchPersonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchAnimalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchPlantButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchLandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchAnimalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newAnimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPlantButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newPlantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchLandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newLandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        backbonePanel.setBackground(new java.awt.Color(255, 255, 255));
        backbonePanel.setName(""); // NOI18N

        javax.swing.GroupLayout backbonePanelLayout = new javax.swing.GroupLayout(backbonePanel);
        backbonePanel.setLayout(backbonePanelLayout);
        backbonePanelLayout.setHorizontalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backbonePanelLayout.setVerticalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("RESOURCE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backbonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(183, 183, 183)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backbonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPersonButtonActionPerformed
        hidePanels();
        searchPerson.setVisible(true);
    }//GEN-LAST:event_searchPersonButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        hidePanels();
        updatePanel.setVisible(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void newPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonButtonActionPerformed
        hidePanels();
        newPerson.setVisible(true);
    }//GEN-LAST:event_newPersonButtonActionPerformed

    private void newAnimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAnimalButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        newAnimal.setVisible(true);

    }//GEN-LAST:event_newAnimalButtonActionPerformed

    private void newPlantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPlantButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        newPlant.setVisible(true);

    }//GEN-LAST:event_newPlantButtonActionPerformed

    private void searchAnimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAnimalButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        searchAnimal.setVisible(true);
    }//GEN-LAST:event_searchAnimalButtonActionPerformed

    private void searchPlantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPlantButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        searchPlant.setVisible(true);
    }//GEN-LAST:event_searchPlantButtonActionPerformed

    private void newLandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLandButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        newLand.setVisible(true);
    }//GEN-LAST:event_newLandButtonActionPerformed

    private void searchLandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLandButtonActionPerformed
        // TODO add your handling code here:
        hidePanels();
        searchLand.setVisible(true);
    }//GEN-LAST:event_searchLandButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backbonePanel;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton newAnimalButton;
    private javax.swing.JButton newLandButton;
    private javax.swing.JButton newPersonButton;
    private javax.swing.JButton newPlantButton;
    private javax.swing.JButton searchAnimalButton;
    private javax.swing.JButton searchLandButton;
    private javax.swing.JButton searchPersonButton;
    private javax.swing.JButton searchPlantButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
