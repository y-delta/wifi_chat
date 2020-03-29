package com.example.myapp.ui.ledger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.myapp.R
import com.example.myapp.ui.main.Model
import com.example.myapp.ui.main.MyAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class LedgerFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ledger, container, false)
        var listView = root.findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()


        list.add(Model("BadBOi", "Hello", R.drawable.btn_rounded))
        list.add(Model("BadBOi1", "Hello!", R.drawable.btn_rounded))
        list.add(Model("BadBOi2", "Hello!!", R.drawable.btn_rounded))
        list.add(Model("BadBOi3", "Hello!!!", R.drawable.btn_rounded))

        listView.adapter = MyAdapter(root.context, R.layout.row, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if (position == 0) {
                Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
            }
            if (position == 1) {
                Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
            }
            if (position == 2) {
                Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
            }
            if (position == 3) {
                Toast.makeText(root.context, "clicked on 1", Toast.LENGTH_LONG).show()
            }
        }
        val add = root.findViewById<FloatingActionButton>(R.id.add)
        add.setOnClickListener {
            //            val  dialogBuilder = AlertDialog.Builder(root.context)
//            dialogBuilder.setTitle("Location?")
//            val necessities = arrayOf("Water", "Food","First-Aid","Sanitation");
//            val checked = booleanArrayOf(true, false, true, false)
//            dialogBuilder.setMultiChoiceItems(necessities, checked){ dialog, which, isChecked ->
//
//            }
//            dialogBuilder.setPositiveButton("OK")
//            {
//                dialog, which->
            list.add(Model("BadBOi2", "Hello!!", R.drawable.btn_rounded))
            listView.adapter = MyAdapter(root.context, R.layout.row, list)
//
//            }
//
//            dialogBuilder.setNegativeButton("Cancel", null)
//            dialogBuilder.setMessage("dfasdfsdf")
//            val dialog = dialogBuilder.create()
//            dialog.show()
//            val intent = Intent(root.context, TakeInput::class.java)
//            startActivity(intent)

        }

        return root

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        var args = getArguments()
//        var loc = args?.getString("Location")
//        Toast.makeText(this.context, loc, Toast.LENGTH_LONG).show()
//    }
}
