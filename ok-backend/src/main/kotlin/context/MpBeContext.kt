package context

import models.IMpError
import models.MpDemandIdModel
import models.MpDemandModel

data class MpBeContext(
        var errors: List<IMpError> = listOf(),

        var requestDemandId: MpDemandIdModel = MpDemandIdModel.NONE,
        var requestDemand: MpDemandModel = MpDemandModel.NONE,
        var responseDemand: MpDemandModel = MpDemandModel.NONE
)
