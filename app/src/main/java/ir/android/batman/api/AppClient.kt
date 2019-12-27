package ir.android.batman.api

import android.content.Context
import android.util.Log
import com.android.volley.*
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import ir.android.batman.App
import org.json.JSONObject
import java.util.*

object AppClient {

    fun Request_Method(Request_Method: String): Int {
        if (Request_Method == "GET") {
            return Request.Method.GET
        }
        if (Request_Method == "POST") {
            return Request.Method.POST
        }
        if (Request_Method == "PUT") {
            return Request.Method.PUT
        }
        return if (Request_Method == "DELETE") {
            Request.Method.DELETE
        } else 1000
    }

    fun Request_String(
        context: Context?,
        Request_Method: String,
        URL: String?,
        js: JSONObject?,
        listener: String_Listener
    ) {
        val stringRequest: StringRequest = object :
            StringRequest(
                Request_Method(Request_Method), URL,
                Response.Listener { response: String? ->
                    listener.lambda(response, null)
                    if (App.debugMode) Log.i("*0*00*", response)
                },
                Response.ErrorListener { error: VolleyError ->
                    listener.lambda(null, error)
                    try {
                        val nr = error.networkResponse
                        val body = String(nr.data, Charsets.UTF_8)
                        if (App.debugMode) Log.i("NetworkResponse", body)
                        if (App.debugMode) println("****error$body")
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            ) {

            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val headers =
                    HashMap<String, String>()
                headers["Content-Type"] = "application/json; charset=utf-8"
                headers["Accept"] = "application/json"
                return headers
            }
        }
        Volley.newRequestQueue(context).add(stringRequest)
        stringRequest.retryPolicy = DefaultRetryPolicy(
            10000,
            DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
            DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
        )
    }

    interface String_Listener {
        fun lambda(response: String?, error: VolleyError?)
    }
}

