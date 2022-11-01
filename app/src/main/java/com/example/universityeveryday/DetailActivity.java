package com.example.universityeveryday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
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
            button.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        University university = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (view.getId() == R.id.btn_set_share){
            Intent shareMedsos = new Intent();
            shareMedsos.setAction(Intent.ACTION_SEND);
            shareMedsos.putExtra(Intent.EXTRA_TEXT,"Aku mau login ke "+ university.getName());
            shareMedsos.setType("text/plain");

            Intent shareIntent = Intent.createChooser(shareMedsos, null);
            startActivity(shareIntent);
        }
    }
}