
package Sport;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Schedule extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement pt;
    public Schedule() {
        initComponents();
         con = JavaConnection.dbConnect();
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ViewPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void JavaWorldPrintExample1() {
     PrinterJob printJob = PrinterJob.getPrinterJob();
 printJob.setJobName("Print Data");
    printJob.setPrintable(new Printable(){
        public int print(Graphics pg, PageFormat pf, int pagenum){
            if(pagenum>0)return Printable.NO_SUCH_PAGE;           
            Graphics2D g2 =(Graphics2D)pg;  
            g2.translate(pf.getImageableX(), pf.getImageableY());          
            g2.scale(0.24,0.24);
            jPanel1.paint(g2);
            return Printable.PAGE_EXISTS;
        }
    });
    if (printJob.printDialog()) {
      try {
        printJob.print();
      } catch (Exception PrintException) {
        PrintException.printStackTrace();
      }  }  }
      
public void fetchActivityFirst()
        
{       DefaultTableModel model = (DefaultTableModel)Schedule.getModel();   
    try
    {
            String game1=jTextField1.getText().toLowerCase();
       String s=jTextField2.getText();
       String day=jTextField3.getText();
       int num=Integer.parseInt(s);                       
       rs = st.executeQuery("select registration.player_id, registration.name, registration.school, registration.game, registration.category, registrationstaff.name  from registration inner join  registrationstaff on  registration.game = registrationstaff.game and registration.game='"+game1+"' and rownum <= '"+num+"' order by player_id");               
             
       while(rs.next())
         model.insertRow(model.getRowCount(),new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
      
       try{
           
          

int rows=Schedule.getRowCount();
System.out.print(rows);

String queryco = "Insert into ActivityFirst(player_id,Name,school,game,Category,referee,day) values (?,?,?,?,?,?,?)";
pt = con.prepareStatement(queryco);
for(int row = 0; row<rows; row++)
{
    String coitemname = (String)Schedule.getValueAt(row, 0);
    String cocateg = (String)Schedule.getValueAt(row, 1);
    String codesc = (String)Schedule.getValueAt(row, 2);
    String coloc = (String)Schedule.getValueAt(row, 3);
    String coitemtagno = (String)Schedule.getValueAt(row, 4);
        String referee = (String)Schedule.getValueAt(row, 5);
    pt.setString(1, coitemname);
    pt.setString(2, cocateg);
    pt.setString(3, codesc);
    pt.setString(4, coloc);
    pt.setString(5, coitemtagno);
    pt.setString(6, referee);
    pt.setString(7, day);
    pt.addBatch();    //pt.setString(7, day);
}
pt.executeBatch();
con.commit();
System.out.print(rows);
if(rows==00)
    JOptionPane.showMessageDialog(this,"Game does not exist");

}
catch(Exception e){           
    JOptionPane.showMessageDialog(this,"These activities are already schedule  .");

   // JOptionPane.showMessageDialog(this,e.getMessage());

}
    } 
    catch (SQLException ex) {

           Logger.getLogger(ViewPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Schedule = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));

        Schedule.setBackground(new java.awt.Color(0, 255, 102));
        Schedule.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Schedule);
        if (Schedule.getColumnModel().getColumnCount() > 0) {
            Schedule.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Game");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("max player");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Create");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Day");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3)
                    .addComponent(jTextField2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Print");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("clear");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(887, 887, 887))
            .addGroup(layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(jButton3)
                .addGap(113, 113, 113)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(273, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JavaWorldPrintExample1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fetchActivityFirst();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Schedule.setModel(new DefaultTableModel (null,  new String [] { "PlayerId", "PlayerName", "School", "Game", "Category", "Referee"}));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Schedule;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
