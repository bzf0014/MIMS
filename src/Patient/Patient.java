package Patient;

import Appointment.Appointment;

public class Patient {
    public String name;
    public Chart chart;

    public Patient(String name, Chart chart) {
        this.name = name;
        this.chart = chart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chart getChart() {
        return this.chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public String displayChart() {
        return this.chart.toString();
    }


}
