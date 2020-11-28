package GUI;


import Appointment.AppointmentManager;
import Database.DatabaseManager;

/**
 *
 * @author Jared
 */
public class AppointmentInterface extends javax.swing.JFrame
{
    public AppointmentInterface()
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        doctorName = new javax.swing.JTextField();
        timeSlot = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        doctorName.setText("Doctor Name");
        doctorName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                doctorNameMouseClicked(evt);
            }
        });

        timeSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9am-9:30am", "9:30am-10am", "10am-10:30am", "10:30am-11am", "11am-11:30am", "12pm-12:30pm", "12:30pm-1pm", "1pm-1:30pm", "1:30pm-2pm", "2pm-2:30pm", "2:30pm-3pm", "3pm-3:30pm", "3:30pm-4pm", "4pm-4:30pm", "4:30pm-5pm" }));
        timeSlot.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                timeSlotActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Availability");

        check.setText("Check");
        check.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                checkActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(timeSlot, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(doctorName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(timeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(check)
                                        .addComponent(cancel))
                                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        m_timeSlot = timeSlot.getItemAt(timeSlot.getSelectedIndex());
    }// </editor-fold>

    private void doctorNameMouseClicked(java.awt.event.MouseEvent evt)
    {
        doctorName.setText("");
    }

    private void timeSlotActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_timeSlot = timeSlot.getItemAt(timeSlot.getSelectedIndex());
    }

    private void checkActionPerformed(java.awt.event.ActionEvent evt)
    {
        mgr = new AppointmentManager();
        dbm = new DatabaseManager();
        String id = dbm.getEmployeeID(doctorName.getText());
        dbm.closeDB();

        String[] availability = mgr.checkAvailable(id);
        int index = m_timeSlot.indexOf("-");
        String avail = m_timeSlot.substring(0, index);
        for (String line : availability)
        {
            System.out.println(line);
            if (line.equals(avail))
            {
                MakeAppointment makeAppointment = new MakeAppointment(doctorName.getText());
                makeAppointment.setVisible(true);
                this.dispose();
                return;
            }
        }
        ErrorScreen errorScreen = new ErrorScreen("Time slot not available");
        errorScreen.setVisible(true);
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
    }

    private javax.swing.JButton cancel;
    private javax.swing.JButton check;
    private javax.swing.JTextField doctorName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> timeSlot;

    private DatabaseManager dbm;

    private AppointmentManager mgr;

    private String m_timeSlot;
}
