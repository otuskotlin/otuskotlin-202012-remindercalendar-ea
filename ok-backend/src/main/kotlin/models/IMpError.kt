package models

data class IMpError(
        val code: String = "",
        val field: String = "",
        val message: String = "",
        val level: ErrorLevel
) enum class ErrorLevel {
    INFO,
    WARNING,
    ERROR
}
