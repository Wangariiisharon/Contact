package dev.mwangi.newfibonciiapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mwangi.newfibonciiapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact=Contact("Anne","071062010","anne.com","616","https://images.pexels.com/photos/718978/pexels-photo-718978.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact1=Contact("Cheko","07001234","cheko.com","616","https://images.pexels.com/photos/1164674/pexels-photo-1164674.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact2=Contact("lavyne","070987678","lavyne.com","616","https://images.pexels.com/photos/3214751/pexels-photo-3214751.jpeg?auto=compress&cs=tinysrgb&w=400 ")
        var contact3=Contact("Shein","0787654321","shein.com","616","https://images.pexels.com/photos/946240/pexels-photo-946240.jpeg?auto=compress&cs=tinysrgb&w=400 ")
        var contact4=Contact("Klein","0745784320","klein.com","616","https://images.pexels.com/photos/936102/pexels-photo-936102.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact5=Contact("Shikoh","077980656","shikoh.com","616","https://images.pexels.com/photos/3170635/pexels-photo-3170635.jpeg?auto=compress&cs=tinysrgb&w=400")

        var contactList= listOf(contact,contact1,contact2,contact3,contact4,contact5)
        var contactsAdapter=contacts_rv_adapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdapter


    }
}