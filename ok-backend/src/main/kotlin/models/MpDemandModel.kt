package models

data class MpDemandModel (
        override val id: MpDemandIdModel = MpDemandIdModel.NONE,
        override val title: String = "",
        override val dateTime: String = "",
        override val description: String = "",
        override val frequency: FrequencyModel = FrequencyModel.MONTHLY
): IMpItemModel {
    companion object {
        val NONE = MpDemandModel()
    }
}
