package pt.ipg.seminarios

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaSeminarios(db: SQLiteDatabase) : TabelaBD(db, NOME_TABELA) {

    fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA ($CAMPO_ID INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_SUMARIO TEXT NOT NULL, $CAMPO_TITULO TEXT)")
    }

    companion object {
        const val NOME_TABELA = "seminarios"
        const val CAMPO_ID = BaseColumns._ID
        const val CAMPO_SUMARIO = "sumario"
        const val CAMPO_TITULO = "titulo"
    }

}