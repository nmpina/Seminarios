package pt.ipg.seminarios

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BaseDadosSeminariosOpenHelper(context: Context?) : SQLiteOpenHelper (context,
    NOME_BASE_DADOS, null, VERSAO_BASE_DADOS) {

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        const val NOME_BASE_DADOS = "seminarios.db"
        const val VERSAO_BASE_DADOS = 1
    }

}


