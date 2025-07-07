package com.amranemon.kinakata

interface CartListener {

    fun showCartLayout(itemCount : Int)

    fun savinCartItemCount(itemCount: Int)

    fun hideCartLayout()

}