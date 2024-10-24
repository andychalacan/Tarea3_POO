public class Empleado {
        String Nombre;
        int edad;
        double salario;


        public  Empleado(){
            //Datos quemados
            Nombre="Andy";
            edad=22;
            salario=450.30;
        }
    public Empleado(String nombre, int edad, double salario) {
        this.Nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

        public void mensaje(){
            System.out.println("El empleado se llama; "+Nombre+" con edad de; "+edad+" y se le renumera un salario de: "+salario);
        }
}