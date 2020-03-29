package com.delta.chatscreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.myapp.R
import com.example.myapp.ui.directmessage.ChatMessage


internal class ChatArrayAdapter(
    context: Context, textViewResourceId: Int
) : ArrayAdapter<ChatMessage>(context, textViewResourceId) {
    private var chatText: TextView? = null
    //  var chatMessageList: MutableList<ChatMessage> = ArrayList()
    private var chatMessageList =ArrayList<ChatMessage>()
    var chatMessageList1 = mutableListOf<ChatMessage>()

    override fun add(`object`: ChatMessage?) {
        chatMessageList.add(`object`!!)
        super.add(`object`)
    }

    override fun getCount(): Int {
        return chatMessageList.size
    }

    override fun getItem(index: Int): ChatMessage {
        return chatMessageList[index]
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        val chatMessageObj = getItem(position)
        var row = convertView
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        row = if (chatMessageObj.left) {
            inflater.inflate(R.layout.right, parent, false)
        } else {
            inflater.inflate(R.layout.left, parent, false)
        }
        chatText = row.findViewById<View>(R.id.msgr) as TextView
        chatText!!.text = chatMessageObj.message
        return row
    }

}