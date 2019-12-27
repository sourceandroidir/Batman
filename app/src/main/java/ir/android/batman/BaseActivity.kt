package ir.android.batman

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import io.github.inflationx.viewpump.ViewPumpContextWrapper

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

    companion object {

        fun span(s: String, end: Int, proportion: Float): CharSequence? {
            val temp = SpannableString(s)
            temp.setSpan(RelativeSizeSpan(proportion), 0, end, 0)
            temp.setSpan(ForegroundColorSpan(Color.parseColor("#FFC107")), 0, end, 0) // set color
            return temp
        }

        fun toast(c: Context, txt: String) {
            val toast = android.widget.Toast.makeText(c, txt, android.widget.Toast.LENGTH_LONG)
            val txt_toast = toast.view.findViewById<TextView>(android.R.id.message)
            txt_toast.setTextColor(Color.WHITE)
            txt_toast.gravity = Gravity.CENTER_VERTICAL or Gravity.CENTER_HORIZONTAL
            val V = toast.view
            V.setBackgroundResource(R.drawable.bk_toast)
            val bgShape: GradientDrawable
            bgShape = V.background as GradientDrawable
            bgShape.setColor(Color.parseColor("#040B50"))
            toast.show()
        }


    }


}