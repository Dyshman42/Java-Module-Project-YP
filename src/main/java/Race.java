public class Race {
    String winner = "";
    int spaceValue = 0;

    public void calculateWinner(Auto autos) {
        int space = autos.speed * 24;
        if (spaceValue < space) {
            winner = autos.name;
            spaceValue = space;
        }
    }

    public String getWinner() {

        return winner;
    }
}