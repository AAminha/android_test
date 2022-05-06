package com.example.projecttemplate;

import android.view.View;

public class list_item {
    private int plant_image;
    private String nickname;

    public list_item(int plant_image, String nickname) {
        this.plant_image = plant_image;
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getProfile_image() {
        return plant_image;
    }

    public void setProfile_image(int plant_image) {
        this.plant_image = plant_image;
    }
}
