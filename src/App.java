
import Models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona( "Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD
       PersonaController pC = new PersonaController();  
       ViewConsole vC = new ViewConsole();
       vC.printMessage("Arreglo personas");
       
       vC.printPersonArray(personas);
       vC.printMessage("Arreglo de personas ordenado");

       pC.ordenarPrEdad(personas);
       vC.printPersonArray(personas);

       vC.printMessage("Buscar persona con edad 40");
       Persona personabuscada = pC.buscarPorEdad(personas, edad: 40);
       if (personaBuscada == null){
        vC.printMessage("No se encontro persona con edad 40");

       }else{
        vC.printMessage("No se encontro personas con edad 40")
        vC.printMessage(personabuscada.toString());

       }
       vC.printMessage("Buscar persona con edad 99");
       Persona personaBuscadaDOS = pC.buscarPorEdad(persona, 99);
       if(personaBuscadaDOS == null){
        vC.printMessage("No se encontro persona con edad 99");

       }else{
        vC.printMessage("Se encontro persona con edad 99");
        vC.printMessage(personaBuscadaDOS.toString());
       }

    }
}
