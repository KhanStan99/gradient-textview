package `in`.trentweet.gradienttextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setColors(R.color.colorOne, R.color.colorTwo)
        two.setColors(R.color.colorTwo, R.color.colorThree)
        three.setColors(R.color.colorThree, R.color.colorOne)

    }
}
