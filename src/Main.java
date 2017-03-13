import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import java.util.AbstractSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nombre;
		String java;
		String web;
		String movil;
		SetFactory<String> factory = new SetFactory<String>();
		System.out.println("Opciones de implementación de SET:\n1)HashSet\n2)TreeSet\n3)LinkedHashSet");
		String op = scan.nextLine();
		Sets<String> listj = factory.getSet(op);
		Sets listw = factory.getSet(op);
		Sets listm = factory.getSet(op);
		
		System.out.println("Cuantos nombre va a ingresar?");
		int cant = scan.nextInt();
		scan.nextLine();
		int x = 0;
		while(x < cant){
			x++;
			System.out.println("Ingrese Nombre:");
			nombre = scan.nextLine();
			System.out.println("Desarrolla en Java?(S/N)");
			java = scan.nextLine();
			System.out.println("Desarrolla en Web?(S/N)");
			web = scan.nextLine();
			System.out.println("Desarrolla en Movil?(S/N)");
			movil = scan.nextLine();
			if (java.equals("s") || java.equals("S")){
				listj.add(nombre);
			} 
			if (web.equals("s") || web.equals("S")){
				listw.add(nombre);
			}
			if (movil.equals("s") || movil.equals("S")){
				listm.add(nombre);
			}
			
		}		
		Operation operacion = new Operation(listj, listw, listm);
		
		System.out.println("All: ");
		System.out.println(""+operacion.all()+"\n");
		
		System.out.println("java no web: ");
		System.out.println(""+operacion.jnotWeb()+"\n");
		
		System.out.println("Web y movil pero no Java: ");
		System.out.println(""+operacion.notJavaBut()+"\n");
		
		System.out.println("Web o movil pero no Java: ");
		System.out.println(""+operacion.notJava()+"\n");
		
		System.out.println("Java es conjunto de Web?: ");
		System.out.println(""+operacion.jUw()+"\n");
		
		System.out.println("Categoria mas grande: ");
		System.out.println(""+operacion.mayor()+"\n");
		
	}

}
