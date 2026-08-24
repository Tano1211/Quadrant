package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    QuadrantScreen()
                }
            }
        }
    }
}




@Composable
fun ComposeArticle(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            fontSize = TextUnit.Unspecified,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun QuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.weight(1f)) {
            ComposeArticle(
                title = stringResource(R.string.Cadre1Titre),
                description = stringResource(R.string.Cadre2Desc),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            )
            ComposeArticle(
                title = stringResource(R.string.Cadre2Titre),
                description = stringResource(R.string.Cadre2Desc),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            ComposeArticle(
                title = stringResource(R.string.Cadre3Titre),
                description = stringResource(R.string.Cadre3Desc),
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            )
            }
        }
}



@Preview(showBackground = true)
@Composable
fun  QuadrantComposePreview() {
    QuadrantComposeTheme {
    QuadrantScreen()
    }
}