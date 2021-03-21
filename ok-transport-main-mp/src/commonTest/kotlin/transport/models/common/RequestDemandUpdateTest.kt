package transport.models.common

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import transport.models.demands.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RequestDemandUpdateTest {
    @Test
    fun serializationRequestDemandUpdateTest() {
        val json = Json {
            prettyPrint = true
            serializersModule = SerializersModule {
                polymorphic(MpMessage::class) {
                    subclass(MpRequestDemandUpdate::class, MpRequestDemandUpdate.serializer())
                }

            }
            classDiscriminator = "type"
        }

        val dto: MpMessage = MpRequestDemandUpdate(
                requestId = "request-id",
                onRequestId = "onRequest-id",
                timeStart = "2021-03-21T09:00:00",
                debug = MpDebug(mode = MpWorkMode.PROD),
                updateData = MpDemandUpdate(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить",
                        frequency = MpFrequency.MONTHLY,
                        id = "id"
                )
        )

        val serializedString = json.encodeToString(dto)
        println(serializedString)
        assertTrue { serializedString.contains("request-id") }
        val deserializedDto = json.decodeFromString(MpMessage.serializer(), serializedString)
        assertEquals("request-id", (deserializedDto as? MpRequestDemandUpdate)?.requestId)
    }
}