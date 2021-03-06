import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame{
private JTextArea Chatarea = new JTextArea();
private JTextField chatbox = new JTextField();
public Bot() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setLayout(null);
    frame.setSize(600 , 600);
    frame.setTitle("ChatBot");
    frame.add(Chatarea);
    frame.add(chatbox);
    //FOR TEXTAREA
    Chatarea.setSize(500 , 400);
    Chatarea.setLocation(2, 2);

    //FOR TEXTFIELD
    chatbox.setSize(540 , 30);
    chatbox.setLocation(2, 500);

    chatbox.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            String gtext = chatbox.getText().toLowerCase();
            Chatarea.append("YOU ->"+ gtext + "\n");
            chatbox.setText("");

            if(gtext.contains("hi")) {
                Bot("HELLO");
            }else {
                int rand = (int) (Math.random() * 3 + 1);
                if(rand == 1) {
                    Bot("I DON'T UNDERSTAND YOU");
                }else if(rand == 2) {
                    Bot("I DON'T UNDERSTAND YOU BRO");
                }else if(rand == 3) {
                    Bot("PLEASE COME AGAIN"); 
        
            }
        }


        if(gtext.contains("how")) {
            Bot("HELLO");
        }else {
            int rand = (int) (Math.random() * 3 + 1);
            if(rand == 1) {
                Bot("I DON'T UNDERSTAND YOU");
            }else if(rand == 2) {
                Bot("I DON'T UNDERSTAND YOU BRO");
            }else if(rand == 3) {
                Bot("PLEASE COME AGAIN"); 
    
        }
    }
    }
        

    });

    }
    private void Bot(String string) {
        Chatarea.append("BOT ->" +string+ "\n");
} 

public static void main(String[] args) {
 new Bot();   
}
    
}
