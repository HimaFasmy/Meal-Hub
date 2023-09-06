package com.example.mealhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchByIng = findViewById<Button>(R.id.searchMealIngredientBtn)
        searchByIng.setOnClickListener {
            val intent = Intent(this, searchbyIng::class.java)
            startActivity(intent)

            val searchmeal = findViewById<Button>(R.id.searchMealBtn)
            searchmeal.setOnClickListener {
                val intent = Intent(this, mealSearch::class.java)
                startActivity(intent)


            val addMealToDbBtn = findViewById<Button>(R.id.addMealToDbBtn)
            addMealToDbBtn.setOnClickListener {
                val meal1 = Meal(
                    idMeal = "52949",
                    meal = "Sweet and Sour Pork",
                    drinkAlternate = null,
                    category = "Pork",
                    area = "Chinese",
                    instructions = "Preparation\n1. Crack the egg into a bowl. Separate the egg white and yolk.\n\nSweet and Sour Pork\n2. Slice the pork tenderloin into strips.\n\n3. Prepare the marinade using a pinch of salt, one teaspoon of starch, two teaspoons of light soy sauce, and an egg white.\n\n4. Marinade the pork strips for about 20 minutes.\n\n5. Put the remaining starch in a bowl. Add some water and vinegar to make a starchy sauce.\n\nSweet and Sour Pork\nCooking Instructions\n1. Pour the cooking oil into a wok and heat to 190°C (375°F). Add the marinated pork strips and fry them until they turn brown. Remove the cooked pork from the wok and place on a plate.\n\n2. Leave some oil in the wok. Put the tomato sauce and white sugar into the wok, and heat until the oil and sauce are fully combined.\n\n3. Add some water to the wok and thoroughly heat the sweet and sour sauce before adding the pork strips to it.\n\n4. Pour in the starchy sauce. Stir-fry all the ingredients until the pork and sauce are thoroughly mixed together.\n\n5. Serve on a plate and add some coriander for decoration.",
                    mealThumb = "https://www.themealdb.com/images/media/meals/1529442316.jpg",
                    tags = "Sweet",
                    youtube = "https://www.youtube.com/watch?v=mdaBIhgEAMo",
                    ingredients = listOf(
                        "Pork",
                        "Egg",
                        "Water",
                        "Salt",
                        "Sugar",
                        "Soy Sauce",
                        "Starch",
                        "Tomato Puree",
                        "Vinegar",
                        "Coriander"
                    ),
                    measures = listOf(
                        "200g",
                        "1",
                        "Dash",
                        "1/2 tsp",
                        "1 tsp",
                        "10g",
                        "10g",
                        "30g",
                        "10g",
                        "Dash"
                    ),
                    source = "https://www.chinahighlights.com/travelguide/chinese-food/cooking/sweet-sour-pork.htm",
                    imageSource = null,
                    creativeCommonsConfirmed = null,
                    dateModified = null
                )
                val meal2 = Meal(
                    idMeal = "52920",
                    meal = "Chicken Marengo",
                    drinkAlternate = null,
                    category = "Chicken",
                    area = "French",
                    instructions = "Heat the oil in a large flameproof casserole dish and stir-fry the mushrooms until they start to soften. Add the chicken legs and cook briefly on each side to colour them a little. Pour in the passata, crumble in the stock cube and stir in the olives. Season with black pepper – you shouldn’t need salt. Cover and simmer for 40 mins until the chicken is tender. Sprinkle with parsley and serve with pasta and a salad, or mash and green veg, if you like.",
                    mealThumb = "https://www.themealdb.com/images/media/meals/qpxvuq1511798906.jpg",
                    tags = null,
                    youtube = "https://www.youtube.com/watch?v=U33HYUr-0Fw",
                    ingredients = listOf(
                        "Olive Oil",
                        "Mushrooms",
                        "Chicken Legs",
                        "Passata",
                        "Chicken Stock Cube",
                        "Black Olives",
                        "Parsley"
                    ),
                    measures = listOf("1 tbs", "300g", "4", "500g", "1", "100g", "Chopped"),
                    source = "https://www.bbcgoodfood.com/recipes/3146682/chicken-marengo",
                    imageSource = null,
                    creativeCommonsConfirmed = null,
                    dateModified = null
                )
                val meal3 = Meal(
                    idMeal = "52997",
                    meal = "Beef Banh Mi Bowls with Sriracha Mayo, Carrot & Pickled Cucumber",
                    drinkAlternate = null,
                    category = "Beef",
                    area = "Vietnamese",
                    instructions = "Add'l ingredients: mayonnaise, siracha\n\n1\n\nPlace rice in a fine-mesh sieve and rinse until water runs clear. Add to a small pot with 1 cup water (2 cups for 4 servings) and a pinch of salt. Bring to a boil, then cover and reduce heat to low. Cook until rice is tender, 15 minutes. Keep covered off heat for at least 10 minutes or until ready to serve.\n\n2\n\nMeanwhile, wash and dry all produce. Peel and finely chop garlic. Zest and quarter lime (for 4 servings, zest 1 lime and quarter both). Trim and halve cucumber lengthwise; thinly slice crosswise into half-moons. Halve, peel, and medium dice onion. Trim, peel, and grate carrot.\n\n3\n\nIn a medium bowl, combine cucumber, juice from half the lime, ¼ tsp sugar (½ tsp for 4 servings), and a pinch of salt. In a small bowl, combine mayonnaise, a pinch of garlic, a squeeze of lime juice, and as much sriracha as you’d like. Season with salt and pepper.\n\n4\n\nHeat a drizzle of oil in a large pan over medium-high heat. Add onion and cook, stirring, until softened, 4-5 minutes. Add beef, remaining garlic, and 2 tsp sugar (4 tsp for 4 servings). Cook, breaking up meat into pieces, until beef is browned and cooked through, 4-5 minutes. Stir in soy sauce. Turn off heat; taste and season with salt and pepper.\n\n5\n\nFluff rice with a fork; stir in lime zest and 1 TBSP butter. Divide rice between bowls. Arrange beef, grated carrot, and pickled cucumber on top. Top with a squeeze of lime juice. Drizzle with sriracha mayo.",
                    mealThumb = "https://www.themealdb.com/images/media/meals/z0ageb1583189517.jpg",
                    tags = null,
                    youtube = null,
                    ingredients = listOf(
                        "Rice",
                        "Onion",
                        "Lime",
                        "Garlic Clove",
                        "Cucumber",
                        "Carrots",
                        "Ground Beef",
                        "Soy Sauce"
                    ),
                    measures = listOf("White", "1", "1", "3", "1", "3 oz", "1 lb", "2 oz"),
                    source = null,
                    imageSource = null,
                    creativeCommonsConfirmed = null,
                    dateModified = null
                )

                val meal4 = Meal(
                    idMeal = "52997",
                    meal = "Leblebi Soup",
                    drinkAlternate = null,
                    category = "Vegetarian",
                    area = "Tunisian",
                    instructions = "Add'l ingredients: mayonnaise, siracha\n\n1\n\nPlace rice in a fine-mesh sieve and rinse until water runs clear. Add to a small pot with 1 cup water (2 cups for 4 servings) and a pinch of salt. Bring to a boil, then cover and reduce heat to low. Cook until rice is tender, 15 minutes. Keep covered off heat for at least 10 minutes or until ready to serve.\n\n2\n\nMeanwhile, wash and dry all produce. Peel and finely chop garlic. Zest and quarter lime (for 4 servings, zest 1 lime and quarter both). Trim and halve cucumber lengthwise; thinly slice crosswise into half-moons. Halve, peel, and medium dice onion. Trim, peel, and grate carrot.\n\n3\n\nIn a medium bowl, combine cucumber, juice from half the lime, ¼ tsp sugar (½ tsp for 4 servings), and a pinch of salt. In a small bowl, combine mayonnaise, a pinch of garlic, a squeeze of lime juice, and as much sriracha as you’d like. Season with salt and pepper.\n\n4\n\nHeat a drizzle of oil in a large pan over medium-high heat. Add onion and cook, stirring, until softened, 4-5 minutes. Add beef, remaining garlic, and 2 tsp sugar (4 tsp for 4 servings). Cook, breaking up meat into pieces, until beef is browned and cooked through, 4-5 minutes. Stir in soy sauce. Turn off heat; taste and season with salt and pepper.\n\n5\n\nFluff rice with a fork; stir in lime zest and 1 TBSP butter. Divide rice between bowls. Arrange beef, grated carrot, and pickled cucumber on top. Top with a squeeze of lime juice. Drizzle with sriracha mayo.",
                    mealThumb = "https:\\/\\/www.themealdb.com\\/images\\/media\\/meals\\/x2fw9e1560460636.jpg",
                    tags = "Soup",
                    youtube = null,
                    ingredients = listOf(
                        "Rice",
                        "Onion",
                        "Lime",
                        "Garlic Clove",
                        "Cucumber",
                        "Carrots",
                        "Ground Beef",
                        "Soy Sauce"
                    ),
                    measures = listOf("White", "1", "1", "3", "1", "3 oz", "1 lb", "2 oz"),
                    source = null,
                    imageSource = null,
                    creativeCommonsConfirmed = null,
                    dateModified = null
                )

                val db = DatabaseProvider.getInstance(applicationContext)

                GlobalScope.launch(Dispatchers.IO) {
                    db.mealDao().insertMeal(meal1)
                    db.mealDao().insertMeal(meal2)
                    db.mealDao().insertMeal(meal3)
                    db.mealDao().insertMeal(meal4)

                    // Get all the meals from the database and convert them to a list of meal names
                    val mealNames = db.mealDao().getAllMeal().map { meal -> meal.meal }

                    // Display a toast message with all the meal names
                    runOnUiThread {
                        Toast.makeText(
                            applicationContext,
                            "All meals: $mealNames",
                            Toast.LENGTH_LONG
                        )
                            .show()
                    }
                }
            }
        }
    }




}}

