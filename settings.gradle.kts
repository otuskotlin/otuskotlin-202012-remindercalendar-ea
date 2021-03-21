rootProject.name = "otuskotlin-202012-remindercalendar-ea"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
        kotlin("js") version kotlinVersion apply false
        kotlin("multiplatform") version kotlinVersion apply false
        kotlin("plugin.serialization") version kotlinVersion apply false
    }
}

include("ok-helloworld")
include("ok-multiplatform")
include("ok-backend")
include("ok-transport-main-mp")
include("ok-backend-mappers-mp")
