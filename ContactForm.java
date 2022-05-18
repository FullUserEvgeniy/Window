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
        super("Контактная форма");
        this.setBounds(100, 100, 300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = super.getContentPane();
        container.setLayout(new GridLayout(4,2,2,10));

        JLabel label1 = new JLabel("Введите имя:");
        textField1 = new JTextField("", 1);

        JLabel label2 = new JLabel("Введите e-mail:");
        textField2 = new JTextField("@", 1);

        container.add(label1);
        container.add(textField1);
        container.add(label2);
        container.add(textField2);

        jRadioButton1 = new JRadioButton("Мужской");
        jRadioButton2 = new JRadioButton("Женский");

        jCheckBox = new JCheckBox("Согласны?", false);

        JButton jButton = new JButton("Отправить");

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

            String isMale = "Мужской";
            if (!jRadioButton1.isSelected()) isMale = "Женский";

            boolean checkBox = jCheckBox.isSelected();

            JOptionPane.showMessageDialog(null, "Ваша почта: "+mail + "\nВаш пол: " + isMale + "\nВы согласны? " + checkBox,"Привет "+ name,JOptionPane.INFORMATION_MESSAGE );

        }
    }
}
