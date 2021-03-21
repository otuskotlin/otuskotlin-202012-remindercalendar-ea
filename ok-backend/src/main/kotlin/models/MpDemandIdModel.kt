package models

data class MpDemandIdModel (
        override val id: String
): IMpItemIdModel {
    companion object {
        val NONE = MpDemandIdModel("")
    }
}