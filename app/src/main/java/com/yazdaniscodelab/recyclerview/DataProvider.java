package com.yazdaniscodelab.recyclerview;

/**
 * Created by Yazdani on 5/3/2017.
 */

public class DataProvider {


    public DataProvider(int img_res,String f_name,String d_name){
        this.setImg_res(img_res);
        this.setF_name(f_name);
        this.setD_name(d_name);
    }


    private int img_res;
    private String f_name;
    private String d_name;

    public int getImg_res(){

        return img_res;
    }

    public void setImg_res(int img_res){

        this.img_res=img_res;
    }

    public String getF_name(){

        return f_name;
    }

    public void setF_name(String f_name){

        this.f_name=f_name;

    }

    public String getD_name(){

        return d_name;

    }

    public void setD_name(String d_name){

        this.d_name=d_name;

    }


}
