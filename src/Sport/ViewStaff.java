
package Sport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class ViewStaff extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    public ViewStaff() {
        initComponents();
        con=JavaConnection.dbConnect();
        try {
          st=  con.createStatement();
        } 
        
       catch (SQLException ex) {
            Logger.getLogger(Third_Day.class.getName()).log(Level.SEVERE, null, ex);
        }
           fetchstaff();   
    }  
    public void fetchstaff()       
{       DefaultTableModel model = (DefaultTableModel)staff_table.getModel();   
    try
    {
           
       rs = st.executeQuery("select * from registrationstaff order by staffid");
        while(rs.next())
         model.insertRow(model.getRowCount(),new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});   
    }   catch (SQLException ex) {
            Logger.getLogger(ViewPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staff_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("STAFF RECORDS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setAutoscrolls(true);

        staff_table.setBackground(new java.awt.Color(51, 255, 153));
        staff_table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        staff_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StaffId", "Name", "Game", "Designation", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        staff_table.setRowHeight(24);
        jScrollPane1.setViewportView(staff_table);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable staff_table;
    // End of variables declaration//GEN-END:variables
}
