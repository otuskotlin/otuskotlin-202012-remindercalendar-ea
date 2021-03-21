package transport.models.demands

import kotlinx.serialization.Serializable
import transport.models.common.IMpItem
import transport.models.common.MpFrequency
import transport.models.common.MpPermission

@Serializable
data class MpDemand(
        override val title: String? = null,
        override val dateTime: String? = null,
        override val description: String? = null,
        override val frequency: MpFrequency? = null,
        override val id: String? = null,
        override val permissions: Set<MpPermission>? = null,
) : IMpItem