package com.ulp.clase04_tp02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Item> list=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarVista();

    }

    private void cargarDatos(){
        list.add(new Item(R.drawable.img01,5));
        list.add(new Item(R.drawable.img02,5));
        list.add(new Item(R.drawable.img03,5));
        list.add(new Item(R.drawable.img04,5));

    }

    private void generarVista(){
        ArrayAdapter<Item> adapter=new AdapterLista(list,this );
        ListView lv=(ListView) findViewById(R.id.milista);
        lv.setAdapter(adapter);
    }

}
