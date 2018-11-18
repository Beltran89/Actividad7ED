
public class Producto {
	//ATRIBUTOS DE LA CLASE

		private int id;
		private String nombre;
		private double pvc;
		private int ref;
		private int unidades;
		private double beneficio;
		private double iva;

		public Producto() {
			this.beneficio = 1.30;
			this.iva = 1.21;
		}
	      
	      //CONSTRUCTORES
		public Producto (int ref) {
			this.ref = ref;
			this.beneficio = 1.30;
			this.iva = 1.21;
		}

		public Producto (int id, String nombre, double pvc, int ref, int unidades){

			this.id = id;
			this.nombre = nombre;
			this.pvc = pvc;
			this.ref = ref;
			this.unidades = unidades;

			this.beneficio = 1.30;
			this.iva = 1.21;
		}
	
	//Declaración de atributos y constructores.

	/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @return the pvc
		 */
		public double getPvc() {
			return pvc;
		}

		/**
		 * @return the ref
		 */
		public int getRef() {
			return ref;
		}

		/**
		 * @return the unidades
		 */
		public int getUnidades() {
			return unidades;
		}

		/**
		 * @return the beneficio
		 */
		public double getBeneficio() {
			return beneficio;
		}

		/**
		 * @return the iva
		 */
		public double getIva() {
			return iva;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @param pvc the pvc to set
		 */
		public void setPvc(double pvc) {
			this.pvc = pvc;
		}

		/**
		 * @param ref the ref to set
		 */
		public void setRef(int ref) {
			this.ref = ref;
		}

		/**
		 * @param unidades the unidades to set
		 */
		public void setUnidades(int unidades) {
			this.unidades = unidades;
		}

		/**
		 * @param beneficio the beneficio to set
		 */
		public void setBeneficio(double beneficio) {
			this.beneficio = beneficio;
		}

		/**
		 * @param iva the iva to set
		 */
		public void setIva(double iva) {
			this.iva = iva;
		}

	/**
	*método que calcula un beneficio al coste del producto
	*@return Valor total con el beneficio
	*/

	public double damePvp(){
		double pvp =  this.pvc * this.beneficio;
		return pvp;
	}

	public double damePvpIva(){
		double res = this.damePvp() * this.iva;
		return res;
	}
}
