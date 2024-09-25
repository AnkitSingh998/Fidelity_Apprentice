public class Category extends Product{
    int CategoryID;
    String CategoryName;
    @Override
    public void display()
    {
        super.display();
        System.out.println("Category ID: " + CategoryID + " Category Name: " + CategoryName);
    }
}
