package transport.models.common

import kotlinx.serialization.Serializable

@Serializable
enum class MpStatus {
    SUCCESS,
    BAD_REQUEST,
    NOT_FOUND
}
