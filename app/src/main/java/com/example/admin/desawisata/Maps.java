package com.example.admin.desawisata;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.AppCompatActivity;


public class Maps extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;

    public static Maps newInstance() {return new Maps();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps, container, false);

        return view;
    }
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Indonesia = new LatLng(-7.797068, 110.370529);
        mMap.addMarker(new MarkerOptions().position(Indonesia).title("Marker in Indonesia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Indonesia));
    }
}
