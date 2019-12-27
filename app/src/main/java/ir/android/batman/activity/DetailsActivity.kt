package ir.android.batman.activity

import android.app.Activity
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import com.bumptech.glide.Glide
import ir.android.batman.App
import ir.android.batman.BaseActivity
import ir.android.batman.NetworkStateReceiver
import ir.android.batman.R
import ir.android.batman.api.API
import ir.android.batman.api.repository.AppRepository
import ir.android.batman.model.DetailsMovie
import ir.android.batman.model.DetailsMovieDao
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.content_details.*


class DetailsActivity : BaseActivity(), NetworkStateReceiver.NetworkStateReceiverListener {

    lateinit var dataAccess: AppRepository.DetailsInterface
    lateinit var activity: Activity
    lateinit var imdbID: String
    private var networkStateReceiver: NetworkStateReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setSupportActionBar(toolbar)
        activity = this
        val extras = intent.extras
        if (extras != null) {
            imdbID = extras.getString("imdbID").toString()

        } else {
            finish();
            toast(activity, "No Set ID ")
        }

        networkStateReceiver = NetworkStateReceiver(activity)
        networkStateReceiver!!.addListener(this)
        registerReceiver(
            networkStateReceiver,
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )
        getDetails()

    }

    private fun getDetails() {
        dataAccess.list(this, imdbID, object : API.InterfaceJsonObject<DetailsMovie> {

            override fun lambda(json: DetailsMovie?, error: String?) {
                if (error == null) {

                    try {
                        val mcc: DetailsMovieDao = App.daoSession!!.getDetailsMovieDao()
                        mcc.insertOrReplace(json)

                    } catch (e: java.lang.Exception) {
                        e.printStackTrace()
                    }
                    Glide.with(activity).load(json!!.poster).error(R.drawable.placeholder)
                        .placeholder(R.drawable.placeholder).into(image)
                    supportActionBar?.title = (json.Title)
                    txt_imdbRating.text = span("IMDB \n" + json.imdbRating + "/10", 4, 2f)
                    txt_Director.text = span("Directed By " + json.director, 11, 1f)
                    txt_Released.text = span("Released on " + json.released, 11, 1f)
                    txt_Runtime.text = span("Time  " + json.Runtime, 4, 1f)
                    txt_Language.text = span("Language  " + json.Language, 8, 1f)
                    txt_Genre.text = span("Genre " + json.Genre, 5, 1f)
                    txt_Rated.text = span("Rated " + json.Rated, 5, 1f)
                    txt_writer.text = span("Writers \n " + json.writer, 7, 2f)
                    txt_Actors.text = span("Actors \n " + json.Actors, 6, 2f)
                    txt_Awards.text = span("Awards \n " + json.Awards, 6, 2f)
                    txt_Plot.text = span("Story  \n " + json.Plot, 5, 2f)


                } else {
                    finish();
                    toast(activity, "You do not have access to this data when you are offline")

                }

            }

        })
    }

    override fun onNetworkAvailable() {
        dataAccess = AppRepository.Movie.DetailsMovie.API()

    }

    override fun onNetworkUnavailable() {
        dataAccess = AppRepository.Movie.DetailsMovie.SQL()

    }

}
