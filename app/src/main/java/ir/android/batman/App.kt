package ir.android.batman

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump
import ir.android.batman.model.DaoMaster
import ir.android.batman.model.DaoMaster.DevOpenHelper
import ir.android.batman.model.DaoSession

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        val helper = DevOpenHelper(this, "batman-db")
        val db = helper.writableDb
        daoSession = DaoMaster(db).newSession()

        ViewPump.init(
            ViewPump.builder()
                .addInterceptor(
                    CalligraphyInterceptor(
                        CalligraphyConfig.Builder()
                            .setDefaultFontPath("fonts/Shabnam.ttf")
                            .setFontAttrId(R.attr.fontPath)
                            .build()
                    )
                )
                .build()
        )

    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        try {
            MultiDex.install(this)
        } catch (multiDexException: RuntimeException) {
            multiDexException.printStackTrace()
        }
    }

    companion object {
        var UrlMovie = "http://www.omdbapi.com/?apikey=3e974fca&s=batman"
        var UrlDetails = "http://www.omdbapi.com/?apikey=3e974fca&i="
        var debugMode = true
        var daoSession: DaoSession? = null
    }
}