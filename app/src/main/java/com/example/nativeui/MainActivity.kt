package com.example.nativeui


import android.os.Bundle
import com.example.nativeui.navigation.BookOnNav
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.Size
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import org.w3c.dom.Text


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookOnNav()
        }
    }
}

val Sf_pro = FontFamily(
    Font(R.font.sfbold),
    Font(R.font.sfsebold),
    Font(R.font.sfre)
)


@Composable
// 레이아웃
fun BookOn(onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        color = MaterialTheme.colorScheme.background
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 16.dp,
                    vertical = 25.dp
                )
        ) {
            BookOnHead() //  로고 + Book-on

            Spacer(modifier = Modifier.height(183.dp))

            BookOnExplan(onClick = onClick) // 설명글 + 시작버튼 모음
        }
    }
}

@Composable
fun BookOnHead() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            "로고",
            modifier = Modifier
                .width(24.dp)
                .height(26.dp)
        )

        Spacer(modifier = Modifier.width(9.dp))

        Text(
            text = "Book-on",
            fontFamily = Sf_pro,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp
        )
    }
}

@Composable
fun TitleText() {
    Text(
        text = "학교 도서관을 더 쉽게 사용하는 방법",
        fontFamily = FontFamily(Font(R.font.sfbold)),
        fontSize = 17.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier
            .height(22.dp)
            .width(257.dp)
    )
}

@Composable
fun BookOnDescription() {
    Text(
        text = "책 검색, 대출현황, 좌석예약까지\n한 번에 관리하세요",
        fontFamily = FontFamily(Font(R.font.sfsebold)),
        fontSize = 17.sp,
        fontWeight = FontWeight.Medium,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier
            .width(232.dp)
            .height(44.dp)
    )
}

@Composable
fun StartButton(onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        contentPadding = PaddingValues(
            horizontal = 50.dp,
            vertical = 5.dp
        ),
        modifier = Modifier
            .height(32.dp)
            .width(162.dp),
        border = BorderStroke(2.dp, MaterialTheme.colorScheme.outline)

    ) {
        Text(
            "시작하기",
            fontFamily = FontFamily(Font(R.font.sfbold)),
            fontWeight = FontWeight(700),
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            color = Color.Black

        )
    }
}

@Composable
fun BookOnExplan(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleText()

        Spacer(modifier = Modifier.height(41.dp))

        BookOnDescription()

        Spacer(modifier = Modifier.height(64.dp))

        StartButton(onClick = onClick)
    }
}

@Composable
// 시작하기 클릭 한 상태 레이아웃
fun BookOn_Welcome(onClick: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    horizontal = 16.dp,
                    vertical = 25.dp
                )
        ) {
            BookOnHead()

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {

                Spacer(modifier = Modifier.height(137.dp))

                BookOn2_Explan(onClick = onClick)
            }
        }
    }
}

@Composable
fun BookOn_Welcome_Title() {
    Text(
        text = "Book-on에 가입하신 걸 환영합니다!",
        fontFamily = FontFamily(Font(R.font.sfbold)),
        color = MaterialTheme.colorScheme.surface,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier
            .width(233.dp)
            .height(22.dp)
    )
}

@Composable
fun BookOn_Welcome_Description() {
    Text(
        text = "책 검색, 대출현황, 좌석예약까지\n한 번에 관리하세요",
        fontFamily = FontFamily(Font(R.font.sfre)),
        fontWeight = FontWeight.Medium,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colorScheme.surface,
        modifier = Modifier
            .width(206.dp)
            .height(44.dp)
    )
}

@Composable
fun LoginButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .height(35.dp)
            .width(220.dp),
        contentPadding = PaddingValues(
            horizontal = 50.dp,
            vertical = 5.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
            Text(
                text = "로그인",
                modifier = Modifier
                    .width(47.dp)
                    .height(22.dp),
                fontFamily = FontFamily(Font(R.font.sfbold)),
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
        }
}

@Composable
fun BookOn_Welcome_FirstTimeText() {
    Text(
        text = "처음이신가요?",
        fontFamily = FontFamily(Font(R.font.sfre)),
        color = Color(0xFF66A3FF),
        fontSize = 13.sp,
        fontWeight = FontWeight(400),
        modifier = Modifier
            .width(82.dp)
            .height(16.dp),
        textAlign = TextAlign.Center
    )
}

@Composable
fun BookOn2_Explan(onClick: () -> Unit) {
    Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 51.dp)
                .background(color = Color(0xFF2D2D2D),shape = RoundedCornerShape(10.dp))
                .padding(
                    top = 15.dp,
                    bottom = 12.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            "로고",
            modifier = Modifier
                .width(24.dp)
                .height(26.dp)
            )

        Spacer(modifier = Modifier.height(13.dp))

        BookOn_Welcome_Title()

        Spacer(modifier = Modifier.height(54.dp))

        BookOn_Welcome_Description()

        Spacer(modifier = Modifier.height(54.dp))

        LoginButton(onClick = onClick)

        Spacer(modifier = Modifier.height(9.dp))

        BookOn_Welcome_FirstTimeText()
    }
}


