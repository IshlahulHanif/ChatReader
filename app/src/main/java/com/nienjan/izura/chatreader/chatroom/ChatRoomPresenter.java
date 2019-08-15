package com.nienjan.izura.chatreader.chatroom;

import com.nienjan.izura.chatreader.utils.ChatMessageData;

public class ChatRoomPresenter implements ChatRoomContract.presenter {
    private ChatRoomContract.interactor mInteractor;
    private ChatRoomContract.view mView;

    public ChatRoomPresenter(ChatRoomContract.interactor mInteractor, ChatRoomContract.view mView) {
        this.mInteractor = mInteractor;
        this.mView = mView;
    }

    @Override
    public void sendMessage(String message) {
        ChatMessageData chatMessageData = new ChatMessageData(message,mInteractor.getMyPersonData(),true);
        mInteractor.storeMessage(chatMessageData);
    }

    @Override
    public String getTextMessage(int position) {
        return mInteractor.getMessage(position).getText();
    }
}
