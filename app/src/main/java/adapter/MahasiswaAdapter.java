package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.promobile.taufiqs.portalti2016.R;

import java.util.List;

import entity.Mahasiswa;
import holder.MahasiswaHolder;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaHolder>{

    private List<Mahasiswa> mahasiswas;

    public MahasiswaAdapter(List<Mahasiswa> mahasiswas) {this.mahasiswas = mahasiswas;}

    @Override
    public MahasiswaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa, parent, false);
        final MahasiswaHolder mahasiswaHolder = new MahasiswaHolder(itemView);

        return mahasiswaHolder;
    }

    @Override
    public void onBindViewHolder(MahasiswaHolder holder, int position) {
        holder.txtNama.setText(mahasiswas.get(position).getName());
        holder.txtNim.setText(mahasiswas.get(position).getNim());
    }

    @Override
    public int getItemCount() {
        return mahasiswas.size();
    }
}