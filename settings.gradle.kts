enableFeaturePreview("GRADLE_METADATA")

include(":utils-internal")
include(":rx")
include(":rx-internal")
include(":mvikotlin")
include(":mvikotlin-test-internal")
include(":mvikotlin-main")
include(":mvikotlin-logging")
include(":mvikotlin-timetravel")
include(":mvikotlin-extensions-reaktive")
include(":mvikotlin-extensions-coroutines")
include(":sample:todo-common")
include(":sample:todo-common-internal")
include(":sample:todo-reaktive")
include(":sample:todo-coroutines")

//include(":tools:check-publication")

doIfBuildTargetAvailable<BuildTarget.Darwin> {
    include(":sample:todo-darwin-umbrella")
}

doIfBuildTargetAvailable<BuildTarget.Android> {
    include(":sample:todo-app-android")
}
