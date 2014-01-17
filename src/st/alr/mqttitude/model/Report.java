package st.alr.mqttitude.model;

import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.LocationClient;

import st.alr.mqttitude.App;
import st.alr.mqttitude.db.Waypoint;
import st.alr.mqttitude.preferences.ActivityPreferences;

public class Report {
    GeocodableLocation location;
    Waypoint waypoint;
    int transition;
    int battery;
    
    
    public Report(GeocodableLocation l){
        this.location = l;
        transition = -1;
        battery = -1;
        waypoint = null;
    }
   

    public void setWaypoint(Waypoint waypoint) {
        this.waypoint = waypoint;
    }


    public void setTransition(int transition) {
        this.transition = transition;
    }


    public void setBattery(int battery) {
        this.battery = battery;
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        builder.append("{");
        builder.append("\"_type\": ").append("\"").append("location").append("\"");
        builder.append(", \"lat\": ").append("\"").append(location.getLatitude()).append("\"");
        builder.append(", \"lon\": ").append("\"").append(location.getLongitude()).append("\"");
        builder.append(", \"tst\": ").append("\"").append((int)(location.getTime()/1000)).append("\"");
        builder.append(", \"acc\": ").append("\"").append(Math.round(location.getLocation().getAccuracy() * 100) / 100.0d).append("\"");

        if(battery != -1)
            builder.append(", \"batt\": ").append("\"").append(battery).append("\"");

        if(this.waypoint != null && ( 0 <= transition && transition  <= 1)  ) {
            builder.append(", \"desc\": ").append("\"").append(this.waypoint.getDescription()).append("\"");
            builder.append(", \"event\": ").append("\"").append(transition == Geofence.GEOFENCE_TRANSITION_ENTER ? "enter" : "leave" ).append("\"");            
        }
        
        return builder.append("}").toString();
        
            
    }


    public GeocodableLocation getLocation() {
        return location;
    }


    public Waypoint getWaypoint() {
        return waypoint;
    }


    public int getTransition() {
        return transition;
    }


    public int getBattery() {
        return battery;
    }

}