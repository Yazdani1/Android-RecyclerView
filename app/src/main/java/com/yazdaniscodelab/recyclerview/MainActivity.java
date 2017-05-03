package com.yazdaniscodelab.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] F_name,D_name;

    int[] img_res=new int[]{

            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,

    };

    ArrayList<DataProvider>arrayList=new ArrayList<DataProvider>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recycler_xml);

        F_name=getResources().getStringArray(R.array.movie_name);
        D_name=getResources().getStringArray(R.array.product_name);

        int i=0;

        for (String name:F_name){

            DataProvider dataProvider=new DataProvider(img_res[i],name,D_name[i]);
            arrayList.add(dataProvider);
            i++;
        }

        adapter=new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
