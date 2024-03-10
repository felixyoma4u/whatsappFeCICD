package com.example.whatsappfe.data

import com.example.whatsappfe.domain.ChatListData
import com.example.whatsappfe.domain.Message
import com.example.whatsappfe.domain.MessageDeliveryStatus
import com.example.whatsappfe.domain.MessageType

val chatList = listOf(
    ChatListData(
        chatId = 1,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            content = "Hey! How's it going?",
            type = MessageType.TEXT,
            timeStamp = "21/03/2024",
            unreadCount = 3
        ),
        userName = "Alice Johnson"
    ),
    ChatListData(
        chatId = 2,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.PENDING,
            content = "Hi there! I'm interested in your project.",
            type = MessageType.TEXT,
            timeStamp = "22/03/2024"
        ),
        userName = "Bob Smith"
    ),
    ChatListData(
        chatId = 3,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            content = "Good morning!",
            type = MessageType.TEXT,
            timeStamp = "23/03/2024",
            unreadCount = 2
        ),
        userName = "Charlie Brown"
    ),
    ChatListData(
        chatId = 4,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            content = "Hey, long time no see!",
            type = MessageType.TEXT,
            timeStamp = "24/03/2024"
        ),
        userName = "Diana Miller"
    ),
    ChatListData(
        chatId = 5,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            content = "What's up?",
            type = MessageType.TEXT,
            timeStamp = "25/03/2024"
        ),
        userName = "Ethan Davis"
    ),
    ChatListData(
        chatId = 6,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.READ,
            content = "Hello!",
            type = MessageType.TEXT,
            timeStamp = "26/03/2024"
        ),
        userName = "Fiona Wilson"
    ),
    ChatListData(
        chatId = 7,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            content = "Nice to meet you!",
            type = MessageType.TEXT,
            timeStamp = "27/03/2024"
        ),
        userName = "George Thompson"
    ),
    ChatListData(
        chatId = 8,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.PENDING,
            content = "How's your day going?",
            type = MessageType.TEXT,
            timeStamp = "28/03/2024"
        ),
        userName = "Hannah White"
    ),
    ChatListData(
        chatId = 9,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            content = "Hi!",
            type = MessageType.TEXT,
            timeStamp = "29/03/2024"
        ),
        userName = "Ian Johnson"
    ),
    ChatListData(
        chatId = 10,
        message = Message(
            deliveryStatus = MessageDeliveryStatus.READ,
            content = "Greetings!",
            type = MessageType.TEXT,
            timeStamp = "30/03/2024"
        ),
        userName = "Jackie Brown"
    )
)
