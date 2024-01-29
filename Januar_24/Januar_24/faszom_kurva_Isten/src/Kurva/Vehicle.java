package Kurva;

import java.util.Objects;

public class Vehicle {
    private VehicleStatus status;
    private int numberOfWheels;
    private String id;

    public Vehicle(String id) {
        this.id = id;
    }

    public Vehicle(int numberOfWheels, String id) {
        this.numberOfWheels = numberOfWheels;
        this.id = id;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public void setMove() {
        status = VehicleStatus.MOVE;
    };

    public void setStop() {
        status = VehicleStatus.STOP;
    }

    public void setPark() {
        status = VehicleStatus.PARK;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "status=" + status +
                ", numberOfWheels=" + numberOfWheels +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfWheels == vehicle.numberOfWheels && status == vehicle.status && Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, numberOfWheels, id);
    }
}
