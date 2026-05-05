package com.example.dailyaffirmations

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyaffirmations.ui.theme.DailyAffirmationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DailyAffirmationsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
                ) {
                    DailyAffirmationApp()
                }
            }
        }
    }
}

data class Affirmation(
    val image: Int,
    val affirmationText: Int
)

val affirmations = listOf(
    Affirmation(
        image = R.drawable.image1,
        affirmationText = R.string.txt_1
    ),
    Affirmation(
        image = R.drawable.image2,
        affirmationText = R.string.txt_2
    ),
    Affirmation(
        image = R.drawable.image3,
        affirmationText = R.string.txt_3
    ),
    Affirmation(
        image = R.drawable.image4,
        affirmationText = R.string.txt_4
    ),
    Affirmation(
        image = R.drawable.image5,
        affirmationText = R.string.txt_5
    ),
    Affirmation(
        image = R.drawable.image6,
        affirmationText = R.string.txt_6
    ),
    Affirmation(
        image = R.drawable.image7,
        affirmationText = R.string.txt_7
    ),
    Affirmation(
        image = R.drawable.image8,
        affirmationText = R.string.txt_8
    ),
    Affirmation(
        image = R.drawable.image9,
        affirmationText = R.string.txt_9
    ),
    Affirmation(
        image = R.drawable.image10,
        affirmationText = R.string.txt_10
    ),
)

@Composable
fun DailyAffirmationApp() {
    Column() {
        affirmations.forEach {
            AffirmationElement(it)
        }
    }
}

@Composable
fun AffirmationElement(item: Affirmation) {
    Column(
        modifier = Modifier.padding(16.dp).fillMaxWidth().background(Color.DarkGray)
    ) {
        Image(
            painter = painterResource(item.image),
            contentDescription = "image_1",
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(item.affirmationText),
            fontSize = 8.sp
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun AppPreview() {
    DailyAffirmationsTheme() {
        DailyAffirmationApp()
    }
}