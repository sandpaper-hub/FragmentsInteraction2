package com.example.constantinekim.fragmentsinteraction2.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.constantinekim.fragmentsinteraction2.Adapter.PhoneAdapter;
import com.example.constantinekim.fragmentsinteraction2.Model.Phone;
import com.example.constantinekim.fragmentsinteraction2.R;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {
    List<Phone> phoneList = new ArrayList<>();
    public OnFragmentInteraction listener;
    private PhoneAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.phones_list);
        adapter = new PhoneAdapter((Context) listener, phoneList);
        recyclerView.setAdapter(adapter);
        initialize();
        return view;
    }

    public interface OnFragmentInteraction {
        void onFragmentInteraction(String model);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (OnFragmentInteraction) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " не реализует интерфейс");
        }
    }

    private void initialize() {
        phoneList.add(new Phone("Galaxy Fold", "Samsung", R.drawable.galaxy_fold));
        phoneList.add(new Phone("P30 PRO", "Huawei", R.drawable.huawei_p30pro));
        phoneList.add(new Phone("IPhone 11 PRO", "Apple", R.drawable.iphone_11pro));
        phoneList.add(new Phone("One Plus 7 PRO", "OnePlus", R.drawable.one_plu7pro));
    }
}