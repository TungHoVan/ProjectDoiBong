package com.example.pc.projectdoibong.adapter;
//Tên packpage để ở số nhiều nhé, là adapters
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pc.projectdoibong.Modols.DoiBong;
import com.example.pc.projectdoibong.R;

import java.util.List;

/**
 * Created by PC on 10/14/2017. Sửa lại tên dev đi nhé
 */

public class DoiBongAdapter extends ArrayAdapter<DoiBong> {
    //Kiếm cái tên nào hay hơn đi, khuyến khích dùng tiếng Anh
    Activity context;
    int resource;
    List<DoiBong> objects;//đổi tên
    //Chuyển về private hết nhé
    //Kết thúc phần khai báo biến, xuống cách một dòng rồi viết tiếp

    public DoiBongAdapter(Activity context, int resource, List<DoiBong> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //trước khi làm việc, nên kiểm tra tính hợp lệ của position
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(resource,null);

        ImageView imgLoGo = (ImageView) row.findViewById(R.id.imageViewLoGo);
        TextView txtTenCauLacBo = (TextView) row.findViewById(R.id.textViewTenCauLacBo);
        TextView txtQuocTich = (TextView) row.findViewById(R.id.textViewQuocTich);

        DoiBong doiBong = objects.get(position);
        imgLoGo.setImageResource(doiBong.getLoGo());
        txtTenCauLacBo.setText(doiBong.getTenCauLacBo());
        txtQuocTich.setText(doiBong.getQuocTich());

        //Không được để trống 2 dòng
        return row;
    }
}
