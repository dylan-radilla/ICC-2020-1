package geometria;

 /**
  * Representa un polígono de tres lados. Está definido por
  * tres puntos en el plano cartesiano.
  * @since 1.0
  * @author Radilla Maldonado Dylan Emmanuel
  * @see Punto
  */
 public class Triangulo{
 	/**
 	 *Triángulo con todos sus lados de la misma longitud.
 	 */
 	public static final int EQUILATERO = 0;
 	/**
 	 *Triángulo con exactamente dos lados de la misma longitud.
 	 */
 	public static final int ISOSCELES = 1;
 	/**
 	*Triángulo con todos sus lados de longitud distinta.
 	*/
 	public static final int ESCALENO = 2;

 	private Punto a;
 	private Punto b;
 	private Punto c;

 	/**
 	 *Crea un triángulo equilatero de lado 1 con vertices en (0,0),
 	 *(1,0) y (0.5,sin(0.5, sin(π / 3))).
 	 *@param a - Punto (0,0)
 	 *@param b - Punto (1,0)
 	 *@param c - Punto (0.5,Math.sin(Math.PI/3))
 	 *@since 1.0
 	 */
 	public Triangulo() {
 		a = new Punto(0,0);
 		b = new Punto(1,0);
 		c = new Punto(0.5,Math.sin(Math.PI/3));

 	}
 	/**
 	 *Crea un triangulo con los tres puntos dados
 	 *@param a - Primer punto
 	 *@param b - Segundo punto
 	 *@param c - Tercer Punto
 	 *@since 1.0
 	 */
 	public Triangulo(Punto a, Punto b, Punto c){
 		this.a = a;
 		this.b = b;
 		this.c = c;

 	}

 	/**
 	 *Determina si los vértices de este triángulo están alineados.
 	 *@return true si los valores están alineados
 	 */
 	public boolean tieneVerticesAlineados() {
 		if (a.estanAlineados(b,c)) {
 			return true;
 		}else{
 			return false;
 		}
 	}

 	/**
 	*Regresa el tipo de este triangulo según la longitud de sus lados;
 	* puede ser equilátero, isósceles o escaleno.
 	*@return el tipo de este triangulo
 	*/
 	public int tipo() {
 		if (a.distancia(b) == b.distancia(c) && a.distancia(b) == a.distancia(c)) {
 			return 0;
 		}else{
 			if (a.distancia(b) == b.distancia(c) || a.distancia(b) == a.distancia(c)) {
 				return 1;
 			}else{
 			return 2;
 			}
 		}
 	}
 }