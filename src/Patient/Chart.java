package Patient;

import Appointment.Appointment;

public class Chart {

    public String patientName;
    public Appointment appointment;
    public String prescription;


    public void Chart(String patientName, Appointment appointment, String prescription) {
        this.patientName = patientName;
        this.appointment = appointment;
        this.prescription = prescription;
    }

    public String toString() {
        return "Name: " + this.patientName
                + "\nAppointment: " + this.appointment.toString()
                + "\nPrescription: " + this.prescription;
    }


}
