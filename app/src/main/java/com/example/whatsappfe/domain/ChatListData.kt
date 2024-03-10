package com.example.whatsappfe.domain

import com.example.whatsappfe.R

data class ChatListData(
    val chatId: Int,
    val message:  Message,
    val userName: String,
    val userImage: Int = R.drawable.ic_user
)

data class Message(
    val content: String,
    val deliveryStatus: MessageDeliveryStatus,
    val type: MessageType,
    val timeStamp: String,
    val unreadCount: Int? = null
)

enum class MessageDeliveryStatus{
    DELIVERED,
    READ,
    PENDING,
    ERROR
}

enum class MessageType{
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE
}
