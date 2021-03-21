package transport.models.demands

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import transport.models.common.IMpDebug
import transport.models.common.IMpRequest
import transport.models.common.MpMessage
import transport.models.common.MpWorkMode

@Serializable
@SerialName("MpRequestDemandUpdate")
data class MpRequestDemandUpdate(
        override val requestId: String? = null,
        override val onRequestId: String? = null,
        override val timeStart: String? = null,
        override val debug: MpDebug? = null,
        val updateData: MpDemandUpdate? = null,
) : IMpRequest, MpMessage()