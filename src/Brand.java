public class Brand extends Category{
    String BrandName;
    @Override
    public void display() {
        super.display();
        System.out.println("Brand: " + BrandName);
    }
}
