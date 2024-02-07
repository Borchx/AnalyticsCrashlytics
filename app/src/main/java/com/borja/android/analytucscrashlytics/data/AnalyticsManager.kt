package com.borja.android.analytucscrashlytics.data

import com.borja.android.analytucscrashlytics.data.model.AnalyticModel
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.logEvent
import javax.inject.Inject

class AnalyticsManager @Inject constructor(private val analytics: FirebaseAnalytics) {

    fun example(){
        analytics.logEvent(FirebaseAnalytics.Event.APP_OPEN){
            param(FirebaseAnalytics.Param.SCORE,"100")
        }
    }

    fun example2(){
        analytics.logEvent("Borchx"){
            param("super","pro")
            param("mega",100)
        }
    }

    fun sendEvent(analyticModel: AnalyticModel){
        analytics.logEvent(analyticModel.title){
         analyticModel.analyticsString.map { param(it.first, it.second) }
            analyticModel.analyticsLong.map { param(it.first, it.second) }
            analyticModel.analyticsDouble.map { param(it.first, it.second) }
            analyticModel.analyticsBundle.map { param(it.first, it.second) }
            analyticModel.analyticsBundleArray.map { param(it.first, it.second.toTypedArray()) }

        }
        //superSDK.track(title = analyticModel.title)

    }

}