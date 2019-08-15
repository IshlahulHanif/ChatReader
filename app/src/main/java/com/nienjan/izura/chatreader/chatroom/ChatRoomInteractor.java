package com.nienjan.izura.chatreader.chatroom;

import com.nienjan.izura.chatreader.ApplicationClassChatReader;
import com.nienjan.izura.chatreader.utils.ChatMessageData;
import com.nienjan.izura.chatreader.utils.PersonData;

public class ChatRoomInteractor implements ChatRoomContract.interactor {


    @Override
    public void storeMessage(ChatMessageData message) {
        ApplicationClassChatReader.chatMessageData.add(message);
    }

    @Override
    public ChatMessageData getMessage(int position) {
        return ApplicationClassChatReader.chatMessageData.get(position);
    }

    @Override
    public PersonData getMyPersonData() {
        //TODO: implement this method
        return null;
    }
}
