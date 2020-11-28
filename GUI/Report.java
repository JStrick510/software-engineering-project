package project1;

import java.util.ArrayList;
import java.util.Collections;

/**
*
* @author Jared
*/
public class Report extends javax.swing.JFrame
{
   public Report()
   {
       initComponents();
       populateReport();
   }

   @SuppressWarnings("unchecked")
   private void initComponents()
   {

       close = new javax.swing.JButton();
       jScrollPane1 = new javax.swing.JScrollPane();
       report = new javax.swing.JTextArea();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       close.setText("Close");
       close.addActionListener(new java.awt.event.ActionListener()
       {
           public void actionPerformed(java.awt.event.ActionEvent evt)
           {
               closeActionPerformed(evt);
           }
       });

       report.setColumns(20);
       report.setRows(5);
       jScrollPane1.setViewportView(report);

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                               .addGap(146, 146, 146)
                               .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(185, Short.MAX_VALUE))
                       .addComponent(jScrollPane1)
       );
       layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                               .addComponent(close)
                               .addGap(0, 18, Short.MAX_VALUE))
       );

       pack();
       report.setEditable(false);
   }// </editor-fold>

   private void closeActionPerformed(java.awt.event.ActionEvent evt)
   {
       this.dispose();
   }

   private void populateReport()
   {
	   String reportData = "";
	   DatabaseManager DBM = new DatabaseManager();
	   
	   ArrayList<String[]> reportRaw = DBM.getReport();
	   Collections.reverse(reportRaw); //reverse the list so newest date first
	   
	   for(String[] line : reportRaw)
	   {
		   reportData = reportData + "On " + line[0] + " saw " + line[1] + " patients and made $" + line[2] + "\n";
	   }
	   
	   report.setText(reportData);
	   
	   DBM.closeDB();
   }

   private javax.swing.JButton close;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextArea report;

   private DatabaseManager dbm;
}
