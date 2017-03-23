
package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controller.Controller;
import Model.SwimmerThread;



public class Screen extends javax.swing.JFrame {

    private boolean startButtonPressed;
    SaveResult save = new SaveResult();
    

    public Screen() {
        super ("Swimming Compitition");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        lane1.setVisible(false);
        lane2.setVisible(false);
        lane3.setVisible(false);
        lane4.setVisible(false);
        lane5.setVisible(false);
        
        spectator1.setVisible(false);
        spectator2.setVisible(false);
        spectator3.setVisible(false);
        spectator4.setVisible(false);
        spectator5.setVisible(false);
        spectator6.setVisible(false);
        spectator7.setVisible(false);
        spectator8.setVisible(false);
        spectator9.setVisible(false);
        spectator10.setVisible(false);
        spectator11.setVisible(false);
        spectator12.setVisible(false);
        
        judge1.setVisible(false);
        judge2.setVisible(false);
        
        staff1.setVisible(false);
        staff2.setVisible(false);
        staff3.setVisible(false);
        
        
        }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jFrame2 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        poolPanel = new javax.swing.JPanel();
        lane2 = new javax.swing.JSlider();
        lane1 = new javax.swing.JSlider();
        lane3 = new javax.swing.JSlider();
        lane4 = new javax.swing.JSlider();
        lane5 = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        headLineLabel = new javax.swing.JLabel();
        scoreBoardLabel = new javax.swing.JPanel();
        scoreBoardLabel1 = new javax.swing.JLabel();
        scoreBoardLabel2 = new javax.swing.JLabel();
        scoreBoardLabel3 = new javax.swing.JLabel();
        scoreBoardLabel4 = new javax.swing.JLabel();
        scoreBoardLabel5 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        PavilianLabel = new javax.swing.JPanel();
        spectator3 = new javax.swing.JLabel();
        spectator5 = new javax.swing.JLabel();
        spectator7 = new javax.swing.JLabel();
        spectator8 = new javax.swing.JLabel();
        spectator9 = new javax.swing.JLabel();
        spectator10 = new javax.swing.JLabel();
        spectator11 = new javax.swing.JLabel();
        spectator12 = new javax.swing.JLabel();
        spectator1 = new javax.swing.JLabel();
        spectator2 = new javax.swing.JLabel();
        spectator4 = new javax.swing.JLabel();
        spectator6 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        namePlayer4 = new javax.swing.JLabel();
        namePlayer1 = new javax.swing.JLabel();
        namePlayer5 = new javax.swing.JLabel();
        namePlayer2 = new javax.swing.JLabel();
        namePlayer3 = new javax.swing.JLabel();
        judge1 = new javax.swing.JButton();
        staff1 = new javax.swing.JButton();
        saveResultButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        retry = new javax.swing.JButton();
        judge2 = new javax.swing.JButton();
        staff2 = new javax.swing.JButton();
        staff3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(128, 64, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        poolPanel.setBackground(new java.awt.Color(153, 217, 234));
        poolPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        poolPanel.setLayout(null);

        lane2.setBackground(new java.awt.Color(153, 217, 234));
        lane2.setMaximum(5000);
        lane2.setValue(0);
        poolPanel.add(lane2);
        lane2.setBounds(0, 50, 470, 26);

        lane1.setBackground(new java.awt.Color(153, 217, 234));
        lane1.setMaximum(5000);
        lane1.setValue(0);
        lane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        poolPanel.add(lane1);
        lane1.setBounds(0, 10, 470, 26);
        lane1.getAccessibleContext().setAccessibleName("");
        lane1.getAccessibleContext().setAccessibleDescription("");

        lane3.setBackground(new java.awt.Color(153, 217, 234));
        lane3.setMaximum(5000);
        lane3.setValue(0);
        poolPanel.add(lane3);
        lane3.setBounds(0, 90, 470, 26);

        lane4.setBackground(new java.awt.Color(153, 217, 234));
        lane4.setMaximum(5000);
        lane4.setValue(0);
        poolPanel.add(lane4);
        lane4.setBounds(0, 130, 470, 26);

        lane5.setBackground(new java.awt.Color(153, 217, 234));
        lane5.setMaximum(5000);
        lane5.setValue(0);
        poolPanel.add(lane5);
        lane5.setBounds(0, 180, 470, 26);

        getContentPane().add(poolPanel);
        poolPanel.setBounds(80, 170, 470, 220);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(680, 100, 0, 230);

        headLineLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        headLineLabel.setText("swimming compitition");
        getContentPane().add(headLineLabel);
        headLineLabel.setBounds(230, 10, 350, 50);

        scoreBoardLabel.setBackground(new java.awt.Color(255, 255, 255));
        scoreBoardLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Score Board", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24), java.awt.Color.black)); // NOI18N
        scoreBoardLabel.setToolTipText("");

        timeLabel.setText("00:00:000");

        javax.swing.GroupLayout scoreBoardLabelLayout = new javax.swing.GroupLayout(scoreBoardLabel);
        scoreBoardLabel.setLayout(scoreBoardLabelLayout);
        scoreBoardLabelLayout.setHorizontalGroup(
            scoreBoardLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreBoardLabelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(scoreBoardLabelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scoreBoardLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(scoreBoardLabelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scoreBoardLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(scoreBoardLabelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scoreBoardLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(scoreBoardLabelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(scoreBoardLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        scoreBoardLabelLayout.setVerticalGroup(
            scoreBoardLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreBoardLabelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(timeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scoreBoardLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scoreBoardLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scoreBoardLabel3)
                .addGap(30, 30, 30)
                .addComponent(scoreBoardLabel4))
        );

        getContentPane().add(scoreBoardLabel);
        scoreBoardLabel.setBounds(590, 110, 250, 280);

        PavilianLabel.setBackground(new java.awt.Color(255, 255, 255));
        PavilianLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pavilian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N
        PavilianLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spectator3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/woman.png"))); // NOI18N
        PavilianLabel.add(spectator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        spectator5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/girl.jpg"))); // NOI18N
        PavilianLabel.add(spectator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        spectator7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/man.png"))); // NOI18N
        PavilianLabel.add(spectator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        spectator8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/boy.png"))); // NOI18N
        PavilianLabel.add(spectator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 70));

        spectator9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/man.png"))); // NOI18N
        PavilianLabel.add(spectator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        spectator10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/girl.jpg"))); // NOI18N
        PavilianLabel.add(spectator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        spectator11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/man.png"))); // NOI18N
        PavilianLabel.add(spectator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        spectator12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/woman.png"))); // NOI18N
        PavilianLabel.add(spectator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        spectator1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/man.png"))); // NOI18N
        PavilianLabel.add(spectator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        spectator2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/man.png"))); // NOI18N
        PavilianLabel.add(spectator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 80));

        spectator4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/girl.jpg"))); // NOI18N
        PavilianLabel.add(spectator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        spectator6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/spectator/boy.png"))); // NOI18N
        PavilianLabel.add(spectator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        getContentPane().add(PavilianLabel);
        PavilianLabel.setBounds(40, 470, 720, 190);

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StartButton);
        StartButton.setBounds(740, 20, 90, 60);

        namePlayer4.setText("Player 4");
        getContentPane().add(namePlayer4);
        namePlayer4.setBounds(20, 300, 60, 20);

        namePlayer1.setText("Player 1");
        getContentPane().add(namePlayer1);
        namePlayer1.setBounds(20, 180, 60, 20);

        namePlayer5.setText("Player 5");
        getContentPane().add(namePlayer5);
        namePlayer5.setBounds(20, 340, 60, 20);

        namePlayer2.setText("Player 2");
        getContentPane().add(namePlayer2);
        namePlayer2.setBounds(20, 220, 60, 20);

        namePlayer3.setText("Player 3");
        getContentPane().add(namePlayer3);
        namePlayer3.setBounds(20, 260, 60, 20);

        judge1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/judge/head.png"))); // NOI18N
        judge1.setToolTipText("");
        judge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judge1ActionPerformed(evt);
            }
        });
        getContentPane().add(judge1);
        judge1.setBounds(40, 390, 80, 80);

        staff1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/staff/girl.jpg"))); // NOI18N
        staff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff1ActionPerformed(evt);
            }
        });
        getContentPane().add(staff1);
        staff1.setBounds(490, 390, 80, 80);

        saveResultButton.setText("Save Result");
        saveResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveResultButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveResultButton);
        saveResultButton.setBounds(350, 670, 140, 30);

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quitButton);
        quitButton.setBounds(600, 670, 160, 30);

        retry.setText("Main Menu");
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });
        getContentPane().add(retry);
        retry.setBounds(70, 670, 150, 30);

        judge2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/judge/second.jpg"))); // NOI18N
        judge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judge2ActionPerformed(evt);
            }
        });
        getContentPane().add(judge2);
        judge2.setBounds(60, 90, 60, 70);

        staff2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/staff/boy.jpg"))); // NOI18N
        staff2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff2ActionPerformed(evt);
            }
        });
        getContentPane().add(staff2);
        staff2.setBounds(480, 80, 90, 90);

        staff3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other/staff/Manager.png"))); // NOI18N
        staff3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff3ActionPerformed(evt);
            }
        });
        getContentPane().add(staff3);
        staff3.setBounds(270, 80, 80, 80);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 420, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        
        startButtonPressed = true;
        
        switch (Controller.getNumberofSwimmers()){
            case 5: 
                lane1.setVisible(true);
                namePlayer1.setText(Controller.getSwimmerName(Controller.getswimmerArray().get(4)));
            case 4: 
                lane2.setVisible(true);
                namePlayer2.setText(Controller.getSwimmerName(Controller.getswimmerArray().get(3)));
            case 3: 
                lane3.setVisible(true);
                namePlayer3.setText(Controller.getSwimmerName(Controller.getswimmerArray().get(2)));
            case 2: 
                lane4.setVisible(true);
                namePlayer4.setText(Controller.getSwimmerName(Controller.getswimmerArray().get(1)));
            case 1: 
                lane5.setVisible(true);
                namePlayer5.setText(Controller.getSwimmerName(Controller.getswimmerArray().get(0)));
                break;
        }
        
        switch(Controller.getNumberofSpectators()){
            case 12:
                spectator12.setVisible(true);
            case 11:
                spectator11.setVisible(true);
            case 10:
                spectator10.setVisible(true);
            case 9:
                spectator9.setVisible(true);
            case 8:
                spectator8.setVisible(true);
            case 7:
                spectator7.setVisible(true);
            case 6:
                spectator6.setVisible(true);
            case 5:
                spectator5.setVisible(true);
            case 4:
                spectator4.setVisible(true);
            case 3:
                spectator3.setVisible(true);
            case 2:
                spectator2.setVisible(true);
                
            case 1:
                spectator1.setVisible(true);
                
        }
        
        switch(Controller.getNumberofJudges()){
            
            case 2:
                judge2.setVisible(true);
            case 1:
                judge1.setVisible(true);
                judge1.setToolTipText("Blow Whistle");
        }
        
        switch (Controller.getNumberofStaff()){
            case 3:
                staff3.setVisible(true);
            case 2:
                staff2.setVisible(true);
            case 1:
                staff1.setVisible(true);
        }
    }//GEN-LAST:event_StartButtonActionPerformed

    private void judge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judge1ActionPerformed
        if (startButtonPressed){
            SwimmerThread thread1 = null,thread2 = null,thread3 = null,thread4 = null,thread5 = null;
            GuiSwimmer t1=null,t2 = null, t3 = null,t4 = null , t5 = null;
            
            Controller.blowWhistle();
            judge1.setToolTipText(null);
            Controller.setTimeLabel(timeLabel);
            switch(Controller.getNumberofSwimmers()){
                case 5:
                    Controller.swimmerThread(thread1);
                    Controller.sliderThread(t1,lane1);
                case 4:
                    Controller.swimmerThread(thread2);
                    Controller.sliderThread(t2,lane2);
                case 3:
                    Controller.swimmerThread(thread3);
                    Controller.sliderThread(t3,lane3);
                    
                case 2:
                    Controller.swimmerThread(thread4);
                    Controller.sliderThread(t4,lane4);
                    
                case 1:
                    Controller.swimmerThread(thread5);
                    Controller.sliderThread(t5,lane5);
                    break;
            }

            Controller.timeThread();
            staff1.setToolTipText("Show Result");
            staff2.setToolTipText("Show Result");
            staff3.setToolTipText("Show Result");
            judge2.setToolTipText("Show Result");
 
        }else
        {
            JOptionPane.showMessageDialog(null,"Please press start button first", "Warnning", WIDTH);
        }
    }//GEN-LAST:event_judge1ActionPerformed

    private void staff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff1ActionPerformed
        switch(Controller.getNumberofSwimmers()){
                   case 5:
                       scoreBoardLabel5.setText(Controller.display(4));
                   case 4:
                       scoreBoardLabel4.setText(Controller.display(3));
                   case 3:
                       scoreBoardLabel3.setText(Controller.display(2));
                   case 2:
                       scoreBoardLabel2.setText(Controller.display(1));
                   case 1:
                       scoreBoardLabel1.setText(Controller.display(0));
                       break;
               }

               Controller.stopClock();
               
        switch(Controller.getNumberofSpectators()){
            case 12:
                spectator12.setToolTipText("Winner is "+Controller.getWinner());
            case 11:
                spectator11.setToolTipText("Winner is "+Controller.getWinner());
            case 10:
                spectator10.setToolTipText("WOW");
            case 9:
                spectator9.setToolTipText("Winner is "+Controller.getWinner());
            case 8:
                spectator8.setToolTipText("WOW");
            case 7:
                spectator7.setToolTipText("WOW");
            case 6:
                spectator6.setToolTipText("Winner is "+Controller.getWinner());
            case 5:
                spectator5.setToolTipText("Winner is "+Controller.getWinner());
            case 4:
                spectator4.setToolTipText(".....WoW....");
            case 3:
                spectator3.setToolTipText("=D =) =P WOW "+Controller.getWinner()+" =P =D =P");
            case 2:
                spectator2.setToolTipText("<<<WOW>>>");

            case 1:
                spectator1.setToolTipText("Winner is "+Controller.getWinner());
            }

    }//GEN-LAST:event_staff1ActionPerformed

    private void saveResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveResultButtonActionPerformed
       save.setSize(200, 150);
       save.setVisible(true);
    }//GEN-LAST:event_saveResultButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        Controller.saveFileName();
        this.dispose();
        
        
    }//GEN-LAST:event_quitButtonActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
        this.dispose();
        StartUp x = new StartUp();
        x.setSize(WIDTH, WIDTH);
        x.setVisible(true);
        
    }//GEN-LAST:event_retryActionPerformed

    private void staff2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff2ActionPerformed
        switch(Controller.getNumberofSwimmers()){
                   case 5:
                       scoreBoardLabel5.setText(Controller.display(4));
                   case 4:
                       scoreBoardLabel4.setText(Controller.display(3));
                   case 3:
                       scoreBoardLabel3.setText(Controller.display(2));
                   case 2:
                       scoreBoardLabel2.setText(Controller.display(1));
                   case 1:
                       scoreBoardLabel1.setText(Controller.display(0));
                       break;
               }

               Controller.stopClock();
               
        switch(Controller.getNumberofSpectators()){
            case 12:
                spectator12.setToolTipText("Winner is "+Controller.getWinner());
            case 11:
                spectator11.setToolTipText("Winner is "+Controller.getWinner());
            case 10:
                spectator10.setToolTipText("WOW");
            case 9:
                spectator9.setToolTipText("Winner is "+Controller.getWinner());
            case 8:
                spectator8.setToolTipText("WOW");
            case 7:
                spectator7.setToolTipText("WOW");
            case 6:
                spectator6.setToolTipText("Winner is "+Controller.getWinner());
            case 5:
                spectator5.setToolTipText("Winner is "+Controller.getWinner());
            case 4:
                spectator4.setToolTipText(".....WoW....");
            case 3:
                spectator3.setToolTipText("=D =) =P WOW "+Controller.getWinner()+" =P =D =P");
            case 2:
                spectator2.setToolTipText("<<<WOW>>>");

            case 1:
                spectator1.setToolTipText("Winner is "+Controller.getWinner());
            }
    }//GEN-LAST:event_staff2ActionPerformed

    private void judge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judge2ActionPerformed
        switch(Controller.getNumberofSwimmers()){
                   case 5:
                       scoreBoardLabel5.setText(Controller.display(4));
                   case 4:
                       scoreBoardLabel4.setText(Controller.display(3));
                   case 3:
                       scoreBoardLabel3.setText(Controller.display(2));
                   case 2:
                       scoreBoardLabel2.setText(Controller.display(1));
                   case 1:
                       scoreBoardLabel1.setText(Controller.display(0));
                       break;
               }

               Controller.stopClock();
               
        switch(Controller.getNumberofSpectators()){
            case 12:
                spectator12.setToolTipText("Winner is "+Controller.getWinner());
            case 11:
                spectator11.setToolTipText("Winner is "+Controller.getWinner());
            case 10:
                spectator10.setToolTipText("WOW");
            case 9:
                spectator9.setToolTipText("Winner is "+Controller.getWinner());
            case 8:
                spectator8.setToolTipText("WOW");
            case 7:
                spectator7.setToolTipText("WOW");
            case 6:
                spectator6.setToolTipText("Winner is "+Controller.getWinner());
            case 5:
                spectator5.setToolTipText("Winner is "+Controller.getWinner());
            case 4:
                spectator4.setToolTipText(".....WoW....");
            case 3:
                spectator3.setToolTipText("=D =) =P WOW "+Controller.getWinner()+" =P =D =P");
            case 2:
                spectator2.setToolTipText("<<<WOW>>>");

            case 1:
                spectator1.setToolTipText("Winner is "+Controller.getWinner());
            }
    }//GEN-LAST:event_judge2ActionPerformed

    private void staff3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff3ActionPerformed
       switch(Controller.getNumberofSwimmers()){
                   case 5:
                       scoreBoardLabel5.setText(Controller.display(4));
                   case 4:
                       scoreBoardLabel4.setText(Controller.display(3));
                   case 3:
                       scoreBoardLabel3.setText(Controller.display(2));
                   case 2:
                       scoreBoardLabel2.setText(Controller.display(1));
                   case 1:
                       scoreBoardLabel1.setText(Controller.display(0));
                       break;
               }

               Controller.stopClock();
               
        switch(Controller.getNumberofSpectators()){
            case 12:
                spectator12.setToolTipText("Winner is "+Controller.getWinner());
            case 11:
                spectator11.setToolTipText("Winner is "+Controller.getWinner());
            case 10:
                spectator10.setToolTipText("WOW");
            case 9:
                spectator9.setToolTipText("Winner is "+Controller.getWinner());
            case 8:
                spectator8.setToolTipText("WOW");
            case 7:
                spectator7.setToolTipText("WOW");
            case 6:
                spectator6.setToolTipText("Winner is "+Controller.getWinner());
            case 5:
                spectator5.setToolTipText("Winner is "+Controller.getWinner());
            case 4:
                spectator4.setToolTipText(".....WoW....");
            case 3:
                spectator3.setToolTipText("=D =) =P WOW "+Controller.getWinner()+" =P =D =P");
            case 2:
                spectator2.setToolTipText("<<<WOW>>>");

            case 1:
                spectator1.setToolTipText("Winner is "+Controller.getWinner());
            }
    }//GEN-LAST:event_staff3ActionPerformed


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PavilianLabel;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel headLineLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton judge1;
    private javax.swing.JButton judge2;
    private javax.swing.JSlider lane1;
    private javax.swing.JSlider lane2;
    private javax.swing.JSlider lane3;
    private javax.swing.JSlider lane4;
    private javax.swing.JSlider lane5;
    private javax.swing.JLabel namePlayer1;
    private javax.swing.JLabel namePlayer2;
    private javax.swing.JLabel namePlayer3;
    private javax.swing.JLabel namePlayer4;
    private javax.swing.JLabel namePlayer5;
    private javax.swing.JPanel poolPanel;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton retry;
    private javax.swing.JButton saveResultButton;
    private javax.swing.JPanel scoreBoardLabel;
    private javax.swing.JLabel scoreBoardLabel1;
    private javax.swing.JLabel scoreBoardLabel2;
    private javax.swing.JLabel scoreBoardLabel3;
    private javax.swing.JLabel scoreBoardLabel4;
    private javax.swing.JLabel scoreBoardLabel5;
    private javax.swing.JLabel spectator1;
    private javax.swing.JLabel spectator10;
    private javax.swing.JLabel spectator11;
    private javax.swing.JLabel spectator12;
    private javax.swing.JLabel spectator2;
    private javax.swing.JLabel spectator3;
    private javax.swing.JLabel spectator4;
    private javax.swing.JLabel spectator5;
    private javax.swing.JLabel spectator6;
    private javax.swing.JLabel spectator7;
    private javax.swing.JLabel spectator8;
    private javax.swing.JLabel spectator9;
    private javax.swing.JButton staff1;
    private javax.swing.JButton staff2;
    private javax.swing.JButton staff3;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

 
}
