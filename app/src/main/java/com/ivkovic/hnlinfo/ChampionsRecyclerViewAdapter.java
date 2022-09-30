package com.ivkovic.hnlinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ChampionsRecyclerViewAdapter extends RecyclerView.Adapter<ChampionsRecyclerViewAdapter.ChampionsViewHolder> {

    Context mContext;
    List<Champion> mData;

    public ChampionsRecyclerViewAdapter(Context mContext, List<Champion> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ChampionsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_champion, viewGroup, false);
        ChampionsViewHolder vHolder = new ChampionsViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChampionsViewHolder championsViewHolder, int i) {

        championsViewHolder.tv_season.setText(mData.get(i).getSeason());
        championsViewHolder.tv_champion_club.setText(mData.get(i).getChampionClub());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ChampionsViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tv_season;
        private TextView tv_champion_club;

        public ChampionsViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_season = (TextView) itemView.findViewById(R.id.tv_season);
            tv_champion_club = (TextView) itemView.findViewById(R.id.tv_champion_club);
        }
    }

}
