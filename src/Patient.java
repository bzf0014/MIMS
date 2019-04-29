public class Patient {
    public String name;
    public Chart chart;
    public Appointment appointment;

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
