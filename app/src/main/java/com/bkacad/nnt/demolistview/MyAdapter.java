package com.bkacad.nnt.demolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private final Context context;
    private final List<Animal> animalList;
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, List<Animal> animalList) {
        this.context = context;
        this.animalList = animalList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animalList.size();
    }

    @Override
    public Object getItem(int position) {
        return animalList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Voi du lieu position i => ung voi itemview o vi tri i

        View view = layoutInflater.inflate(R.layout.item_animal, null, true);
        // Bind Id
        TextView tvName = view.findViewById(R.id.tvAnimalName);
        ImageView imgAnimal = view.findViewById(R.id.imgAnimalImage);
        // Set du lieu
        Animal animal = animalList.get(position);
        tvName.setText(animal.getName());
        Glide.with(context).load(animal.getUrlImage()).into(imgAnimal);
        return view;
    }
}
