package com.ivkovic.hnlinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubActivity extends AppCompatActivity {

    TextView clubName, clubLocation, clubEstablished, clubStadium, clubStadiumCapacity, clubChairman, clubManager, clubWebsite;
    ImageView clubLogo, clubStadiumPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        clubName = findViewById(R.id.tv_club_name);
        clubLogo = findViewById(R.id.iv_club_logo);
        clubLocation = findViewById(R.id.tv_club_location);
        clubEstablished = findViewById(R.id.tv_club_established_data);
        clubStadium = findViewById(R.id.tv_club_stadium_data);
        clubStadiumCapacity = findViewById(R.id.tv_club_stadium_capacity_data);
        clubChairman = findViewById(R.id.tv_club_chairman_data);
        clubManager = findViewById(R.id.tv_club_manager_data);
        clubWebsite = findViewById(R.id.tv_club_website_data);
        clubStadiumPhoto = findViewById(R.id.iv_club_stadium);
        Intent intent = getIntent();
        String receivedName = intent.getStringExtra("name");
        int receivedLogo = intent.getIntExtra("logo",0);
        String receivedLocation = intent.getStringExtra("location");
        String receivedEstablished = intent.getStringExtra("established");
        String receivedStadium = intent.getStringExtra("stadium");
        String receivedStadiumCapacity = intent.getStringExtra("capacity");
        String receivedChairman = intent.getStringExtra("chairman");
        String receivedManager = intent.getStringExtra("manager");
        String receivedWebsite = intent.getStringExtra("website");
        int receivedStadiumPhoto = intent.getIntExtra("stadium_photo",0);
        clubName.setText(receivedName);
        clubLogo.setImageResource(receivedLogo);
        clubLocation.setText(receivedLocation);
        clubEstablished.setText(receivedEstablished);
        clubStadium.setText(receivedStadium);
        clubStadiumCapacity.setText(receivedStadiumCapacity);
        clubChairman.setText(receivedChairman);
        clubManager.setText(receivedManager);
        clubWebsite.setText(receivedWebsite);
        clubStadiumPhoto.setImageResource(receivedStadiumPhoto);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }

        switch (item.getItemId())
        {
            case R.id.menu_item_clubs:
                Intent intent1 = new Intent(ClubActivity.this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.menu_item_statistics:
                Intent intent2 = new Intent(ClubActivity.this, StatisticsActivity.class);
                startActivity(intent2);
                break;
            case R.id.menu_item_history:
                Intent intent3 = new Intent(ClubActivity.this, HistoryActivity.class);
                startActivity(intent3);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
