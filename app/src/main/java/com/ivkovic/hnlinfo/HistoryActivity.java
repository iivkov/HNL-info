package com.ivkovic.hnlinfo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HistoryActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        initViews();
        setUpPager();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initViews()
    {
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tab);
    }

    private void setUpPager()
    {
        PagerAdapter pagerAdapter = new HistoryPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
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
                Intent intent1 = new Intent(HistoryActivity.this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.menu_item_statistics:
                Intent intent2 = new Intent(HistoryActivity.this, StatisticsActivity.class);
                startActivity(intent2);
                break;
            case R.id.menu_item_history:
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
