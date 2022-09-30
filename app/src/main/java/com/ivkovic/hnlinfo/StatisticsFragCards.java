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

public class StatisticsFragCards extends Fragment {
    View v;
    private RecyclerView cards_recyclerview;
    private List<Cards> cards;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.activity_statistics_cards, container, false);
        cards_recyclerview = (RecyclerView) v.findViewById(R.id.cards_recyclerview);
        CardsRecyclerViewAdapter cardsRecyclerAdapter = new CardsRecyclerViewAdapter(getContext(), cards);
        cards_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        cards_recyclerview.setAdapter(cardsRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cards = new ArrayList<>();
        cards.add(new Cards("1.", "Istra 1961", "56", "2", "1", "60"));
        cards.add(new Cards("2.", "Rudeš", "50", "2", "3", "58"));
        cards.add(new Cards("3.", "Gorica", "54", "1", "1", "57"));
        cards.add(new Cards("4.", "Osijek", "52", "1", "1", "55"));
        cards.add(new Cards("5.", "Slaven", "48", "4", "1", "54"));
        cards.add(new Cards("6.", "Inter", "44", "3", "1", "49"));
        cards.add(new Cards("7.", "Hajduk", "40", "0", "1", "42"));
        cards.add(new Cards("8.", "Dinamo", "40", "1", "0", "41"));
        cards.add(new Cards("9.", "Lokomotiva", "38", "0", "0", "38"));
        cards.add(new Cards("10.", "Rijeka", "33", "2", "1", "37"));
    }
}
