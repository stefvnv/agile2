public class Converter {

    //Method signature
    public double convertUSDtoEUR(double USD, double xRate) {

        if (USD >= 100 && USD <= 10000 && xRate >= 0.5 && xRate <= 1.6){
            return USD * xRate;

        }else
            return -99.00;
    }
}

