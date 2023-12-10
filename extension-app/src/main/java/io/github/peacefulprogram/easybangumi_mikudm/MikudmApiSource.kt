package io.github.peacefulprogram.easybangumi_mikudm

import com.heyanle.extension_api.ExtensionIconSource
import com.heyanle.extension_api.ExtensionSource
import kotlin.reflect.KClass

class MikudmApiSource : ExtensionSource(), ExtensionIconSource {
    override val describe: String
        get() = label
    override val label: String
        get() = "异世界动漫"
    override val version: String
        get() = "1.0"
    override val versionCode: Int
        get() = 1

    override fun getIconResourcesId(): Int = R.drawable.mikudm
    override val sourceKey: String
        get() = "io.github.peacefulprogram.easybangumi_mikudm"

    override fun register(): List<KClass<*>> {
        return listOf(
            MikudmPageComponent::class,
            MikudmSearchComponent::class,
            MikudmDetailComponent::class,
            MikudmPlayComponent::class,
        )
    }
}