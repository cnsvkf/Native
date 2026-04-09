package com.example.nativeui
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

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
val Sfpro = FontFamily(
    Font(R.font.sfbold, FontWeight.Bold),
            Font(R.font.sfbold, FontWeight.SemiBold)
)
@Composable
fun bookOn(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
            color = MaterialTheme.colorScheme.background
    ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(top = 6.dp),
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

                Text("Book-on",
                    fontFamily = Sfpro,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 17.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(275.dp))

                Text("학교 도서관을 더 쉽게 사용하는 방법",
                    fontFamily = Sfpro,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                )
                Spacer(modifier = Modifier.height(41.dp))

                Text("책 검색, 대출현황, 좌석예약까지 \n" + "한 번에 관리하세요",
                    fontSize = 17.sp,
                    fontFamily = Sfpro,
                    fontWeight = FontWeight(590),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(64.dp))

                Box(
                    modifier = Modifier
                        .border(2.dp, Color.Black, RoundedCornerShape(16.dp))
                        .width(162.dp)
                        .height(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "시작하기",
                        fontFamily = Sfpro,
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
    }

}
