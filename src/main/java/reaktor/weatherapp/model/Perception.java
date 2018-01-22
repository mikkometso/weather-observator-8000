package reaktor.weatherapp.model;

import javax.persistence.*;

@Entity
public class Perception {

    // ======== Properties: ======== //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERCEPTION_ID")
    private Long perceptionId; // Automatically generated perception Id number

    @Column(name = "TIMESTAMP")
    private String timestamp;

    @Column(name = "TEMPERATURE")
    private String temperature;

    @Column(name = "STATION")
    private Station station;

    // ======== Constructors: ======== //

    public Perception() {}

    public Perception(String timestamp, String temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    public Perception(String timestamp, String temperature, Station station) {
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.station = station;
    }

    // ======== Getters / Setters: ======== //

    public Long getPerceptionId() {
        return perceptionId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }
// ======== toString: ======== //

    @Override
    public String toString() {
        return "Perception{" +
                "perceptionId=" + perceptionId +
                ", timestamp='" + timestamp + '\'' +
                ", temperature='" + temperature + '\'' +
                ", station=" + station +
                '}';
    }
}