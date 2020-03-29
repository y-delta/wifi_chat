package com.delta.chatscreen


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.myapp.R
import com.example.myapp.ui.directmessage.ChatMessage


class ChatArrayAdapter(
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

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(context)
        val chatMessageObj = getItem(position)
        var row: View
        val inflater =
            this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        if (chatMessageObj.left) {
            row = layoutInflater.inflate(R.layout.right, parent, false)
        } else {
            row = layoutInflater.inflate(R.layout.left, parent, false)
        }
        chatText = row.findViewById(R.id.msgr)
        chatText!!.text = chatMessageObj.message
        return row
    }
}