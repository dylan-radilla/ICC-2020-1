/**
* Clase Libro que nos da la información de un Libro.
* @author Radilla Maldonado Dylan Emmanuel
* @version 10/09/2019
*/
public class Libro {
	String titulo;
	String autor;
	int añoPub;

		/**
		 *Constructor default.
		 *@param titulo el titulo del libro
		 *@param autor autor del libro
		 *@param añoPub el año de publicación
		 */
		public Libro (){
			this.titulo = "";
			this.autor = "";
			this.añoPub = 0;
		}

		/**
		 *Constructor con parámetros.
		 *@param titulo titulo del libro
		 *@param autor autor del libro
		 *@param añoPub año de publicación del libro
		 */
		public Libro (String titulo, String autor, int añoPub){
			this.titulo = titulo;
			this.autor = autor;
			this.añoPub = añoPub;
		}

		/**
		 *Asigna un titulo nuevo.
		 *@param titulo titulo del libro
		 */
		public void setTitulo(String titulo){
			this.titulo=titulo;
		}

		/**
		 *Asigna un autor nuevo.
		 *@param autor autor del libro
		 */
		public void setAutor(String autor){
			this.autor=autor;
		}

		/**
		 *Asigna un año de publicación nuevo.
		 *@param añoPub año de publicación del libro
		 */
		public void setAñoPub(int añoPub){
			this.añoPub=añoPub;
		}

		/**
		 *Accesa y muestra el titulo del libro.
		 *@param titulo titulo del libro
		 *@return el titulo del libro
		 */
		public String getTitulo(){
			return titulo;
		}

		/**
		 *Accesa y muestra al autor del libro.
		 *@param autor autor del libro
		 *@return al autor del libro
		 */
		public String getAutor(){
			return autor;
		}

		/**
		 *Accesa y muestra el año de publicación del libro.
		 *@param añoPub año de publicación del libro
		 *@return el año de publicación del libro
		 */
		public int getAñoPub(){
			return añoPub;
		}
}