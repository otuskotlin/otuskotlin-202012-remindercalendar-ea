package transport.models.common

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import transport.models.demands.MpDebug
import transport.models.demands.MpDemandCreate
import transport.models.demands.MpRequestDemandCreate
import transport.models.demands.MpRequestDemandRead
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RequestDemandCreateTest {
    @Test
    fun serializationRequestDemandCreateTest() {
        val json = Json {
            prettyPrint = true
            serializersModule = SerializersModule {
                polymorphic(MpMessage::class) {
                    subclass(MpRequestDemandCreate::class, MpRequestDemandCreate.serializer())
                }

            }
            classDiscriminator = "type"
        }

        val dto: MpMessage = MpRequestDemandCreate(
                requestId = "request-id",
                onRequestId = "onRequest-id",
                timeStart = "2021-03-21T09:00:00",
                debug = MpDebug(mode = MpWorkMode.STUB),
                createData = MpDemandCreate(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить",
                        frequency = MpFrequency.MONTHLY
                )
        )

        val serializedString = json.encodeToString(dto)
        println(serializedString)
        assertTrue { serializedString.contains("request-id") }
        val deserializedDto = json.decodeFromString(MpMessage.serializer(), serializedString)
        assertEquals("request-id", (deserializedDto as? MpRequestDemandCreate)?.requestId)
    }
}