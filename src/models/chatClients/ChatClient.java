package models.chatClients;

import java.awt.event.ActionListener;
import java.util.List;

public interface ChatClient {
    void sendMessage(String text);
    void login(String userName);
    void logout();
    Boolean isAuthenticated();
    List<String> getLoggedUsers();
    List<String> getMessages();

    void addActionListenerLoggedUsersChanged(ActionListener toAdd);
    void addActionListenerMessagesChanged(ActionListener toAdd);
}
