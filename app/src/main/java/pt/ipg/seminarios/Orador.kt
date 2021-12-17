package pt.ipg.seminarios

import android.content.ContentValues

data class Orador (var nome: String, var titulo : String?, var  id: Long = -1) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaOradores.CAMPO_NOME, nome)
        valores.put(TabelaOradores.CAMPO_TITULO, titulo)

        return valores
    }
}
