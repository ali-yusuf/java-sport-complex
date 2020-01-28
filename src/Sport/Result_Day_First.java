/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sport;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Result_Day_First extends javax.swing.JFrame {

    Connection con;
    Statement st;
   ResultSet rs;
    public Result_Day_First() {
        initComponents();
         con=JavaConnection.dbConnect();
        try {
          st=  con.createStatement();
        } 
        
       catch (SQLException ex) {
            Logger.getLogger(Third_Day.class.getName()).log(Level.SEVERE, null, ex);
        }
        fetch();
    }
public void fetch()
        
{      
    DefaultTableModel model = (DefaultTableModel)Result_Day_First.getModel();
    Result_Day_First.getColumnModel().getColumn(0).setPreferredWidth(20);
    
    try
    {
       rs = st.executeQuery("Select* from second_day order by player_id ");
        while(rs.next())
         model.insertRow(model.getRowCount(),new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
        
    }   catch (SQLException ex) {
            Logger.getLogger(ViewPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Result_Day_First = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Result_Day_First.setBackground(new java.awt.Color(51, 255, 153));
        Result_Day_First.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Result_Day_First.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PlayerId", "PlayerName", "School", "Game", "Category", "Referee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Result_Day_First.setRowHeight(24);
        jScrollPane1.setViewportView(Result_Day_First);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FirstDayResult");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(392, 392, 392)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(346, 346, 346))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result_Day_First().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Result_Day_First;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
