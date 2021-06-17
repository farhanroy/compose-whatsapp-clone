package github.farhanroy.whatsappclone.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import github.farhanroy.whatsappclone.HomeTab

@Composable
fun AppTabBar(
    modifier: Modifier = Modifier,
    children: @Composable (Modifier) -> Unit
) {
    Row(modifier) {
        children(
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
fun AppTabs(
    modifier: Modifier = Modifier,
    titles: List<String>,
    tabSelected: HomeTab,
    onTabSelected: (HomeTab) -> Unit
) {
    TabRow(
        selectedTabIndex = tabSelected.ordinal,
        modifier = modifier,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.tabIndicatorOffset(tabPositions[tabSelected.ordinal])
            )
        },
        divider = {}
    ) {
        titles.forEachIndexed { index, title ->
            val selected = index == tabSelected.ordinal
            Tab(
                text = {Text(title)},
                selected = selected,
                onClick = { onTabSelected(HomeTab.values()[index]) }
            )
        }
    }
}