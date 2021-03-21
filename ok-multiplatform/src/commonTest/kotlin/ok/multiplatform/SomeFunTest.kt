package ok.multiplatform

import kotlin.test.Test
import kotlin.test.assertTrue

internal class SomeFunTest {
    @Test
    fun someFunTest() {
        assertTrue {
            val str = "SomeFun"
            someFun(str).contains(str)
        }
    }
}