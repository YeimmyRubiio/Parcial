package org.example;

public class Cabina {
    private int numeroCabina;
    private int llamadasLocales;
    private int llamadasLargaDistancia;
    private int llamadasCelular;
    private int minutosLocales;
    private int minutosLargaDistancia;
    private int minutosCelular;
    private double costoTotal;
    private int tipollamada;
    private int tipominuto;
    private int costominuto;

    public Cabina() {
    }

    public Cabina(int numeroCabina, int llamadasLocales, int llamadasLargaDistancia, int llamadasCelular, int minutosLocales, int minutosLargaDistancia, int minutosCelular, double costoTotal) {
        this.numeroCabina = numeroCabina;
        this.llamadasLocales = llamadasLocales;
        this.llamadasLargaDistancia = llamadasLargaDistancia;
        this.llamadasCelular = llamadasCelular;
        this.minutosLocales = minutosLocales;
        this.minutosLargaDistancia = minutosLargaDistancia;
        this.minutosCelular = minutosCelular;
        this.costoTotal = costoTotal;
    }

    public int getNumeroCabina() {
        return numeroCabina;
    }

    public void setNumeroCabina(int numeroCabina) {
        this.numeroCabina = numeroCabina;
    }

    public int getLlamadasLocales() {
        return llamadasLocales;
    }

    public void setLlamadasLocales(int llamadasLocales) {
        this.llamadasLocales = llamadasLocales;
    }

    public int getLlamadasLargaDistancia() {
        return llamadasLargaDistancia;
    }

    public void setLlamadasLargaDistancia(int llamadasLargaDistancia) {
        this.llamadasLargaDistancia = llamadasLargaDistancia;
    }

    public int getLlamadasCelular() {
        return llamadasCelular;
    }

    public void setLlamadasCelular(int llamadasCelular) {
        this.llamadasCelular = llamadasCelular;
    }

    public int getMinutosLocales() {
        return minutosLocales;
    }

    public void setMinutosLocales(int minutosLocales) {
        this.minutosLocales = minutosLocales;
    }

    public int getMinutosLargaDistancia() {
        return minutosLargaDistancia;
    }

    public void setMinutosLargaDistancia(int minutosLargaDistancia) {
        this.minutosLargaDistancia = minutosLargaDistancia;
    }

    public int getMinutosCelular() {
        return minutosCelular;
    }

    public void setMinutosCelular(int minutosCelular) {
        this.minutosCelular = minutosCelular;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getNumeroLlamadas() {
        return llamadasLocales + llamadasLargaDistancia + llamadasCelular;
    }

    public int getMinutosTotales() {
        return minutosLocales + minutosLargaDistancia + minutosCelular;
    }

    public void crearCabina(int numeroCabina, int tipollamada, int tipominuto, int costominuto ){
        this.numeroCabina=numeroCabina;
        this.tipollamada=tipollamada;
        this.tipominuto=tipominuto;
        this.costominuto=costominuto;
    }

    public void registroLlamadaLocal(int minutos){
        llamadasLocales++;
        minutosLocales += minutos;
        costoTotal += minutos * 50;
    }

    public void registroLlamadaLargaDistancia(int minutos){
        llamadasLargaDistancia++;
        minutosLargaDistancia += minutos;
        costoTotal += minutos * 350;
    }

    public void registroLlamadaCelular(int minutos){
        llamadasCelular++;
        minutosCelular += minutos;
        costoTotal += minutos * 150;
    }

    public void reiniciarCabina(){
        numeroCabina = 0;
        llamadasLocales = 0;
        llamadasLargaDistancia = 0;
        llamadasCelular = 0;
        minutosLocales = 0;
        minutosLargaDistancia = 0;
        minutosCelular = 0;
        costoTotal = 0;
    }

    public String mostrarInformacionDetallada(int numeroCabina) {
        System.out.println("Cabina #" + numeroCabina);
        System.out.println("Llamadas locales: " + llamadasLocales + ", minutos: " + minutosLocales);
        System.out.println("Llamadas larga distancia: " + llamadasLargaDistancia + ", minutos: " + minutosLargaDistancia);
        System.out.println("Llamadas celular: " + llamadasCelular + ", minutos: " + minutosCelular);
        System.out.println("Número total de llamadas: " + getLlamadasLocales());
        System.out.println("Duración total de llamadas: " + getMinutosTotales() + " minutos");
        System.out.println("Costo total: $" + costoTotal);
        return null;
    }

    public void mostrarConsolidadoTotal(){
        System.out.println("Llamadas locales: " + getLlamadasLocales());
        System.out.println("Llamadas larga distancia: " + getLlamadasLargaDistancia());
        System.out.println("Llamadas celular: " + getLlamadasCelular());
        System.out.println("Número total de llamadas: " +getNumeroLlamadas());
        System.out.println("Duración total de llamadas: " + getMinutosTotales() + " minutos");
        System.out.println("Costo total: $" + costoTotal);
    }
}
