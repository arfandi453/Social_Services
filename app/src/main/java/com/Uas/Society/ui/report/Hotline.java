package com.Uas.Society.ui.report;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.Uas.Society.R;

public class Hotline extends AppCompatActivity {
public ImageView polisi,pemadam,ambulan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotline);

        ImageView tlp =(ImageView)findViewById(R.id.polisi);
        ImageView tlp_p =(ImageView)findViewById(R.id.pemadam);
        ImageView tlp_a =(ImageView)findViewById(R.id.ambulance);

        tlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tlp = new Intent();
                tlp.setAction(Intent.ACTION_DIAL);
                tlp.setData(Uri.parse("tel: 110"));
                if(tlp.resolveActivity(getPackageManager())!=null)
                    startActivity(tlp);

            }
        });
        tlp_p.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent tlp_p = new Intent();
            tlp_p.setAction(Intent.ACTION_DIAL);
            tlp_p.setData(Uri.parse("tel: 113"));
            if(tlp_p.resolveActivity(getPackageManager())!=null)
                startActivity(tlp_p);

        }
    });
        tlp_a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent tlp_a = new Intent();
                tlp_a.setAction(Intent.ACTION_DIAL);
                tlp_a.setData(Uri.parse("tel: 118"));
                if(tlp_a.resolveActivity(getPackageManager())!=null)
                    startActivity(tlp_a);

            }
        });
    }
    }