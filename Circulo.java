public class Circulo {
    private double radio;
    
    /**Este metodo indica el atributo radio de la clase circulo*/
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**Esta clase esta descontinuada, se debe de usar en su lugar calcularArea()*/
     public double calculoArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**Este metodo calcula el area del circulo y agrega un if que en caso de que el radio sea menor que 0 lanzara un mensaje de aviso  */
    public double calcularArea() {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * Math.pow(radio, 2);
    }

    /**Este metodo devuelve el calculo de la circunferencia de la clase circulo con un metodo matematico */
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    /**Este metodo devuelve el radio de la clase circulo */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}