package transport.models.demands

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import transport.models.common.*

@Serializable
@SerialName("MpResponseDemandDelete")
data class MpResponseDemandDelete(
        override val responseId: String? = null,
        override val onRequestId: String? = null,
        override val debug: MpDebug? = null,
        override val status: MpStatus? = null,
        override val errors: List<MpError>? = null,
        val demand: MpDemand? = null,
        val deleted: Boolean? = null,
) : IMpResponse, MpMessage()