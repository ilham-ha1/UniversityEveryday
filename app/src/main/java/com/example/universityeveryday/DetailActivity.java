package com.example.universityeveryday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class DetailActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView nameDetail = findViewById(R.id.name_detail);
        TextView detailDetail = findViewById(R.id.detail_univ_detail);
        Button button = findViewById(R.id.btn_set_share);

        University university = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(university != null){
            Glide.with(this)
                    .load(university.getPhoto())
                    .into(imageView);
            nameDetail.setText(university.getName());
            detailDetail.setText(university.getDetail());
            button.setOnClickListener(view -> Toast.makeText(view.getContext(), "Share " +
                     university.getName(), Toast.LENGTH_SHORT).show());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail University");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}