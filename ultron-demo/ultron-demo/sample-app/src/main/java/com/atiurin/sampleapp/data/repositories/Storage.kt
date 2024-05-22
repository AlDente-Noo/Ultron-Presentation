package com.atiurin.sampleapp.data.repositories

import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.data.entities.Contact
import com.atiurin.sampleapp.data.entities.Message
import com.atiurin.sampleapp.data.entities.User

val CURRENT_USER = User(1, "Фёдор Кунгуров", Avatars.JOEY.drawable, "xd", "xd")

val CONTACTS = mutableListOf(
    Contact(2, "Фёдор Кунгуров", "Ничего не делает", Avatars.DEFAULT.drawable),
    Contact(3, "Ира Колчаева", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(4, "Дмитрий Курочка", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(5, "Артём Керпик", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(6, "Костя Панов", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(7, "Кира Шульган", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(8, "兎 千葉", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(9, "Саша Говако", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(10, "Лидия Пшеничная\n", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(12, "Елена Пранова", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(13, "Виктория Батогова ", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(14, "Александр Кривулин", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(15, "Михаэль Креславский", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(16, "Даниил Бауманн", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(17, "Ваня Булгаков", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(18, "Владислав Аниканов", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(19, "Геннадий Худяков", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(20, "Кто-то", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(21, "Кто-то", "Что-то делает", Avatars.DEFAULT.drawable),
    Contact(22, "Кто-то", "Что-то делает", Avatars.DEFAULT.drawable),

)

enum class Avatars(val drawable: Int) {
    CHANDLER(R.drawable.chandler),
    ROSS(R.drawable.ross),
    MONICA(R.drawable.monica),
    RACHEL(R.drawable.rachel),
    PHOEBE(R.drawable.phoebe),
    GUNTHER(R.drawable.gunther),
    JOEY(R.drawable.joey),
    JANICE(R.drawable.janice),
    DEFAULT(R.drawable.default_avatar)
}


val MESSAGES = arrayListOf(
    Message(1, 2, "What's up Chandler"),
    Message(2, 1, "Hi Joey"),
    Message(1, 2, "Let's drink coffee"),
    Message(2, 1, "Ok"),
    Message(1, 3, "Do u wanna coffee?"),
    Message(3, 1, "yep, let's go")
)