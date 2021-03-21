package transport.models.demands

import kotlinx.serialization.Serializable
import transport.models.common.IMpItemCreate
import transport.models.common.MpFrequency

@Serializable
data class MpDemandCreate(
        override val title: String? = null,
        override val dateTime: String? = null,
        override val description: String? = null,
        override val frequency: MpFrequency? = null
) : IMpItemCreate