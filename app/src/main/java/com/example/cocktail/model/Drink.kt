import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

import androidx.room.Entity

@Entity
data class Drink (

    @ColumnInfo(name = "idDrink") @SerializedName("idDrink") val idDrink : Int,
    @ColumnInfo(name = "strDrink") @SerializedName("strDrink") val strDrink : String?,
    @ColumnInfo(name = "strDrinkAlternate") @SerializedName("strDrinkAlternate") val strDrinkAlternate : String?,
    @ColumnInfo(name = "strDrinkES") @SerializedName("strDrinkES") val strDrinkES : String?,
    @ColumnInfo(name = "strDrinkDE") @SerializedName("strDrinkDE") val strDrinkDE : String?,
    @ColumnInfo(name = "strDrinkFR") @SerializedName("strDrinkFR") val strDrinkFR : String?,
    @ColumnInfo(name = "strDrinkZH-HANS") @SerializedName("strDrinkZH-HANS") val strDrinkZH_HANS : String?,
    @ColumnInfo(name = "strDrinkZH-HANT") @SerializedName("strDrinkZH-HANT") val strDrinkZH_HANT : String?,
    @ColumnInfo(name = "strTags") @SerializedName("strTags") val strTags : String?,
    @ColumnInfo(name = "strVideo") @SerializedName("strVideo") val strVideo : String?,
    @ColumnInfo(name = "strCategory") @SerializedName("strCategory") val strCategory : String?,
    @ColumnInfo(name = "strIBA") @SerializedName("strIBA") val strIBA : String?,
    @ColumnInfo(name = "strAlcoholic") @SerializedName("strAlcoholic") val strAlcoholic : String?,
    @ColumnInfo(name = "strGlass") @SerializedName("strGlass") val strGlass : String?,
    @ColumnInfo(name = "strInstructions") @SerializedName("strInstructions") val strInstructions : String?,
    @ColumnInfo(name = "strInstructionsES") @SerializedName("strInstructionsES") val strInstructionsES : String?,
    @ColumnInfo(name = "strInstructionsDE") @SerializedName("strInstructionsDE") val strInstructionsDE : String?,
    @ColumnInfo(name = "strInstructionsFR") @SerializedName("strInstructionsFR") val strInstructionsFR : String?,
    @ColumnInfo(name = "strInstructionsZH-HANS") @SerializedName("strInstructionsZH-HANS") val strInstructionsZH_HANS : String?,
    @ColumnInfo(name = "strInstructionsZH-HANT") @SerializedName("strInstructionsZH-HANT") val strInstructionsZH_HANT : String?,
    @ColumnInfo(name = "strDrinkThumb") @SerializedName("strDrinkThumb") val strDrinkThumb : String?,
    @ColumnInfo(name = "strIngredient1") @SerializedName("strIngredient1") val strIngredient1 : String?,
    @ColumnInfo(name = "strIngredient2") @SerializedName("strIngredient2") val strIngredient2 : String?,
    @ColumnInfo(name = "strIngredient3") @SerializedName("strIngredient3") val strIngredient3 : String?,
    @ColumnInfo(name = "strIngredient4") @SerializedName("strIngredient4") val strIngredient4 : String?,
    @ColumnInfo(name = "strIngredient5") @SerializedName("strIngredient5") val strIngredient5 : String?,
    @ColumnInfo(name = "strIngredient6") @SerializedName("strIngredient6") val strIngredient6 : String?,
    @ColumnInfo(name = "strIngredient7") @SerializedName("strIngredient7") val strIngredient7 : String?,
    @ColumnInfo(name = "strIngredient8") @SerializedName("strIngredient8") val strIngredient8 : String?,
    @ColumnInfo(name = "strIngredient9") @SerializedName("strIngredient9") val strIngredient9 : String?,
    @ColumnInfo(name = "strIngredient10") @SerializedName("strIngredient10") val strIngredient10 : String?,
    @ColumnInfo(name = "strIngredient11") @SerializedName("strIngredient11") val strIngredient11 : String?,
    @ColumnInfo(name = "strIngredient12") @SerializedName("strIngredient12") val strIngredient12 : String?,
    @ColumnInfo(name = "strIngredient13") @SerializedName("strIngredient13") val strIngredient13 : String?,
    @ColumnInfo(name = "strIngredient14") @SerializedName("strIngredient14") val strIngredient14 : String?,
    @ColumnInfo(name = "strIngredient15") @SerializedName("strIngredient15") val strIngredient15 : String?,
    @ColumnInfo(name = "strMeasure1") @SerializedName("strMeasure1") val strMeasure1 : String?,
    @ColumnInfo(name = "strMeasure2") @SerializedName("strMeasure2") val strMeasure2 : String?,
    @ColumnInfo(name = "strMeasure3") @SerializedName("strMeasure3") val strMeasure3 : String?,
    @ColumnInfo(name = "strMeasure4") @SerializedName("strMeasure4") val strMeasure4 : String?,
    @ColumnInfo(name = "strMeasure5") @SerializedName("strMeasure5") val strMeasure5 : String?,
    @ColumnInfo(name = "strMeasure6") @SerializedName("strMeasure6") val strMeasure6 : String?,
    @ColumnInfo(name = "strMeasure7") @SerializedName("strMeasure7") val strMeasure7 : String?,
    @ColumnInfo(name = "strMeasure8") @SerializedName("strMeasure8") val strMeasure8 : String?,
    @ColumnInfo(name = "strMeasure9") @SerializedName("strMeasure9") val strMeasure9 : String?,
    @ColumnInfo(name = "strMeasure10") @SerializedName("strMeasure10") val strMeasure10 : String?,
    @ColumnInfo(name = "strMeasure11") @SerializedName("strMeasure11") val strMeasure11 : String?,
    @ColumnInfo(name = "strMeasure12") @SerializedName("strMeasure12") val strMeasure12 : String?,
    @ColumnInfo(name = "strMeasure13") @SerializedName("strMeasure13") val strMeasure13 : String?,
    @ColumnInfo(name = "strMeasure14") @SerializedName("strMeasure14") val strMeasure14 : String?,
    @ColumnInfo(name = "strMeasure15") @SerializedName("strMeasure15") val strMeasure15 : String?,
    @ColumnInfo(name = "strCreativeCommonsConfirmed") @SerializedName("strCreativeCommonsConfirmed") val strCreativeCommonsConfirmed : String?,
    @ColumnInfo(name = "dateModified") @SerializedName("dateModified") val dateModified : String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(idDrink)
        parcel.writeString(strDrink)
        parcel.writeString(strDrinkAlternate)
        parcel.writeString(strDrinkES)
        parcel.writeString(strDrinkDE)
        parcel.writeString(strDrinkFR)
        parcel.writeString(strDrinkZH_HANS)
        parcel.writeString(strDrinkZH_HANT)
        parcel.writeString(strTags)
        parcel.writeString(strVideo)
        parcel.writeString(strCategory)
        parcel.writeString(strIBA)
        parcel.writeString(strAlcoholic)
        parcel.writeString(strGlass)
        parcel.writeString(strInstructions)
        parcel.writeString(strInstructionsES)
        parcel.writeString(strInstructionsDE)
        parcel.writeString(strInstructionsFR)
        parcel.writeString(strInstructionsZH_HANS)
        parcel.writeString(strInstructionsZH_HANT)
        parcel.writeString(strDrinkThumb)
        parcel.writeString(strIngredient1)
        parcel.writeString(strIngredient2)
        parcel.writeString(strIngredient3)
        parcel.writeString(strIngredient4)
        parcel.writeString(strIngredient5)
        parcel.writeString(strIngredient6)
        parcel.writeString(strIngredient7)
        parcel.writeString(strIngredient8)
        parcel.writeString(strIngredient9)
        parcel.writeString(strIngredient10)
        parcel.writeString(strIngredient11)
        parcel.writeString(strIngredient12)
        parcel.writeString(strIngredient13)
        parcel.writeString(strIngredient14)
        parcel.writeString(strIngredient15)
        parcel.writeString(strMeasure1)
        parcel.writeString(strMeasure2)
        parcel.writeString(strMeasure3)
        parcel.writeString(strMeasure4)
        parcel.writeString(strMeasure5)
        parcel.writeString(strMeasure6)
        parcel.writeString(strMeasure7)
        parcel.writeString(strMeasure8)
        parcel.writeString(strMeasure9)
        parcel.writeString(strMeasure10)
        parcel.writeString(strMeasure11)
        parcel.writeString(strMeasure12)
        parcel.writeString(strMeasure13)
        parcel.writeString(strMeasure14)
        parcel.writeString(strMeasure15)
        parcel.writeString(strCreativeCommonsConfirmed)
        parcel.writeString(dateModified)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Drink> {
        override fun createFromParcel(parcel: Parcel): Drink {
            return Drink(parcel)
        }

        override fun newArray(size: Int): Array<Drink?> {
            return arrayOfNulls(size)
        }
    }
}