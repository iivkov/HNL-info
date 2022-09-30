package com.ivkovic.hnlinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class GoalscorersRecyclerViewAdapter extends RecyclerView.Adapter<GoalscorersRecyclerViewAdapter.GoalscorersViewHolder> {
    Context mContext;
    List<Goalscorers> mData;

    public GoalscorersRecyclerViewAdapter(Context mContext, List<Goalscorers> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public GoalscorersRecyclerViewAdapter.GoalscorersViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_goalscorers, viewGroup, false);
        GoalscorersRecyclerViewAdapter.GoalscorersViewHolder vHolder = new GoalscorersRecyclerViewAdapter.GoalscorersViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GoalscorersRecyclerViewAdapter.GoalscorersViewHolder goalscorersViewHolder, int i) {

        goalscorersViewHolder.tv_number_of_goals.setText(mData.get(i).getNumberOfGoals());
        goalscorersViewHolder.tv_players.setText(mData.get(i).getPlayers());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class GoalscorersViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tv_number_of_goals;
        private TextView tv_players;

        public GoalscorersViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_number_of_goals = (TextView) itemView.findViewById(R.id.tv_goalscorers_number_of_goals);
            tv_players = (TextView) itemView.findViewById(R.id.tv_goalscorers_players);
        }
    }
}
