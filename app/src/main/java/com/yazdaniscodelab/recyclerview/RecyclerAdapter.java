package com.yazdaniscodelab.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yazdani on 5/3/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myRecyclerViewHolder> {

    private ArrayList<DataProvider> arrayList=new ArrayList<DataProvider>();

    public RecyclerAdapter(ArrayList<DataProvider> arrayList){

        this.arrayList=arrayList;

    }


    @Override
    public myRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);


        myRecyclerViewHolder myviewholder=new myRecyclerViewHolder(myview);

        return myviewholder;
    }

    @Override
    public void onBindViewHolder(myRecyclerViewHolder holder, int position) {

        DataProvider dataprovider=arrayList.get(position);

        holder.imageView.setImageResource(dataprovider.getImg_res());
        holder.f_name.setText(dataprovider.getF_name());
        holder.d_name.setText(dataprovider.getD_name());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class myRecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView f_name;
        TextView d_name;

        public myRecyclerViewHolder(View view){

            super(view);

            imageView=(ImageView)view.findViewById(R.id.image_xml);
            f_name=(TextView)view.findViewById(R.id.textf_xml);
            d_name=(TextView)view.findViewById(R.id.textL_xml);

        }


    }



}
