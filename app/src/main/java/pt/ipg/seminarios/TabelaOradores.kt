package pt.ipg.seminarios

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaOradores(db: SQLiteDatabase) : TabelaBD (db, NOME_TABELA) {

    fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA ($CAMPO_ID INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_NOME TEXT NOT NULL, $CAMPO_TITULO TEXT)")
    }

    companion object {
        const val NOME_TABELA = "oradores"
        const val CAMPO_ID = BaseColumns._ID
        const val CAMPO_NOME = "nome"
        const val CAMPO_TITULO = "titulo"
    }
}