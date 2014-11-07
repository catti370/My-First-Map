package com.example.myfirstmap;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.app.Activity;
import android.os.Bundle;

public class GPSLocatorActivity extends Activity {
	
	private GoogleMap googleMap;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpslocator);

        // Get a handle to the Map Fragment:
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();
        
        // Marker locations defined:
        LatLng linköping = new LatLng(58.24050, 15.34661);

        
        // Get set user location:
        map.setMyLocationEnabled(true);
        map.getMyLocation();
		
        // Add marker to map
        map.addMarker(new MarkerOptions()
                .title("Linköping")
                .snippet("The most populous city in Östergötland.")
                .position(linköping));
        
        // Other supported types include: MAP_TYPE_NORMAL,
        // MAP_TYPE_TERRAIN, MAP_TYPE_HYBRID and MAP_TYPE_NONE
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        }
    
}