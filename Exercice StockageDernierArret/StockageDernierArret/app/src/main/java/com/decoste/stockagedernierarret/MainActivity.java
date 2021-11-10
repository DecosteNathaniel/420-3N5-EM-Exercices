package com.decoste.stockagedernierarret;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.decoste.stockagedernierarret.dao.MaBD;
import com.decoste.stockagedernierarret.modele.DemoDate;

import java.util.Date;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        MaBD bd = Room.databaseBuilder(getApplicationContext(), MaBD.class, "pipo")
                .allowMainThreadQueries()
                .build();

        DemoDate demoDate = new DemoDate();
        demoDate.dateDeFermeture = new Date();
        bd.dao().creerDate(demoDate);

        for(DemoDate a : bd.dao().toutesLesDates()) {
            Log.i("DATEFERMETURE", ">> " + " Fermeture à " + a.dateDeFermeture);
        }

    }
}