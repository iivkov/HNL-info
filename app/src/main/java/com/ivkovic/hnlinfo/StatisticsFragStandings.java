package com.ivkovic.hnlinfo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class StatisticsFragStandings extends Fragment {
    View v;
    private RecyclerView standings_recyclerview;
    private List<Standings> standings;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.activity_statistics_standings, container, false);
        standings_recyclerview = (RecyclerView) v.findViewById(R.id.standings_recyclerview);
        StandingsRecyclerViewAdapter standingsRecyclerAdapter = new StandingsRecyclerViewAdapter(getContext(), standings);
        standings_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        standings_recyclerview.setAdapter(standingsRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        standings = new ArrayList<>();
        standings.add(new Standings("1.", "Dinamo", "19", "15", "3", "1", "39:11", "48"));
        standings.add(new Standings("2.", "Osijek", "19", "10", "4", "5", "38:19", "34"));
        standings.add(new Standings("3.", "Lokomotiva", "19", "10", "4", "5", "34:18", "34"));
        standings.add(new Standings("4.", "Rijeka", "19", "9", "7", "3", "33:20", "34"));
        standings.add(new Standings("5.", "Gorica", "19", "9", "3", "7", "26:23", "30"));
        standings.add(new Standings("6.", "Hajduk", "19", "6", "8", "5", "28:25", "26"));
        standings.add(new Standings("7.", "Slaven", "19", "2", "12", "5", "21:27", "18"));
        standings.add(new Standings("8.", "Inter", "19", "5", "2", "12", "20:43", "17"));
        standings.add(new Standings("9.", "Istra 1961", "19", "4", "4", "11", "21:36", "16"));
        standings.add(new Standings("10.", "Rudeš", "19", "0", "3", "16", "12:50", "3"));

    }
}
