package com.ivkovic.hnlinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    private List<Club> club;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        club = new ArrayList<>();
        club.add(new Club(R.drawable.dinamo, "GNK Dinamo", "Zagreb", "9. lipnja 1945.", "Maksimir", "35.423", "Mirko Barišić", "Nenad Bjelica", "www.gnkdinamo.hr", R.drawable.dinamo_stadion));
        club.add(new Club(R.drawable.gorica, "HNK Gorica", "Velika Gorica", "2009.", "Gradski stadion", "5.000", "Nenad Črnko", "Sergej Jakirović", "www.hnk-gorica.hr", R.drawable.gorica_stadion));
        club.add(new Club(R.drawable.hajduk, "HNK Hajduk", "Split", "13. veljače 1911.", "Poljud", "34.198", "Jasmin Huljaj", "Siniša Oreščanin", "www.hajduk.hr", R.drawable.hajduk_stadion));
        club.add(new Club(R.drawable.inter, "NK Inter", "Zaprešić", "25. lipnja 1929.", "ŠRC Zaprešić", "5.228", "Branko Laljak", "Samir Toplak", "www.inter.hr", R.drawable.inter_stadion));
        club.add(new Club(R.drawable.istra, "NK Istra 1961", "Pula", "1948.", "Aldo Drosina", "9.800", "Branko Devidé Vincenti", "Krunoslav Rendulić", "www.nkistra1961.hr", R.drawable.istra_stadion));
        club.add(new Club(R.drawable.lokomotiva, "NK Lokomotiva", "Zagreb", "1. svibnja 1914.", "Kranjčevićeva", "5.000", "Tin Dolički", "Goran Tomić", "www.nklokomotiva.hr", R.drawable.lokomotiva_stadion));
        club.add(new Club(R.drawable.osijek, "NK Osijek", "Osijek", "27. veljače 1947.", "Gradski vrt", "18.856", "Ivan Meštrović", "Zoran Zekić", "www.nk-osijek.hr", R.drawable.osijek_stadion));
        club.add(new Club(R.drawable.rijeka, "HNK Rijeka", "Rijeka", "29. srpnja 1946.", "Rujevica", "8.279", "Damir Mišković", "Igor Bišćan", "www.nk-rijeka.hr", R.drawable.rijeka_stadion));
        club.add(new Club(R.drawable.rudes, "NK Rudeš", "Zagreb", "1957.", "Kranjčevićeva", "5.000", "Ivan Knežević", "Tomislav Ivković", "www.nkrudes.com", R.drawable.lokomotiva_stadion));
        club.add(new Club(R.drawable.slaven, "NK Slaven", "Koprivnica", "1907.", "Gradski stadion", "3.134", "Hrvoje Kolarić", "Ivica Sertić", "www.nk-slaven-belupo.hr", R.drawable.slaven_stadion));

        gridView = findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ClubActivity.class);
                intent.putExtra("name", club.get(i).getName());
                intent.putExtra("logo", club.get(i).getLogo());
                intent.putExtra("location", club.get(i).getLocation());
                intent.putExtra("established", club.get(i).getEstablished());
                intent.putExtra("stadium", club.get(i).getStadium());
                intent.putExtra("capacity", club.get(i).getStadiumCapacity());
                intent.putExtra("chairman", club.get(i).getChairman());
                intent.putExtra("manager", club.get(i).getManager());
                intent.putExtra("website", club.get(i).getWebsite());
                intent.putExtra("stadium_photo", club.get(i).getStadiumPhoto());
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return club.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.item_club,null);
            ImageView image = view1.findViewById(R.id.clickable_logo);

            image.setImageResource(club.get(i).getLogo());
            return view1;
        }
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
        switch (item.getItemId())
        {
            case R.id.menu_item_clubs:
                break;
            case R.id.menu_item_statistics:
                Intent intent2 = new Intent(MainActivity.this, StatisticsActivity.class);
                startActivity(intent2);
                break;
            case R.id.menu_item_history:
                Intent intent3 = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent3);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
