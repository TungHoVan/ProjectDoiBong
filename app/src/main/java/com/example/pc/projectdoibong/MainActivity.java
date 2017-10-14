package com.example.pc.projectdoibong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pc.projectdoibong.Modols.DoiBong;
import com.example.pc.projectdoibong.R;
import com.example.pc.projectdoibong.adapter.DoiBongAdapter;
import com.example.pc.projectdoibong.Modols.DoiBong;
import com.example.pc.projectdoibong.adapter.DoiBongAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvLogo;
    ArrayList<DoiBong> dsDoiBong;
    DoiBongAdapter doiBongAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        lvLogo = (ListView) findViewById(R.id.listviewLogo);
        dsDoiBong = new ArrayList<>();
        dsDoiBong.add(new DoiBong("Asenal","Anh",R.drawable.asenal));
        dsDoiBong.add(new DoiBong("Barcelona","Tây Ban Nha",R.drawable.bacsa));
        dsDoiBong.add(new DoiBong("Bayern Munich","Đức",R.drawable.bayern));
        dsDoiBong.add(new DoiBong("Chelsea","Anh",R.drawable.chelsea));
        dsDoiBong.add(new DoiBong("Borussia Dortmund","Đức",R.drawable.domun));
        dsDoiBong.add(new DoiBong("Italia","Ý",R.drawable.italy));
        dsDoiBong.add(new DoiBong("Juventus","Anh",R.drawable.juventus));
        dsDoiBong.add(new DoiBong("Real Madrid","Tây Ban Nha",R.drawable.real));
        dsDoiBong.add(new DoiBong("Manchester","Anh",R.drawable.u));
        dsDoiBong.add(new DoiBong("Roma","Ý",R.drawable.roma));
        dsDoiBong.add(new DoiBong("VFF","Việt Nam",R.drawable.vff));

        doiBongAdapter = new  DoiBongAdapter(this,R.layout.item_doibong,dsDoiBong);
        lvLogo.setAdapter(doiBongAdapter);


    }

    private void addEvents() {
    }
}
