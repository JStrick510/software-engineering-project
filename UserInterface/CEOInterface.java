package UserInterface;


import Database.DatabaseManager;
import GUI.Report;

/**
 *
 * @author Jared
 */
public class CEOInterface extends javax.swing.JFrame
{

    public CEOInterface(String id)
    {
        this.m_employeeId = id;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {
        viewReport = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewReport.setText("View Report");
        viewReport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewReportActionPerformed(evt);
            }
        });

        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                logOutActionPerformed(evt);
            }
        });

        jLabel1.setText("CEO Interface");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(viewReport, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(viewReport)
                                .addGap(36, 36, 36)
                                .addComponent(logOut)
                                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>

    private void viewReportActionPerformed(java.awt.event.ActionEvent evt)
    {
        Report report = new Report();
        report.setVisible(true);
    }

    private void logOutActionPerformed(java.awt.event.ActionEvent evt)
    {
        dbm = new DatabaseManager();
        dbm.removeCurrentLogIn(m_employeeId);
        dbm.closeDB();
        this.dispose();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton viewReport;

    private DatabaseManager dbm;

    private String m_employeeId;
}
