package pt.ipg.seminarios

import android.content.ContentValues

data class Seminario (var titulo: String, var sumario: String, var _idOrador: Long, var nomeOrador: String, var id: Long = -1) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaSeminarios.CAMPO_TITULO, titulo)
        valores.put(TabelaSeminarios.CAMPO_SUMARIO, sumario)
        valores.put(TabelaSeminarios.CAMPO_ID_ORADOR, _idOrador)

        return valores
    }
}