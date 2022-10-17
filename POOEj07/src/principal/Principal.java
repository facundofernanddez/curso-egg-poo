/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package principal;

import entidad.Persona;
import servicio.PersonasServicios;

public class Principal {

    public static void main(String[] args) {
        PersonasServicios service = new PersonasServicios();
        
        Persona persona1 = service.crearPersona();
        int IMCpersona1 = service.calcularIMC(persona1);
        boolean mayorEdad1 = service.esMayorDeEdad(persona1);
        
        Persona persona2 = service.crearPersona();
        int IMCpersona2 = service.calcularIMC(persona2);
        boolean mayorEdad2 = service.esMayorDeEdad(persona2);
        
        Persona persona3 = service.crearPersona();
        int IMCpersona3 = service.calcularIMC(persona3);
        boolean mayorEdad3 = service.esMayorDeEdad(persona3);
        
        Persona persona4 = service.crearPersona();
        int IMCpersona4 = service.calcularIMC(persona4);
        boolean mayorEdad4 = service.esMayorDeEdad(persona4);
        
        int[] arrIMC = new int[4];
        arrIMC[0] = IMCpersona1;
        arrIMC[1] = IMCpersona2;
        arrIMC[2] = IMCpersona3;
        arrIMC[3] = IMCpersona4;
        int contBajoPeso = 0;
        int contPesoIdeal = 0;
        int contSobrePeso = 0;
        
        for (int i = 0; i < 4; i++){
            switch (arrIMC[i]) {
                case -1:
                    contBajoPeso += 1;
                    break;
                case 0:
                    contPesoIdeal += 1;
                    break;
                case 1:
                    contSobrePeso += 1;
                    break;
                default:
                    break;
            }
        }
        
        double porBajoPeso = contBajoPeso * 100 / 4;
        double porPesoIdeal = contPesoIdeal * 100 / 4;
        double porSobrePeso = contSobrePeso * 100 / 4;
        
        System.out.println("Los porcentajes de los distintos IMC encontrados son: Bajo Peso: " + porBajoPeso + "%, Peso Ideal: " + porPesoIdeal + "% y Sobrepeso: " + porSobrePeso + "%");
        
        boolean[] arrEdad = new boolean[4];
        arrEdad[0] = mayorEdad1;
        arrEdad[1] = mayorEdad2;
        arrEdad[2] = mayorEdad3;
        arrEdad[3] = mayorEdad4;
        int mayorEdad = 0;
        int menorEdad = 0;
        
        for (int i = 0; i < 4; i++){
           if (arrEdad[i] == true) mayorEdad += 1;
           else menorEdad += 1;
        }
        
        double porMayorEdad = mayorEdad * 100 / 4;
        double porMenorEdad = menorEdad * 100 / 4;
        
        System.out.println("El porcentaje de personas de mayor edad es: " + porMayorEdad + "%, el porcentaje de personas de menor edad es: " + porMenorEdad + "%");

        //Primer ejercicio de la guia de excepciones.
       try {
           Persona p1 = null;
           service.esMayorDeEdad(p1);
       } catch (Exception e) {
           System.out.println("No se puede inicilizar un objeto vacio");
       }
    }   
}
