package Tugas.PM1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;


public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {
    private List<Itemlist> itemList;

    public AdapterList(List<Itemlist> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public AdapterList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, null);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Itemlist item = itemList.get(position);
        holder.judul.setText(item.getJudul());
        holder.subjudul.setText(item.getSubJudul());
        Glide.with(holder.imageView.getContext()).load(item.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView judul, subjudul;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_image);
            judul = itemView.findViewById(R.id.title);
            subjudul = itemView.findViewById(R.id.sub_title);
        }
    }
}
