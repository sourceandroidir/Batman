package ir.android.batman.api.repository

import android.content.Context
import ir.android.batman.App
import ir.android.batman.BaseActivity
import ir.android.batman.api.API.InterfaceArrayList
import ir.android.batman.api.API.InterfaceJsonObject
import ir.android.batman.model.DetailsMovie
import ir.android.batman.model.DetailsMovieDao
import ir.android.batman.model.ListMovie
import ir.android.batman.model.ListMovieDao
import java.util.*

class AppRepository {

    interface ListInterface {
        fun list(
            context: Context?,
            listener: InterfaceArrayList<ListMovie>?
        )
    }

    interface DetailsInterface {
        fun list(
            context: Context?,
            imdbID: String,
            listener: InterfaceJsonObject<DetailsMovie>?

        )
    }


    class Movie {

        class ListMovie {
            class SQL : ListInterface {
                override fun list(
                    context: Context?,
                    listener: InterfaceArrayList<ir.android.batman.model.ListMovie>?
                ) {
                    try {
                        val mcc: ListMovieDao = App.daoSession!!.getListMovieDao()
                        val s: List<ir.android.batman.model.ListMovie?> = mcc.queryBuilder().list()
                        listener!!.lambda(ArrayList<ir.android.batman.model.ListMovie>(s), null)
                        BaseActivity.toast(context!!, " Your Offline ")

                    } catch (e: Exception) {
                        listener!!.lambda(null, e.message)
                    }
                }
            }

            class API : ListInterface {
                override fun list(
                    context: Context?,
                    listener: InterfaceArrayList<ir.android.batman.model.ListMovie>?
                ) {
                    ir.android.batman.api.API.Movie.getList(context, listener!!)

                }
            }
        }

        class DetailsMovie {
            class SQL : DetailsInterface {
                override fun list(
                    context: Context?,
                    imdbID: String,
                    listener: InterfaceJsonObject<ir.android.batman.model.DetailsMovie>?
                ) {
                    try {
                        val mcc: DetailsMovieDao = App.daoSession!!.getDetailsMovieDao()
                        val s: List<ir.android.batman.model.DetailsMovie>? =
                            mcc.queryBuilder().where(DetailsMovieDao.Properties.ImdbID.eq(imdbID))
                                .list()
                        listener!!.lambda((s!![0]), null)
                        BaseActivity.toast(context!!, " Your Offline ")

                    } catch (e: Exception) {
                        listener!!.lambda(null, e.message)
                    }
                }
            }


            class API : DetailsInterface {
                override fun list(
                    context: Context?, imdbID: String,
                    listener: InterfaceJsonObject<ir.android.batman.model.DetailsMovie>?
                ) {
                    ir.android.batman.api.API.Movie.getDetails(context, imdbID, listener!!)
                }

            }
        }
    }
}