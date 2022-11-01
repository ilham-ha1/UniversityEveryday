package com.example.universityeveryday;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUniversity;
    private ArrayList<University> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       rvUniversity = findViewById(R.id.rv_university);
        rvUniversity.setHasFixedSize(true);

        list.addAll(UniversityData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvUniversity.setLayoutManager(new LinearLayoutManager(this));
        ListUniversityAdapter listUniversityAdapter = new ListUniversityAdapter(list);
        rvUniversity.setAdapter(listUniversityAdapter);

        listUniversityAdapter.setOnItemClickCallback(new ListUniversityAdapter.OnItemClickCallback(){
           @Override
           public void onItemClicked(University university){
               Intent moveIntent = new Intent(MainActivity.this,DetailActivity.class);
               moveIntent.putExtra(DetailActivity.ITEM_EXTRA,university);
               startActivity(moveIntent);
           }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.action_profile){
            Intent moveIntent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }


}