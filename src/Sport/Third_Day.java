/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author yusuf ali
 */
public class Third_Day extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pt;
    public Third_Day() {
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
    DefaultTableModel model = (DefaultTableModel)Third_Day.getModel();
    Third_Day.getColumnModel().getColumn(0).setPreferredWidth(20);    
    try
    {
       rs = st.executeQuery("select player_id,name,school,game,category ,referee from activityfirst where day = 'third' order by player_id");
        while(rs.next())
         model.insertRow(model.getRowCount(),new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
        
    }   catch (SQLException ex) {
            Logger.getLogger(ViewPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Third_Day = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ThirdDayActivity", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        Third_Day.setBackground(new java.awt.Color(153, 255, 102));
        Third_Day.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Third_Day.setModel(new javax.swing.table.DefaultTableModel(
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
        Third_Day.setRowHeight(24);
        Third_Day.setRowMargin(3);
        jScrollPane1.setViewportView(Third_Day);

        jButton2.setBackground(new java.awt.Color(255, 255, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Add activity to Result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(101, 101, 101)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {     
            int index[]= Third_Day.getSelectedRows();
            int rows=index.length;
            System.out.print(rows);
            String Day="third";
                        String query = "Insert into result(player_id,Name,school,game,Category,referee,day) values (?,?,?,?,?,?,?)";
                pt = con.prepareStatement(query);
                for(int row1 = 0; row1<rows; row1++)
                {
                    String playerid = (String)Third_Day.getValueAt(index[row1], 0);
                    String name = (String)Third_Day.getValueAt(index[row1], 1);
                    String school = (String)Third_Day.getValueAt(index[row1], 2);
                    String game = (String)Third_Day.getValueAt(index[row1], 3);
                    String category = (String)Third_Day.getValueAt(index[row1], 4);
                    String referee = (String)Third_Day.getValueAt(index[row1], 5);
                    // String Day = (String)jComboBox1.getSelectedItem().toString();
                    pt.setString(1,playerid);
                    pt.setString(2,name);
                    pt.setString(3,school);
                    pt.setString(4,game);
                    pt.setString(5,category);
                    pt.setString(6, referee);
                    pt.setString(7,Day);
                    pt.addBatch();
                }
                pt.executeBatch();
                //con.commit();             
                System.out.print("default");            
        }
        catch (SQLException ex) {
            Logger.getLogger(Third_Day.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);  
Home h= new Home();
h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Third_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Third_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Third_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Third_Day.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Third_Day().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Third_Day;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
