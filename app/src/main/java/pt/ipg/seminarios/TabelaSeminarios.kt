package pt.ipg.seminarios

import android.database.sqlite.SQLiteDatabase

class TabelaSeminarios(db: SQLiteDatabase) : TabelaBD(db, NOME_TABELA) {

    fun cria() {
        db.execSQL("CREATE TABLE $NOME_TABELA($CAMPO_ID INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_TITULO TEXT NOT NULL, $CAMPO_SUMARIO TEXT NOT NULL, $CAMPO_ID_ORADOR INTEGER NOT NULL, FOREIGN KEY($CAMPO_ID_ORADOR) REFERENCES ${TabelaOradores.NOME_TABELA}(${CAMPO_ID}))")
    }

    companion object {
        const val NOME_TABELA = "seminarios"
        const val CAMPO_ID_ORADOR = "id_orador"
        const val CAMPO_SUMARIO = "sumario"
        const val CAMPO_TITULO = "titulo"
    }

}