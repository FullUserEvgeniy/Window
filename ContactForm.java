package com.Abrosimov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField textField1;
    JTextField textField2;
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JCheckBox jCheckBox;

    public ContactForm(){
        super("���������� �����");
        this.setBounds(100, 100, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(4,2,2,10));

        JLabel label1 = new JLabel("������� ���:");
        textField1 = new JTextField("", 1);

        JLabel label2 = new JLabel("������� e-mail:");
        textField2 = new JTextField("@", 1);

        container.add(label1);
        container.add(textField1);
        container.add(label2);
        container.add(textField2);

        jRadioButton1 = new JRadioButton("�������");
        jRadioButton2 = new JRadioButton("�������");

        jCheckBox = new JCheckBox("��������?", false);

        JButton jButton = new JButton("���������");

        jRadioButton1.setSelected(true);
        container.add(jRadioButton1);
        container.add(jRadioButton2);

        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        group.add(jRadioButton2);

        container.add(jCheckBox);
        container.add(jButton);

        jButton.addActionListener(new ButtonEventManager());
    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = textField1.getText();
            String mail = textField2.getText();

            String isMale = "�������";
            if (!jRadioButton1.isSelected()) isMale = "�������";

            boolean checkBox = jCheckBox.isSelected();

            JOptionPane.showMessageDialog(null, "���� �����: "+mail + "\n��� ���: " + isMale + "\n�� ��������? " + checkBox,"������ "+ name,JOptionPane.INFORMATION_MESSAGE );

        }
    }
}
