package ir.android.batman.activity

import android.app.Activity
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.ItemAnimator
import ir.android.batman.App
import ir.android.batman.BaseActivity
import ir.android.batman.NetworkStateReceiver
import ir.android.batman.R
import ir.android.batman.adapter.AdapterList
import ir.android.batman.api.API
import ir.android.batman.api.repository.AppRepository
import ir.android.batman.api.repository.AppRepository.ListInterface
import ir.android.batman.model.ListMovie
import ir.android.batman.model.ListMovieDao
import kotlinx.android.synthetic.main.activity_list.*
import java.util.*

class ListActivity : BaseActivity(), NetworkStateReceiver.NetworkStateReceiverListener {

    lateinit var dataAccess: ListInterface
    lateinit var activity: Activity
    lateinit var adapter: AdapterList
    private var networkStateReceiver: NetworkStateReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        activity = this

        networkStateReceiver = NetworkStateReceiver(activity)
        networkStateReceiver!!.addListener(this)
        registerReceiver(
            networkStateReceiver,
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )

        refresh.setRefreshing(true)

        init()
        getList()

        refresh.setOnRefreshListener {
            adapter.list!!.clear()
            getList()
        }


    }

    fun init() {
        recyclerView.setLayoutManager(LinearLayoutManager(activity))
        val itemAnimator: ItemAnimator = DefaultItemAnimator()
        itemAnimator.addDuration = 50
        itemAnimator.removeDuration = 20
        recyclerView.itemAnimator = itemAnimator
        adapter = AdapterList(activity, recyclerView)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : AdapterList.OnItemClickListener {
            override fun onClick(position: Int) {

                val myIntent = Intent(activity, DetailsActivity::class.java)
                myIntent.putExtra("imdbID", adapter.list!![position].imdbID)
                startActivity(myIntent)
            }

        })


    }

    private fun getList() {
        dataAccess!!.list(this, object : API.InterfaceArrayList<ListMovie> {
            override fun lambda(list: ArrayList<*>?, error: String?) {
                  refresh.setRefreshing(false)
                if (error == null) {
                    try {
                        var temp = list!! as ArrayList<ListMovie>
                        adapter.list!!.addAll(temp)
                        adapter.notifyDataSetChanged()
                        val mcc: ListMovieDao = App.daoSession!!.getListMovieDao()
                        mcc.insertOrReplaceInTx(temp)
                    } catch (e: Exception) {
                        e.printStackTrace()

                    }

                }
            }

        })
    }

    override fun onNetworkAvailable() {
        dataAccess = AppRepository.Movie.ListMovie.API()

    }

    override fun onNetworkUnavailable() {
        dataAccess = AppRepository.Movie.ListMovie.SQL()

    }


}
