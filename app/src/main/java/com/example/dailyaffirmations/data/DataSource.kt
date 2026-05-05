package com.example.dailyaffirmations.data

import com.example.dailyaffirmations.R
import com.example.dailyaffirmations.model.Affirmation

class DataSource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(
                imageResourceId = R.drawable.image1,
                stringResourceId = R.string.txt_1
            ),
            Affirmation(
                imageResourceId = R.drawable.image2,
                stringResourceId = R.string.txt_2
            ),
            Affirmation(
                imageResourceId = R.drawable.image3,
                stringResourceId = R.string.txt_3
            ),
            Affirmation(
                imageResourceId = R.drawable.image4,
                stringResourceId = R.string.txt_4
            ),
            Affirmation(
                imageResourceId = R.drawable.image5,
                stringResourceId = R.string.txt_5
            ),
            Affirmation(
                imageResourceId = R.drawable.image6,
                stringResourceId = R.string.txt_6
            ),
            Affirmation(
                imageResourceId = R.drawable.image7,
                stringResourceId = R.string.txt_7
            ),
            Affirmation(
                imageResourceId = R.drawable.image8,
                stringResourceId = R.string.txt_8
            ),
            Affirmation(
                imageResourceId = R.drawable.image9,
                stringResourceId = R.string.txt_9
            ),
            Affirmation(
                imageResourceId = R.drawable.image10,
                stringResourceId = R.string.txt_10
            )
        )
    }
}