package transport.models.common

interface IMpItem : IMpItemUpdate {
    val permissions: Set<MpPermission>?
}