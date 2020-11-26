 package GUI;

 import Database.DatabaseManager;

/**
 *
 * @author Jared
 */
public class Register extends javax.swing.JFrame
{
    public Register()
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {
        fName = new javax.swing.JTextField();
        middleInitial = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        employeeId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        nurse = new javax.swing.JRadioButton();
        staff = new javax.swing.JRadioButton();
        doctor = new javax.swing.JRadioButton();
        ceo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fName.setText("First Name");
        fName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                fNameMouseClicked(evt);
            }
        });

        middleInitial.setText("M.I.");
        middleInitial.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                middleInitialMouseClicked(evt);
            }
        });

        lName.setText("Last Name");
        lName.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lNameMouseClicked(evt);
            }
        });

        password.setText("jPasswordField1");
        password.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                passwordMouseClicked(evt);
            }
        });

        employeeId.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                employeeIdMouseClicked(evt);
            }
        });

        jLabel1.setText("Register");

        jLabel2.setText("Select Position");

        jLabel3.setText("Employee ID");

        jLabel4.setText("Password");

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                registerActionPerformed(evt);
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

        nurse.setText("Nurse");
        nurse.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nurseActionPerformed(evt);
            }
        });

        staff.setText("Staff");
        staff.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                staffActionPerformed(evt);
            }
        });

        doctor.setText("Doctor");
        doctor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doctorActionPerformed(evt);
            }
        });

        ceo.setText("CEO");
        ceo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ceoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(10, 10, 10)
                                                                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(24, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(employeeId, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(register, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(42, 42, 42))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(nurse, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ceo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(middleInitial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nurse)
                                        .addComponent(staff)
                                        .addComponent(doctor)
                                        .addComponent(ceo))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(register))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancel))
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void fNameMouseClicked(java.awt.event.MouseEvent evt)
    {
        fName.setText("");
    }

    private void middleInitialMouseClicked(java.awt.event.MouseEvent evt)
    {
        middleInitial.setText("");
    }

    private void lNameMouseClicked(java.awt.event.MouseEvent evt)
    {
        lName.setText("");
    }

    private void staffActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_isStaff = staff.isSelected();
        nurse.setSelected(false);
        doctor.setSelected(false);
        ceo.setSelected(false);
    }

    private void nurseActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_isNurse = nurse.isSelected();
        staff.setSelected(false);
        doctor.setSelected(false);
        ceo.setSelected(false);
    }

    private void doctorActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_isDoctor = doctor.isSelected();
        nurse.setSelected(false);
        staff.setSelected(false);
        ceo.setSelected(false);
    }

    private void ceoActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_isCeo = ceo.isSelected();
        nurse.setSelected(false);
        doctor.setSelected(false);
        staff.setSelected(false);
    }

    private void employeeIdMouseClicked(java.awt.event.MouseEvent evt)
    {
        employeeId.setText("");
    }

    private void passwordMouseClicked(java.awt.event.MouseEvent evt)
    {
        password.setText("");
    }

    private String getRole()
    {
        if (m_isCeo)
            return "CEO";
        else if (m_isDoctor)
            return "Doctor";
        else if (m_isNurse)
            return "Nurse";
        else if (m_isStaff)
            return "Staff";
        else
            return "";
    }

    private void registerActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_id = employeeId.getText();
        m_password = password.getText();
        String name = fName.getText() + " " + middleInitial.getText() + " " + lName.getText();

        String role = getRole();
        if (role.equals(""))
        {
            System.out.println("Failed to register");
            ErrorScreen error = new ErrorScreen("Registration Failed");
            error.setVisible(true);
            return;
        }
        System.out.println("Selected role: " + role);
        dbm = new DatabaseManager();
        //TODO: add password hashing
        dbm.addLogInInfo(m_id, m_password, role, name.toLowerCase());
        dbm.closeDB();
        this.dispose();
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.dispose();
    }

    private javax.swing.JButton cancel;
    private javax.swing.JRadioButton ceo;
    private javax.swing.JRadioButton doctor;
    private javax.swing.JTextField employeeId;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField middleInitial;
    private javax.swing.JRadioButton nurse;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JRadioButton staff;

    private boolean m_isStaff;
    private boolean m_isDoctor;
    private boolean m_isCeo;
    private boolean m_isNurse;

    private String m_id;
    private String m_password;

    private DatabaseManager dbm;
}