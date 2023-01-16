package genFichas;

public class WhiteWolf extends Visualizadores {
	
	//Variables
	//Juego
	private String jugador;
	private String nombre;
	private String cronica;
	private String naturaleza;
	private String conducta;
	private String concepto;
	private String clan;
	private String generacion;
	private String sire;
	
	//Atributos
	//Fisicos
	private int fuerza;
	private int destreza;
	private int resistencia;
	//Sociales
	private int carisma;
	private int manipulacion;
	private int apariencia;
	//Mentales
	private int percepcion;
	private int inteligencia;
	private int astucia;
	
	//Habilidades
	//Talentos
	private int alerta;
	private int atletismo;
	private int consciencia;
	private int empatia;
	private int expresion;
	private int intimidacion;
	private int lideradgo;
	private int pelea;
	private int prestidigitacion;
	private int subterfugio;
	//Tecnicas
	private int artesania;
	private int comercio;
	private int equitacion;
	private int etiqueta;
	private int interpretacion;
	private int peleaArmas;
	private int sigilo;
	private int supervivencia;
	private int tiroArco;
	private int tratoAnimales;
	//Conocimientos
	private int academicismo;
	private int enigmas;
	private int investigacion;
	private int leyes;
	private int medicina;
	private int ocultismo;
	private int politica;
	private int sabiduriaPopular;
	private int senescal;
	private int teologia;
	
	//Ventajas
	//Disciplinas
	private int disciplinaA = 0;
	private int disciplinaB = 0;
	private int disciplinaC = 0;
	private String disciplina1 = null;
	private String disciplina2 = null;
	private String disciplina3 = null;
	
	//Virtudes
	private int concienciaConviccion;
	private int autocontrolInstinto;
	private int coraje;
	
	//Camino
	private String camino;
	private int puntuacionCamino;
	private int fuerzaVoluntad;
	
	//Debilidad
	private String debilidad;
	
	//Constructor
	public WhiteWolf() { }

	//Visualizador
	public void visualizadorFicha() {
		System.out.println("Ficha de: " + jugador);
		System.out.println("Nombre: " + nombre);
		System.out.println("Cronica: " + cronica);
		System.out.println("Naturaleza: " + naturaleza);
		System.out.println("Conducta: " + conducta);
		System.out.println("Clan: " + clan);
		System.out.println("Generación: " + generacion);
		System.out.println("Sire: " + sire);
		System.out.println("--Atributos fisicos--");
		System.out.println("Fuerza: " + fuerza);
		System.out.println("Destreza: " + destreza);
		System.out.println("Resistencia: " + resistencia);
		System.out.println("--Atributos sociales--");
		System.out.println("Carisma: " + carisma);
		System.out.println("Manipulación: " + manipulacion);
		System.out.println("Apariencia: " + apariencia);
		System.out.println("--Atributos mentales--");
		System.out.println("Percepción: " + percepcion);
		System.out.println("Inteligencia: " + inteligencia);
		System.out.println("Astucia: " + astucia);
		System.out.println("--Habilidades (talentos)--");
		System.out.println("Alerta: " + alerta);
		System.out.println("Atletismo: " + atletismo);
		System.out.println("Consciencia: "  + consciencia);
		System.out.println("Empatía: " + empatia);
		System.out.println("Expresión: " + expresion);
		System.out.println("Intimidación: " + intimidacion);
		System.out.println("Lideradgo: " + lideradgo);
		System.out.println("Pelea: " + pelea);
		System.out.println("Prestidigitación: " + prestidigitacion);
		System.out.println("Subterfugio: " + subterfugio);
		System.out.println("--Habilidades (técnicas)--");
		System.out.println("Artesanía: " + artesania);
		System.out.println("Comercio: " + comercio);
		System.out.println("Equitación: " + equitacion);
		System.out.println("Etiqueta: " + etiqueta);
		System.out.println("Interpretación: " + interpretacion);
		System.out.println("Pelea con Armas: " + peleaArmas);
		System.out.println("Sigilo: " + sigilo);
		System.out.println("Supervivencia: " + supervivencia);
		System.out.println("Tiro con arco: " + tiroArco);
		System.out.println("Trato con animales: " + tratoAnimales);
		System.out.println("--Habilidades (conocimientos)--");
		System.out.println("Academicismo: " + academicismo);
		System.out.println("Enigmas: " + enigmas);
		System.out.println("Investigación: " + investigacion);
		System.out.println("Leyes: " + leyes);
		System.out.println("Medicina: " + medicina);
		System.out.println("Ocultismo: " + ocultismo);
		System.out.println("Política: " + politica);
		System.out.println("Sabiduria popular: " + sabiduriaPopular);
		System.out.println("Senescal: " + senescal);
		System.out.println("Teología: " + teologia);
		System.out.println("--Ventajas--");
		System.out.println(disciplina1 + ": " + disciplinaA);
		System.out.println(disciplina2 + ": " + disciplinaB);
		System.out.println(disciplina3 + ": " + disciplinaC);
		System.out.println("--Virtudes--");
		System.out.println("Conciencia/Convicción: " + concienciaConviccion);
		System.out.println("Autocontrol/Instinto: " + autocontrolInstinto);
		System.out.println("Coraje: " + coraje);
		System.out.println(camino + ": " + puntuacionCamino);
		System.out.println("Fuerza de voluntad: " + fuerzaVoluntad);
		System.out.println("El conteo de reserva de sangre y salud lo debe llevar cada uno.");
	}
	
	//Getters y settters
	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCronica() {
		return cronica;
	}

	public void setCronica(String cronica) {
		this.cronica = cronica;
	}

	public String getNaturaleza() {
		return naturaleza;
	}

	public void setNaturaleza(String naturaleza) {
		this.naturaleza = naturaleza;
	}

	public String getConducta() {
		return conducta;
	}

	public void setConducta(String conducta) {
		this.conducta = conducta;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getClan() {
		return clan;
	}

	public void setClan(String clan) {
		this.clan = clan;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public String getSire() {
		return sire;
	}

	public void setSire(String sire) {
		this.sire = sire;
	}
	
	public String getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
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



	public int getResistencia() {
		return resistencia;
	}



	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}



	public int getCarisma() {
		return carisma;
	}



	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}



	public int getManipulacion() {
		return manipulacion;
	}



	public void setManipulacion(int manipulacion) {
		this.manipulacion = manipulacion;
	}



	public int getApariencia() {
		return apariencia;
	}



	public void setApariencia(int apariencia) {
		this.apariencia = apariencia;
	}



	public int getPercepcion() {
		return percepcion;
	}



	public void setPercepcion(int percepcion) {
		this.percepcion = percepcion;
	}



	public int getInteligencia() {
		return inteligencia;
	}



	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}



	public int getAstucia() {
		return astucia;
	}



	public void setAstucia(int astucia) {
		this.astucia = astucia;
	}



	public int getAlerta() {
		return alerta;
	}



	public void setAlerta(int alerta) {
		this.alerta = alerta;
	}



	public int getAtletismo() {
		return atletismo;
	}



	public void setAtletismo(int atletismo) {
		this.atletismo = atletismo;
	}



	public int getEmpatia() {
		return empatia;
	}



	public void setEmpatia(int empatia) {
		this.empatia = empatia;
	}



	public int getExpresion() {
		return expresion;
	}



	public void setExpresion(int expresion) {
		this.expresion = expresion;
	}



	public int getIntimidacion() {
		return intimidacion;
	}



	public void setIntimidacion(int intimidacion) {
		this.intimidacion = intimidacion;
	}



	public int getLideradgo() {
		return lideradgo;
	}



	public void setLideradgo(int lideradgo) {
		this.lideradgo = lideradgo;
	}



	public int getPelea() {
		return pelea;
	}



	public void setPelea(int pelea) {
		this.pelea = pelea;
	}



	public int getPrestidigitacion() {
		return prestidigitacion;
	}



	public void setPrestidigitacion(int prestidigitacion) {
		this.prestidigitacion = prestidigitacion;
	}



	public int getSubterfugio() {
		return subterfugio;
	}



	public void setSubterfugio(int subterfugio) {
		this.subterfugio = subterfugio;
	}



	public int getArtesania() {
		return artesania;
	}



	public void setArtesania(int artesania) {
		this.artesania = artesania;
	}



	public int getComercio() {
		return comercio;
	}



	public void setComercio(int comercio) {
		this.comercio = comercio;
	}



	public int getEquitacion() {
		return equitacion;
	}



	public void setEquitacion(int equitacion) {
		this.equitacion = equitacion;
	}



	public int getEtiqueta() {
		return etiqueta;
	}



	public void setEtiqueta(int etiqueta) {
		this.etiqueta = etiqueta;
	}



	public int getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(int interpretacion) {
		this.interpretacion = interpretacion;
	}



	public int getPeleaArmas() {
		return peleaArmas;
	}



	public void setPeleaArmas(int peleaArmas) {
		this.peleaArmas = peleaArmas;
	}



	public int getSigilo() {
		return sigilo;
	}



	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}



	public int getSupervivencia() {
		return supervivencia;
	}



	public void setSupervivencia(int supervivencia) {
		this.supervivencia = supervivencia;
	}



	public int getTiroArco() {
		return tiroArco;
	}



	public void setTiroArco(int tiroArco) {
		this.tiroArco = tiroArco;
	}



	public int getTratoAnimales() {
		return tratoAnimales;
	}



	public void setTratoAnimales(int tratoAnimales) {
		this.tratoAnimales = tratoAnimales;
	}



	public int getAcademicismo() {
		return academicismo;
	}



	public void setAcademicismo(int academicismo) {
		this.academicismo = academicismo;
	}



	public int getEnigmas() {
		return enigmas;
	}



	public void setEnigmas(int enigmas) {
		this.enigmas = enigmas;
	}



	public int getInvestigacion() {
		return investigacion;
	}



	public void setInvestigacion(int investigacion) {
		this.investigacion = investigacion;
	}



	public int getLeyes() {
		return leyes;
	}



	public void setLeyes(int leyes) {
		this.leyes = leyes;
	}



	public int getMedicina() {
		return medicina;
	}



	public void setMedicina(int medicina) {
		this.medicina = medicina;
	}



	public int getPolitica() {
		return politica;
	}



	public void setPolitica(int politica) {
		this.politica = politica;
	}



	public int getSabiduriaPopular() {
		return sabiduriaPopular;
	}



	public void setSabiduriaPopular(int sabiduriaPopular) {
		this.sabiduriaPopular = sabiduriaPopular;
	}



	public int getSenescal() {
		return senescal;
	}



	public void setSenescal(int senescal) {
		this.senescal = senescal;
	}



	public int getTeologia() {
		return teologia;
	}



	public void setTeologia(int teologia) {
		this.teologia = teologia;
	}



	public int getConsciencia() {
		return consciencia;
	}



	public void setConsciencia(int consciencia) {
		this.consciencia = consciencia;
	}



	public int getOcultismo() {
		return ocultismo;
	}



	public void setOcultismo(int ocultismo) {
		this.ocultismo = ocultismo;
	}



	public int getConcienciaConviccion() {
		return concienciaConviccion;
	}



	public void setConcienciaConviccion(int concienciaConviccion) {
		this.concienciaConviccion = concienciaConviccion;
	}



	public int getAutocontrolInstinto() {
		return autocontrolInstinto;
	}



	public void setAutocontrolInstinto(int autocontrolInstinto) {
		this.autocontrolInstinto = autocontrolInstinto;
	}



	public int getCoraje() {
		return coraje;
	}



	public void setCoraje(int coraje) {
		this.coraje = coraje;
	}



	public String getCamino() {
		return camino;
	}



	public void setCamino(String camino) {
		this.camino = camino;
	}



	public int getFuerzaVoluntad() {
		return fuerzaVoluntad;
	}



	public void setFuerzaVoluntad(int fuerzaVoluntad) {
		this.fuerzaVoluntad = fuerzaVoluntad;
	}

	public int getDisciplinaA() {
		return disciplinaA;
	}

	public void setDisciplinaA(int disciplinaA) {
		this.disciplinaA = disciplinaA;
	}

	public int getDisciplinaB() {
		return disciplinaB;
	}

	public void setDisciplinaB(int disciplinaB) {
		this.disciplinaB = disciplinaB;
	}

	public int getDisciplinaC() {
		return disciplinaC;
	}

	public void setDisciplinaC(int disciplinaC) {
		this.disciplinaC = disciplinaC;
	}

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public String getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public String getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}

	public int getPuntuacionCamino() {
		return puntuacionCamino;
	}

	public void setPuntuacionCamino(int puntuacionCamino) {
		this.puntuacionCamino = puntuacionCamino;
	}

}
