package com.borja.android.analytucscrashlytics.ui

import androidx.lifecycle.ViewModel
import com.borja.android.analytucscrashlytics.data.AnalyticsManager
import com.borja.android.analytucscrashlytics.data.model.AnalyticModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val analyticsManager: AnalyticsManager) :
    ViewModel() {

        fun onLoginSelected(){
            //logica
            analyticsManager.example()
            analyticsManager.example2()

            val analyticModel = AnalyticModel(
                title = "Nuevo evento de dia",
                analyticsString = listOf(Pair("clave","valor"))
            )
            analyticsManager.sendEvent(analyticModel)

        }

}