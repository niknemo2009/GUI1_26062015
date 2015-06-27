import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Fri Jun 26 18:29:02 EEST 2015
 */



/**
 * @author Nezdoliy Yura
 */
public class Form1 extends JFrame {
    public Form1() {
        initComponents();
        DefaultComboBoxModel<User>  model=new DefaultComboBoxModel<User>(User.getSprUser());
        this.spisokUsers1.setModel(model);
        this.comboBox1_users.setModel(model);
       // textField5_telefon.setInputVerifier(new MyVerifer());


    }

    private void spisokUsers1MouseReleased(MouseEvent e) {
        User selectedUser=(User)spisokUsers1.getSelectedValue();
        textField3_name.setText(selectedUser.name);
        textField4_emeil.setText(selectedUser.emeil);
        textField5_telefon.setText(selectedUser.telefon);
    }

    private void spisokUsers1ValueChanged(ListSelectionEvent e) {
        System.out.println("1111111");
        User selectedUser=(User)spisokUsers1.getSelectedValue();
        textField3_name.setText(selectedUser.name);
        textField4_emeil.setText(selectedUser.emeil);
        textField5_telefon.setText(selectedUser.telefon);   // TODO add your code here
    }

    private void button1_addActionPerformed(ActionEvent e) {
        String name1=textField3_name.getText();
        String emeil22=textField4_emeil.getText();
        String tel=textField5_telefon.getText();
        String message=null;
        if(tel.matches("[0-9]{2}-[0-9]{3}-[0-9]{2}")){
            new User(name1,emeil22,tel);
            message="Пользователь создан";
        }else{
            message="Маска для набора dd-ddd-dd";
        }
        JOptionPane.showMessageDialog(this,message);

    }

    class MyVerifer extends  InputVerifier{

                    @Override
                    public boolean verify(JComponent jComponent)
                    {
                        boolean result=textField5_telefon.getText().matches("[0-9]*");
                        if(!result){
                            System.err.println("Error");
                        }
            return result;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Nezdoliy Yura
        panel1 = new JPanel();
        button1_add = new JButton();
        button2_delete = new JButton();
        button3_update = new JButton();
        panel2 = new JPanel();
        textField3_name = new JTextField();
        textField4_emeil = new JTextField();
        textField5_telefon = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel3 = new JPanel();
        scrollPane1 = new JScrollPane();
        spisokUsers1 = new JList();
        comboBox1_users = new JComboBox();

        //======== this ========
        setTitle("\u0424\u043e\u0440\u043c\u0430 1");
        setBackground(new Color(51, 255, 0));
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder(null, "\u041f\u0430\u043d\u0435\u043b\u044c \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
                new Font("Dialog", Font.BOLD, 14), Color.magenta));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- button1_add ----
            button1_add.setText("add");
            button1_add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1_addActionPerformed(e);
                }
            });

            //---- button2_delete ----
            button2_delete.setText("delete");

            //---- button3_update ----
            button3_update.setText("update");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(button1_add)
                        .addGap(35, 35, 35)
                        .addComponent(button2_delete)
                        .addGap(30, 30, 30)
                        .addComponent(button3_update)
                        .addContainerGap(333, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1_add)
                            .addComponent(button2_delete)
                            .addComponent(button3_update)))
            );
        }

        //======== panel2 ========
        {

            //---- textField3_name ----
            textField3_name.setToolTipText("\u0432\u0430\u0432\u0430\u0432\u0430\u0432\u0430\u0432\u0430\u0432\u0430\u0432\u0430\u0432\u0430");

            //---- label1 ----
            label1.setText("\u0418\u043c\u044f");

            //---- label2 ----
            label2.setText("\u0415\u043c\u0435\u0439\u043b");

            //---- label3 ----
            label3.setText("\u0422\u0435\u043b\u0435\u0444\u043e\u043d");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textField3_name, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(textField4_emeil)
                            .addComponent(textField5_telefon))
                        .addContainerGap())
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField3_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField4_emeil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField5_telefon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3))
                        .addContainerGap(35, Short.MAX_VALUE))
            );
        }

        //======== panel3 ========
        {

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGap(0, 323, Short.MAX_VALUE)
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
            );
        }

        //======== scrollPane1 ========
        {

            //---- spisokUsers1 ----
            spisokUsers1.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    spisokUsers1ValueChanged(e);
                }
            });
            scrollPane1.setViewportView(spisokUsers1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboBox1_users, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(comboBox1_users, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nezdoliy Yura
    private JPanel panel1;
    private JButton button1_add;
    private JButton button2_delete;
    private JButton button3_update;
    private JPanel panel2;
    private JTextField textField3_name;
    private JTextField textField4_emeil;
    private JTextField textField5_telefon;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel3;
    private JScrollPane scrollPane1;
    private JList spisokUsers1;
    private JComboBox comboBox1_users;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
