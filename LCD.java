public class LCD {

    //isi bagian ini
    // Mendeklarasikan variabel status, volumme, brightness, dan cable
    private String Status;
    private int Volume;
    private int Brightness;
    private String Cable;

    // Default konstruktor
    public LCD() {
        Status = "";
        Volume = 0;
        Brightness = 0;
        Cable = "";
    }
    
    //buat method yang ada pada soal 
    // Deklarasi method untuk Status
    public void turnOff() {
        this.Status = "Off";
    }

    public void turnOn() {
        this.Status = "On";
    }

    public void Freeze() {
        this.Status = "Freeze";
    }

    // Deklarasi method untuk Volume
    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    public void volumeUp() {
        this.Volume++; // Untuk meningkatkan volume LCD
    }

    public void volumeDown() {
        if (this.Volume > 0) {
            this.Volume--; // Untuk menurunkan volume LCD
        }
    }

    // Deklarasi method untuk Brightness
    public void setBrightness(int Brightness) {
        this.Brightness = Brightness;
    }

    public void brightnessUp() {
        this.Brightness++; // Unuk menambah kecerahan LCD
    }

    public void brightnessDown() {
        if (this.Brightness > 0) {
            this.Brightness--; // Untuk mengurangi kecerahan LCD
        } 
    }

    public void setCable(int option) {
        //lengkapi method ini dengan mennggunakan array
        String[] Cable = {"VGA", "DVI", "HDMI", "DisplayPort"}; // Membuat array untuk menyimpan data jenis kabel
        if (option >= 0 && option < Cable.length) { // Untuk memastikan rentang nilai option sesuai dengan indeks array
            this.Cable = Cable[option]; // Jika sesuai maka akan menampilkan jenis kabel
        } else {
            System.out.println("Tidak Tersedia"); // Akan muncul jika nilai yang diberikan tidak sesuai
        }           
    }
    
    public void displayMessage() {
        //lengkapi method ini
        System.out.println("LCD Status: " + this.Status);
        System.out.println("Volume: " + this.Volume);
        System.out.println("Brightness: " + this.Brightness);
        System.out.println("Cable: " + this.Cable);
    }
}
