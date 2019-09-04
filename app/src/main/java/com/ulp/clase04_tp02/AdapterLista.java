package com.ulp.clase04_tp02;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import java.util.ArrayList;

public class AdapterLista extends ArrayAdapter<Item> {
ArrayList<Item> list;
  private  Context context;
    public AdapterLista(ArrayList<Item> list, Context context) {
        super(context, R.layout.item,list);
        this.context = context;
        this.list=list;

    }

    public View getView (int position, View convertView, ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            LayoutInflater lf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = lf.inflate(R.layout.item, parent, false);
        }

        Item itemActual = list.get(position);
        ImageView imagen=(ImageView) itemView.findViewById(R.id.imageitem);
        imagen.setImageResource(itemActual.getImagen());
        RatingBar ratingBar= (RatingBar) itemView.findViewById(R.id.ratingitem);
        ratingBar.setNumStars(itemActual.getEstrella());
        return itemView;
    }
}
