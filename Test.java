import java.util.HashMap;

class Test {

    public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder res = new StringBuilder();
        res.append(numerator / denominator + ".");
        int rem = Math.abs(numerator) % Math.abs(denominator);
        HashMap<Integer, Integer> remMap = new HashMap<>();
        while(rem != 0){
            if (remMap.get(rem) != null) {
                res.insert(remMap.get(rem)-1, "(");
                res.append(")");
                break;
            };
            res.append((rem * 10) / denominator);
            remMap.put(rem, res.length());
            rem = (rem * 10) % denominator;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res = fractionToDecimal(4, 333);
        System.out.println(res);
        System.out.println((10l / 2l));
    }
}