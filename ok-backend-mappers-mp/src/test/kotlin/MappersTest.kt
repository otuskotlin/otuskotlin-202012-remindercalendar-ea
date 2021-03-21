import context.MpBeContext
import models.MpDemandIdModel
import models.MpDemandModel
import org.junit.Test
import transport.models.demands.*
import kotlin.test.assertEquals

class MappersTest {

    @Test
    fun requestDemandCreate() {
        val request = MpRequestDemandCreate(
                createData = MpDemandCreate(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить"
                )
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("Ипотека", context.requestDemand.title)
        assertEquals("2021-03-28T09:00:00", context.requestDemand.dateTime)
        assertEquals("Платить платить и еще раз платить", context.requestDemand.description)
    }

    @Test
    fun requestDemandRead() {
        val request = MpRequestDemandRead(
                demandId = "demand-id"
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("demand-id", context.requestDemandId.id)
    }

    @Test
    fun requestDemandUpdate() {
        val request = MpRequestDemandUpdate(
                updateData = MpDemandUpdate(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                )
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("Ипотека", context.requestDemand.title)
        assertEquals("2021-03-28T09:00:00", context.requestDemand.dateTime)
    }

    @Test
    fun requestDemandDelete() {
        val request = MpRequestDemandDelete(
                demandId = "demand-id"
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("demand-id", context.requestDemandId.id)
    }

    @Test
    fun responseDemandCreate() {
        val request = MpResponseDemandCreate(
                demand = MpDemand(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить"
                )
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("Ипотека", context.requestDemand.title)
        assertEquals("2021-03-28T09:00:00", context.requestDemand.dateTime)
        assertEquals("Платить платить и еще раз платить", context.requestDemand.description)
    }

    @Test
    fun responseDemandRead() {
        val request = MpResponseDemandRead(
                demand = MpDemand(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить"
                )
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("Ипотека", context.requestDemand.title)
        assertEquals("2021-03-28T09:00:00", context.requestDemand.dateTime)
        assertEquals("Платить платить и еще раз платить", context.requestDemand.description)
    }

    @Test
    fun responseDemandUpdate() {
        val request = MpResponseDemandUpdate(
                demand = MpDemand(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить"
                )
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("Ипотека", context.requestDemand.title)
        assertEquals("2021-03-28T09:00:00", context.requestDemand.dateTime)
        assertEquals("Платить платить и еще раз платить", context.requestDemand.description)
    }

    @Test
    fun responseDemandDelete() {
        val request = MpResponseDemandDelete(
                demand = MpDemand(
                        title = "Ипотека",
                        dateTime = "2021-03-28T09:00:00",
                        description = "Платить платить и еще раз платить"
                )
        )

        val context = MpBeContext()

        context.setQuery(request)

        assertEquals("Ипотека", context.requestDemand.title)
        assertEquals("2021-03-28T09:00:00", context.requestDemand.dateTime)
        assertEquals("Платить платить и еще раз платить", context.requestDemand.description)
    }
}

private fun MpBeContext.setQuery(request: MpRequestDemandCreate) {
    requestDemand = MpDemandModel(
            title = request.createData?.title ?: "",
            dateTime = request.createData?.dateTime ?: "",
            description = request.createData?.description ?: ""
    )
}

private fun MpBeContext.setQuery(request: MpRequestDemandRead) {
    requestDemandId = MpDemandIdModel(
            id = request.demandId ?: ""
    )
}

private fun MpBeContext.setQuery(request: MpRequestDemandUpdate) {
    requestDemand = MpDemandModel(
            title = request.updateData?.title ?: "",
            dateTime = request.updateData?.dateTime ?: ""
    )
}

private fun MpBeContext.setQuery(request: MpRequestDemandDelete) {
    requestDemandId = MpDemandIdModel(
            id = request.demandId ?: ""
    )
}

private fun MpBeContext.setQuery(request: MpResponseDemandCreate) {
    requestDemand = MpDemandModel(
            title = request.demand?.title ?: "",
            dateTime = request.demand?.dateTime ?: "",
            description = request.demand?.description ?: ""
    )
}

private fun MpBeContext.setQuery(request: MpResponseDemandRead) {
    requestDemand = MpDemandModel(
            title = request.demand?.title ?: "",
            dateTime = request.demand?.dateTime ?: "",
            description = request.demand?.description ?: ""
    )
}

private fun MpBeContext.setQuery(request: MpResponseDemandUpdate) {
    requestDemand = MpDemandModel(
            title = request.demand?.title ?: "",
            dateTime = request.demand?.dateTime ?: "",
            description = request.demand?.description ?: ""
    )
}

private fun MpBeContext.setQuery(request: MpResponseDemandDelete) {
    requestDemand = MpDemandModel(
            title = request.demand?.title ?: "",
            dateTime = request.demand?.dateTime ?: "",
            description = request.demand?.description ?: ""
    )
}
