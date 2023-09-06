package com.example.mealhub


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class searchbyIng : AppCompatActivity() {

    private lateinit var resultsBox: TextView
    private lateinit var retrieveBtn: Button
    private lateinit var searchBox: EditText
    private lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchby_ing)
        searchBox=findViewById(R.id.search_view_edit_text)
        val savedSearchText = savedInstanceState?.getString("search_text")
        searchBox.setText(savedSearchText)

        saveBtn=findViewById(R.id.saveBtn)

        resultsBox=findViewById(R.id.results)


        retrieveBtn=findViewById(R.id.retrieveBtn)

        retrieveBtn.setOnClickListener{
            val searchQuery = searchBox.text.toString()
            // Construct the URL with the search query
            val urlString = "https://www.themealdb.com/api/json/v1/1/search.php?s=$searchQuery"

            val url = URL(urlString)
            val con: HttpURLConnection = url.openConnection() as HttpURLConnection

            // Run the network request in a coroutine to avoid blocking the main thread
            runBlocking {
                launch {
                    // Run the code of the coroutine in a new thread
                    withContext(Dispatchers.IO) {
                        // Read the response from the API and store it in a StringBuilder
                        val bf = BufferedReader(InputStreamReader(con.inputStream))
                        val stb = StringBuilder()
                        var line: String? = bf.readLine()
                        while (line != null) {
                            stb.append(line + "\n")
                            line = bf.readLine()
                        }

                        // Parse the JSON response and display the meal information
                        parseJSON(stb)
                    }
                }

            }
        }


    }

    private fun saveResultsToDatabase(resultsBox: TextView?) {

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("savedResults", resultsBox.toString())
    }



    private fun parseJSON(stb: StringBuilder) {
        // Create a JSON object from the response string
        val json = JSONObject(stb.toString())

        // Get the array of meals from the JSON object
        val mealArray = json.getJSONArray("meals")

        // Create a StringBuilder to hold the meal information
        val mealInfo = StringBuilder()
        // Loop through each meal object in the array
        for (i in 0 until mealArray.length()) {
            val mealObj = mealArray.getJSONObject(i)

            val name = mealObj.getString("strMeal")
            val drinkAlternate = mealObj.getString("strDrinkAlternate")
            val category = mealObj.getString("strCategory")
            val instructions = mealObj.getString("strInstructions")
            val tags = mealObj.getString("strTags")
            val youtube = mealObj.getString("strYoutube")

            val ingredient1 = mealObj.getString("strIngredient1")
            val ingredient2 = mealObj.getString("strIngredient2")
            val ingredient3 = mealObj.getString("strIngredient3")
            val ingredient4 = mealObj.getString("strIngredient4")
            val ingredient5 = mealObj.getString("strIngredient5")
            val ingredient6 = mealObj.getString("strIngredient6")
            val ingredient7 = mealObj.getString("strIngredient7")
            val ingredient8 = mealObj.getString("strIngredient8")
            val ingredient9 = mealObj.getString("strIngredient9")
            val ingredient10 = mealObj.getString("strIngredient10")
            val ingredient11 = mealObj.getString("strIngredient11")
            val ingredient12 = mealObj.getString("strIngredient12")
            val ingredient13 = mealObj.getString("strIngredient13")
            val ingredient14 = mealObj.getString("strIngredient14")
            val ingredient15 = mealObj.getString("strIngredient15")
            val ingredient16 = mealObj.getString("strIngredient16")
            val ingredient17 = mealObj.getString("strIngredient17")
            val ingredient18 = mealObj.getString("strIngredient18")
            val ingredient19 = mealObj.getString("strIngredient19")
            val ingredient20 = mealObj.getString("strIngredient20")

            val measure1 = mealObj.getString("strMeasure1")
            val measure2 = mealObj.getString("strMeasure2")
            val measure3 = mealObj.getString("strMeasure3")
            val measure4 = mealObj.getString("strMeasure4")
            val measure5 = mealObj.getString("strMeasure5")
            val measure6 = mealObj.getString("strMeasure6")
            val measure7 = mealObj.getString("strMeasure7")
            val measure8 = mealObj.getString("strMeasure8")
            val measure9 = mealObj.getString("strMeasure9")
            val measure10 = mealObj.getString("strMeasure10")
            val measure11 = mealObj.getString("strMeasure11")
            val measure12 = mealObj.getString("strMeasure12")
            val measure13 = mealObj.getString("strMeasure13")
            val measure14 = mealObj.getString("strMeasure14")
            val measure15 = mealObj.getString("strMeasure15")
            val measure16 = mealObj.getString("strMeasure16")
            val measure17 = mealObj.getString("strMeasure17")
            val measure18 = mealObj.getString("strMeasure18")
            val measure19 = mealObj.getString("strMeasure19")
            val measure20 = mealObj.getString("strMeasure20")



            // Append the meal information to the StringBuilder
            mealInfo.append("Meal: $name\n")
            mealInfo.append("Drink Alternate: $drinkAlternate\n")
            mealInfo.append("Category: $category\n")
            mealInfo.append("Instructions: $instructions\n")
            mealInfo.append("Tags: $tags\n")
            mealInfo.append("YouTube: $youtube\n")
            mealInfo.append("Ingredient1: $ingredient1\n")
            mealInfo.append("Ingredient2: $ingredient2\n")
            mealInfo.append("Ingredient3: $ingredient3\n")
            mealInfo.append("Ingredient4: $ingredient4\n")
            mealInfo.append("Ingredient5: $ingredient5\n")
            mealInfo.append("Ingredient6: $ingredient6\n")
            mealInfo.append("Ingredient7: $ingredient7\n")
            mealInfo.append("Ingredient8: $ingredient8\n")
            mealInfo.append("Ingredient9: $ingredient9\n")
            mealInfo.append("Ingredient10: $ingredient10\n")
            mealInfo.append("Ingredient11: $ingredient11\n")
            mealInfo.append("Ingredient12: $ingredient12\n")
            mealInfo.append("Ingredient13: $ingredient13\n")
            mealInfo.append("Ingredient14: $ingredient14\n")
            mealInfo.append("Ingredient15: $ingredient15\n")
            mealInfo.append("Ingredient16: $ingredient16\n")
            mealInfo.append("Ingredient17: $ingredient17\n")
            mealInfo.append("Ingredient18: $ingredient18\n")
            mealInfo.append("Ingredient19: $ingredient19\n")
            mealInfo.append("Ingredient20: $ingredient20\n")
            mealInfo.append("Measure1: $measure1\n")
            mealInfo.append("Measure2: $measure2\n")
            mealInfo.append("Measure3: $measure3\n")
            mealInfo.append("Measure4: $measure4\n")
            mealInfo.append("Measure5: $measure5\n")
            mealInfo.append("Measure6: $measure6\n")
            mealInfo.append("Measure7: $measure7\n")
            mealInfo.append("Measure8: $measure8\n")
            mealInfo.append("Measure9: $measure9\n")
            mealInfo.append("Measure10: $measure10\n")
            mealInfo.append("Measure11: $measure11\n")
            mealInfo.append("Measure12: $measure12\n")
            mealInfo.append("Measure13: $measure13\n")
            mealInfo.append("Measure14: $measure14\n")
            mealInfo.append("Measure15: $measure15\n")
            mealInfo.append("Measure16: $measure16\n")
            mealInfo.append("Measure17: $measure17\n")
            mealInfo.append("Measure18: $measure18\n")
            mealInfo.append("Measure19: $measure19\n")
            mealInfo.append("Measure20: $measure20\n\n")

        }

        runOnUiThread {
            // Display the meal information in the TextView
            resultsBox.text = mealInfo.toString()
        }

    }


}