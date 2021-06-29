package tomuch.coffee.submission1dicoding.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tomuch.coffee.submission1dicoding.DetailActivity
import tomuch.coffee.submission1dicoding.databinding.ItemUserBinding
import tomuch.coffee.submission1dicoding.model.User

class UserAdapter(private val arrayUser: ArrayList<User>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindUser(arrayUser[position])
        holder.binding.imgPhoto.setImageResource(arrayUser[position].avatar)
        holder.binding.txtName.text = arrayUser[position].name
        holder.binding.txtUserName.text = arrayUser[position].username

    }

    override fun getItemCount(): Int {
        return arrayUser.size
    }

    inner class ViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindUser(user: User) {
            binding.layout.setOnClickListener {
                val intent = Intent(binding.layout.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_USER, user)
                binding.layout.context.startActivity(intent)
            }
        }

    }


}