import javax.swing.*;
import java.awt.*;

class Login1 extends JFrame
{
    Login1(String s1)
    {
        super(s1);
    }

    void setComponent()
    {
        JLabel l1 = new JLabel("USERNAME");
        JTextField t1 = new JTextField();

        JLabel l2 = new JLabel("PASSWORD");
        JTextField t2 = new JTextField();

        JButton b1 = new JButton("SUBMIT");

        setLayout(null);

        l1.setBounds(100, 100, 100, 30);
        t1.setBounds(220, 100, 150, 30);

        l2.setBounds(100, 200, 100, 30);
        t2.setBounds(220, 200, 150, 30);

        b1.setBounds(150, 300, 120, 40);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b1);
        b1.AddActionListner(new log());

    }

    public static void main(String[] args)
    {
        Login1 s1 = new Login1("Welcome to Coding");

        s1.setSize(700, 700);

        s1.setComponent();

        s1.setVisible(true);

        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
class log implement ActionListener
{
    public void actionperformed(ActionEvent e1)
string s1 = t1.getText();
string s2 = t2.getText();
if s1.equal("coding")
}
}