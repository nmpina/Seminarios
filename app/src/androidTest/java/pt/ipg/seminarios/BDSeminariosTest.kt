package pt.ipg.seminarios

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

    private fun getContext() = InstrumentationRegistry.getInstrumentation().targetContext

    @Test
    fun consegueCriarAbrirBaseDados() {
        val bdOpenHelper= BaseDadosSeminariosOpenHelper(getContext())
        val bd = bdOpenHelper.readableDatabase
        assert(bd.isOpen)
    }
}