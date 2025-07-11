rootProject.name = "ClasswallaMeet"
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(":app", ":sdk")

include(":react-native-amplitude")
project(":react-native-amplitude").projectDir = File(rootDir, "../node_modules/@amplitude/analytics-react-native/android")

include(":react-native-async-storage")
project(":react-native-async-storage").projectDir = File(rootDir, "../node_modules/@react-native-async-storage/async-storage/android")

include(":react-native-background-timer")
project(":react-native-background-timer").projectDir = File(rootDir, "../node_modules/react-native-background-timer/android")

include(":react-native-calendar-events")
project(":react-native-calendar-events").projectDir = File(rootDir, "../node_modules/react-native-calendar-events/android")

include(":react-native-community_clipboard")
project(":react-native-community_clipboard").projectDir = File(rootDir, "../node_modules/@react-native-clipboard/clipboard/android")

include(":react-native-community_netinfo")
project(":react-native-community_netinfo").projectDir = File(rootDir, "../node_modules/@react-native-community/netinfo/android")

include(":react-native-default-preference")
project(":react-native-default-preference").projectDir = File(rootDir, "../node_modules/react-native-default-preference/android")

include(":react-native-device-info")
project(":react-native-device-info").projectDir = File(rootDir, "../node_modules/react-native-device-info/android")

include(":react-native-gesture-handler")
project(":react-native-gesture-handler").projectDir = File(rootDir, "../node_modules/react-native-gesture-handler/android")

include(":react-native-get-random-values")
project(":react-native-get-random-values").projectDir = File(rootDir, "../node_modules/react-native-get-random-values/android")

include(":react-native-giphy")
project(":react-native-giphy").projectDir = File(rootDir, "../node_modules/@giphy/react-native-sdk/android")

include(":react-native-google-signin")
project(":react-native-google-signin").projectDir = File(rootDir, "../node_modules/@react-native-google-signin/google-signin/android")

include(":react-native-immersive-mode")
project(":react-native-immersive-mode").projectDir = File(rootDir, "../node_modules/react-native-immersive-mode/android")

include(":react-native-keep-awake")
project(":react-native-keep-awake").projectDir = File(rootDir, "../node_modules/react-native-keep-awake/android")

include(":react-native-orientation-locker")
project(":react-native-orientation-locker").projectDir = File(rootDir, "../node_modules/react-native-orientation-locker/android")

include(":react-native-pager-view")
project(":react-native-pager-view").projectDir = File(rootDir, "../node_modules/react-native-pager-view/android")

include(":react-native-performance")
project(":react-native-performance").projectDir = File(rootDir, "../node_modules/react-native-performance/android")

include(":react-native-safe-area-context")
project(":react-native-safe-area-context").projectDir = File(rootDir, "../node_modules/react-native-safe-area-context/android")

include(":react-native-screens")
project(":react-native-screens").projectDir = File(rootDir, "../node_modules/react-native-screens/android")

include(":react-native-slider")
project(":react-native-slider").projectDir = File(rootDir, "../node_modules/@react-native-community/slider/android")

include(":react-native-sound")
project(":react-native-sound").projectDir = File(rootDir, "../node_modules/react-native-sound/android")

include(":react-native-splash-screen")
project(":react-native-splash-screen").projectDir = File(rootDir, "../node_modules/react-native-splash-screen/android")

include(":react-native-svg")
project(":react-native-svg").projectDir = File(rootDir, "../node_modules/react-native-svg/android")

include(":react-native-video")
project(":react-native-video").projectDir = File(rootDir, "../node_modules/react-native-video/android")

include(":react-native-webrtc")
project(":react-native-webrtc").projectDir = File(rootDir, "../node_modules/react-native-webrtc/android")

include(":react-native-webview")
project(":react-native-webview").projectDir = File(rootDir, "../node_modules/react-native-webview/android")
