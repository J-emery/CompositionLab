package vehicles;

public class Motor implements IMotorised {
    private int hp;
    private int fuel;
    private Motor (int fuel, int power) {
        this.hp = power;
        this.fuel = fuel;
    }

    @Override
    public void startEngine() {
        System.out.println("Vrooom Vrooom");
    }

    @Override
    public void stopEngine() {
        System.out.println("...");
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
