package transport.models.common

import kotlinx.serialization.Serializable

@Serializable
enum class MpWorkMode {
    PROD,
    STUB
}
