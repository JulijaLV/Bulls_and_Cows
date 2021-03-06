class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        Double result;

        try {
            result = Double.parseDouble(input);
        }
        catch (Exception e) {
            result = 0.0;
        }
        return result;
    }
}