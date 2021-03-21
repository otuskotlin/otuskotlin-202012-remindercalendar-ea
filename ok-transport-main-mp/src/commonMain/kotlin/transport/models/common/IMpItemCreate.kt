package transport.models.common

interface IMpItemCreate {
    val title: String?
    val dateTime: String?
    val description: String?
    val frequency: MpFrequency?
}