package com.nuanshui.frms.test.csservice;

import com.nuanshui.frms.test.entity.cs.MessageList;

public interface MessageListService {
    Long getMessageList(MessageList messagelist);
    Long addMessageList(MessageList messagelist);
    Long deleteMessageList(String id);
}
