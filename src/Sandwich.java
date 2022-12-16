public class Sandwich {
    String mainIngredient;
    String breadType;
    double price;

    public void setMainIngredient(String ingredient){
        mainIngredient = ingredient;
    }

    public String getMainIngredient(){
        return mainIngredient;
    }

    public void setBreadType(String bread){
        breadType = bread;
    }

    public String getBreadType(){
        return breadType;
    }

    public void setPrice(double prc){
        price = prc;
    }

    public double getPrice(){
        return price;
    }
}
