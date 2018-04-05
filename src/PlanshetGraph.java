

public class PlanshetGraph extends Planshet {
    private String color;

    public PlanshetGraph (int razmer, String material, String vid) {
        super(razmer, material, vid);
        this.color ="white";
    }

//    public PlanshetGraph() {
//        this.color ="color";
//    }

    public  String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
