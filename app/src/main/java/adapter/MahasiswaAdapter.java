package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import entity.Mahasiswa;

public class MahasiswaAdapter extends RecyclerView.Adapter<Mahasiswa> {

    public MahasiswaAdapter(List<Mahasiswa> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }

    @Override
    public Mahasiswa onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(Mahasiswa holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
