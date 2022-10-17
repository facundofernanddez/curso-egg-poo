
package servicio;

import entidad.Persona;
import java.util.Scanner;

public class PersonasServicios {
    
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private void validarSexo(String sexo){
        boolean aux = false;
        switch (sexo){
            case "H":
                sexo = "H";
                aux = true;
                break;
            case "M":
                sexo = "M";
                aux = true;
                break;
            case "O":
                sexo = "O";
                aux = true;
                break;
            default:
                while (aux == false){
                  System.out.println("Ha introducido una letra incorrecta, vuelva a intentarlo");
                  sexo = leer.next();
                  if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) aux = true;
                }
                
        }
    }
    
    public Persona crearPersona(){
        System.out.println("Introduzca su nombre");
        String nombre = leer.next();
        
        System.out.println("Introduzca su edad");
        int edad = leer.nextInt();
        
        System.out.println("Introduzca su sexo H/M/O");
        String sexo = leer.next();
        validarSexo(sexo);
        
        System.out.println("Introduzca su peso en kg");
        double peso = leer.nextDouble();
        
        System.out.println("Introduzca su altura en metros");
        double altura = leer.nextDouble();
        
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public int calcularIMC(Persona p1){
        double IMC = p1.getPeso() / (p1.getAltura() * p1.getAltura());
        int resultado = 0;
        
        if (IMC < 20) resultado = (-1);
        else if (IMC >= 20 && IMC <= 25) resultado = 0;
        else if (IMC > 25) resultado = 1;
        
        return resultado;
    }
    
    public boolean esMayorDeEdad(Persona p1){
        boolean resultado = false;
        
        if (p1.getEdad() > 18) resultado = true;
        
        return resultado;
    }
}
