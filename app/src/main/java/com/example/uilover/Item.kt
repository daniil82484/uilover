package com.example.uilover

data class Item(val imageId:Int, val title:String)

class ItemList{
    val list = arrayListOf(
        Item(R.drawable.ic_1, "Inbox"),
        Item(R.drawable.ic_2, "Maps"),
        Item(R.drawable.ic_3, "Chats"),
        Item(R.drawable.ic_4, "Report"),
        Item(R.drawable.ic_5, "Calender"),
        Item(R.drawable.ic_6, "Tips"),
        Item(R.drawable.ic_7, "Settings"),
        Item(R.drawable.ic_8, "More"),
        )
}