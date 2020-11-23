package GUI;


import Database.DatabaseManager;
import UserInterface.CEOInterface;
import UserInterface.DoctorInterface;
import UserInterface.NurseInterface;
import UserInterface.StaffInterface;

/**
 *
 * @author Jared
 */
public class Login extends javax.swing.JFrame
{

    public Login()
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {

        employeeId = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeId.setText("Employee ID");
        employeeId.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                employeeIdMouseClicked(evt);
            }
        });

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                loginActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                cancelMouseClicked(evt);
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

        jLabel1.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(employeeId)
                                                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(employeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(login)
                                .addGap(32, 32, 32)
                                .addComponent(cancel)
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void employeeIdMouseClicked(java.awt.event.MouseEvent evt)
    {
        employeeId.setText("");
    }

    private void passwordMouseClicked(java.awt.event.MouseEvent evt)
    {
        password.setText("");
    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt)
    {
        m_id = employeeId.getText();
        m_password = password.getText();

        dbm = new DatabaseManager();
        if (m_password.equals(dbm.getLogInInfoData(m_id, 1).trim()))
        {
            dbm.addCurrentLogIn(m_id);
        }
        else
        {
            System.out.println("GUI.Login failed");
            ErrorScreen error = new ErrorScreen("Invalid GUI.Login");
            error.setVisible(true);
            return;

        }
        System.out.println("Successfully logged in");
        String role = dbm.getLogInInfoData(m_id, 2);
        System.out.println("Role is: " + role);
        dbm.closeDB();
        switch (role.trim())
        {
            case "Doctor":
                System.out.println("Doctor");
                DoctorInterface doctor = new DoctorInterface(m_id);
                this.dispose();
                doctor.setVisible(true);
                break;
            case "Staff":
                System.out.println("Staff");
                StaffInterface staff = new StaffInterface(m_id);
                this.dispose();
                staff.setVisible(true);
                break;
            case "Nurse":
                System.out.println("Nurse");
                NurseInterface nurse = new NurseInterface(m_id);
                this.dispose();
                nurse.setVisible(true);
                break;
            case "CEO":
                System.out.println("CEO");
                CEOInterface ceo = new CEOInterface(m_id);
                this.dispose();
                ceo.setVisible(true);
                break;
            default:
                System.out.println("Invalid choice");
                ErrorScreen error = new ErrorScreen("Invalid emplyoee option");
                error.setVisible(true);
                break;
        }
    }

    private void cancelMouseClicked(java.awt.event.MouseEvent evt)
    {
        this.dispose();
    }

    private javax.swing.JButton cancel;
    private javax.swing.JTextField employeeId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;

    private String m_id;
    private String m_password;

    private DatabaseManager dbm;
}