package kasper.pagh.kotlinexamexamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity : AppCompatActivity(), AsyncResponse
{
    override fun processFinished(result: String)
    {
        //anko magic, den leder selv i view.R.id.....
        responseBox.text = result
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton.setOnClickListener({submitButton ->
            val nw = Networker(this)
            nw.execute()
        })

    }





}
