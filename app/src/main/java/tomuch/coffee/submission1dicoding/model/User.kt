package tomuch.coffee.submission1dicoding.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User(
    val username: String,
    val name: String,
    val location: String,
    val repository: Int,
    val company: String,
    val followers: Int,
    val following: Int,
    val avatar: Int,
) : Parcelable