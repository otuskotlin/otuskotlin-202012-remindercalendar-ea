package transport.models.demands

import kotlinx.serialization.Serializable
import transport.models.common.IMpItemUpdate
import transport.models.common.MpFrequency

@Serializable
data class MpDemandUpdate(
        override val title: String? = null,
        override val dateTime: String? = null,
        override val description: String? = null,
        override val frequency: MpFrequency? = null,
        override val id: String? = null
) : IMpItemUpdate