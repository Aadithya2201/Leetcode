class Solution {
    public double[] convertTemperature(double celsius) {
        double[] mod = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius *1.80 +32.00;
        mod[0]=kelvin;
        mod[1]=fahrenheit;
        return mod;
    }
}