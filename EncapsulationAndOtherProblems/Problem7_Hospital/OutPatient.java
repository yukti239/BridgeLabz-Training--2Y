public class OutPatient extends Patient implements MedicalRecord {
    private StringBuilder records = new StringBuilder();
    public OutPatient(String id,String name,int age){ super(id,name,age); }
    public double calculateBill(){ return 500; }
    public void addRecord(String record){ records.append(record).append("; "); }
    public String viewRecords(){ return records.toString(); }
}
