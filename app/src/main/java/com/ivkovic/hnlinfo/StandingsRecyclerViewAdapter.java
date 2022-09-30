package com.ivkovic.hnlinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StandingsRecyclerViewAdapter extends RecyclerView.Adapter<StandingsRecyclerViewAdapter.StandingsViewHolder> {

    Context mContext;
    List<Standings> mData;

    public StandingsRecyclerViewAdapter(Context mContext, List<Standings> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public StandingsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_standings, viewGroup, false);
        StandingsViewHolder vHolder = new StandingsViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StandingsViewHolder standingsViewHolder, int i) {

        standingsViewHolder.tv_standings_position.setText(mData.get(i).getPosition());
        standingsViewHolder.tv_standings_club.setText(mData.get(i).getStandingsClub());
        standingsViewHolder.tv_standings_matches.setText(mData.get(i).getMatches());
        standingsViewHolder.tv_standings_wins.setText(mData.get(i).getWins());
        standingsViewHolder.tv_standings_draws.setText(mData.get(i).getDraws());
        standingsViewHolder.tv_standings_losses.setText(mData.get(i).getLosses());
        standingsViewHolder.tv_standings_goals.setText(mData.get(i).getGoals());
        standingsViewHolder.tv_standings_points.setText(mData.get(i).getPoints());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class StandingsViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tv_standings_position;
        private TextView tv_standings_club;
        private TextView tv_standings_matches;
        private TextView tv_standings_wins;
        private TextView tv_standings_draws;
        private TextView tv_standings_losses;
        private TextView tv_standings_goals;
        private TextView tv_standings_points;

        public StandingsViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_standings_position = (TextView) itemView.findViewById(R.id.tv_standings_position);
            tv_standings_club = (TextView) itemView.findViewById(R.id.tv_standings_club);
            tv_standings_matches = (TextView) itemView.findViewById(R.id.tv_standings_matches);
            tv_standings_wins = (TextView) itemView.findViewById(R.id.tv_standings_wins);
            tv_standings_draws = (TextView) itemView.findViewById(R.id.tv_standings_draws);
            tv_standings_losses = (TextView) itemView.findViewById(R.id.tv_standings_losses);
            tv_standings_goals = (TextView) itemView.findViewById(R.id.tv_standings_goals);
            tv_standings_points = (TextView) itemView.findViewById(R.id.tv_standings_points);
        }
    }

}
