package com.nienjan.izura.chatreader.utils;

public class ChatMessageData {
    private String text;
    private PersonData personData;
    private boolean isBelongToMe;

    public ChatMessageData(String text, PersonData personData, boolean isBelongToMe) {
        this.text = text;
        this.personData = personData;
        this.isBelongToMe = isBelongToMe;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PersonData getPersonData() {
        return personData;
    }

    public void setPersonData(PersonData personData) {
        this.personData = personData;
    }

    public boolean isBelongToMe() {
        return isBelongToMe;
    }

    public void setBelongToMe(boolean belongToMe) {
        isBelongToMe = belongToMe;
    }


}
