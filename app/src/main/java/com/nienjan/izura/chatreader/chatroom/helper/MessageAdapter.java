package com.nienjan.izura.chatreader.chatroom.helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nienjan.izura.chatreader.R;
import com.nienjan.izura.chatreader.utils.ChatMessageData;

import java.util.ArrayList;
import static com.nienjan.izura.chatreader.utils.CommonUtility.*;

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {
    private String TAG = "MessageAdapter";
    private ArrayList<ChatMessageData> messages;
    private MessageClickListener messageClickListener;

    public MessageAdapter(Context context, ArrayList<ChatMessageData> list) {
        this.messageClickListener = (MessageClickListener) context;
        this.messages = list;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;

        if (messages.get(i).isBelongToMe()) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_message, viewGroup, false);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.their_message, viewGroup, false);
        }

        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder messageViewHolder, int i) {
        messageViewHolder.itemView.setTag(messages.get(i));
        messageViewHolder.getTvMessage().setText(messages.get(i).getText());
        if (!messages.get(i).isBelongToMe()) {
            try {
                messageViewHolder.getTvName().setText(messages.get(i).getPersonData().getName());
                messageViewHolder.getIvAvatar().setImageDrawable(messages.get(i).getPersonData().getAvatar());
            } catch (Exception e) {
                error(e.getMessage());
            }
        }
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
