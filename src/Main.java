import models.chatClients.ChatClient;
import models.chatClients.InMemoryChatClient;
import models.Message;
import models.gui.MainFrame;

public class Main {
    public static void main(String[] args) {
        //test();
        MainFrame window = new MainFrame(800,600);

    }
    private static void test(){
            System.out.println("hi");

            ChatClient client = new InMemoryChatClient();
            client.login("patkos");
            System.out.println(client.isAuthenticated());
            System.out.println(client.getLoggedUsers());
            client.sendMessage("zdarec");

            for (Message msg: client.getMessages()){
                System.out.println(msg.getText());
            }

            client.logout();
            System.out.println(client.isAuthenticated());
        }
    }

