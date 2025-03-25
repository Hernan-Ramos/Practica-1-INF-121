// incisa(b)
public class Coche {
    //atributos
    public String marca ;
    public String modelo;
    public float velocidad;
    
    public Coche(String marca, String modelo, float velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    public float acelerar(){
        System.out.println("Acelerando...");
        return this.velocidad + 10;

    }
    public float frenar(){
        System.out.println("Frenando...");
        return this.velocidad - 5;
    }
    public static void main(String[] args) {
        Coche peta = new Coche("Toyota","Corolla",100);
        System.out.println(peta.acelerar());
        System.out.println(peta.frenar());
        
    }


    
}
