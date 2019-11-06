package bonch.dev.fifthhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var buttonUserActivity : Button
    private lateinit var buttonAlbumActivity : Button
    private lateinit var buttonPhotosActivity : Button
    private lateinit var buttonPostCreateDialogFragment : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        InitializeViews()
    }

    fun InitializeViews()
    {
        buttonUserActivity = button_user_activity
        buttonAlbumActivity = button_albums_activity
        buttonPhotosActivity = button_photos_activity
        buttonPostCreateDialogFragment = button_create_post_dialog_fragment
    }

    fun SEtListeners()
    {
        buttonUserActivity.setOnClickListener {

        }
        buttonAlbumActivity.setOnClickListener {

        }
        buttonPhotosActivity.setOnClickListener {

        }
        buttonPostCreateDialogFragment.setOnClickListener {

        }
    }
}
