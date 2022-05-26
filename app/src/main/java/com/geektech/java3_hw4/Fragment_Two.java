package com.geektech.java3_hw4;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class Fragment_Two extends Fragment implements OnClickListenerData {

private RecyclerView recyclerView;
private ArrayList<Music>musics;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.receiter);
        loadData();
        //996
        MuzAdapter adapter = new MuzAdapter(musics,this);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        musics= new ArrayList<>();
        musics.add(new Music("Alan Walker","Faded",1,"3:10"));
        musics.add(new Music("Billie Eilish","Lovely",2,"3:40"));
        musics.add(new Music("Alym996","поисках тишины",3,"2:00"));
        musics.add(new Music("Alum996","правда",4,"3:30"));
        musics.add(new Music("Hammali & Navai"," А если это любовь",1,"3:00"));
        musics.add(new Music("Фогель","ревность",5,"2:20"));
        musics.add(new Music("Bakr","апрельский сирень",6,"3:00"));
        musics.add(new Music("Ulukmanapo","true",7,"3:58"));
        musics.add(new Music("Егор Крид","будильник",8,"3:28"));
        musics.add(new Music("Моргенштерн","Арестократ",9,"3:31"));
        musics.add(new Music("Скриптонит","ламбада",10,"3:38"));

        }

    @Override
    public void onClick(Music music) {
        Intent intent = new Intent(requireActivity(),  MainActivity2.class);
        //intent.putExtra("text",Music.getTextView)
        intent.putExtra("text",music.getIspolnitel());
        startActivity(intent);
    }
}

