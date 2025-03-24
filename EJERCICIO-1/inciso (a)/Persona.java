
public class Persona{
    //atributos
    private String nombre;
    //private int edad ;
    private  String ciudad;
    //metodos
    public Persona(String nombre, int edad, String ciudad){
        this.nombre = nombre;
        //this.edad = edad;
        this.ciudad = ciudad;
    }
    public String saludar(){
        return String.format("Hola soy %s y vivo en la ciudad de %s. ",this.nombre,this.ciudad);
    }
    public static void main(String[] args) {
        Persona persona = new Persona("Diego",19,"La Paz");
        System.out.println(persona.saludar());
    }
}
