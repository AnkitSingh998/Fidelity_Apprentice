public class Product {
    int ProductID;
    String ProductName;
    double ProductPrice;
    public Product(int ProductID,String ProductName , double price)
    {
        this.ProductID=ProductID;
        this.ProductName=ProductName;
    }
    public void display()
    {
        System.out.println("Product ID: " + ProductID + "\nProduct Name: " + ProductName + "\nProduct Price: " + ProductPrice);
    }
    public static void main(String[]args)
    {
        Product[] products=new Product[5];
        products[0]=new Product(101,"Laptop",5000);
        products[1]=new Product(102,"Smartphone",2000);
        products[2]=new Product(103,"Tablet",200);
        products[3]=new Product(104,"Smartwatch",8000);
        products[4]=new Product(105,"Headphones",7000);

        for(int i=0;i<products.length;i++)
        {
            products[i].display();
        }


    }

}
