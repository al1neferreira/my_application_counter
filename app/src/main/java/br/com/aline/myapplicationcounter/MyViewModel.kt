package br.com.aline.myapplicationcounter


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//Presentantion(layer)
class MyViewModel(private val repository: MyRepository) : ViewModel() {


    fun incrementaUm() {
        repository.contador += 1
    }

    fun getContador(): Int {
        return repository.contador
    }

    companion object {

        val factory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(
                modelClass: Class<T>,
            ): T {
                val repository = MyRepository()
                return MyViewModel(repository) as T
            }
        }
    }
}

//Data (layer
class MyRepository() {
    var contador = 0
}


