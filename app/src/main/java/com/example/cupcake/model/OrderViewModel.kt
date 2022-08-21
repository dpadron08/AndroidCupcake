package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel : ViewModel() {

    private val _quantity = MutableLiveData(0)
    val quantity: LiveData<Int>
        get() = _quantity

    private val _flavor = MutableLiveData("")
    val flavor: LiveData<String>
        get() = _flavor

    private val _date = MutableLiveData("")
    val date: LiveData<String>
        get() = _date

    private val _price = MutableLiveData(0.0)
    val price: LiveData<Double>
        get() = _price

    fun setQuantity(numberCupcakes: Int) {
        _quantity.value = numberCupcakes
    }

    fun setFlavor(desiredFlavor: String) {
        _flavor.value = desiredFlavor
    }

    fun setDate(pickupDate: String) {
        _date.value = pickupDate
    }
}