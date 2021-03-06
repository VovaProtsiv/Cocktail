package com.example.cocktail

import Drink
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cocktail.adapter.DrinksRecyclerViewAdapter
import com.example.cocktailapp.model.ResultResponse
import com.example.cocktailapp.retrofit.RetrofitClient
import com.example.cocktailapp.retrofit.ThecocktaildbApiService
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_search_screen.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SearchScreen : AppCompatActivity(), DrinksRecyclerViewAdapter.DrinkClickListener {

    internal lateinit var jsonApi: ThecocktaildbApiService
    internal lateinit var compositeDisposable: CompositeDisposable
    internal lateinit var adapter: DrinksRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_screen)
        //init API
        val retrofit = RetrofitClient.instance
        jsonApi = retrofit.create(ThecocktaildbApiService::class.java)

        compositeDisposable = CompositeDisposable()
        //view
        recycler_drink.setHasFixedSize(true)
        recycler_drink.layoutManager = GridLayoutManager(this, 2)


        searchCocktail.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

                val editText = findViewById<EditText>(R.id.searchCocktail)
                val message = editText.text
                if (s.isNullOrEmpty()) {
                    displayData(null)
                    findViewById<TextView>(R.id.text_help_search_screen).apply {
                        text = "Enter text to start search"
                    }
                    return
                }

                jsonApi.drinkList(editText.text.toString())
                    .enqueue(object : Callback<ResultResponse> {
                        override fun onFailure(call: Call<ResultResponse>, t: Throwable) {

                        }

                        override fun onResponse(
                            call: Call<ResultResponse>,
                            response: Response<ResultResponse>
                        ) {
                            val drinks = response.body()?.drinks
                            displayData(drinks)
                        }
                    })
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
    }

    fun displayData(drinks: List<Drink>?) {
        if (drinks == null) {
            recycler_drink.adapter = null
            findViewById<TextView>(R.id.text_help_search_screen).apply {
                text = "No cocktails found"
            }
        } else {
            adapter = DrinksRecyclerViewAdapter(this, drinks!!, this)
            recycler_drink.adapter = adapter
        }

    }

    override fun onItemClick(view: View, position: Int) {
        val intent = Intent(this, DetailsActivity::class.java)
        val bundle = Bundle()
        bundle.putParcelable("listDrinks", adapter.drinkList[position])
        intent.putExtras(bundle)
        startActivity(intent)
    }
}


















