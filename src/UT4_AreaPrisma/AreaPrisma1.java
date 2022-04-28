package UT4_AreaPrisma;

/**
 * Clase de para calcular Area del prisma
 * @author Alberto Rodz Ramz
 *
 */

public class AreaPrisma1 {
	
	private int baseTriangulo;
	private int alturaPrisma;
	
	
	/**
     * Constructor que define los valores iniciales de los atributos.
     * @param baseTriangulo Base del triángulo.
     * @param alturaPrisma Altura del prisma.
     */
	public AreaPrisma1(int baseTriangulo, int alturaPrisma) {
		this.baseTriangulo = baseTriangulo;
		this.alturaPrisma = alturaPrisma;
	}
	
	
	 /**
     * Getter del atributo. Mostrar el valor del atributo baseTriangulo
     * @return Devuelve el valor baseTriangulo.
     */
	public float getBaseTriangulo() {
		return baseTriangulo;
	}

	
	 /**
     * Setter del atributo. Dar valor al atributo baseTriangulo
     * @param baseTriangulo. Nuevo valor de baseTriangulo.
     */
	public void setBaseTriangulo(int baseTriangulo) {
		this.baseTriangulo = baseTriangulo;
	}

	
	 /**
     * Mostrar el valor del atributo alturaPrisma
     * @return Devuelve el valor del atributo alturaPrisma.
     */
	public float getAlturaPrisma() {
		return alturaPrisma;
	}

	
	/**
     * Setter del atributo. Dar valor al atributo alturaPrisma
     * @param alturaPrisma. Nuevo valor de alturaPrisma.
     */
	public void setAlturaPrisma(int alturaPrisma) {
		this.alturaPrisma = alturaPrisma;
	}
	
	
	 /**
     * Calcula la altura de triángulo.
     * @return la altura del triángulo.
     */
	public float alturaTriangulo () {
		 return (float) (Math.sqrt(3)/2*this.baseTriangulo);
	}
	
	
	 /**
     * Calcula el área de  un triangulo
     * @param alturaTriangulo Altura que tiene el triángulo.
     * @return el area de la base del prisma, que es un triangulo.
     */
	public float areaBase( float alturaTriangulo) {
		return((this.baseTriangulo*alturaTriangulo)/2);
	}
	
	
	/**
     * Calcula el perímetro de la base del prisma con base triangular
     * @return El perímetro de la base del prisma triangular
     */
	public float perimetro () {
		return(this.baseTriangulo*3);
	}
	
	
	  /**
     * Calcula el area lateral del prisma
     * @param perimetro Perimetro del prisma
     * @return el area del lateral del prisma, que es un rectangulo
     */
	public float areaLateral (float perimetro) {
		return(perimetro*this.alturaPrisma);
	}
	
	
	/**
	 * Calcula el area total del prisma triangular
	 * @return el area total del prisma
	 */
	public float AreaTotal() {
		float areaLateral=areaLateral(perimetro());
		float areaBase=areaBase(alturaTriangulo());
		return (2*areaBase+areaLateral);
		
	}		
}
