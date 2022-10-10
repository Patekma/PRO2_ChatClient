package models.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    JTextField txtInputName;
    JTextField txtInputMessage;

    public MainFrame(int width, int height){

        super("PRO2 CHAT CLIENT");
        setSize(width, height);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initGui();

        setVisible(true);
    }

    private void initGui(){
        JPanel panelMain = new JPanel(new BorderLayout());

        panelMain.add(initLoginPanel(), BorderLayout.NORTH);
        panelMain.add(initChatPanel(), BorderLayout.CENTER);
        panelMain.add(initMessagePanel(), BorderLayout.SOUTH);

        add(panelMain);
    }

    private JPanel initLoginPanel(){
        JPanel panelLogin = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panelLogin.add(new JLabel("Username"));
        panelLogin.add(new JTextField("", 30));
        panelLogin.add(txtInputName);
        panelLogin.add(new JButton("Login"));

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("login checked: " + txtInputName.getText());
            }
        });
        panelLogin.add(btnLogin);
        return panelLogin;
    }

    private JPanel initChatPanel(){
        JPanel panelChat = new JPanel();

        panelChat.setLayout(new BoxLayout(panelChat, BoxLayout.X_AXIS));
        JTextArea txtChat = new JTextArea();
        txtChat.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(txtChat);

        for (int i = 0; i < 50; i++) {
            txtChat.append("Message " + i);
        }

        panelChat.add(scrollPane);

        return panelChat;
    }

    private JPanel initMessagePanel(){
        JPanel panelMessage = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtInputMessage = new JTextField("", 50);
        panelMessage.add(txtInputMessage);

        JButton btnSend = new JButton("Send");
        btnSend.addActionListener(e -> {
            System.out.println("btnSend clicked" + txtInputMessage.getText());

        });


        return panelMessage;
    }
}
