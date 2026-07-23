public class JedliksToyCar {

    public int driven ;
    public int battery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " +this.driven+ " meters";
    }

    public String batteryDisplay() {
        int res = 100-(this.driven/20);
        if(res <= 0)
            return "Battery empty";
        return "Battery at "+ res +"%";
    }

    public void drive() {
        if(this.driven != 2000)
            this.driven = this.driven + 20;
    }
}
