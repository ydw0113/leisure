package net.skhu.leisure;

import android.provider.BaseColumns;

public class DataBases{
    public static final class CreateDB implements BaseColumns {
        public static final String index = "index";
        public static final String city = "city";
        public static final String siseol = "siseol";
        public static final String activity = "activity";
        public static final String  img= "img";
        public static final String gymName = "gymName";
        public static final String _TABLENAME0 = "phyDB";
        public static final String _CREATE0 = "create table if not exists "+_TABLENAME0+"("
                +_ID+" integer primary key autoincrement, "
                +index+" integer not null , "
                +city+" text not null , "
                +siseol+" text  , "
                +activity+" text,"
                +img+" text, "
                +gymName+" text not null ) ;";
    }
}

