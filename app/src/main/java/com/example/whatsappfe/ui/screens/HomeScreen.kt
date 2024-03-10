package com.example.whatsappfe.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatsappfe.data.INITIAL_INDEX
import com.example.whatsappfe.data.tabs
import com.example.whatsappfe.ui.components.AppBarComponent
import com.example.whatsappfe.ui.components.TabComponent
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    val pagerState = rememberPagerState(initialPage = INITIAL_INDEX, pageCount = {
        tabs.size
    })

    val scope = rememberCoroutineScope()

    Column {
        AppBarComponent()
        TabComponent(
            initialIndex = INITIAL_INDEX,
            pagerState = pagerState,
            onTabSelected = { selectedPage ->
                scope.launch { pagerState.animateScrollToPage(selectedPage) }

            })
        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,
        ) { page ->
            when (page) {
                0 -> ChatsScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }

        }
    }
}

@Preview
@Composable
fun HomeScreenPrev() {
    HomeScreen()
}