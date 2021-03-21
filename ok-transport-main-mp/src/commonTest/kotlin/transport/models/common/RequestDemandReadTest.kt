package transport.models.common

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import transport.models.demands.MpDebug
import transport.models.demands.MpRequestDemandRead
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class RequestDemandReadTest {
    @Test
    fun serializationRequestDemandReadTest() {
        val json = Json {
            prettyPrint = true
            serializersModule = SerializersModule {
                polymorphic(MpMessage::class) {
                    subclass(MpRequestDemandRead::class, MpRequestDemandRead.serializer())
                }

            }
            classDiscriminator = "type"
        }

        val dto: MpMessage = MpRequestDemandRead(
                requestId = "request-id",
                onRequestId = "onRequest-id",
                timeStart = "2021-03-21T09:00:00",
                debug = MpDebug(mode = MpWorkMode.PROD),
                demandId = "demand-id"
        )

        val serializedString = json.encodeToString(dto)
        println(serializedString)
        assertTrue { serializedString.contains("demand-id") }
        val deserializedDto = json.decodeFromString(MpMessage.serializer(), serializedString)
        assertEquals("demand-id", (deserializedDto as? MpRequestDemandRead)?.demandId)
    }
}