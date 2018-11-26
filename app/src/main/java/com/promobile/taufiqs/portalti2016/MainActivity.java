package com.promobile.taufiqs.portalti2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import adapter.MahasiswaAdapter;
import entity.DaftarMahasiswa;
import entity.Mahasiswa;
import network.Network;
import network.Routes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void requestDaftarMahasiswa() {
        Routes services = Network.request().create(Routes.class);

        services.getMahasiswa().enqueue(new Callback<DaftarMahasiswa>() {
            @Override
            public void onResponse(Call<DaftarMahasiswa> call, Response<DaftarMahasiswa> response) {
                if (response.isSuccessful()){
                    DaftarMahasiswa mahasiswa = response.body();

                    Log.d("TI2016", mahasiswa.getTitle());

                    MahasiswaAdapter adapter = new MahasiswaAdapter(mahasiswa.getData());
                }
            }

            @Override
            public void onFailure(Call<DaftarMahasiswa> call, Throwable t) {

            }
        });
    }
}
