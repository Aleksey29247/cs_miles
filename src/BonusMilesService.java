public class BonusMilesService {
   private int _bonus_miles;
    public int get() {
        return _bonus_miles;
    }
    public void set (int bonus_miles) {
        _bonus_miles=bonus_miles;
    }
    public BonusMilesService(){

        _bonus_miles=0;
    };
    public  int calculate(int cost)
    {
        if (cost< _bonus_miles)
            return 0;
        else
            return (int)(cost/_bonus_miles);
    }

}
