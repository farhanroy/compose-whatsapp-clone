package github.farhanroy.whatsappclone.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import github.farhanroy.whatsappclone.HomeTab

@Composable
fun AppTabBar(
    modifier: Modifier = Modifier,
    children: @Composable (Modifier) -> Unit
) {
    Row(modifier){
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
        indicator = { tabIndicator ->
            TabRowDefaults.Indicator(
                Modifier.tabIndicatorOffset(tabIndicator[tabSelected.ordinal])
            )
        },
        divider = {}
    ) {
        titles.forEachIndexed {index, title ->
            val selected = index == tabSelected.ordinal
            Tab(
                text = { Text(text = title)},
                selected = selected,
                onClick = { onTabSelected(HomeTab.values()[index]) }
            )
        }
    }
}









