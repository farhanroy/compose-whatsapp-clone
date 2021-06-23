package github.farhanroy.whatsappclone.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import github.farhanroy.whatsappclone.R

@Composable
fun StatusView() {
    Row(Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        Box(modifier = Modifier.weight(2f)) {
            Image(
                painter = painterResource(id = R.drawable.ic_person),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(48.dp)
                    .background(Color.LightGray),
                contentScale = ContentScale.Crop
            )
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null,
                tint = Color.Green,
                modifier = Modifier.offset(x = 32.dp, y = 32.dp)
            )
        }
        Column(
            Modifier
                .padding(horizontal = 8.dp)
                .weight(8f)
        ) {
            Text("Status saya", maxLines = 1, fontSize = 17.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(6.dp))
            Text("Ketuk untuk menambah status", fontSize = 15.sp, color = Color.Gray)
        }
    }
}