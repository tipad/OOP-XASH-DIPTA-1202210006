public class mainApp{
    public static void main(String[] args){
        Perangkat Perangkat = new Perangkat("Adata", 2, 1.5F);
        Perangkat.informasi();
        System.out.println("");

        Laptop provid = new Laptop("provid", 16, 2.50F, true);
        provid.webcam = true;
        provid.informasi();
        provid.bukaGame("Overwatch 2");
        provid.kirimEmail("javakey@gmail.com");
        provid.kirimEmail("default@gmail.com", "gateway@gmail.com");
        System.out.println("");

        Handphone manage = new Handphone("snap", 2, 3.20F, false);
        manage.informasi();
        manage.telfon(853373707);
        manage.kirimSMS(823908817);
        manage.kirimSMS(82907775, 821804372);
    }
}