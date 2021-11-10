package com.decoste.stockagedernierarret.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.decoste.stockagedernierarret.modele.DemoDate;


@Database(entities = {DemoDate.class},
        version = 1)
@TypeConverters({Converters.class})
public abstract class MaBD   extends RoomDatabase{
    public abstract DemoDAO dao();
}
