package ir.android.batman.api

import android.content.Context
import android.util.Log
import com.android.volley.VolleyError
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ir.android.batman.App
import ir.android.batman.api.AppClient.Request_String
import ir.android.batman.api.AppClient.String_Listener
import ir.android.batman.model.DetailsMovie
import ir.android.batman.model.ListMovie
import org.json.JSONArray
import org.json.JSONObject
import java.util.*

class API {
    interface InterfaceArrayList<T> {
        fun lambda(list: ArrayList<*>?, error: String?)
    }

    interface InterfaceJsonObject<T> {
        fun lambda(json: DetailsMovie?, error: String?)
    }


    object Movie {
        fun getList(context: Context?, listener: InterfaceArrayList<*>) {
            Request_String(context, "GET", App.UrlMovie, null,
                object : String_Listener {
                    override fun lambda(response: String?, error: VolleyError?) {
                        if (error == null) {
                            try {
                                val jsonObject = JSONObject(response)
                                val jsonArray: JSONArray = jsonObject.getJSONArray("Search")
                                val temp =
                                    Gson().fromJson<ArrayList<ListMovie>>(
                                        jsonArray.toString(),
                                        object : TypeToken<ArrayList<ListMovie?>?>() {}.type
                                    )
                                if (App.debugMode) Log.i("95555", response)
                                listener.lambda(temp, null)
                            } catch (e: Exception) {
                                listener.lambda(null, e.message)
                            }
                        } else {
                            listener.lambda(null, "Error")
                        }
                    }
                }
            )
        }

        fun getDetails(context: Context?, id: String, listener: InterfaceJsonObject<*>) {
            Request_String(context, "GET", App.UrlDetails + id, null,
                object : String_Listener {
                    override fun lambda(response: String?, error: VolleyError?) {
                        if (error == null) {
                            try {
                                val jsonObject = JSONObject(response)
                                val temp =
                                    Gson().fromJson(jsonObject.toString(), DetailsMovie::class.java)

                                if (App.debugMode) Log.i("95555", response)
                                listener.lambda(temp, null)
                            } catch (e: Exception) {
                                listener.lambda(null, e.message)
                            }
                        } else {
                            listener.lambda(null, "Error")
                        }
                    }
                }
            )
        }
    }
}