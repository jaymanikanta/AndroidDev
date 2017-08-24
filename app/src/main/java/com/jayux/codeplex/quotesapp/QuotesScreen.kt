package com.jayux.codeplex.quotesapp

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.widget.TextView

class QuotesScreen : AppCompatActivity() {

    val quotes = arrayOf("Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.", "Don't cry because it's over, smile because it happened.", "Be yourself; everyone else is already taken.", "A room without books is like a body without a soul.", "You only live once, but if you do it right, once is enough.", "Be the change that you wish to see in the world.", "In three words I can sum up everything I've learned about life: it goes on.")
    val authors = arrayOf("Einstein", "Dr.Seuss", "Oscar Wilde", "Marcus Tullius Cicero", "Mae West", "Mahatma Gandhi", "Robert Frost")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes_screen)

        val quotesText = findViewById<TextView>(R.id.textView3)
        val quoteButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val author = findViewById<TextView>(R.id.textViewAuthor)
        val n = quotes.size
        quoteButton.setOnClickListener{
            val randomGenerator = (Math.random()*n).toInt()
            quotesText.text = quotes[randomGenerator]
            author.text = authors[randomGenerator]
        }

    }
}
