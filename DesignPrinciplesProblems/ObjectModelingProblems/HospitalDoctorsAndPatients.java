import java.util.*;

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        System.out.println(name + " consults " + p.name);
    }
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
}

public class SelfProblem3_HospitalDoctorsAndPatients {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Alice");
        Patient p = new Patient("Bob");
        d.consult(p);
    }
}