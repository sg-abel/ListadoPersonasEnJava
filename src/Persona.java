public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;


    //Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //constructor con argumentos
    public Persona(String nombre, String tel, String email){
        this();// Se llama el constructor vacio
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    //obtener el valor de ID
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override //Para imprimir a detalle el objeto
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}'; //+ super.toString(); Para llamar objetos de la clase padre
    }

    public static void main(String[] args){
        Persona persona1 = new Persona("Abel Salazar", "2223456", "able@gmail.com");
        System.out.println(persona1);
    }
}
