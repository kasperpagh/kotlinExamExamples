package kasper.pagh.kotlinexamexamples

import android.os.AsyncTask
import java.net.URL

/**
 * Created by kaspe on 2016-12-20.
 */
class Networker(val delegate : AsyncResponse) : AsyncTask<String, Void, String>()
{
    override fun doInBackground(vararg p0: String?): String
    {
        return network()
    }

    override fun onPostExecute(result : String)
    {
        delegate.processFinished(result)
    }

    fun network(): String
    {
        val res = URL("https://jsonplaceholder.typicode.com/posts/1").readText()
        return res
    }

}