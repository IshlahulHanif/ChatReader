package com.nienjan.izura.chatreader.chatroom;

import android.view.View;

import com.nienjan.izura.chatreader.utils.ChatMessageData;
import com.nienjan.izura.chatreader.utils.PersonData;

public class ChatRoomContract {
    interface view {
        void onBtnSendClicked (View view);
        void onBtnVoiceChatClicked (View view);
        void onChatBubbleClicked (int position);
    }

    interface interactor {
        void storeMessage (ChatMessageData message);
        ChatMessageData getMessage (int position);
        PersonData getMyPersonData ();
    }

    interface presenter {
        void sendMessage (String message);
        String getTextMessage (int position);
    }
}
