package pt.ipg.seminarios

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase

open class TabelaBD(db: SQLiteDatabase, nomeTabela: String) {
    protected val  db=db;
    protected  val nomeTabela = nomeTabela

    fun insert (values: ContentValues) = db.insert(nomeTabela, null, values)

    fun  update (id: Long, values: ContentValues) = db.update(nomeTabela, values, "${TabelaOradores.CAMPO_ID}=?", arrayOf("$id"))

    fun delete (id: Long) = db.delete(nomeTabela,"${TabelaOradores.CAMPO_ID}=?", arrayOf("$id"))

    fun query(columns: Array<String>, selection: String, selectionArgs: Array<String>, groupBy: String, having: String, orderBy: String ) {
        db.query(nomeTabela, columns, selection, selectionArgs, groupBy, having, orderBy)
    }
}