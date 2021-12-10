package pt.ipg.seminarios

import android.database.sqlite.SQLiteDatabase

class TabelaOradores(db: SQLiteDatabase) {
    private val db = db

    public fun cria() {
        db.execSQL(
            "CREATE TABLE oradores (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nome TEXT,NOT NULL" +
                    "titulo TEXT" + ")"
        )
    }
}