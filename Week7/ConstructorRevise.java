package Week7;
public class ConstructorRevise {
    public static void main(String[] args) {
        NonParameterizedConstructor np = new NonParameterizedConstructor();
        System.out.println(np.data2);

        ParameterizedConstructor pc = new ParameterizedConstructor(11, "Shyam");
        System.out.println(pc.data2);
        pc.data2 = "Changing";
        // pc.data1 = 100;

        pc.setData1(100);
        System.out.println(pc.getData1());

        Song s1 = new Song("Sajhni Rey", 2.11);
        Song s2 = new Song("Dishomm", 2.20);
        s1.setDuration(3.11);
        s2.setArtists("Garjid");
        s1.setArtists("Arjit");
        s1.album = "prajwal re";
        s1.description = "Prajwal is good singer";

        s2.album = "Gaurab re";
        s2.description = "Gaurab is singing live";

        System.out.println("Song1");
        System.out.println("Title: "+s1.getTitle());
        System.out.println("Duration: "+s1.getDuration());
        System.out.println("Artist: "+s1.getArtists());
        System.out.println("Album: "+s1.album);
        System.out.println("Description: "+s1.description);
        System.out.println("Song2");
        System.out.println("Title: "+s2.getTitle());
        System.out.println("Duration: "+s2.getDuration());
        System.out.println("Artist: "+s2.getArtists());
        System.out.println("Album: "+s2.album);
        System.out.println("Description: "+s2.description);
        

    }
}

class ParameterizedConstructor {
    private int data1;
    String data2;

    // write-only access to private property
    void setData1(int data1){
        this.data1 = data1;
    }
    

    // read-only access to private property

    int getData1() {
        return data1;
    }


    ParameterizedConstructor(int data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }
}

class NonParameterizedConstructor {
    private int data1;
    String data2;


    NonParameterizedConstructor() {
        data1=10;
        data2="Ram";
        System.out.println("Running in object Creation");
    }
}

class Song {
    private int id;
    private String title;
    private double duration;
    private String artists;
    String album;
    String description;

    Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getArtists() {
        return artists;
    }

    
}