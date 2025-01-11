package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(45, 45, 45)); // Dark background
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to the Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254)); // Light color for heading
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.WHITE); // White text for rules
        rules.setText(
                "<html>" +
                        "1. This quiz is designed to test your knowledge on various topics. Answer the questions to the best of your ability."
                        + "<br><br>" +
                        "2. The quiz consists of 10 questions." + "<br><br>" +
                        "3. You will have a total of 15 Seconds for each question of the quiz. A timer will be displayed on the screen to help you keep track."
                        + "<br><br>" +
                        "4. Each correct answer will earn you 10 points." + "<br><br>" +
                        "5. Once you submit, you'll immediately receive your score. You can also view the correct answers to the questions you've answered."
                        + "<br><br>" +
                        "6. Brace yourself, this paper is not for the faint-hearted" + "<br><br>" +
                        "<html>");
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254)); // Button color
        back.setForeground(Color.WHITE); // Text color for the button
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254)); // Button color
        start.setForeground(Color.WHITE); // Text color for the button
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
