package com.uwacoding.uwakotlin

import com.uwacoding.uwakotlin.model.DataModel
import java.util.*

/**
 * Created by Firman on 2/11/2017.
 */

object Content {
    val ITEMS: MutableList<DataModel> = ArrayList()

    private val COUNT = 25

    init {
        for (i in 1..COUNT) {
            ITEMS.add(createDummyItem(i))
        }
    }

    private fun createDummyItem(position: Int): DataModel {
        return DataModel(position.toString(), "Item " + position, makeDetails(position))

    }

    private fun makeDetails(position: Int):String {
        val builder = StringBuilder()
        builder.append("Details about Item:").append(position)
        for (i in 0..position - 1) {
            builder.append("\ndetail informasi")
        }
        return builder.toString();
    }
}
