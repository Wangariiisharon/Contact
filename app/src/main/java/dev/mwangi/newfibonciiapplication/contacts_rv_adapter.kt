package dev.mwangi.newfibonciiapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.mwangi.newfibonciiapplication.databinding.ContactListItemBinding

class contacts_rv_adapter(var contactList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemBinding.
        inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        with(holder.binding) {
            tvAdress.text = currentContact.address
            tvName.text = currentContact.name
            tvPhoneNo.text = currentContact.phone
            tvEmail.text = currentContact.email
            Picasso.get()
                .load(currentContact.image)
                .resize(300,300)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_perm_contact_calendar_24)
                .error(R.drawable.ic_baseline_perm_contact_calendar_24)
                .into(imgContact)
        }
    }



    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root){

    



}