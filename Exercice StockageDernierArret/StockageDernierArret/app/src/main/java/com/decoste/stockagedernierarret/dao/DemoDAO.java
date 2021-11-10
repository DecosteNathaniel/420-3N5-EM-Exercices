package com.decoste.stockagedernierarret.dao;

import com.decoste.stockagedernierarret.modele.DemoDate;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DemoDAO {

    @Insert
    Long creerDate(DemoDate demoDate);

    @Query("SELECT * FROM DemoDate")
    List<DemoDate> toutesLesDates();

}