package transport.models.demands

import kotlinx.serialization.Serializable
import transport.models.common.IMpDebug
import transport.models.common.MpWorkMode

@Serializable
data class MpDebug(
        override val mode: MpWorkMode? = null
) : IMpDebug