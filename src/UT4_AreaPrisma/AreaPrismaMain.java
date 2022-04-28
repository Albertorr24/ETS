package UT4_AreaPrisma;

import java.util.Scanner;
/**
 * Clase que contiene el metodo main
 * @author Alberto
 *
 */
public class AreaPrismaMain {

	/**
	 * Metodo para introducir valores por el teclado
	 * @return dicho valor introducido
	 */
	public static int leerValor () {
		Scanner tec=new Scanner(System.in);
		int valor=tec.nextInt();
		return valor;
	}
	
	
	/**
	 * Metodo que imprime un valor de tipo String
	 * @param valor Dato de tipo string que es mostrado
	 */
	public static void imprimirValor (String valor) {
		System.out.println(valor);
	}
	
	/**
	 * Ordena el vector por su area total de mayor a  menor
	 * @param prisma vector de clase float que almacena el area total de cada prisma
	 */
	public static void ordenaPrisma(float prisma[]) {
		float aux=0;
		for(int i=0; i<prisma.length ; i++) {
			for (int j=i+1; j<prisma.length; j++) {
				if(prisma[i]<prisma[j]) {
					aux=prisma[i];
					prisma[i]=prisma[j];
					prisma[j]=aux;
				}
			}
		}
	}
	
	/**
	 * Meootdo que imprime el vector de tipo float que contiene el area total
	 * @param areaDelPrisma vector que contiene las areas de los prismas, ordenados
	 */
	public static void imprimirPrisma(float [] areaDelPrisma) {
		
		System.out.println("Los prismas ordenados de mayor a menor: ");
		for(int i=0;i<areaDelPrisma.length;i++) {
			System.out.println("> El"+(i+1)+"º Prisma tiene un area de: "+areaDelPrisma[i]);
		}
	}
	
	
	/**
	 * Metodo main cuya funcion es crear prismas y almacenarlos en un vector,haciendo uso de diferentes métodos
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce el numero de prismas: ");
		int numeroPrismas=leerValor();
		AreaPrisma1 [] vecPrisma= new AreaPrisma1[numeroPrismas];
		float [] areaDelPrisma= new float[numeroPrismas];
		
		/*
		float alturaTriangulo= prisma.alturaTriangulo(baseTriangulo);
		float areaTriangulo=prisma.areaBase(baseTriangulo, alturaTriangulo);
		*/
		
   
        for (int i = 0; i < vecPrisma.length; i++) {
        	
        	imprimirValor("Creando Prisma"+(i+1));
        	
        	int baseTriangulo = (int)(Math.random() * (100-1+1))+1;
        	int alturaPrisma =(int)(Math.random() * (100-1+1))+1;
        	
            vecPrisma[i] = new AreaPrisma1(baseTriangulo,alturaPrisma);
           
            imprimirValor("La base del triangulo es:"+vecPrisma[i].getBaseTriangulo());
            imprimirValor("La altura del prisma es:"+vecPrisma[i].getAlturaPrisma());
            imprimirValor("El area total es: "+vecPrisma[i].AreaTotal());
            areaDelPrisma[i]=vecPrisma[i].AreaTotal();
            imprimirValor("\n---------------------------------");
        }
        
        ordenaPrisma(areaDelPrisma);
        imprimirPrisma(areaDelPrisma);
 

	}

}
