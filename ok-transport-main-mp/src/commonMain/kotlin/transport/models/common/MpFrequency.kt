package transport.models.common

import kotlinx.serialization.Serializable

@Serializable
enum class MpFrequency {
    DAILY,
    WEEKLY,
    MONTHLY,
    YEARLY
}
