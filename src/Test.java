



public class Test {

    public static void main(String[] args) {
        Planshet planshetGraph = new PlanshetGraph(4, "derevo", "white");
        Planshet planshetVoen = new PlanshetVoen(3, "derevo", "blue");
        System.out.println("PlanshetGraph is material? " + planshetGraph.getMaterial());
        System.out.println("PlanshetVoen " + planshetVoen.getVid());
        System.out.println("PlanshetVoen " + planshetVoen.getMaterial() + " Material.");
        // System.out.println("PlanshetGraph color is" + planshetGraph.getColor());
    }

}
