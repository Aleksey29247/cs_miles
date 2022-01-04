public class BonusMilesService {
    public int calculate(int cost, int bonus_miles) {
        if (cost < bonus_miles) {
            return 0;
        } else {
            return (int) (cost / bonus_miles);
        }
    }
}
