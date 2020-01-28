
package Sport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class CreateAccount extends javax.swing.JFrame {
   Connection con;
   Statement st;
   ResultSet rs;
   PreparedStatement pt;
    public CreateAccount() {
        initComponents();
        con = JavaConnection.dbConnect();
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ViewPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Dat = new com.toedter.calendar.JDateChooser();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CreateAccount", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Designation");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        b1.setBackground(new java.awt.Color(153, 153, 255));
        b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b1.setText("Create");
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Date of Birth");

        Dat.setDateFormatString("dd/MM/yyyy");
        Dat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel5)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(Dat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(Dat, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(jButton2))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

    try {
        String username=jTextField1.getText();
                String name=jTextField2.getText();
                //String Dat=
                java.text.SimpleDateFormat formatter= new java.text.SimpleDateFormat("yyyy/MM/dd");
                java.util.Date newDate=Dat.getDate();
                formatter.format(newDate);
               Date sqldate=new java.sql.Date(newDate.getTime());Dat.getDate();
               String datee=sqldate.toString();              
        String password=jPasswordField1.getText();
        String designation=jTextField4.getText();
       String str=("insert into createaccount values('"+username+"','"+name+"','"+datee+"','"+password+"','"+designation+"')");   
       int u=st.executeUpdate(str);
       
JOptionPane.showMessageDialog(null, "Account created !");    
    } 
    catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Account did not create !");    

        Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
    }                                        

    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        Home h=new Home();
        h.setVisible(true);       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    
    public static void main(String []args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Dat;
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}

