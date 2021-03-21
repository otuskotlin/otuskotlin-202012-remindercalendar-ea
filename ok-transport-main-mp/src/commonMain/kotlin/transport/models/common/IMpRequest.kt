package transport.models.common

interface IMpRequest {
    val requestId: String?
    val onRequestId: String?
    val timeStart: String?
    val debug: IMpDebug?
}