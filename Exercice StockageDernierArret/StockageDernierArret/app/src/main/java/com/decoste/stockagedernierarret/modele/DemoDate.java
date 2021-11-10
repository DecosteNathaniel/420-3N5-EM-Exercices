package com.decoste.stockagedernierarret.modele;

import java.util.Date;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class DemoDate {
    @PrimaryKey
    public Date dateDeFermeture;
}
