package com.nienjan.izura.chatreader;

import android.app.Application;

import com.nienjan.izura.chatreader.utils.ChatMessageData;

import java.util.ArrayList;

public class ApplicationClassChatReader extends Application {
    public static ArrayList<ChatMessageData> chatMessageData;

    @Override
    public void onCreate() {
        super.onCreate();

        chatMessageData = new ArrayList<ChatMessageData>();
    }
}
