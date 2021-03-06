package com.apress.springrecipes;

import java.util.List;

public interface MessageBoardService {

    List<Message> listMessages();

    void postMessage(Message message);

    void deleteMessage(Message message);

    Message findMessageById(Long messageId);

}
