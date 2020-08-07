package com.example.constantinekim.fragmentsinteraction2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.constantinekim.fragmentsinteraction2.Model.Phone;
import com.example.constantinekim.fragmentsinteraction2.R;

import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Phone> phones;

    public PhoneAdapter(Context context, List<Phone> phones) {
        this.inflater = LayoutInflater.from(context);
        this.phones = phones;
    }

    @NonNull
    @Override
    public PhoneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneAdapter.ViewHolder holder, int position) {
        Phone phone = phones.get(position);
        holder.image.setImageResource(phone.getImage());
        holder.productName.setText(phone.getModelName());
        holder.productCompany.setText(phone.getCompanyName());
    }

    @Override
    public int getItemCount() {
        return phones.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView productName;
        private TextView productCompany;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.product_image);
            productName = itemView.findViewById(R.id.product_name);
            productCompany = itemView.findViewById(R.id.product_company);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
