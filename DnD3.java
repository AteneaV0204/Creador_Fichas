package genFichas;

public class DnD3 extends Visualizadores{
	
	//Variables
	private String nombreJugador;
	private String nombrePJ;
	private String clase;
	private String raza;
	private String animal;
	private String deidad = "Ninguna";
	
	//Caracteristicas
	private int fuerza;
	private int destreza;
	private int constitucion;
	private int inteligencia;
	private int sabiduria;
	private int carisma;
	private int velocidad;
	
	//Resistencias
	private int ataqueBase = 0;
	private int resConjuros = 0;
	
	//Vida
	private int claseArmadura;
	
	//Iniciativa
	private int iniciativa = 0;
	
	//Tiros de salvacion
	private int fortaleza;
	private int reflejos;
	private int voluntad;
	
	//Habilidades
	private int avistar = 0;
	private int buscar = 0;
	private int diplomacia = 0;
	private int equilibrio = 0;
	private int esconderse = 0;
	private int escuchar = 0;
	private int moverSigilosamente = 0;
	private int reunirInfo = 0;
	private int saberNaturaleza = 0;
	private int saltar = 0;
	private int supervivencia = 0;
	private int tasacion = 0;
	private int trepar = 0;
	
	//Conjuros (Solo clases magicas)
	private String conjuro1 = "Ninguno";
	private String conjuro2 = "Ninguno";
	private String truco1 = "Ninguno";
	private String truco2 = "Ninguno";
	private String truco3 = "Ninguno";
	private String truco4 = "Ninguno";
	private String truco5 = "Ninguno";
	
	//Dinero
	private int dineroCobre = 0;
	private int dineroPlata = 0;
	private int dineroOro;
	private int dineroPlatino = 0;
	
	//Constructores
	public DnD3 () { }
	
	//Modificadores raciales
	public int velocidadGeneral() { //Humanos, elfos, semielfos y semiorcos
		return velocidad = 30;}
	
	public int velocidadPequeños() { //Enanos, medianos y gnomos
		return velocidad = 20;}
	
	public int bonificacionDestreza() { //Elfos y medianos
		return destreza + 2;}
	
	public int penalizacionConstitucion() { //Elfos
		return constitucion - 2;}
	
	public int bonificacionResConjuros() { //Elfos, enanos y gnomos
		return resConjuros + 2;}
	
	public int bonificacionAvistar() { //Elfos
		return avistar + 2;}
	
	public int bonificacionBuscar() { //Elfos y enanos
		return buscar + 2;}
	
	public int bonificacionEscuchar() { //Elfos, gnomos y medianos
		return escuchar + 2;}

	public int bonificacionConstitucion() { //Enanos y gnomos
		return constitucion + 2;}
	
	public int penalizacionCarisma() {//Enanos
		return carisma - 2;}
	
	public int bonificacionEquilibrio() {//Enanos
		return equilibrio + 4;}
	
	public int bonificacionTasar() {//Gnomos
		return tasacion + 2;}
	
	public int penalizacionFuerza() {//Gnomos
		return fuerza - 2;}
	
	public int bonificacionCA() {//Gnomos y medianos
		return claseArmadura + 1;}
	
	public int bonificacionAtaque() {//Gnomos y medianos
		return ataqueBase + 1;}
	
	public int bonificacionEsconderse() {//Gnomos y medianos
		return esconderse + 4;}
	
	public int penalizadorFuerza() { //Medianos
		return fuerza - 2;}
	
	public int bonificacionSigilo() {//Medianos
		return moverSigilosamente + 2;}
	
	public int bonificacionSaltar() {//Medianos
		return saltar + 2;}
	
	public int bonificacionTrepar() {//Medianos
		return trepar + 2;}
	
	public int bonificacionFortaleza() {//Medianos
		return fortaleza + 1;}
	
	public int bonificacionReflejos() {//Medianos
		return reflejos + 1;}
	
	public int bonificacionVoluntad() {//Medianos
		return voluntad + 1;}
	
	public int bonificacionAvistar2() {//Semielfos
		return avistar + 1;}
	
	public int bonificacionBuscar2() {//Semielfos
		return buscar + 1;}
	
	public int bonificacionEscuchar2() {//Semielfos
		return escuchar + 1;}
	
	public int bonificacionDiplomacia() {//Semielfos
		return diplomacia + 2;}
	
	public int bonificacionReunirInfo() {//Semielfos
		return reunirInfo + 2;}
	
	public int bonificacionFuerza() {//Semiorcos
		return fuerza + 2;}
	
	public int penalizadorInteligencia() {//Semiorcos
		return inteligencia - 2;}
	
	public int penalizadorCarisma() {//Semiorcos
		return carisma - 2;}

	//Modificadores de clase
	public int bonifVelocidad() {//Barbaros
		return velocidad + 10;}
	
	public int Nv1Ataque() {//Barbaros
		return ataqueBase + 1;}
	
	public int Nv1Fortaleza() {//Barbaros, clerigos
		return fortaleza + 2;}
	
	public int bonifSaberNat() {
		return saberNaturaleza + 2;}
	
	public int bonifSupervivencia() {
		return supervivencia + 2;}
	
	public int equipoBarbaros() {
		System.out.println("Su armadura es: cuero tachonado.");
		claseArmadura =+ 3;
		System.out.println("Sus armas iniciales son:\n Gran hacha (1d12)\n Arco corto con carcaj (20 flechas)(1d6)\n Daga (1d4)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero");
		return claseArmadura;}
	
	public int Nv1Reflejos() {//Bardos
		return reflejos + 2;}
	
	public int Nv1Voluntad() {//Bardos, clerigos
		return voluntad + 2;}
	
	public int equipoBardos() {
		System.out.println("Su armadura es: cuero tachonado.");
		claseArmadura =+ 3;
		System.out.println("Sus armas iniciales son:\n Espada larga (1d6)\n Ballesta ligera con carcaj (20 virotes)(1d6)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n 3 antorchas\n Un laud\n Material para conjuros");
		return claseArmadura;}
	
	public int equipoClerigos() {
		System.out.println("Su armadura es: Cota de escamas y escudo pesado.");
		claseArmadura =+ 6;
		System.out.println("Sus armas iniciales son:\n Maza pesada (1d8)\n Ballesta ligera con carcaj (10 virotes)(1d6)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n 3 antorchas\n Simbolo sagrado de madera");
		return claseArmadura;}
	
	public int equipoDruida() {
		System.out.println("Su armadura es: Pieles y escudo de madera pesado.");
		claseArmadura =+ 5;
		System.out.println("Sus armas iniciales son:\n Cimitarra (1d6)\n Clava (1d6)\n Honda con bolsa (10 piedras de honda)(1d4)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n 3 antorchas\n Acebo y muerdago");
		return claseArmadura;}
	
	public int equipoExplorador() {
		System.out.println("Su armadura es: Cuero tachonado.");
		claseArmadura =+ 3;
		System.out.println("Sus armas iniciales son:\n Espada larga (1d8)\n Espada corta (1d6)\n Arco corto con carcaj (20 flechas)(1d8)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero");
		return claseArmadura;}
	
	public int equipoGuerrero() {
		System.out.println("Su armadura es: Cota de escamas y escudo pesado de madera.");
		claseArmadura =+ 4;
		System.out.println("Sus armas iniciales son:\n Hacha de guerra enana (1d10)\n Arco corto con carcaj (20 flechas)(1d8)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n 3 antorchas");
		return claseArmadura;}
	
	public int equipoHechicero() {
		System.out.println("El hechicero no lleva armadura.");
		System.out.println("Sus armas iniciales son:\n Lanza corta (1d6)\n Ballesta ligera (10 virotes)(1d8)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n Linetrna sorda con 5 cartuchos de aceite\n Bolsa con componentes de conjuro");
		return claseArmadura = 0;}
	
	public int equipoMago() {
		System.out.println("El mago no lleva armadura.");
		System.out.println("Sus armas iniciales son:\n Bastón (1d6)\n Ballesta ligera (10 virotes)(1d8)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n 10 velas\n Bolsa con componentes de conjuro\n Libro de conjuros");
		return claseArmadura = 0;}
	
	public int equipoMonje() {
		System.out.println("El monje no lleva armadura.");
		System.out.println("Sus armas iniciales son:\n Bastón (1d6)\n Honda con bolsa (10 piedras de honda)(1d4)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n 3 antorchas");
		return claseArmadura = 0;}
	
	public int equipoPaladin() {
		System.out.println("Su armadura es: Cota de escamas y escudo de madera pesado.");
		claseArmadura = 6;
		System.out.println("Sus armas iniciales son:\n Espada larga (1d8)\n Arco corto con carcaj (20 flechas)(1d6)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n Linetrna sorda con 3 cartuchos de aceite\n Simbolo sagrado de madera");
		return claseArmadura;}
	
	public int equipoPicaro() {
		System.out.println("Su armadura es: Cuero.");
		claseArmadura = 2;
		System.out.println("Sus armas iniciales son:\n Espada corta (1d4)\n Ballesta ligera (10 virotes)(1d6)\n Daga (1d4)");
		System.out.println("Su equipo inicial será:\n Mochila con odre de agua\n Raciones para un viaje de un dia\n Saco de dormir\n Pedernal y acero\n Linetrna sorda con 3 cartuchos de aceite\n Herramientas de ladrón");
		return claseArmadura;}
	
	public int modificadorFuerza(int stat) {
		int modificador = 0;
		if (stat == 10 || stat == 11) {
			modificador = 0;}
		else if (stat == 12 || stat == 13) {
			modificador = 1;}
		else if (stat == 14 || stat == 15) {
			modificador = 2;}
		else if (stat == 16 || stat == 17) {
			modificador = 3;}
		else if (stat == 18 || stat == 19) {
			modificador = 4;}
		return modificador;}
	
	public int modificadorDestreza(int stat) {
		int modificador = 0;
		if (stat == 10 || stat == 11) {
			modificador = 0;}
		else if (stat == 12 || stat == 13) {
			modificador = 1;}
		else if (stat == 14 || stat == 15) {
			modificador = 2;}
		else if (stat == 16 || stat == 17) {
			modificador = 3;}
		else if (stat == 18 || stat == 19) {
			modificador = 4;}
		return modificador;}	
	
	public int modificadorCons(int stat) {
		int modificador = 0;
		if (stat == 10 || stat == 11) {
			modificador = 0;}
		else if (stat == 12 || stat == 13) {
			modificador = 1;}
		else if (stat == 14 || stat == 15) {
			modificador = 2;}
		else if (stat == 16 || stat == 17) {
			modificador = 3;}
		else if (stat == 18 || stat == 19) {
			modificador = 4;}
		return modificador;}
	
	public int modificadorInt(int stat) {
		int modificador = 0;
		if (stat == 10 || stat == 11) {
			modificador = 0;}
		else if (stat == 12 || stat == 13) {
			modificador = 1;}
		else if (stat == 14 || stat == 15) {
			modificador = 2;}
		else if (stat == 16 || stat == 17) {
			modificador = 3;}
		else if (stat == 18 || stat == 19) {
			modificador = 4;}
		return modificador;}
	
	public int modificadorSab(int stat) {
		int modificador = 0;
		if (stat == 10 || stat == 11) {
			modificador = 0;}
		else if (stat == 12 || stat == 13) {
			modificador = 1;}
		else if (stat == 14 || stat == 15) {
			modificador = 2;}
		else if (stat == 16 || stat == 17) {
			modificador = 3;}
		else if (stat == 18 || stat == 19) {
			modificador = 4;}
		return modificador;}
	
	public int modificadorCarisma(int stat) {
		int modificador = 0;
		if (stat == 10 || stat == 11) {
			modificador = 0;}
		else if (stat == 12 || stat == 13) {
			modificador = 1;}
		else if (stat == 14 || stat == 15) {
			modificador = 2;}
		else if (stat == 16 || stat == 17) {
			modificador = 3;}
		else if (stat == 18 || stat == 19) {
			modificador = 4;}
		return modificador;}
	
	public void visualizadorFicha() {
			System.out.println("Nombre del jugador: " + nombreJugador);
			System.out.println("Nombre del personaje: " + nombrePJ);
			System.out.println("Raza: " + raza);
			System.out.println("Clase: " + clase);
			System.out.println("Deidad: " + deidad);
			System.out.println("Fuerza: " + fuerza + "     Mod. Fuerza: " + modificadorFuerza(fuerza));
			System.out.println("Destreza: " + destreza + "     Mod. Destreza: " + modificadorDestreza(destreza));
			System.out.println("Constitución: " + constitucion + "     Mod. Constitución: " + modificadorCons(constitucion));
			System.out.println("Inteligencia: " + inteligencia + "     Mod. Inteligencia: " + modificadorInt(inteligencia));
			System.out.println("Sabiduría: " + sabiduria + "     Mod. Sabiduría: " + modificadorSab(sabiduria));
			System.out.println("Carisma: " + carisma + "     Mod. Carisma: " + modificadorCarisma(carisma));
			System.out.println("Puntos de vida: 20");
			System.out.println("Clase de armadura: " + claseArmadura);
			System.out.println("Iniciativa: " + iniciativa);
			System.out.println("Fortaleza: " + fortaleza);
			System.out.println("Reflejos: " + reflejos);
			System.out.println("Voluntad: " + voluntad);
			System.out.println("Ataque base: " + ataqueBase);
			System.out.println("Resistencia a conjuros: " + resConjuros);
			System.out.println("--Habilidades--");
			System.out.println("Avistar: " + avistar);
			System.out.println("Buscar: " + buscar);
			System.out.println("Diplomacia: " + diplomacia);
			System.out.println("Equilibrio: " + equilibrio);
			System.out.println("Escuchar: " + escuchar);
			System.out.println("Moverse sigilosamente: " + moverSigilosamente);
			System.out.println("Reunir información: " + reunirInfo);
			System.out.println("Saber (Naturaleza): " + saberNaturaleza);
			System.out.println("Saltar: " + saltar);
			System.out.println("Supervivencia: " + supervivencia);
			System.out.println("Tasación:" + tasacion);
			System.out.println("Trepar: " + trepar);
			System.out.println("--Conjuros--");
			System.out.println("Primer conjuro: " + conjuro1);
			System.out.println("Segundo conjuro: " + conjuro2);
			System.out.println("Primer truco: " + truco1);
			System.out.println("Segundo truco: " + truco2);
			System.out.println("Tercer truco: " + truco3);
			System.out.println("Cuarto truco: " + truco4);
			System.out.println("Quinto truco: " + truco5);
			if(clase.equalsIgnoreCase("bardo")) {
				equipoBardos();}
			else if (clase.equalsIgnoreCase("clerigo")) {
				equipoClerigos();}
			else if (clase.equalsIgnoreCase("druida")) {
				equipoDruida();}
			else if (clase.equalsIgnoreCase("explorador")) {
				equipoExplorador();}
			else if (clase.equalsIgnoreCase("guerrero")) {
				equipoGuerrero();}
			else if (clase.equalsIgnoreCase("hechicero")) {
				equipoHechicero();}
			else if (clase.equalsIgnoreCase("mago")) {
				equipoMago();}
			else if (clase.equalsIgnoreCase("monje")) {
				equipoMonje();}
			else if (clase.equalsIgnoreCase("paladin")) {
				equipoPaladin();}
			else if (clase.equalsIgnoreCase("picaro")) {
				equipoPicaro();}
			System.out.println("Piezas de platino disponibles: " + dineroPlatino);
			System.out.println("Piezas de oro disponibles: " + dineroOro);
			System.out.println("Piezas de plata disponibles: " + dineroPlata);
			System.out.println("Piezas de cobre disponibles: " + dineroCobre);
	}
			
	
	//Getters y setters
	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getNombrePJ() {
		return nombrePJ;
	}

	public void setNombrePJ(String nombrePJ) {
		this.nombrePJ = nombrePJ;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getConstitucion() {
		return constitucion;
	}

	public void setConstitucion(int constitucion) {
		this.constitucion = constitucion;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	public int getClaseArmadura() {
		return claseArmadura;
	}

	public void setClaseArmadura(int claseArmadura) {
		this.claseArmadura = claseArmadura;
	}

	public int getIniciativa() {
		return iniciativa;
	}

	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	public int getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}

	public int getReflejos() {
		return reflejos;
	}

	public void setReflejos(int reflejos) {
		this.reflejos = reflejos;
	}

	public int getVoluntad() {
		return voluntad;
	}

	public void setVoluntad(int voluntad) {
		this.voluntad = voluntad;
	}

	public int getAtaqueBase() {
		return ataqueBase;
	}

	public void setAtaqueBase(int ataqueBase) {
		this.ataqueBase = ataqueBase;
	}

	public int getResConjuros() {
		return resConjuros;
	}

	public void setResConjuros(int resConjuros) {
		this.resConjuros = resConjuros;
	}
	
	public String getConjuro1() {
		return conjuro1;
	}

	public void setConjuro1(String conjuro1) {
		this.conjuro1 = conjuro1;
	}

	public String getConjuro2() {
		return conjuro2;
	}

	public void setConjuro2(String conjuro2) {
		this.conjuro2 = conjuro2;
	}

	public String getTruco1() {
		return truco1;
	}

	public void setTruco1(String truco1) {
		this.truco1 = truco1;
	}

	public String getTruco2() {
		return truco2;
	}

	public void setTruco2(String truco2) {
		this.truco2 = truco2;
	}

	public String getTruco3() {
		return truco3;
	}

	public void setTruco3(String truco3) {
		this.truco3 = truco3;
	}

	public String getTruco4() {
		return truco4;
	}

	public void setTruco4(String truco4) {
		this.truco4 = truco4;
	}

	public String getTruco5() {
		return truco5;
	}

	public void setTruco5(String truco5) {
		this.truco5 = truco5;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public String getDeidad() {
		return deidad;
	}

	public void setDeidad(String deidad) {
		this.deidad = deidad;
	}

	public int getDineroOro() {
		return dineroOro;
	}

	public void setDineroOro(int dineroOro) {
		this.dineroOro = dineroOro;
	}


}
