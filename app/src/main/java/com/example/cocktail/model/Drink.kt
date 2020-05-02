import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Drink (

    @SerializedName("idDrink") val idDrink : Int,
    @SerializedName("strDrink") val strDrink : String?,
    @SerializedName("strDrinkAlternate") val strDrinkAlternate : String?,
    @SerializedName("strDrinkES") val strDrinkES : String?,
    @SerializedName("strDrinkDE") val strDrinkDE : String?,
    @SerializedName("strDrinkFR") val strDrinkFR : String?,
    @SerializedName("strDrinkZH-HANS") val strDrinkZH_HANS : String?,
    @SerializedName("strDrinkZH-HANT") val strDrinkZH_HANT : String?,
    @SerializedName("strTags") val strTags : String?,
    @SerializedName("strVideo") val strVideo : String?,
    @SerializedName("strCategory") val strCategory : String?,
    @SerializedName("strIBA") val strIBA : String?,
    @SerializedName("strAlcoholic") val strAlcoholic : String?,
    @SerializedName("strGlass") val strGlass : String?,
    @SerializedName("strInstructions") val strInstructions : String?,
    @SerializedName("strInstructionsES") val strInstructionsES : String?,
    @SerializedName("strInstructionsDE") val strInstructionsDE : String?,
    @SerializedName("strInstructionsFR") val strInstructionsFR : String?,
    @SerializedName("strInstructionsZH-HANS") val strInstructionsZH_HANS : String?,
    @SerializedName("strInstructionsZH-HANT") val strInstructionsZH_HANT : String?,
    @SerializedName("strDrinkThumb") val strDrinkThumb : String?,
    @SerializedName("strIngredient1") val strIngredient1 : String?,
    @SerializedName("strIngredient2") val strIngredient2 : String?,
    @SerializedName("strIngredient3") val strIngredient3 : String?,
    @SerializedName("strIngredient4") val strIngredient4 : String?,
    @SerializedName("strIngredient5") val strIngredient5 : String?,
    @SerializedName("strIngredient6") val strIngredient6 : String?,
    @SerializedName("strIngredient7") val strIngredient7 : String?,
    @SerializedName("strIngredient8") val strIngredient8 : String?,
    @SerializedName("strIngredient9") val strIngredient9 : String?,
    @SerializedName("strIngredient10") val strIngredient10 : String?,
    @SerializedName("strIngredient11") val strIngredient11 : String?,
    @SerializedName("strIngredient12") val strIngredient12 : String?,
    @SerializedName("strIngredient13") val strIngredient13 : String?,
    @SerializedName("strIngredient14") val strIngredient14 : String?,
    @SerializedName("strIngredient15") val strIngredient15 : String?,
    @SerializedName("strMeasure1") val strMeasure1 : String?,
    @SerializedName("strMeasure2") val strMeasure2 : String?,
    @SerializedName("strMeasure3") val strMeasure3 : String?,
    @SerializedName("strMeasure4") val strMeasure4 : String?,
    @SerializedName("strMeasure5") val strMeasure5 : String?,
    @SerializedName("strMeasure6") val strMeasure6 : String?,
    @SerializedName("strMeasure7") val strMeasure7 : String?,
    @SerializedName("strMeasure8") val strMeasure8 : String?,
    @SerializedName("strMeasure9") val strMeasure9 : String?,
    @SerializedName("strMeasure10") val strMeasure10 : String?,
    @SerializedName("strMeasure11") val strMeasure11 : String?,
    @SerializedName("strMeasure12") val strMeasure12 : String?,
    @SerializedName("strMeasure13") val strMeasure13 : String?,
    @SerializedName("strMeasure14") val strMeasure14 : String?,
    @SerializedName("strMeasure15") val strMeasure15 : String?,
    @SerializedName("strCreativeCommonsConfirmed") val strCreativeCommonsConfirmed : String?,
    @SerializedName("dateModified") val dateModified : String?
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