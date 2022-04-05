package com.example.recycleviewproject.ui.main

import com.example.recycleviewproject.R
import kotlin.random.Random

data class Data (
    var titles: String = arrayOf(
        "Chapter One",
        "Chapter Two", "Chapter Three", "Chapter Four",
        "Chapter Five", "Chapter Six", "Chapter Seven",
        "Chapter Eight"
    )[Random.nextInt(0, 8)],
    var details: String = arrayOf(
        "Item one details", "Item two details",
        "Item three details", "Item four details",
        "Item five details", "Item six details",
        "Item seven details", "Item eight details"
    )[Random.nextInt(0, 8)],
    var images: Int = intArrayOf(
        R.drawable.android_image_1,
        R.drawable.android_image_2, R.drawable.android_image_3,
        R.drawable.android_image_4, R.drawable.android_image_5,
        R.drawable.android_image_6, R.drawable.android_image_7,
        R.drawable.android_image_8
    )[Random.nextInt(0, 8)])
{
    companion object {

    }
}


