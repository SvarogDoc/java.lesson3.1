public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMiles = 20;
        int price = 10_000;
        int miles = price / bonusMiles;
        return miles;

    }
}
