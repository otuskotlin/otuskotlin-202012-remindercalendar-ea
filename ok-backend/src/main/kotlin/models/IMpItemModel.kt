package models

interface IMpItemModel {
    val id: IMpItemIdModel
    val title: String
    val dateTime: String
    val description: String
    val frequency: FrequencyModel
}