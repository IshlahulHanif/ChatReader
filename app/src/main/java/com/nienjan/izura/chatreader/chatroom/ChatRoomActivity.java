package com.nienjan.izura.chatreader.chatroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import com.nienjan.izura.chatreader.ApplicationClassChatReader;
import com.nienjan.izura.chatreader.utils.ChatMessageData;
import com.nienjan.izura.chatreader.R;

public class ChatRoomActivity extends AppCompatActivity implements ChatRoomContract.view{

    private EditText etWriteMessage;
    private RecyclerView rvMessageDisplay;
    private ChatRoomContract.interactor mInteractor;
    private ChatRoomContract.presenter mPresenter;
    private int jokeCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
        etWriteMessage = findViewById(R.id.et_write_message);
        mInteractor = new ChatRoomInteractor();
        mPresenter = new ChatRoomPresenter(mInteractor,this);
        jokeCount = 0;

        rvMessageDisplay = findViewById(R.id.rv_message_display);
        rvMessageDisplay.setHasFixedSize(true);
        //TODO: implement chat adapter and linear layout manager
        //TODO: understand what linear layout manager do
        ArrayAdapter<ChatMessageData> chatAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, ApplicationClassChatReader.chatMessageData);

//        rvMessageDisplay.setAdapter(chatAdapter);


    }

    @Override
    public void onBtnSendClicked(View view) {
        if (etWriteMessage.getText().toString().isEmpty()) {
            Toast.makeText(ChatRoomActivity.this,"Please Write Something!", Toast.LENGTH_LONG).show();
            jokeCount = 1;
        } else if (etWriteMessage.getText().toString().equals("Something") && jokeCount==1){
            Toast.makeText(ChatRoomActivity.this,"Please Write YOUR MESSAGE!", Toast.LENGTH_LONG).show();
            jokeCount = 2;
        } else if (etWriteMessage.getText().toString().equals("YOUR MESSAGE!") && jokeCount==2){
            Toast.makeText(ChatRoomActivity.this,"I'm tired of ignorant people like you", Toast.LENGTH_LONG).show();
            jokeCount = 3;
        } else {
            String message = etWriteMessage.getText().toString();
            mPresenter.sendMessage(message);
        }
    }

    @Override
    public void onBtnVoiceChatClicked(View view) {

    }

    @Override
    public void onChatBubbleClicked(int position) {

    }
}