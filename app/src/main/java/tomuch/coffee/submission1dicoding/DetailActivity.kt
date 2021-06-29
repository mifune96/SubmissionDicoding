package tomuch.coffee.submission1dicoding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import tomuch.coffee.submission1dicoding.databinding.ActivityDetailBinding
import tomuch.coffee.submission1dicoding.model.User

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user: User? = intent.getParcelableExtra(EXTRA_USER)

        Glide.with(this@DetailActivity).load(user?.avatar).into(binding.ivAvatar)
        binding.tvCompany.text = user?.company
        binding.tvLocation.text = user?.location
        binding.tvUsername.text = user?.username
        binding.tvName.text = user?.name
        binding.tvFollowing.text = user?.following.toString()
        binding.tvFolower.text = user?.followers.toString()
        binding.tvRepository.text = user?.repository.toString()

    }
}