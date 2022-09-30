package com.ivkovic.hnlinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CardsRecyclerViewAdapter extends RecyclerView.Adapter<CardsRecyclerViewAdapter.CardsViewHolder> {

    Context mContext;
    List<Cards> mData;

    public CardsRecyclerViewAdapter(Context mContext, List<Cards> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CardsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_cards, viewGroup, false);
        CardsViewHolder vHolder = new CardsViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardsViewHolder cardsViewHolder, int i) {

        cardsViewHolder.tv_cards_position.setText(mData.get(i).getPosition());
        cardsViewHolder.tv_cards_club.setText(mData.get(i).getCardsClub());
        cardsViewHolder.tv_cards_yellow.setText(mData.get(i).getYellow());
        cardsViewHolder.tv_cards_second_yellow.setText(mData.get(i).getSecondYellow());
        cardsViewHolder.tv_cards_red.setText(mData.get(i).getRed());
        cardsViewHolder.tv_cards_overall.setText(mData.get(i).getOverall());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class CardsViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tv_cards_position;
        private TextView tv_cards_club;
        private TextView tv_cards_yellow;
        private TextView tv_cards_second_yellow;
        private TextView tv_cards_red;
        private TextView tv_cards_overall;

        public CardsViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_cards_position = (TextView) itemView.findViewById(R.id.tv_cards_position);
            tv_cards_club = (TextView) itemView.findViewById(R.id.tv_cards_club);
            tv_cards_yellow = (TextView) itemView.findViewById(R.id.tv_cards_yellow);
            tv_cards_second_yellow = (TextView) itemView.findViewById(R.id.tv_cards_second_yellow);
            tv_cards_red = (TextView) itemView.findViewById(R.id.tv_cards_red);
            tv_cards_overall = (TextView) itemView.findViewById(R.id.tv_cards_overall);
        }
    }
}
