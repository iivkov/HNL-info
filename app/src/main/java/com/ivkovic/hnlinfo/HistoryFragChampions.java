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

public class HistoryFragChampions extends Fragment {

    View v;
    private RecyclerView champions_recyclerview;
    private List<Champion> champion;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.activity_history_champions, container, false);
        champions_recyclerview = (RecyclerView) v.findViewById(R.id.champion_recyclerview);
        ChampionsRecyclerViewAdapter championsRecyclerAdapter = new ChampionsRecyclerViewAdapter(getContext(), champion);
        champions_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        champions_recyclerview.setAdapter(championsRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        champion = new ArrayList<>();
        champion.add(new Champion("1992.", "Hajduk"));
        champion.add(new Champion("1992./93.", "Croatia"));
        champion.add(new Champion("1993./94.", "Hajduk"));
        champion.add(new Champion("1994./95.", "Hajduk"));
        champion.add(new Champion("1995./96.", "Croatia"));
        champion.add(new Champion("1996./97.", "Croatia"));
        champion.add(new Champion("1997./98.", "Croatia"));
        champion.add(new Champion("1998./99.", "Croatia"));
        champion.add(new Champion("1999./00.", "Dinamo"));
        champion.add(new Champion("2000./01.", "Hajduk"));
        champion.add(new Champion("2001./02.", "Zagreb"));
        champion.add(new Champion("2002./03.", "Dinamo"));
        champion.add(new Champion("2003./04.", "Hajduk"));
        champion.add(new Champion("2004./05.", "Hajduk"));
        champion.add(new Champion("2005./06.", "Dinamo"));
        champion.add(new Champion("2006./07.", "Dinamo"));
        champion.add(new Champion("2007./08.", "Dinamo"));
        champion.add(new Champion("2008./09.", "Dinamo"));
        champion.add(new Champion("2009./10.", "Dinamo"));
        champion.add(new Champion("2010./11.", "Dinamo"));
        champion.add(new Champion("2011./12.", "Dinamo"));
        champion.add(new Champion("2012./13.", "Dinamo"));
        champion.add(new Champion("2013./14.", "Dinamo"));
        champion.add(new Champion("2014./15.", "Dinamo"));
        champion.add(new Champion("2015./16.", "Dinamo"));
        champion.add(new Champion("2016./17.", "Rijeka"));
        champion.add(new Champion("2017./18.", "Dinamo"));
    }
}
