package empat;

public class Komputer {
    String Processor;
    String Ram;
    String VGA;
    int Monitor;
    Komputer(String processor, String ram, String vga, int monitor) // Constructor
    {
        Processor = processor;
        Ram = ram;
        VGA = vga;
        Monitor = monitor;
    }

    String setMonitor()
    {
        return Integer.toString(Monitor)+" Inch";
    }

    void tampilkanData() {
        System.out.println("Informasi Komputer");
        System.out.println("Processor : "+Processor);
        System.out.println("Ram : "+Ram);
        System.out.println("VGA : "+VGA);
        System.out.println("Monitor : "+setMonitor());
    }

    public static void main(String args[])
    {
        Komputer komputer = new Komputer("Dual Core", "2 Gb", "320 Gb", 16);
        komputer.tampilkanData();
    }
}
