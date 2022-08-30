package gabrielchangguiaej1;

import java.util.Scanner;

public class GabrielChangGuiaEJ1 {
 
    public static void main(String[] args) {
        int codigo, salarioMensual; //variables para guardar atributos enteros
        String nombre, apellido;    //variables para guardar atributos cadena
        
        //se crea un objeto de lectura, indicando que tomará lo de la entrada
        Scanner objRead = new Scanner(System.in);
        
        //se crea objeto de la clase Trabajador
        Trabajador trabajadorUni = new Trabajador();
        
        //se pide nombre, y se asigna mediante el metodo setNombreTrabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = objRead.nextLine();
        trabajadorUni.setNombreTrabajador(nombre);
        
        //se pide apellido, y se asigna mediante el metodo setApellidoTrabajdor
        System.out.print("Ingrese el apellido del trabajador: ");
        apellido = objRead.nextLine();
        trabajadorUni.setApellidoTrabajador(apellido);
        
        //se pide codigo, y se asigna mediante el metodo setCodigoTrabajador
        System.out.print("\nIngrese codigo del trabajador: ");
        codigo = objRead.nextInt();
        trabajadorUni.setCodigoTrabajador(codigo);
        
        //se pide salario mensual, y se asigna mediante el metodo setSalarioMensualtrabajador
        System.out.print("Ingrese salario mensual del trabajador: ");
        salarioMensual = objRead.nextInt();
        trabajadorUni.setSalarioMensualTrabajador(salarioMensual);
        
        
        //se imprime cada atributo del objeto, mediante los metodos "getters"
        System.out.println("\nNombre del trabajador: " + trabajadorUni.getNombreTrabajador());
        System.out.println("Apellido del trabajador: " + trabajadorUni.getApellidoTrabajador());
        System.out.println("Codigo del trabajador: " + trabajadorUni.getCodigoTrabajador());
        System.out.println("\nSalario mensual: " + trabajadorUni.getSalarioMensualTrabajador());
        
        //salario diario
        System.out.println("Salario diario: " + 
        (trabajadorUni.getSalarioDiarioTrabajador(trabajadorUni.getSalarioMensualTrabajador())));
    }
}
