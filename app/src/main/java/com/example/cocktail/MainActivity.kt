package com.example.cocktail

import Drink
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cocktail.adapter.DrinksRecyclerViewAdapter
import com.example.cocktail.dao.DbHelper
import com.example.cocktail.dao.DbHelper.Companion.TABLE_DRINKS
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DrinksRecyclerViewAdapter.DrinkClickListener {
    internal lateinit var adapter: DrinksRecyclerViewAdapter
    internal lateinit var dbHelper: DbHelper
    internal lateinit var listDrink: ArrayList<Drink>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listDrink = ArrayList<Drink>()

        main_recycler_drink.setHasFixedSize(true)
        main_recycler_drink.layoutManager = GridLayoutManager(this, 2)

        dbHelper = DbHelper(this, DbHelper.DATABASE_NAME, DbHelper.DATABASE_VERSION)
        val writableDatabase = dbHelper.writableDatabase
        //writableDatabase.execSQL("drop table if exists $TABLE_DRINKS")
       //dbHelper.onCreate(writableDatabase)
        val cursor = writableDatabase.query(TABLE_DRINKS, null, null, null, null, null, null)

        //writableDatabase.delete(TABLE_DRINKS,null,null)
        if (cursor.moveToFirst()  ) {
            Log.d("start", cursor.count.toString())
            val columnIndexID = cursor.getColumnIndex(DbHelper.KEY_ID)

            val columnIndexNAME = cursor.getColumnIndex(DbHelper.KEY_NAME)

            val columnIndexIMAGE = cursor.getColumnIndex(DbHelper.KEY_IMAGE)

            val columnIndexALCOHOLIC = cursor.getColumnIndex(DbHelper.KEY_ALCOHOLIC)

            val columnIndexGLASS = cursor.getColumnIndex(DbHelper.KEY_GLASS)
            Log.d("columnIndexGLASS", columnIndexGLASS.toString())
            val columnIndexINSTRUCTIONS = cursor.getColumnIndex(DbHelper.KEY_INSTRUCTIONS)
            val columnIndexINGREDIENT1 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT1)
            val columnIndexINGREDIENT2 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT2)
            val columnIndexINGREDIENT3 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT3)
            val columnIndexINGREDIENT4 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT4)
            val columnIndexINGREDIENT5 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT5)
            val columnIndexINGREDIENT6 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT6)
            val columnIndexINGREDIENT7 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT7)
            val columnIndexINGREDIENT8 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT8)
            val columnIndexINGREDIENT9 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT9)
            val columnIndexINGREDIENT10 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT10)
            val columnIndexINGREDIENT11 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT11)
            val columnIndexINGREDIENT12 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT12)
            val columnIndexINGREDIENT13 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT13)
            val columnIndexINGREDIENT14 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT14)
            val columnIndexINGREDIENT15 = cursor.getColumnIndex(DbHelper.KEY_INGREDIENT15)
            val columnIndexMEASURE1 = cursor.getColumnIndex(DbHelper.KEY_MEASURE1)
            val columnIndexMEASURE2 = cursor.getColumnIndex(DbHelper.KEY_MEASURE2)
            val columnIndexMEASURE3 = cursor.getColumnIndex(DbHelper.KEY_MEASURE3)
            val columnIndexMEASURE4 = cursor.getColumnIndex(DbHelper.KEY_MEASURE4)
            val columnIndexMEASURE5 = cursor.getColumnIndex(DbHelper.KEY_MEASURE5)
            val columnIndexMEASURE6 = cursor.getColumnIndex(DbHelper.KEY_MEASURE6)
            val columnIndexMEASURE7 = cursor.getColumnIndex(DbHelper.KEY_MEASURE7)
            val columnIndexMEASURE8 = cursor.getColumnIndex(DbHelper.KEY_MEASURE8)
            val columnIndexMEASURE9 = cursor.getColumnIndex(DbHelper.KEY_MEASURE9)
            val columnIndexMEASURE10 = cursor.getColumnIndex(DbHelper.KEY_MEASURE10)
            val columnIndexMEASURE11 = cursor.getColumnIndex(DbHelper.KEY_MEASURE11)
            val columnIndexMEASURE12 = cursor.getColumnIndex(DbHelper.KEY_MEASURE12)
            val columnIndexMEASURE13 = cursor.getColumnIndex(DbHelper.KEY_MEASURE13)
            val columnIndexMEASURE14 = cursor.getColumnIndex(DbHelper.KEY_MEASURE14)
            val columnIndexMEASURE15 = cursor.getColumnIndex(DbHelper.KEY_MEASURE15)
            Log.d("end", cursor.count.toString())
            do {
                val drink = Drink(
                    cursor.getString(columnIndexID),
                    cursor.getString(columnIndexNAME),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    cursor.getString(columnIndexALCOHOLIC),
                    cursor.getString(columnIndexGLASS),
                    cursor.getString(columnIndexINSTRUCTIONS),
                    null,
                    null,
                    null,
                    null,
                    null,
                    cursor.getString(columnIndexIMAGE),
                    cursor.getString(columnIndexINGREDIENT1),
                    cursor.getString(columnIndexINGREDIENT2),
                    cursor.getString(columnIndexINGREDIENT3),
                    cursor.getString(columnIndexINGREDIENT4),
                    cursor.getString(columnIndexINGREDIENT5),
                    cursor.getString(columnIndexINGREDIENT6),
                    cursor.getString(columnIndexINGREDIENT7),
                    cursor.getString(columnIndexINGREDIENT8),
                    cursor.getString(columnIndexINGREDIENT9),
                    cursor.getString(columnIndexINGREDIENT10),
                    cursor.getString(columnIndexINGREDIENT11),
                    cursor.getString(columnIndexINGREDIENT12),
                    cursor.getString(columnIndexINGREDIENT13),
                    cursor.getString(columnIndexINGREDIENT14),
                    cursor.getString(columnIndexINGREDIENT15),
                    cursor.getString(columnIndexMEASURE1),
                    cursor.getString(columnIndexMEASURE2),
                    cursor.getString(columnIndexMEASURE3),
                    cursor.getString(columnIndexMEASURE4),
                    cursor.getString(columnIndexMEASURE5),
                    cursor.getString(columnIndexMEASURE6),
                    cursor.getString(columnIndexMEASURE7),
                    cursor.getString(columnIndexMEASURE8),
                    cursor.getString(columnIndexMEASURE9),
                    cursor.getString(columnIndexMEASURE10),
                    cursor.getString(columnIndexMEASURE11),
                    cursor.getString(columnIndexMEASURE12),
                    cursor.getString(columnIndexMEASURE13),
                    cursor.getString(columnIndexMEASURE14),
                    cursor.getString(columnIndexMEASURE15),
                    null,
                    null
                )
                listDrink.add(drink)
            } while (cursor.moveToNext())
        }

        cursor.close()
if(listDrink.isNotEmpty()) {
    displayData(listDrink)
}
    }

    fun changeActivity(view: View) {
        val intent = Intent(this, SearchScreen::class.java)
        startActivity(intent)
    }

    fun displayData(drinks: List<Drink>?) {
        adapter = DrinksRecyclerViewAdapter(this, drinks!!, this)
        main_recycler_drink.adapter = adapter

    }

    override fun onItemClick(view: View, position: Int) {
        val intent = Intent(this, DetailsActivity::class.java)
        val bundle = Bundle()
        bundle.putParcelable("listDrinks", adapter.drinkList[position])
        intent.putExtras(bundle)
        startActivity(intent)
    }


}
