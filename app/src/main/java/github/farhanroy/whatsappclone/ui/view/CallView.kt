package github.farhanroy.whatsappclone.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.coil.rememberCoilPainter
import github.farhanroy.whatsappclone.R
import github.farhanroy.whatsappclone.data.Call
import github.farhanroy.whatsappclone.data.DummyData

@Composable
fun CallView() {
    val dummyCall = DummyData.listCall

    LazyColumn {
        items(dummyCall.size) { index ->
            CallItem(dummyCall[index])
        }
    }
}

@Composable
fun CallItem(call: Call) {
    Row(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Box(modifier = Modifier.weight(2f)) {
            Image(
                painter = rememberCoilPainter(request = call.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(64.dp),
                contentScale = ContentScale.Crop
            )
        }

        Column(
            Modifier
                .padding(horizontal = 8.dp)
                .weight(7f)
        ) {
            Text(text = call.name, maxLines = 1, fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
            Row(Modifier.fillMaxWidth()) {
                if (call.isMissCall) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call_miss),
                        contentDescription = null,
                        tint = Color.Red
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_call_receive),
                        contentDescription = null,
                        tint = Color.Green
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(call.date, fontSize = 15.sp, color = Color.Gray)
            }
            Spacer(modifier = Modifier.height(14.dp))
            Divider(color = Color(0xFFebebeb))
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.Call, contentDescription = null,
                tint = MaterialTheme.colors.primary
            )
        }
    }
}













