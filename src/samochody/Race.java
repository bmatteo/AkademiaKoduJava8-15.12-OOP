package samochody;

import java.util.List;

public class Race {
    private Car winner;
    private List<Car> players;

    public void addPlayer(Car car) {
        this.players.add(car);
    }

    public void chooseWinner() {
        if (this.players.size() <= 0)
            return;

        Car fastestCar = this.players.get(0);
        for (Car car : this.players) {
            if (car.getAcceleration() > fastestCar.getAcceleration()) {
                fastestCar = car;
            }
        }

        this.winner = fastestCar;
    }

    public void chooseWinner2() {
        if (this.players.size() <= 0)
            return;

        Car fastestCar = null;
        for (int i = 0; i <this.players.size(); i++) {
            if(i==0) {
                fastestCar = this.players.get(i);
            } else {
                if (this.players.get(i).getAcceleration() > fastestCar.getAcceleration()) {
                    fastestCar = this.players.get(i);
                }
            }
        }

        this.winner = fastestCar;
    }
}
