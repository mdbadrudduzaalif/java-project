package Entity;

public class Conversion {
    private String type;
    private double input;
    private double result;

    public Conversion(String type, double input) {
        this.type = type;
        this.input = input;
        this.result = calculate();
    }

    private double calculate() {
        switch (type) {
            case "cm->inches": return input / 2.54;
            case "inches->cm": return input * 2.54;
            case "kg->pounds": return input * 2.20462;
            case "pounds->kg": return input / 2.20462;
            case "liters->gallons": return input * 0.264172;
            case "gallons->liters": return input / 0.264172;
            default: return 0;
        }
    }

    public double getResult() {
        return result;
    }

    public String getFormattedResult() {
        return String.format("%.4f", result);
    }

    public String getInfo() {
        return input + " " + type + " = " + getFormattedResult() + "\n";
    }
}
