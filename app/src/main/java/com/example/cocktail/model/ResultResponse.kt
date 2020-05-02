package com.example.cocktailapp.model

import Drink
import android.os.Parcel
import android.os.Parcelable

data class ResultResponse(
    val drinks: List<Drink>?
) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.createTypedArrayList(Drink)) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeTypedList(drinks)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ResultResponse> {
        override fun createFromParcel(parcel: Parcel): ResultResponse {
            return ResultResponse(parcel)
        }

        override fun newArray(size: Int): Array<ResultResponse?> {
            return arrayOfNulls(size)
        }
    }
}