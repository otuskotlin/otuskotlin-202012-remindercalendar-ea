package transport.models.common

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import transport.models.demands.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class ResponseDemandCreateTest {
    @Test
    fun serializationResponseDemandCreateTest() {
        val json = Json {
            prettyPrint = true
            serializersModule = SerializersModule {
                polymorphic(MpMessage::class) {
                    subclass(MpResponseDemandCreate::class, MpResponseDemandCreate.serializer())
                }

            }
            classDiscriminator = "type"
        }

        val dto: MpMessage = MpResponseDemandCreate(
                responseId = "response-id",
                onRequestId = "onRequest-id",
                debug = MpDebug(mode = MpWorkMode.PROD),
                status = MpStatus.SUCCESS,
                errors = listOf(MpError(
                        code = "code",
                        message = "Ошибка",
                        field = "field",
                        level = MpError.ErrorLevelDto.ERROR
                )),
                demand = MpDemand(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить",
                        frequency = MpFrequency.MONTHLY,
                        id = "id",
                        permissions = setOf(MpPermission.UPDATE)
                )
        )

        val serializedString = json.encodeToString(dto)
        println(serializedString)
        assertTrue { serializedString.contains("response-id") }
        val deserializedDto = json.decodeFromString(MpMessage.serializer(), serializedString)
        assertEquals("response-id", (deserializedDto as? MpResponseDemandCreate)?.responseId)
    }
}