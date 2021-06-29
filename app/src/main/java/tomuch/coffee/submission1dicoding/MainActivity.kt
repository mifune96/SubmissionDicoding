package tomuch.coffee.submission1dicoding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import tomuch.coffee.submission1dicoding.adapter.UserAdapter
import tomuch.coffee.submission1dicoding.databinding.ActivityMainBinding
import tomuch.coffee.submission1dicoding.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvItem.layoutManager = LinearLayoutManager(this)
        binding.rvItem.adapter = UserAdapter(getUser())

    }

    private fun getUser(): ArrayList<User> {
        val getUsername = resources.getStringArray(R.array.username)
        val getName = resources.getStringArray(R.array.name)
        val getLocation = resources.getStringArray(R.array.location)
        val getrepository = resources.getIntArray(R.array.repository)
        val getcompany = resources.getStringArray(R.array.company)
        val getfollowers = resources.getIntArray(R.array.followers)
        val getfollowing = resources.getIntArray(R.array.following)
        val getavatar = resources.obtainTypedArray(R.array.avatar)

        val arrLisUser: ArrayList<User> = arrayListOf()
        for (i in getUsername.indices) {
            arrLisUser.add(
                User(
                    getUsername[i],
                    getName[i],
                    getLocation[i],
                    getrepository[i],
                    getcompany[i],
                    getfollowers[i],
                    getfollowing[i],
                    getavatar.getResourceId(i, -1)
                )
            )
        }
        return arrLisUser
    }
}