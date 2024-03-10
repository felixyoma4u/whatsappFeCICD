package com.example.whatsappfe.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappfe.domain.ChatListData
import com.example.whatsappfe.domain.Message
import com.example.whatsappfe.domain.MessageDeliveryStatus
import com.example.whatsappfe.domain.MessageType
import com.example.whatsappfe.ui.theme.HighLightsGreen

@Composable
fun UserDetails(chatData: ChatListData) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        MessageHeader(chatData)
        MessageSubTitle(chatData)
    }
}

@Composable
fun MessageHeader(chatData: ChatListData) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComposable(
            modifier = Modifier.weight(1f),
            value = chatData.userName,
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold
        )
        TextComposable(
            value = chatData.message.timeStamp,
            fontSize = 12.sp,
            color = if ((chatData.message.unreadCount ?: 0) > 0) HighLightsGreen else Color.Gray,
            modifier = null,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun MessageSubTitle(chatData: ChatListData) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComposable(
            value = chatData.message.content,
            fontSize = 12.sp,
            color = Color.Gray,
            modifier = Modifier.weight(1f)
        )

        chatData.message.unreadCount?.also { unread->
            CircularCount(
                unreadCount = unread.toString(),
                backgroundColor = HighLightsGreen,
                textColor = Color.White
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
private fun MessageHeaderPrev() {
    MessageHeader(
        ChatListData(
            chatId = 1,
            message = Message(
                deliveryStatus = MessageDeliveryStatus.DELIVERED,
                content = "Hey! How's it going?",
                type = MessageType.TEXT,
                timeStamp = "21/03/2024"
            ),
            userName = "Alice Johnson"
        ),
    )
}

@Preview(showBackground = true)
@Composable
private fun MessageSubTitlePrev() {
    MessageSubTitle(
        ChatListData(
            chatId = 1,
            message = Message(
                deliveryStatus = MessageDeliveryStatus.DELIVERED,
                content = "Hey! How's it going?",
                type = MessageType.TEXT,
                timeStamp = "21/03/2024"
            ),
            userName = "Alice Johnson"
        ),
    )
}

