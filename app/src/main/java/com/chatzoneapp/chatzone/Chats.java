package com.chatzoneapp.chatzone;

public class Chats {

    String lastMessageKey;

    public Chats()
    {

    }

    public Chats( String lastMessageKey) {
        this.lastMessageKey = lastMessageKey;
    }

    public String getLastMessageKey() {
        return lastMessageKey;
    }

    public void setLastMessageKey(String lastMessageKey) {
        this.lastMessageKey = lastMessageKey;
    }

}
