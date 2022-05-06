package com.example.projecttemplate.ui;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.projecttemplate.R;

class ViewHolder extends RecyclerView.ViewHolder {
    TextView nickname_textView;
    ImageButton plant_image;

    ViewHolder(View itemView) {
        super(itemView);
        plant_image = itemView.findViewById(R.id.plant_image);
        nickname_textView = itemView.findViewById(R.id.nickname_textview);
    }
}