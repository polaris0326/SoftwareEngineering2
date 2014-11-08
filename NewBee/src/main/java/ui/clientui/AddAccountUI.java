/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.clientui;

import vo.AccountVO;
import blservice.accountblservice.AccountBLService_Manage;

public class AddAccountUI extends javax.swing.JFrame {
	
	AccountBLService_Manage bls;

    
    public AddAccountUI(AccountBLService_Manage bls) {
        initComponents();
        this.bls=bls;
    }
                       
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        balanceField = new javax.swing.JTextField();
        headLabel = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        balanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceFieldActionPerformed(evt);
            }
        });

        headLabel.setText("新建账户");

        confirm.setText("确定");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cancel.setText("取消");
        
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        nameLabel.setText("账户名称");

        balanceLabel.setText("账户余额");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel)
                    .addComponent(balanceLabel))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(confirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(headLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(headLabel)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceLabel))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(cancel))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>                        

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void balanceFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {                                        
        boolean result=bls.addAccount(new AccountVO(nameField.getText(),
        		Double.parseDouble(balanceField.getText())));
        if (result){
        	javax.swing.JOptionPane.showMessageDialog(this,"添加账户成功！");
        }
        else{
           	javax.swing.JOptionPane.showMessageDialog(this,"添加账户失败：该账户名已存在。");
        }
    }    
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {  
    	
       System.exit(NORMAL);
    }    

    // Variables declaration - do not modify                     
    private javax.swing.JTextField balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel headLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration                   
}
