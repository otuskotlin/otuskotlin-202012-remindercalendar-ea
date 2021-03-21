package transport.models.common

interface IMpResponse {
    val responseId: String?
    val onRequestId: String?
    val debug: IMpDebug?
    val status: MpStatus?
    val errors: List<MpError>?
}