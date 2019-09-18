package mapajogo;

import java.time.Clock;

public class GameField extends javax.swing.JFrame {
    public boolean player1 = true;
    public boolean player2 = true;
    public int countPosition = 0;
    public int a = 0, b = 0;
    int op;
    public String L1, L2, L3, C1, C2, C3, D11, D12;
    
    String[][] arrayGame = new String[3][3];
        
    public GameField() {
        initComponents();
    }
        
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonRestart = new javax.swing.JButton();
        textgame = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        buttonRestart.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        buttonRestart.setText("NOVO JOGO");
        buttonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestartActionPerformed(evt);
            }
        });

        textgame.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        textgame.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textgameActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("M.A.P.A.");

        label2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label2.setText("JOGO DA VELHA");

        label3.setText("Aluno - Bruno Vinicio Araújo do Carmo");

        label4.setText("R.A.- 16016075");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(buttonRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textgame)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(textgame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void verifyPlayerTurn(){
        if(player1&&player2){
            this.op = 1;
            player1 = false;
            player2 = true;
            textgame.setText("Jogador 2 joga com O");
        } else if(player1&&player2==false){
            this.op = 1;
            player1 = false;
            player2 = true;
            textgame.setText("Jogador 2 joga com O");
        } else {
            this.op = 2;
            player1 = true;
            player2 = false;
            textgame.setText("Jogador 1 joga com X");
        }
    }
    
    public void CleanPositions(){
        for(a=0; a<3; a++){
            for(b=0; b<3; b++){
                arrayGame[a][b] = "";
            }               
        }
    }
    
    public void unableButtons(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    
    public void VerifyPosition(){
    countPosition = 0;
    for(a=0; a<3; a++){
            for(b=0; b<3; b++){
                    if(arrayGame[a][b] == "X" | arrayGame [a][b] == "O"){
                   countPosition +=1;    
                }    
            }
        }
    }
    
    public void VerifyWinner(){
        L1 = arrayGame[0][0] + arrayGame[0][1] + arrayGame[0][2];
        L2 = arrayGame[1][0] + arrayGame[1][1] + arrayGame[1][2];
        L3 = arrayGame[2][0] + arrayGame[2][1] + arrayGame[2][2];
        
        C1 = arrayGame[0][0] + arrayGame[1][0] + arrayGame[2][0];
        C2 = arrayGame[0][1] + arrayGame[1][1] + arrayGame[2][1];
        C3 = arrayGame[0][2] + arrayGame[1][2] + arrayGame[2][2];
        
        D11 = arrayGame[0][0] + arrayGame[1][1] + arrayGame[2][2];
        D12 = arrayGame[0][2] + arrayGame[1][1] + arrayGame[2][0];
        
        if(L1.equals("XXX")|L2.equals("XXX")|L3.equals("XXX")|C1.equals("XXX")|C2.equals("XXX")|C3.equals("XXX")|D11.equals("XXX")|D12.equals("XXX")){
            textgame.setText("Jogador 1 GANHOU!");
            unableButtons();
        } else if (L1.equals("OOO")|L2.equals("OOO")|L3.equals("OOO")|C1.equals("OOO")|C2.equals("OOO")|C3.equals("OOO")|D11.equals("OOO")|D12.equals("OOO")){
            textgame.setText("Jogador 2 GANHOU!");
            unableButtons();
        } else if(countPosition == 9){
            textgame.setText("Empatou!");
        }
    }
            
    //button1
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button1.setText("X");
    arrayGame[0][0] = "X";
    } else {
    button1.setText("O");
    arrayGame[0][0] = "O";
    }
    button1.setEnabled(false); 
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button1ActionPerformed
    //button2
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button2.setText("X");
    arrayGame[0][1] = "X";
    } else {
    button2.setText("O");
    arrayGame[0][1] = "O";
    }
    button2.setEnabled(false);     
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button2ActionPerformed
    //button3
    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button3.setText("X");
    arrayGame[0][2] = "X";
    } else {
    button3.setText("O");
    arrayGame[0][2] = "O";
    }
    button3.setEnabled(false);
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button3ActionPerformed
    //button4
    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button4.setText("X");
    arrayGame[1][0] = "X";
    } else {
        button4.setText("O");
    arrayGame[1][0] = "O";
    }
    button4.setEnabled(false);     
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button4ActionPerformed
    //button5
    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button5.setText("X");
    arrayGame[1][1] = "X";
    } else {
        button5.setText("O");
    arrayGame[1][1] = "O";
    }
    button5.setEnabled(false);         
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button5ActionPerformed
    //button6
    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button6.setText("X");
    arrayGame[1][2] = "X";
    } else {
    button6.setText("O");
    arrayGame[1][2] = "O";
    }
    button6.setEnabled(false);    
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button6ActionPerformed
    //button7
    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button7.setText("X");
    arrayGame[2][0] = "X";
    } else {
    button7.setText("O");
    arrayGame[2][0] = "O";
    }
    button7.setEnabled(false);        
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button7ActionPerformed
    //button8
    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button8.setText("X");
    arrayGame[2][1] = "X";
    } else {
    button8.setText("O");
    arrayGame[2][1] = "O";
    }
    button8.setEnabled(false);    
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button8ActionPerformed
    //button9
    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
    verifyPlayerTurn();
    if(op==1){
    button9.setText("X");
    arrayGame[2][2] = "X";
    } else {
    button9.setText("O");
    arrayGame[2][2] = "O";
    }
    button9.setEnabled(false);    
    VerifyPosition();
    VerifyWinner();
    }//GEN-LAST:event_button9ActionPerformed
    //buttonRestart
    private void buttonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestartActionPerformed
    button1.setText("");
    button1.setEnabled(true);
    button2.setText("");
    button2.setEnabled(true);
    button3.setText("");
    button3.setEnabled(true);
    button4.setText("");
    button4.setEnabled(true);
    button5.setText("");
    button5.setEnabled(true);
    button6.setText("");
    button6.setEnabled(true);
    button7.setText("");
    button7.setEnabled(true);
    button8.setText("");
    button8.setEnabled(true);
    button9.setText("");
    button9.setEnabled(true);
    CleanPositions();
    textgame.setText("");
    player1 = true;
    player2 = true;
    }//GEN-LAST:event_buttonRestartActionPerformed

    private void textgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textgameActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_textgameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameField().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonRestart;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTextField textgame;
    // End of variables declaration//GEN-END:variables
}
