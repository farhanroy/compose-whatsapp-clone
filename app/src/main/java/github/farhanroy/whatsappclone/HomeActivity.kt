package github.farhanroy.whatsappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import github.farhanroy.whatsappclone.composable.AppTabBar
import github.farhanroy.whatsappclone.composable.AppTabs
import github.farhanroy.whatsappclone.ui.theme.WhatsappCloneTheme
import github.farhanroy.whatsappclone.ui.view.ChatView
import github.farhanroy.whatsappclone.ui.view.ContactView
import github.farhanroy.whatsappclone.ui.view.StatusView

enum class HomeTab {
    CHAT, STATUS, CONTACT
}


class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsappCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    HomeView()
                }
            }
        }
    }
}

@Composable
fun HomeView() {
    var showMenu by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("WhatsApp") },
                elevation = 0.dp,
                actions = {
                    DropdownMenu(
                        expanded = showMenu,
                        onDismissRequest = { showMenu = false }
                    ) {
                        DropdownMenuItem(onClick = { /*TODO*/ }) {
                            Text("Whatsapp web")
                        }
                        DropdownMenuItem(onClick = { /*TODO*/ }) {
                            Text("Settings")
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Search, contentDescription = null)
                    }

                    IconButton(onClick = { showMenu = showMenu != true }) {
                        Icon(Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        },
        modifier = Modifier.fillMaxSize()
    ) {
        Column(Modifier.fillMaxSize()) {
            val coroutineScope = rememberCoroutineScope()
            var tabSelected by remember { mutableStateOf(HomeTab.CHAT) }
            HomeTabBar(tabSelected, onTabSelected = { tabSelected = it })
            when(tabSelected){
                HomeTab.CHAT -> ChatView()
                HomeTab.STATUS -> StatusView()
                HomeTab.CONTACT -> ContactView()
            }
        }
    }

}

@Composable
fun HomeTabBar(
    tabSelected: HomeTab,
    onTabSelected: (HomeTab) -> Unit
) {
    AppTabBar {tabBarModifier ->
        AppTabs(
            modifier = tabBarModifier,
            titles = HomeTab.values().map {it.name},
            tabSelected = tabSelected,
            onTabSelected = { newTab -> onTabSelected(HomeTab.values()[newTab.ordinal]) }
        )
    }
}