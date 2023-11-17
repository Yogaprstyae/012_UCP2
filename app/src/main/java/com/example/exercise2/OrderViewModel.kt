package com.example.exercise2

import androidx.lifecycle.ViewModel
import com.example.exercise2.data.OrderUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(OrderUIState())
    val stateUI: StateFlow<OrderUIState> = _stateUI.asStateFlow()


    fun setDosen1(dosenPilihan: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy( form = dosenPilihan)
        }
    }

    fun setDosen2(dosenPilihan: String) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy( form = dosenPilihan)
        }
    }

    fun setForm(listForm: MutableList<String>) {
        _stateUI.update { stateSaatini ->
            stateSaatini.copy(
                nama = listForm[0],
                nim = listForm[1],
                konsentrasi = listForm[2],
                judul = listForm[3]
            )
        }
    }
}
