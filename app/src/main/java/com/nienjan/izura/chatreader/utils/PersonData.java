package com.nienjan.izura.chatreader.utils;

import android.graphics.drawable.Drawable;

public class PersonData {
    private String name;
    private Drawable avatar;

    public PersonData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getAvatar() {
        return avatar;
    }

    public void setAvatar(Drawable avatar) {
        this.avatar = avatar;
    }
}
