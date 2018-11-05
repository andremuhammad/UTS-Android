package com.farizdotid.mahasiswagundam.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.farizdotid.mahasiswagundam.R;
import com.farizdotid.mahasiswagundam.helper.DBHandler;

public class HomeScreenActivity extends AppCompatActivity {

    private Button button_tambahdata;
    private Button button_lihatdata;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        dbHandler = new DBHandler(HomeScreenActivity.this);
        initComponents();
    }

    private void initComponents(){
        button_tambahdata = (Button) findViewById(R.id.button_tambahdata);
        button_lihatdata = (Button) findViewById(R.id.button_lihatdata);

        button_tambahdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, TambahMahasiswaActivity.class));
            }
        });

        button_lihatdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreenActivity.this, LihatMahasiswaActivity.class));
            }
        });

    }
}
