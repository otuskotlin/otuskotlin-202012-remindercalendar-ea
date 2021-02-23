import ok.multiplatform.SharedModel
import kotlin.test.Test
import kotlin.test.assertEquals

internal class SharedModelTest {
    @Test
    fun sharedModelTest() {
        val sm =SharedModel("id-1", "name-1")
        assertEquals("id-1", sm.id)
        assertEquals("name-1", sm.name)
    }
}