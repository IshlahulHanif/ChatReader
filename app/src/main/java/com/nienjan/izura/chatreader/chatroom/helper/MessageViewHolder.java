package com.nienjan.izura.chatreader.chatroom.helper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nienjan.izura.chatreader.R;

public class MessageViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMessage;
    private TextView tvName;
    private ImageView ivAvatar;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);

        tvMessage = itemView.findViewById(R.id.tv_message_body);
        tvName = itemView.findViewById(R.id.tv_their_name);
        ivAvatar = itemView.findViewById(R.id.v_avatar);

        //TODO: set onlongclick to play audio
        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
    }

    public TextView getTvMessage() {
        return tvMessage;
    }

    public TextView getTvName() {
        return tvName;
    }

    public ImageView getIvAvatar() {
        return ivAvatar;
    }
}