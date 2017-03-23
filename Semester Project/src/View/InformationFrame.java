
package View;



import View.EventSelect;
import javax.swing.*;
import Model.ArrayCls;
import Controller.Controller;

public class InformationFrame extends javax.swing.JFrame {
   //Variables of 
    private boolean isMale;
    
    
    
   private int swimmerLabelCount = 0;//for swimmer detail panel
   private int judgeLabelCount = 0;
   private int spectatorLabelCount = 0;
   private int staffLabelCount = 0;
    
    
    // make screen object
    Screen pool = new Screen();
    
    public InformationFrame() {
        super("Swimming Competition-Information form");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        formTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        judgePanel = new javax.swing.JPanel();
        judgeName = new javax.swing.JTextField();
        judgeLable = new javax.swing.JLabel();
        addJudge = new javax.swing.JButton();
        spectatorPanel = new javax.swing.JPanel();
        spectatorName = new javax.swing.JTextField();
        spectaterLable = new javax.swing.JLabel();
        addSpectator = new javax.swing.JButton();
        goToPoolButton = new javax.swing.JButton();
        swimmerPanel = new javax.swing.JPanel();
        swimmerName = new javax.swing.JTextField();
        swimmerLable = new javax.swing.JLabel();
        addSwimmer = new javax.swing.JButton();
        detailPanel = new javax.swing.JPanel();
        swimmer1 = new javax.swing.JLabel();
        swimmer2 = new javax.swing.JLabel();
        swimmer3 = new javax.swing.JLabel();
        swimmer4 = new javax.swing.JLabel();
        swimmer5 = new javax.swing.JLabel();
        judge1 = new javax.swing.JLabel();
        staff1 = new javax.swing.JLabel();
        staff2 = new javax.swing.JLabel();
        staff3 = new javax.swing.JLabel();
        spectator1 = new javax.swing.JLabel();
        spectator2 = new javax.swing.JLabel();
        spectator3 = new javax.swing.JLabel();
        spectator4 = new javax.swing.JLabel();
        spectator5 = new javax.swing.JLabel();
        spectator7 = new javax.swing.JLabel();
        spectator8 = new javax.swing.JLabel();
        spectator11 = new javax.swing.JLabel();
        spectator12 = new javax.swing.JLabel();
        spectator10 = new javax.swing.JLabel();
        spectator9 = new javax.swing.JLabel();
        judge2 = new javax.swing.JLabel();
        spectator6 = new javax.swing.JLabel();
        suppotingStaffPanel = new javax.swing.JPanel();
        staffNameLable = new javax.swing.JLabel();
        staffName = new javax.swing.JTextField();
        addStaffMember = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        formTitle.setText("Information form");
        getContentPane().add(formTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 18, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 393, -1, -1));

        judgePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Judge"));
        judgePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judgeName.setText("judge");
        judgeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judgeNameActionPerformed(evt);
            }
        });
        judgePanel.add(judgeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 17, 100, -1));

        judgeLable.setText("Name :");
        judgePanel.add(judgeLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, -1, -1));

        addJudge.setText("Add Judge");
        addJudge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJudgeActionPerformed(evt);
            }
        });
        judgePanel.add(addJudge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        getContentPane().add(judgePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 350, 60));

        spectatorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Spectator"));
        spectatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spectatorName.setText("spectator");
        spectatorPanel.add(spectatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 100, -1));

        spectaterLable.setText("Name :");
        spectatorPanel.add(spectaterLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 31, -1, -1));

        addSpectator.setText("Add Spectater");
        addSpectator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSpectatorActionPerformed(evt);
            }
        });
        spectatorPanel.add(addSpectator, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        getContentPane().add(spectatorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 350, 70));

        goToPoolButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        goToPoolButton.setText("Go to Pool");
        goToPoolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToPoolButtonActionPerformed(evt);
            }
        });
        getContentPane().add(goToPoolButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 350, 43));

        swimmerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Swimmer"));
        swimmerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        swimmerName.setText("swimmer");
        swimmerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swimmerNameActionPerformed(evt);
            }
        });
        swimmerPanel.add(swimmerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 28, 100, -1));

        swimmerLable.setText("Name :");
        swimmerPanel.add(swimmerLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 31, -1, -1));

        addSwimmer.setText("Add Player");
        addSwimmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSwimmerActionPerformed(evt);
            }
        });
        swimmerPanel.add(addSwimmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        getContentPane().add(swimmerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 350, 70));

        detailPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        detailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        detailPanel.add(swimmer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, -1));
        detailPanel.add(swimmer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));
        detailPanel.add(swimmer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 10));
        detailPanel.add(swimmer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));
        detailPanel.add(swimmer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        detailPanel.add(judge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));
        detailPanel.add(staff1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        detailPanel.add(staff2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        detailPanel.add(staff3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 174, -1, 20));
        detailPanel.add(spectator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        detailPanel.add(spectator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        detailPanel.add(spectator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        detailPanel.add(spectator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        detailPanel.add(spectator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 40, 10));
        detailPanel.add(spectator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        detailPanel.add(spectator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        detailPanel.add(spectator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        detailPanel.add(spectator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));
        detailPanel.add(spectator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        detailPanel.add(spectator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        detailPanel.add(judge2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 10));
        detailPanel.add(spectator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 140, -1));

        getContentPane().add(detailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 310, 462));

        suppotingStaffPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Supporting Staff"));
        suppotingStaffPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffNameLable.setText("Name :");
        suppotingStaffPanel.add(staffNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 31, -1, -1));

        staffName.setText("staff");
        suppotingStaffPanel.add(staffName, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 28, 100, -1));

        addStaffMember.setText("Add Staff Member");
        addStaffMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffMemberActionPerformed(evt);
            }
        });
        suppotingStaffPanel.add(addStaffMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        getContentPane().add(suppotingStaffPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 350, 76));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToPoolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToPoolButtonActionPerformed
       
        if (ArrayCls.getswimmerArray().isEmpty()){
            JOptionPane.showMessageDialog(null,"please add players");
        }
        else if ( ArrayCls.getJudgeArray().isEmpty()){
            JOptionPane.showMessageDialog(null,"please add Judges");
        }
        else if (ArrayCls.getstaffArray().isEmpty()){
            JOptionPane.showMessageDialog(null,"please add Supporting Staff");
        }
        else if (ArrayCls.getspectatorArray().isEmpty()){
             JOptionPane.showMessageDialog(null,"please add Spectators");
        }
        else{
            this.dispose();
            pool.setSize(856,750);
            pool.setVisible(true);
        }
        
        Controller.createSaveFile();
        
        
    }//GEN-LAST:event_goToPoolButtonActionPerformed
    public static String getTextName(JTextField personName){
         return personName.getText();
    }
    private void addSwimmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSwimmerActionPerformed
      /* add player
       * and print player in panel
       */
        
        // detail panel labels of swimmer got in to array
        JLabel swimmerDetailShow[] = {swimmer1,swimmer2,swimmer3,swimmer4,swimmer5}; 
        
        isMale = EventSelect.getIsMale();
        Controller.createSwimmer(isMale,swimmerName,swimmerLabelCount);
        
        if(Controller.getError()){
            JOptionPane.showMessageDialog(null, Controller.getErrorMessege());
            
        }
        else{
        
        if (isMale && swimmerLabelCount<5) {
           
            swimmerDetailShow[swimmerLabelCount].setText("Swimmer"+"    "+"Male"+"    "+swimmerName.getText());
            swimmerLabelCount++;
        }
        
        else if  (swimmerLabelCount<5){
            swimmerDetailShow[swimmerLabelCount].setText("Swimmer"+"    "+"Female"+"    "+swimmerName.getText());
            swimmerLabelCount++;
        }
        }
        
    }//GEN-LAST:event_addSwimmerActionPerformed
    
    private void addJudgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJudgeActionPerformed
        JLabel judgeDetailShow[] = {judge1,judge2};
        Controller.createJudge(judgeName);
        if(Controller.getError()){
            JOptionPane.showMessageDialog(null, Controller.getErrorMessege());
        }
        else{
       
        if (judgeLabelCount<2){
            judgeDetailShow[judgeLabelCount].setText("Judge"+"    "+judgeName.getText());
            judgeLabelCount++;
        }
        }
    }//GEN-LAST:event_addJudgeActionPerformed
//11 spectators
    private void addSpectatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSpectatorActionPerformed
        JLabel spectatorDetailShow[] = {spectator1,spectator2,spectator3,spectator4,spectator5,spectator7,spectator8,spectator9,spectator10,spectator11,spectator12,spectator6};
        Controller.createSpectator(spectatorName);
        if(Controller.getError()){
            JOptionPane.showMessageDialog(null, Controller.getErrorMessege());
        }
        else{
        
        if (spectatorLabelCount<11){
            spectatorDetailShow[spectatorLabelCount].setText("Spectator"+"     "+spectatorName.getText());
            spectatorLabelCount++;
        }
        }
    }//GEN-LAST:event_addSpectatorActionPerformed

    private void addStaffMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffMemberActionPerformed
        JLabel staffDetailShow[] = {staff1,staff2,staff3};
       Controller.createStaff(staffName);
        if(Controller.getError()){
            JOptionPane.showMessageDialog(null, Controller.getErrorMessege());
        }
        else{
        
        if (staffLabelCount<3){
            
            staffDetailShow[staffLabelCount].setText("SupportingStaff"+"     "+staffName.getText());
            staffLabelCount++;
        }
        }
    }//GEN-LAST:event_addStaffMemberActionPerformed

    private void swimmerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swimmerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swimmerNameActionPerformed

    private void judgeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judgeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judgeNameActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJudge;
    private javax.swing.JButton addSpectator;
    private javax.swing.JButton addStaffMember;
    private javax.swing.JButton addSwimmer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JLabel formTitle;
    private javax.swing.JButton goToPoolButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel judge1;
    private javax.swing.JLabel judge2;
    private javax.swing.JLabel judgeLable;
    private javax.swing.JTextField judgeName;
    private javax.swing.JPanel judgePanel;
    private javax.swing.JLabel spectaterLable;
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
    private javax.swing.JTextField spectatorName;
    private javax.swing.JPanel spectatorPanel;
    private javax.swing.JLabel staff1;
    private javax.swing.JLabel staff2;
    private javax.swing.JLabel staff3;
    private javax.swing.JTextField staffName;
    private javax.swing.JLabel staffNameLable;
    private javax.swing.JPanel suppotingStaffPanel;
    private javax.swing.JLabel swimmer1;
    private javax.swing.JLabel swimmer2;
    private javax.swing.JLabel swimmer3;
    private javax.swing.JLabel swimmer4;
    private javax.swing.JLabel swimmer5;
    private javax.swing.JLabel swimmerLable;
    private javax.swing.JTextField swimmerName;
    private javax.swing.JPanel swimmerPanel;
    // End of variables declaration//GEN-END:variables
 
}