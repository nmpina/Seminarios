package pt.ipg.seminarios

import android.database.sqlite.SQLiteDatabase
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class BDSeminariosTest {

    private fun getContext() = InstrumentationRegistry.getInstrumentation().targetContext

    private fun getWritableDatabase(): SQLiteDatabase {
        val bdOpenHelper = BaseDadosSeminariosOpenHelper(getContext())
        return bdOpenHelper.writableDatabase
    }

    private fun insereOrador( tabelaOradores: TabelaOradores, orador: Orador ) : Long {
        val id = tabelaOradores.insert(orador.toContentValues())

        assertNotEquals(-1, id)
        return id
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("pt.ipg.seminarios", appContext.packageName)
    }

    @Before
    fun apagaBaseDados(){
        getContext().deleteDatabase(BaseDadosSeminariosOpenHelper.NOME_BASE_DADOS)
    }

    @Test
    fun consegueCriarAbrirBaseDados() {
        val bdOpenHelper= BaseDadosSeminariosOpenHelper(getContext())
        val bd = bdOpenHelper.readableDatabase
        assert(bd.isOpen)
    }

    @Test
    fun consegueInserirOrador() {
        val bd = getWritableDatabase()

        insereOrador(TabelaOradores(bd), Orador("Fábio Marques", "Sr."))
        bd.close()
    }



    @Test
    fun consegueEliminarOrador() {
        val bd = getWritableDatabase()
        insereOrador(TabelaOradores(bd), Orador("Anonimo", ""))
        bd.close()
    }
}