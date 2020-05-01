package com.example.cocktailapp.retrofit


import com.example.cocktailapp.model.ResultResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ThecocktaildbApiService {
  @GET("search.php")
     fun drinkList(@Query("s") strDrink : String): Call<ResultResponse>

}