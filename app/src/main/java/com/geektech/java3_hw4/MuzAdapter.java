package com.geektech.java3_hw4;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MuzAdapter extends RecyclerView.Adapter<MuzAdapter.ViewHolder> {
    private ArrayList<Music> musics;
    private OnClickListenerData listenerData;



    public MuzAdapter(ArrayList<Music> musics, Fragment_Two onClickListenerData) {
        this.musics = musics;
        this.listenerData = onClickListenerData;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_m, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,
                                 //996
                                 @SuppressLint("RecyclerView") int position) {

        holder.bind(musics.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listenerData.onClick(musics.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return musics.size();
    }

    //______________________________________________________________________________________________//
    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView ispolnitel, nazvaniy, numberO, dlit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ispolnitel = itemView.findViewById(R.id.ispolnitel);
            nazvaniy = itemView.findViewById(R.id.title);
            numberO = itemView.findViewById(R.id.one);
            dlit = itemView.findViewById(R.id.vrem);
        }

        public void bind(Music music) {
            ispolnitel.setText(music.getIspolnitel());
            nazvaniy.setText(music.getNazvaniy());
            numberO.setText(String.valueOf(music.getNumberO()));
            dlit.setText(music.getDlit());
        }
    }
}
