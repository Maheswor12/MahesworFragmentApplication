package com.example.mahesworfragmentapplication.ui.recycler;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mahesworfragmentapplication.R;
import com.example.mahesworfragmentapplication.adapter.ContactsAdapter;
import com.example.mahesworfragmentapplication.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class RecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Ronaldo", "9866532456", R.drawable.ronaldo));
        contactsList.add(new Contacts("Dybala", "9887698765", R.drawable.dybala));
        contactsList.add(new Contacts("Hazard", "9853535352", R.drawable.hazard));
        contactsList.add(new Contacts("Kroos", "9874747438", R.drawable.kroos));
        contactsList.add(new Contacts("Marcello", "9877329227", R.drawable.marcello));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}