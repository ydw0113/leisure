package net.skhu.leisure;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MyDataBaseHelper  extends SQLiteOpenHelper {
    private static final String DATABASENAME ="phyDB.db";
    private static final int DATABASE_VERSION =1;
    private MyDataBaseHelper mDBHelper;
    private  Context mCtx;

    public MyDataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASENAME, factory,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DataBases.CreateDB._CREATE0);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super .onOpen(db);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}

