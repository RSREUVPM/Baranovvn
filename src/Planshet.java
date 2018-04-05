
public class Planshet {

    public int razmer;
    public String material;
    public String vid;

    public Planshet() {
    }

    public Planshet(int raz, String mat, String vid) {
        this.razmer = raz;
        this.material = mat;
        this.vid = vid;
    }

    public int getRazmer() {
        return razmer;
    }

//    public void setRazmer(int razmer) {
//        this.razmer = razmer;
//    }

    public String getMaterial() {
        return material;
    }

//    public void setMaterial(String material) {
//        this.material = material;
//    }

    public String getVid() {
        return vid;
    }

//    public void setVid(String vid) {
//        this.vid = vid;
//    }
}