//https://leetcode.com/problems/convert-the-temperature/description/
//time complexity: O(1)
//space complexity: O(1)
//approach: we can use the formula to convert celsius to fahrenheit and celsius to kelvin. The formula to convert celsius to fahrenheit is (celsius * 1.8) + 32 and the formula to convert celsius to kelvin is celsius + 273.15. We can store the results in an array and return it.
//technique used: math  
class ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double[] result=new double[2];
        result[1]=(celsius*1.8)+32;
        result[0]=celsius+273.15;
        return result;
    }
}