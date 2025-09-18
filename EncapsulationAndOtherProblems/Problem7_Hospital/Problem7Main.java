public class Problem7Main {
    public static void main(String[] args){
        InPatient ip = new InPatient("P001","Aman",45,5);
        OutPatient op = new OutPatient("P002","Sita",30);
        ip.addRecord("Surgery"); op.addRecord("Consultation");
        System.out.println(ip.getPatientId()+" Bill: "+ip.calculateBill()+" Records: "+ip.viewRecords());
        System.out.println(op.getPatientId()+" Bill: "+op.calculateBill()+" Records: "+op.viewRecords());
    }
}
