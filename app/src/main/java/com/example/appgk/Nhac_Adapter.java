package com.example.appgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Nhac_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Nhac> nhacList;

    public Nhac_Adapter(Context context, int layout, List<Nhac> nhacList) {
        this.context = context;
        this.layout = layout;
        this.nhacList = nhacList;
    }

    @Override
    public int getCount() {
        return nhacList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);
        // anh xa
        TextView txt_tenNhac= view.findViewById(R.id.txtTenNhac);
        TextView txt_caSi= view.findViewById(R.id.txtTencaSi);
        TextView txt_nhacSi= view.findViewById(R.id.txtTenNhacSi);
        ImageView img = view.findViewById(R.id.imgHinh);

        Nhac nhac =  nhacList.get(i);
        txt_tenNhac.setText(nhac.getTenNhac());
        txt_caSi.setText(nhac.getTenCaSi());
        txt_nhacSi.setText(nhac.getTacGia());
        img.setImageResource(nhac.getImg());

        return view;
    }
}
