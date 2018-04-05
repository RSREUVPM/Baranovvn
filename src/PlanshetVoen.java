
public class PlanshetVoen extends Planshet {
    private String color;

    public PlanshetVoen (int razmer, String material, String vid) {
        super(razmer, material, vid);

        this.color ="blue";
    }

    public PlanshetVoen() {

        this.color ="color";
    }

    public String getColor() {
        return color;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

}