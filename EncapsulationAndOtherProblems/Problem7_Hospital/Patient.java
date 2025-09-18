public abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    public Patient(String id,String name,int age){ this.patientId=id; this.name=name; this.age=age; }
    public String getPatientId(){ return patientId; }
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public abstract double calculateBill();
    public void getPatientDetails(){ System.out.println(patientId+" "+name+" "+age); }
}
