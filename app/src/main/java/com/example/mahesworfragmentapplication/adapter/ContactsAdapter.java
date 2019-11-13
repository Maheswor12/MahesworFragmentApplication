package com.example.mahesworfragmentapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mahesworfragmentapplication.ContactDetails;
import com.example.mahesworfragmentapplication.R;
import com.example.mahesworfragmentapplication.model.Contacts;
import com.example.mahesworfragmentapplication.ui.recycler.RecyclerFragment;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
    RecyclerFragment mContext;
    List<Contacts> contactsList;

    //    Constructor to receive the data from the activity
    public ContactsAdapter(RecyclerFragment mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_contact_details, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        final Contacts contacts = contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageid());
        holder.contactName.setText(contacts.getName());
        holder.contactPhone.setText(contacts.getPhoneno());

        holder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ContactDetails.class);
                intent.putExtra("image", contacts.getImageid());
                intent.putExtra("Phone", contacts.getPhoneno());
                intent.putExtra("name", contacts.getName());

                mContext.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imgProfile;
        TextView contactName, contactPhone;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imageView2);
            contactName = itemView.findViewById(R.id.contactName);
            contactPhone = itemView.findViewById(R.id.contactPhone);

        }
    }
}
