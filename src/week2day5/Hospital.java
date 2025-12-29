package week2day5;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Hospital {
    public static void main(String[] args) {

        ArrayList<String> doctorList = new ArrayList<>();
        doctorList.add("Dr. A");
        doctorList.add("Dr. B");

        try {
            for (String d : doctorList) {
                doctorList.add("Dr. C");
            }
        } catch (Exception e) {
            System.out.println("Fail-Fast: ConcurrentModificationException");
        }

        CopyOnWriteArrayList<String> liveDoctorList = new CopyOnWriteArrayList<>();
        liveDoctorList.add("Dr. X");
        liveDoctorList.add("Dr. Y");

        for (String d : liveDoctorList) {
            liveDoctorList.add("Dr. Z");
        }

        System.out.println("Fail-Safe Live Doctors: " + liveDoctorList);
    }
}
