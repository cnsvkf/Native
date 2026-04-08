package com.example.nativeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nativeui.ui.theme.NativeUiTheme
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                bookOn()
            }
        }
    }
}

@Composable
fun bookOn() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
            color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 16.dp,
                        start = 8.dp,
                        bottom = 16.dp,
                        end = 8.dp
                    ),
                horizontalArrangement = Arrangement.Start
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "로고",
                    modifier = Modifier
                        .width(24.dp)
                        .height(26.dp)
                )

                Spacer(modifier = Modifier.width(9.dp))

                Text("Book-on")
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(0.3f))

                Text("학교 도서관을 더 쉽게 사용하는 방법",
                    fontSize = 17.sp
                )
                Spacer(modifier = Modifier.weight(0.1f))

                Text("책 검색, 대출현황, 좌석예약까지 \n" + "한 번에 관리하세요",
                    fontSize = 17.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.weight(0.13f))

                Box(
                    modifier = Modifier
                        .border(2.dp, Color.Black, RoundedCornerShape(16.dp))
                        .fillMaxWidth(0.43f)
                        .aspectRatio(162f / 32f),
                    contentAlignment = Alignment.Center

                ) {
                    Text(
                        text = "시작하기",
                        fontSize = 17.sp
                    )
                }

                Spacer(modifier = Modifier.weight(0.47f))
            }
        }
    }

}
