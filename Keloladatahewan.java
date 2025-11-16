package Challenge;
class Hewan {
    protected String nama;
    protected String jenis;
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}
class Mamalia extends Hewan {
    private int jumlahKaki;
    private String habitat;

    public Mamalia(String nama, String jenis, int jumlahKaki, String habitat) {
        super(nama, jenis);
        this.jumlahKaki = jumlahKaki;
        this.habitat = habitat;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kaki: " + jumlahKaki);
        System.out.println("Habitat: " + habitat);
    }
}
class Burung extends Hewan {
    private int jumlahKaki;
    private String habitat;

    public Burung(String nama, String jenis, int jumlahKaki, String habitat) {
        super(nama, jenis);
        this.jumlahKaki = jumlahKaki;
        this.habitat = habitat;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kaki: " + jumlahKaki);
        System.out.println("Habitat: " + habitat);
    }
}
public class Keloladatahewan {
    public static void main(String[] args) {
        System.out.println("Program Pengelolaan Data Hewan");
        Hewan hewan1 = new Mamalia("Singa", "Karnivora", 4, "Savana");
        Hewan hewan2 = new Burung("Elang", "Pemakan Daging", 2, "Pegunungan");

        System.out.println("\nInformasi Hewan 1:");
        hewan1.tampilkanInfo();

        System.out.println("\nInformasi Hewan 2:");
        hewan2.tampilkanInfo();
    }
}
