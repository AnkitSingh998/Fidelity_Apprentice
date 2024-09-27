public class game {
    String Name;
    int MaxNumPlayers;

    public game(String Name,int MaxNumPlayers)
    {
        this.Name = Name;
        this.MaxNumPlayers = MaxNumPlayers;
    }

    public void ToString()
    {
        System.out.println("Name: " + Name);
        System.out.println("Max Num Players: " + MaxNumPlayers);

    }
}
   class GameWithTimeLimit extends game{
    int TimeLimit;

    public GameWithTimeLimit(String Name,int MaxNumPlayers,int TimeLimit)
    {
        super(Name,MaxNumPlayers);
        this.TimeLimit = TimeLimit;
    }
    @Override
    public void ToString()
    {
        super.ToString();
        System.out.println("TimeLimit: " + TimeLimit);
    }
    public void display()
    {
        System.out.println("Name: " + Name);
        System.out.println("Max Num Players: " + MaxNumPlayers);
        System.out.println("TimeLimit: " + TimeLimit);
    }
}
