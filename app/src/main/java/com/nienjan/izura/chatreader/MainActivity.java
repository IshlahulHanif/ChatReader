package com.nienjan.izura.chatreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nienjan.izura.chatreader.chatroom.ChatRoomActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openChatRoom();
    }

    private void openChatRoom () {
        Intent i = new Intent(MainActivity.this, ChatRoomActivity.class);
        startActivity(i);
    }
}
