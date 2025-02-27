package Peso;

public class Peso {
    private double pesoTotal;
    public String unidad = "";

    public Peso(double w, String u) {
    	
        this.pesoTotal += w;
        this.unidad = u.trim().toLowerCase();
    }

    public double getLibras() {
        if (this.unidad.equals("kg")) return (this.pesoTotal * 2.20462);
        if (this.unidad.equals("oz")) return (this.pesoTotal * 0.0625);
        if (this.unidad.equals("g")) return (this.pesoTotal * 0.00220462);

        return (this.pesoTotal);
    }

    public double getOnzas() {
        if (this.unidad.equals("kg")) return (this.pesoTotal * 35.274);
        if (this.unidad.equals("lb")) return (this.pesoTotal * 16);
        if (this.unidad.equals("g")) return (this.pesoTotal * 0.035274);

        return (this.pesoTotal);
    }

    public double getPeso() {
        if (this.unidad.equals("oz")) return (this.pesoTotal * 0.0283495);
        if (this.unidad.equals("lb")) return (this.pesoTotal * 0.453592);
        if (this.unidad.equals("g")) return (this.pesoTotal / 1000);

        return (this.pesoTotal);
    }
}
