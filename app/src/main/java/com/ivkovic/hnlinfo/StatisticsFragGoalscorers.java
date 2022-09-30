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

public class StatisticsFragGoalscorers extends Fragment {
    View v;
    private RecyclerView goalscorers_recyclerview;
    private List<Goalscorers> goalscorers;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.activity_statistics_goalscorers, container, false);
        goalscorers_recyclerview = (RecyclerView) v.findViewById(R.id.goalscorers_recyclerview);
        GoalscorersRecyclerViewAdapter goalscorersRecyclerAdapter = new GoalscorersRecyclerViewAdapter(getContext(), goalscorers);
        goalscorers_recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        goalscorers_recyclerview.setAdapter(goalscorersRecyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        goalscorers = new ArrayList<>();
        goalscorers.add(new Goalscorers("10 golova", "Komnen Andrić"));
        goalscorers.add(new Goalscorers("9 golova", "Heber Araujo Dos Santos, Mirko Marić, Lukasz Piotr Zwolinski"));
        goalscorers.add(new Goalscorers("8 golova", "Antonio Mirko Čolak"));
        goalscorers.add(new Goalscorers("7 golova", "Haris Hajradinović, Bruno Petković, Lirim Kastrati, Ivan Krstanović, Iyayi Believe Atiemwen, Ramon Nazareno Mierez"));
        goalscorers.add(new Goalscorers("6 golova", "Jairo De Macedo Da Silva, Mijo Caktaš"));
        goalscorers.add(new Goalscorers("5 golova", "Mario Budimir, Mirko Ivanovski, Mario Gavranović, Myrto Uzuni"));
        goalscorers.add(new Goalscorers("4 gola", "Jean-Philippe Mendy, Ezekiel Isoken Henty, Damian Kadzior, Alexander Gorgon, Mislav Oršić, Dejan Radonjić"));
        goalscorers.add(new Goalscorers("3 gola", "Gabrijel Boban, Petar Bočkaj, Jakov Puljić, Stipe Bačelić Grgić, Tomislav Mrkonjić, Maxwell Boadu Acosty, Regan Obeng, Said Ahmed Said, Robert Perić-Komšić, Luka Ivanušec, Matej Jelić, Ivan Mamut, Roei Gordana"));
        goalscorers.add(new Goalscorers("2 gola", "Izet Hajrović, Mateus Lima Cruz, Faruku Miya, Adam Gyurcso, Joey Suk, Adrian Fuentes Gonzalez, Matko Babić, Bruno Bogojević, Ante Palaversa, Zoran Kvržić, Daniel Olmo Carvajal, Jan Lecjaks, Marko Lešković, Mile Škorić, Mario Marina, Toni Datković, Matija Dvorneković, Tomislav Štrkalj"));
        goalscorers.add(new Goalscorers("1 gol", "Kristijan Lovrić, Marijan Čabraja, Karlo Muhar, Andrej Šimunec, Robert Mudražija, Mateas Delić, Alen Grgić, Domagoj Drožđek, Arijan Ademi, Marin Pilj, Dario Župarić, Marin Grujević, Dino Perić, Tomislav Šorša, Martin Maloča, Mario Musa, Antonio Ivančić, Karlo Kamenar, Zoran Nižić, Domagoj Pavičić, Mario Šitum, Ivan Tomičić, Robert Mišković, Momčilo Raspopović, Amer Gojak, Amir Rrahmani, Stanko Jurić, Renato Pantalon, Borna Petrović, Danijel Lončar, Josip Špoljarić, Dino Halilović, Mario Lovre Vojković, Petar Rubić, Goodness Ohiremen Ajayi, Miloš Vidović, Marin Leovac, Theophilus Solomon, Armin Hodžić, Andrey Falinski Rodrigues, Jose Luis Rodriguez Francis, Daniel Arnaud Ndi, Marko Vukčević, Louis Marie Rodrigue Bongongui, Kevin Theophile Catherine, Julio Cesar Rodriguez Lopez, Stipe Vučur, Marko Burzanović, Gutieri Tomelin, Mario Pavelić"));
    }
}
