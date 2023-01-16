package genFichas;

import java.util.Random;
import java.util.Scanner;

public class CreaFichasMain {

	public static void main(String[] args) {

		// Variables y objetos
		String tipoFicha;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		// Bienvenida y recogida de datos
		System.out.println("Bienvenido al creador de fichas.");
		do {
			System.out.println("¿La ficha sera de Vampiro Edad Oscura (V) o de D&D 3.5 (D)? (0 para salir)");
			tipoFicha = sc.nextLine();
			
			if (tipoFicha.equalsIgnoreCase("v")) {
				WhiteWolf vamp = new WhiteWolf();
				
				System.out.println("¿Cual es el nombre del jugador?");
				vamp.setJugador(sc.nextLine());
				
				System.out.println("¿Cual es el nombre de tu personaje?");
				vamp.setNombre(sc.nextLine());
				
				System.out.println("Dame el nombre y año de la cronica:");
				vamp.setCronica(sc.nextLine());
				
				System.out.println("Dime la naturaleza del vastago:");
				vamp.setNaturaleza(sc.nextLine());
				
				System.out.println("Dime la conducta del vastago:");
				vamp.setConducta(sc.nextLine());
				
				do{
					System.out.println("Dime la clan del vastago: ");
					vamp.setClan(sc.nextLine());
					switch (vamp.getClan()) {
					case "ahriman":
						System.out.println("Debilidad escogida: Incapacidad de crear vinculum o ghouls");
						vamp.setDebilidad("Incapacidad de crear vinculum o ghouls");
						System.out.println("Disciplinas:\n Animalismo\n Potencia\n Spiritus");
						vamp.setDisciplina1("Animalismo");
						vamp.setDisciplina2("Potencia");
						vamp.setDisciplina3("Spiritus");
						break;
					case "assamita":
						System.out.println("Debilidad escogida: Necesidad de cometer la tradicion de diablerie ritual");
						vamp.setDebilidad("Necesidad de cometer la tradicion de diablerie ritual");
						System.out.println("Disciplinas:\n Celeridad\n Ofuscacion\n Extincion");
						vamp.setDisciplina1("Celeridad");
						vamp.setDisciplina2("Ofuscacion");
						vamp.setDisciplina3("Extincion");
						break;
					case "baali":
						System.out.println("Debilidad escogida: Vulnerable a simbolo religioso");
						vamp.setDebilidad("Vulnerable a simbolo religioso");
						System.out.println("Disciplinas:\n Ofuscacion\n Presencia\n Daimonion");
						vamp.setDisciplina1("Ofuscacion");
						vamp.setDisciplina2("Presencia");
						vamp.setDisciplina3("Daimonion");
						break;
					case "bonsam":
						System.out.println("Debilidad escogida: Inspiras terror a los mortales");
						vamp.setDebilidad("Inspiras terror a los mortales");
						System.out.println("Disciplinas:\n Abombwe\n Ofuscacion\n Potencia");
						vamp.setDisciplina1("Abombwe");
						vamp.setDisciplina2("Ofuscacion");
						vamp.setDisciplina3("Potencia");
						break;
					case "brujah":
						System.out.println("Debilidad escogida: Furioso eternamente");
						vamp.setDebilidad("Furioso eternamente");
						System.out.println("Disciplinas:\n Celeridad\n Potencia\n Presencia");
						vamp.setDisciplina1("Celeridad");
						vamp.setDisciplina2("Potencia");
						vamp.setDisciplina3("Presencia");
						break;
					case "capadocio":
						System.out.println("Debilidad escogida: Segun pasa el tiempo, tu apariencia se vuelve cadaverica");
						vamp.setDebilidad("Segun pasa el tiempo, tu apariencia se vuelve cadaverica");
						System.out.println("Disciplinas:\n Auspex\n Fortaleza\n Necromancia");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Fortaleza");
						vamp.setDisciplina3("Necromancia");
						break;
					case "danava":
						System.out.println("Debilidad escogida: Debe hacerse un ritual antes de alimentarse");
						vamp.setDebilidad("Debe hacerse un ritual antes de alimentarse");
						System.out.println("Disciplinas:\n Dominación\n Fortaleza\n Taumaturgia");
						vamp.setDisciplina1("Dominación");
						vamp.setDisciplina2("Fortaleza");
						vamp.setDisciplina3("Taumaturgia");
						break;
					case "gangrel":
						System.out.println("Debilidad escogida: Segun des poder a la bestia, mas rasgos animales apareces");
						vamp.setDebilidad("Segun des poder a la bestia, mas rasgos animales apareces");
						System.out.println("Disciplinas:\n Animalismo\n Fortaleza\n Protean");
						vamp.setDisciplina1("Animalismo");
						vamp.setDisciplina2("Fortaleza");
						vamp.setDisciplina3("Protean");
						break;
					case "giovanni":
						System.out.println("Debilidad escogida: Beber le duele al mortal");
						vamp.setDebilidad("Beber le duele al mortal");
						System.out.println("Disciplinas:\n Auspex\n Fortaleza\n Necromancia");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Fortaleza");
						vamp.setDisciplina3("Necromancia");
						break;
					case "lamiae":
						System.out.println("Debilidad escogida: Portas la \"Semilla de lilith\" y contagias esa plaga");
						vamp.setDebilidad("Portas la \"Semilla de lilith\" y contagias esa plaga");
						System.out.println("Disciplinas:\n Fortaleza\n Necromancia\n Potencia");
						vamp.setDisciplina1("Fortaleza");
						vamp.setDisciplina2("Necromancia");
						vamp.setDisciplina3("Potencia");
						break;
					case "lasombra":
						System.out.println("Debilidad escogida: El sol te hace mas daño");
						vamp.setDebilidad("El sol te hace mas daño");
						System.out.println("Disciplinas:\n Dominación\n Obtenebración\n Potencia");
						vamp.setDisciplina1("Dominación");
						vamp.setDisciplina2("Obtenebración");
						vamp.setDisciplina3("Potencia");
						break;
					case "lhiannan":
						System.out.println("Debilidad escogida: Modificador de +2 de dificutad a todas las tiradas (excepto percibir naturaleza)");
						vamp.setDebilidad("Modificador de +2 de dificutad a todas las tiradas (excepto percibir naturaleza)");
						System.out.println("Disciplinas:\n Animalismo\n Ogham\n Presencia");
						vamp.setDisciplina1("Animalismo");
						vamp.setDisciplina2("Ogham");
						vamp.setDisciplina3("Presencia");
						break;
					case "malkavian":
						System.out.println("Debilidad escogida: Trastorno incurable");
						vamp.setDebilidad("Trastorno incurable");
						System.out.println("Disciplinas:\n Auspex\n Dementación\n Ofuscación");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Dementación");
						vamp.setDisciplina3("Ofuscación");
						break;
					case "nagarajah":
						System.out.println("Debilidad escogida: Necesidad de carne a la vez que vitae");
						vamp.setDebilidad("Necesidad de carne a la vez que vitae");
						System.out.println("Disciplinas:\n Auspex\n Dominación\n Necromancia");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Dominación");
						vamp.setDisciplina3("Necromancia");
						break;
					case "nictuku":
						System.out.println("Debilidad escogida: Metabolizas un tercio del vitae");
						vamp.setDebilidad("Metabolizas un tercio del vitae");
						System.out.println("Disciplinas:\n Auspex\n Celeridad\n Potencia");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Celeridad");
						vamp.setDisciplina3("Potencia");
						break;
					case "nosferatu":
						System.out.println("Debilidad escogida: Sobrenaturalmente horrendo (tu apariencia será siempre 0)");
						vamp.setDebilidad("Sobrenaturalmente horrendo");
						System.out.println("Disciplinas:\n Animalismo\n Ofuscación\n Potencia");
						vamp.setDisciplina1("Animalismo");
						vamp.setDisciplina2("Ofuscación");
						vamp.setDisciplina3("Potencia");
						break;
					case "ramanga":
						System.out.println("Debilidad escogida: Dificultad aumentada con las disciplinas");
						vamp.setDebilidad("Dificultad aumentada con las disciplinas");
						System.out.println("Disciplinas:\n Obtenebración\n Ofuscación\n Presencia");
						vamp.setDisciplina1("Obtenebración");
						vamp.setDisciplina2("Ofuscación");
						vamp.setDisciplina3("Presencia");
						break;
					case "ravnos":
						System.out.println("Debilidad escogida: Debes intentar engañar al resto de alguna forma elegida");
						vamp.setDebilidad("Debes intentar engañar al resto de alguna forma elegida");
						System.out.println("Disciplinas:\n Animalismo\n Fortaleza\n Quimerismo");
						vamp.setDisciplina1("Animalismo");
						vamp.setDisciplina2("Fortaleza");
						vamp.setDisciplina3("Quimerismo");
						break;
					case "salubri":
						System.out.println("Debilidad escogida: No puedes negar ayuda a quien la necesite");
						vamp.setDebilidad("No puedes negar ayuda a quien la necesite");
						System.out.println("Disciplinas:\n Auspex\n Fortaleza\n Valeren");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Fortaleza");
						vamp.setDisciplina3("Valeren");
						break;
					case "seguidor de set":
						System.out.println("Debilidad escogida: Susceptible a la luz del sol");
						vamp.setDebilidad("Susceptible a la luz del sol");
						System.out.println("Disciplinas:\n Ofuscación\n Presencia\n Serpentis");
						vamp.setDisciplina1("Ofuscación");
						vamp.setDisciplina2("Presencia");
						vamp.setDisciplina3("Serpentis");
						break;
					case "toreador":
						System.out.println("Debilidad escogida: No puedes dejar de mirar las obras de arte");
						vamp.setDebilidad("No puedes dejar de mirar las obras de arte");
						System.out.println("Disciplinas:\n Auspex\n Celeridad\n Presencia");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Celeridad");
						vamp.setDisciplina3("Presencia");
						break;
					case "tremere":
						System.out.println("Debilidad escogida: Son muy susceptibles al Vinculum");
						vamp.setDebilidad("Son muy susceptibles al Vinculum");
						System.out.println("Disciplinas:\n Auspex\n Dominación\n Taumaturgia");
						vamp.setDisciplina1("Auspex");
						vamp.setDisciplina2("Dominación");
						vamp.setDisciplina3("Taumaturgia");
						break;
					case "tzimisce":
						System.out.println("Debilidad escogida: Necesita tierra de su tierra de nacimiento");
						vamp.setDebilidad("Necesita tierra de su tierra de nacimiento");
						System.out.println("Disciplinas:\n Animalismo\n Auspex\n Vicisitud");
						vamp.setDisciplina1("Animalismo");
						vamp.setDisciplina2("Auspex");
						vamp.setDisciplina3("Vicisitud");
						break;
					case "ventrue":
						System.out.println("Debilidad escogida: Debe tener un solo tipo de presa");
						vamp.setDebilidad("Debe tener un solo tipo de presa");
						System.out.println("Disciplinas:\n Dominación\n Fortaleza\n Presencia");
						vamp.setDisciplina1("Dominación");
						vamp.setDisciplina2("Fortaleza");
						vamp.setDisciplina3("Presencia");
						break;
					default:
						System.out.println("Ese clan no existe.");}
					}while (!(vamp.getClan().equalsIgnoreCase("ahriman") || vamp.getClan().equalsIgnoreCase("assamita") || vamp.getClan().equalsIgnoreCase("baali") ||
							vamp.getClan().equalsIgnoreCase("bonsam") || vamp.getClan().equalsIgnoreCase("brujah") || vamp.getClan().equalsIgnoreCase("capadocio") ||
							vamp.getClan().equalsIgnoreCase("danava") || vamp.getClan().equalsIgnoreCase("gangrel") || vamp.getClan().equalsIgnoreCase("giovanni") ||
							vamp.getClan().equalsIgnoreCase("lamiae") || vamp.getClan().equalsIgnoreCase("lasombra") || vamp.getClan().equalsIgnoreCase("lhiannan") ||
							vamp.getClan().equalsIgnoreCase("malkavian") || vamp.getClan().equalsIgnoreCase("nagarajah") || vamp.getClan().equalsIgnoreCase("nictuku") ||
							vamp.getClan().equalsIgnoreCase("nosferatu") || vamp.getClan().equalsIgnoreCase("ramanga") || vamp.getClan().equalsIgnoreCase("ravnos") ||
							vamp.getClan().equalsIgnoreCase("salubri") || vamp.getClan().equalsIgnoreCase("seguidor de set") || vamp.getClan().equalsIgnoreCase("toreador") ||
							vamp.getClan().equalsIgnoreCase("tremere") || vamp.getClan().equalsIgnoreCase("tzimisce") || vamp.getClan().equalsIgnoreCase("ventrue")));
				
				System.out.println("Dime el concepto del vastago:");
				vamp.setConcepto(sc.nextLine());
				
					
					System.out.println("Dime la generacion del vastago (en numero):");
					vamp.setGeneracion(sc.nextLine());
					if (vamp.getGeneracion().equals("13")) {
						vamp.setClan("Sangre debil");
						System.out.println("Tu clan ha sido cambiado a Sangre debil");
						System.out.println("Debilidad escogida: Todos los vastagos querran deshacerse de ti.");
						vamp.setDebilidad("Todos los vastagos querran deshacerse de ti.");
						System.out.println("Disciplina: Alquimia de sangre");
						vamp.setDisciplina1("Alquimia de sangre");
						vamp.setDisciplina2("Los sangre debil solo tienen una disciplina");
						vamp.setDisciplina3("Los sangre debil solo tienen una disciplina");}
					
					System.out.println("Dime el nombre del sire de " + vamp.getNombre());
					String sire = sc.nextLine();
					vamp.setSire(sire);
					
					System.out.println("Hora de empezar con los atributos de "+ vamp.getNombre());
					System.out.println("Puedes repartir 7/5/3 entre los atributos fisicos/sociales/mentales.");
					System.out.println("¿Que atributo quieres que tenga 7 puntos?");
					String atributo1 = sc.nextLine();
					
					int i1;
					switch (atributo1) {
					case "fisicos":
						int sumaF = 1;
						int sumaD = 1;
						int sumaR = 1;
						for (i1 = 1; i1 <= 7; i1++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i1 + "? (fuerza, destreza o resistencia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("fuerza")) {
								sumaF += 1;}
							else if (punto.equalsIgnoreCase("destreza")) {
								sumaD += 1;}
							else if (punto.equalsIgnoreCase("resistencia")) {
								sumaR += 1;}}
						vamp.setFuerza(sumaF);
						vamp.setDestreza(sumaD);
						vamp.setResistencia(sumaR);
						break;
					case "sociales":
						int sumaC = 1;
						int sumaM = 1;
						int sumaAp = 1;
						for (i1 = 1; i1 <= 7; i1++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i1 + "? (carisma, manipulacion, apariencia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("carisma")) {
								sumaC += 1;}
							else if (punto.equalsIgnoreCase("manipulacion")) {
								sumaM += 1;}
							else if (punto.equalsIgnoreCase("apariencia")) {
								sumaAp += 1;}}
						vamp.setCarisma(sumaC);
						vamp.setManipulacion(sumaM);
						vamp.setApariencia(sumaAp);
						break;
					case "mentales":
						int sumaP = 1;
						int sumaI = 1;
						int sumaAs = 1;
						for (i1 = 1; i1 <= 7; i1++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i1 + "? (percepcion, inteligencia, astucia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("percepcion")) {
								sumaP += 1;}
							else if (punto.equalsIgnoreCase("inteligencia")) {
								sumaI += 1;}
							else if (punto.equalsIgnoreCase("astucia")) {
								sumaAs += 1;}}
						vamp.setPercepcion(sumaP);
						vamp.setInteligencia(sumaI);
						vamp.setAstucia(sumaAs);
						break;}
					
					System.out.println("¿Que atributo quieres que tenga 5 puntos? fisicos/sociales/mentales");
					String atributo2 = sc.nextLine();
					
					int i2;
					switch (atributo2) {
					case "fisicos":
						int sumaF = 1;
						int sumaD = 1;
						int sumaR = 1;
						for (i2 = 1; i2 <= 5; i2++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i2 + "? (fuerza, destreza o resistencia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("fuerza")) {
								sumaF += 1;}
							else if (punto.equalsIgnoreCase("destreza")) {
								sumaD += 1;}
							else if (punto.equalsIgnoreCase("resistencia")) {
								sumaR += 1;}}
						vamp.setFuerza(sumaF);
						vamp.setDestreza(sumaD);
						vamp.setResistencia(sumaR);
						break;
					case "sociales":
						int sumaC = 1;
						int sumaM = 1;
						int sumaAp = 1;
						for (i2 = 1; i2 <= 5; i2++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i2 + "? (carisma, manipulacion, apariencia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("carisma")) {
								sumaC += 1;}
							else if (punto.equalsIgnoreCase("manipulacion")) {
								sumaM += 1;}
							else if (punto.equalsIgnoreCase("apariencia")) {
								sumaAp += 1;}}
						vamp.setCarisma(sumaC);
						vamp.setManipulacion(sumaM);
						vamp.setApariencia(sumaAp);
						break;
					case "mentales":
						int sumaP = 1;
						int sumaI = 1;
						int sumaAs = 1;
						for (i2 = 1; i2 <= 5; i2++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i2 + "? (percepcion, inteligencia, astucia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("percepcion")) {
								sumaP += 1;}
							else if (punto.equalsIgnoreCase("inteligencia")) {
								sumaI += 1;}
							else if (punto.equalsIgnoreCase("astucia")) {
								sumaAs += 1;}}
						vamp.setPercepcion(sumaP);
						vamp.setManipulacion(sumaI);
						vamp.setApariencia(sumaAs);
						break;}
					
					System.out.println("¿Que atributo quieres que tenga 3 puntos? fisicos/sociales/mentales");
					String atributo3 = sc.nextLine();
					
					int i3;
					switch (atributo3) {
					case "fisicos":
						int sumaF = 1;
						int sumaD = 1;
						int sumaR = 1;
						for (i3 = 1; i3 <= 3; i3++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i3 + "? (fuerza, destreza o resistencia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("fuerza")) {
								sumaF += 1;}
							else if (punto.equalsIgnoreCase("destreza")) {
								sumaD += 1;}
							else if (punto.equalsIgnoreCase("resistencia")) {
								sumaR += 1;}}
						vamp.setFuerza(sumaF);
						vamp.setDestreza(sumaD);
						vamp.setResistencia(sumaR);
						break;
					case "sociales":
						int sumaC = 1;
						int sumaM = 1;
						int sumaAp = 1;
						for (i3 = 1; i3 <= 3; i3++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i3 + "? (carisma, manipulacion, apariencia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("carisma")) {
								sumaC += 1;}
							else if (punto.equalsIgnoreCase("manipulacion")) {
								sumaM += 1;}
							else if (punto.equalsIgnoreCase("apariencia")) {
								sumaAp += 1;}}
						vamp.setCarisma(sumaC);
						vamp.setManipulacion(sumaM);
						vamp.setApariencia(sumaAp);
						break;
					case "mentales":
						int sumaP = 1;
						int sumaI = 1;
						int sumaAs = 1;
						for (i3 = 1; i3 <= 3; i3++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i3 + "? (percepcion, inteligencia, astucia)");
							punto = sc.nextLine();
							if (punto.equalsIgnoreCase("percepcion")) {
								sumaP += 1;}
							else if (punto.equalsIgnoreCase("inteligencia")) {
								sumaI += 1;}
							else if (punto.equalsIgnoreCase("astucia")) {
								sumaAs += 1;}}
						vamp.setPercepcion(sumaP);
						vamp.setInteligencia(sumaI);
						vamp.setAstucia(sumaAs);
						break;}
					
					if (vamp.getClan() == "nosferatu") {
						vamp.setApariencia(0);}
					
					System.out.println("En las habilidades los puntos a repartir son 13/9/5 (talentos, tecnicas y conocimientos)");
					System.out.println("¿Que atributo quieres que tenga 13 puntos?");
					String habilidad1 = sc.nextLine();
					
					int i4;
					switch (habilidad1) {
					case "talentos":
						int sumaAl = 0;
						int sumaAt = 0;
						int sumaCons = 0;
						int sumaEm = 0;
						int sumaEx = 0;
						int sumaIn = 0;
						int sumaLid = 0;
						int sumaPe = 0;
						int sumaPre = 0;
						int sumaSub = 0;
						for (i4 = 1; i4 <= 13; i4++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i4 + "? (alerta, atletismo, consciencia, empatia, expresion, intimidacion, lideradgo, pelea, prestidigitacion, subterfugio)");
							punto = sc.nextLine();
							switch (punto) {
							case "alerta":
								sumaAl += 1;
								break;
							case "atletismo":
								sumaAt += 1;
								break;
							case "consciencia":
								sumaCons += 1;
								break;
							case "empatia":
								sumaEm += 1;
								break;
							case "expresion":
								sumaEx += 1;
								break;
							case "intimidacion":
								sumaIn += 1;
								break;
							case "lideradgo":
								sumaLid += 1;
								break;
							case "pelea":
								sumaPe += 1;
								break;
							case "prestidigitacion":
								sumaPre += 1;
								break;
							case "subterfugio":
								sumaSub += 1;
								break;}}
							
						vamp.setAlerta(sumaAl);
						vamp.setAtletismo(sumaAt);
						vamp.setConsciencia(sumaCons);
						vamp.setEmpatia(sumaEm);
						vamp.setExpresion(sumaEx);
						vamp.setIntimidacion(sumaIn);
						vamp.setLideradgo(sumaLid);
						vamp.setPelea(sumaPe);
						vamp.setPrestidigitacion(sumaPre);
						vamp.setSubterfugio(sumaSub);
						break;
					case "tecnicas":
						int sumaAr = 0;
						int sumaCo = 0;
						int sumaEq = 0;
						int sumaEt = 0;
						int sumaInter = 0;
						int sumaPeArmas = 0;
						int sumaSig = 0;
						int sumaSup = 0;
						int sumaTiroArco = 0;
						int sumaTratoAn = 0;
						for (i4 = 1; i4 <= 13; i4++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i4 + "? (artesanía, comercio, equitacion, etiqueta, interpretacion, pelea con armas (poner armas), sigilo, supervivencia, tiro con arco (poner arco), trato con animales (poner animales))");
							punto = sc.nextLine();
							switch (punto) {
								case "artesania":
									sumaAr += 1;
									break;
								case "comercio":
									sumaCo += 1;
									break;
								case "equitacion":
									sumaEq += 1;
									break;
								case "etiqueta":
									sumaEt += 1;
									break;
								case "interpretacion":
									sumaInter += 1;
									break;
								case "armas":
									sumaPeArmas += 1;
									break;
								case "sigilo":
									sumaSig += 1;
									break;
								case "supervivencia":
									sumaSup += 1;
									break;
								case "arco":
									sumaTiroArco += 1;
									break;
								case "animales":
									sumaTratoAn += 1;
									break;
								}}
						vamp.setArtesania(sumaAr);
						vamp.setComercio(sumaCo);
						vamp.setEquitacion(sumaEq);
						vamp.setEtiqueta(sumaEt);
						vamp.setInterpretacion(sumaInter);
						vamp.setPeleaArmas(sumaPeArmas);
						vamp.setSigilo(sumaSig);
						vamp.setSupervivencia(sumaSup);
						vamp.setTiroArco(sumaTiroArco);
						vamp.setTratoAnimales(sumaTratoAn);
						break;
					case "conocimientos":
						int sumaAcademicismo = 0;
						int sumaEnigmas = 0;
						int sumaInvestigacion = 0;
						int sumaLeyes = 0;
						int sumaMedicina = 0;
						int sumaOcultismo = 0;
						int sumaPolitica = 0;
						int sumaSabiduriaPop = 0;
						int sumaSenescal = 0;
						int sumaTeologia = 0;
						for (i4 = 1; i4 <= 13; i4++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i4 + "? (academicismo, enigmas, investigacion, leyes, medicina, ocultismo, politica, sabiduria popular (poner pop), senescal, teologia)");
							punto = sc.nextLine();
							switch (punto) {
								case "academicismo":
									sumaAcademicismo += 1;
									break;
								case "enigmas":
									sumaEnigmas += 1;
									break;
								case "investigacion":
									sumaInvestigacion += 1;
									break;
								case "leyes":
									sumaLeyes += 1;
									break;
								case "medicina":
									sumaMedicina += 1;
									break;
								case "ocultismo":
									sumaOcultismo += 1;
									break;
								case "politica":
									sumaPolitica += 1;
									break;
								case "pop":
									sumaSabiduriaPop += 1;
									break;
								case "senescal":
									sumaSenescal += 1;
									break;
								case "teologia":
									sumaTeologia += 1;
									break;}}
						vamp.setAcademicismo(sumaAcademicismo);
						vamp.setEnigmas(sumaEnigmas);
						vamp.setInvestigacion(sumaInvestigacion);
						vamp.setLeyes(sumaLeyes);
						vamp.setMedicina(sumaMedicina);
						vamp.setOcultismo(sumaOcultismo);
						vamp.setPolitica(sumaPolitica);
						vamp.setSabiduriaPopular(sumaSabiduriaPop);
						vamp.setSenescal(sumaSenescal);
						vamp.setTeologia(sumaTeologia);
						break;}
					
					System.out.println("¿Que atributo quieres que tenga 9 puntos?");
					String habilidad2 = sc.nextLine();
					
					int i5;
					switch (habilidad2) {
					case "talentos":
						int sumaAl = 0;
						int sumaAt = 0;
						int sumaCons = 0;
						int sumaEm = 0;
						int sumaEx = 0;
						int sumaIn = 0;
						int sumaLid = 0;
						int sumaPe = 0;
						int sumaPre = 0;
						int sumaSub = 0;
						for (i5 = 1; i5 <= 9; i5++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i5 + "? (alerta, atletismo, consciencia, empatia, expresion, intimidacion, lideradgo, pelea, prestidigitacion, subterfugio)");
							punto = sc.nextLine();
							switch (punto) {
							case "alerta":
								sumaAl += 1;
								break;
							case "atletismo":
								sumaAt += 1;
								break;
							case "consciencia":
								sumaCons += 1;
								break;
							case "empatia":
								sumaEm += 1;
								break;
							case "expresion":
								sumaEx += 1;
								break;
							case "intimidacion":
								sumaIn += 1;
								break;
							case "lideradgo":
								sumaLid += 1;
								break;
							case "pelea":
								sumaPe += 1;
								break;
							case "prestidigitacion":
								sumaPre += 1;
								break;
							case "subterfugio":
								sumaSub += 1;
								break;}}
						vamp.setAlerta(sumaAl);
						vamp.setAtletismo(sumaAt);
						vamp.setConsciencia(sumaCons);
						vamp.setEmpatia(sumaEm);
						vamp.setExpresion(sumaEx);
						vamp.setIntimidacion(sumaIn);
						vamp.setLideradgo(sumaLid);
						vamp.setPelea(sumaPe);
						vamp.setPrestidigitacion(sumaPre);
						vamp.setSubterfugio(sumaSub);
						break;
					case "tecnicas":
						int sumaAr = 0;
						int sumaCo = 0;
						int sumaEq = 0;
						int sumaEt = 0;
						int sumaInter = 0;
						int sumaPeArmas = 0;
						int sumaSig = 0;
						int sumaSup = 0;
						int sumaTiroArco = 0;
						int sumaTratoAn = 0;
						for (i5 = 1; i5 <= 9; i5++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i5 + "? (artesanía, comercio, equitacion, etiqueta, interpretacion, pelea con armas (poner armas), sigilo, supervivencia, tiro con arco (poner arco), trato con animales (poner animales))");
							punto = sc.nextLine();
							switch (punto) {
								case "artesania":
									sumaAr += 1;
									break;
								case "comercio":
									sumaCo += 1;
									break;
								case "equitacion":
									sumaEq += 1;
									break;
								case "etiqueta":
									sumaEt += 1;
									break;
								case "interpretacion":
									sumaInter += 1;
									break;
								case "armas":
									sumaPeArmas += 1;
									break;
								case "sigilo":
									sumaSig += 1;
									break;
								case "supervivencia":
									sumaSup += 1;
									break;
								case "arco":
									sumaTiroArco += 1;
									break;
								case "animales":
									sumaTratoAn += 1;
									break;
								}}
						vamp.setArtesania(sumaAr);
						vamp.setComercio(sumaCo);
						vamp.setEquitacion(sumaEq);
						vamp.setEtiqueta(sumaEt);
						vamp.setInterpretacion(sumaInter);
						vamp.setPeleaArmas(sumaPeArmas);
						vamp.setSigilo(sumaSig);
						vamp.setSupervivencia(sumaSup);
						vamp.setTiroArco(sumaTiroArco);
						vamp.setTratoAnimales(sumaTratoAn);
						break;
					case "conocimientos":
						int sumaAcademicismo = 0;
						int sumaEnigmas = 0;
						int sumaInvestigacion = 0;
						int sumaLeyes = 0;
						int sumaMedicina = 0;
						int sumaOcultismo = 0;
						int sumaPolitica = 0;
						int sumaSabiduriaPop = 0;
						int sumaSenescal = 0;
						int sumaTeologia = 0;
						for (i5 = 1; i5 <= 9; i5++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i5 + "? (academicismo, enigmas, investigacion, leyes, medicina, ocultismo, politica, sabiduria popular (poner pop), senescal, teologia)");
							punto = sc.nextLine();
							switch (punto) {
								case "academicismo":
									sumaAcademicismo += 1;
									break;
								case "enigmas":
									sumaEnigmas += 1;
									break;
								case "investigacion":
									sumaInvestigacion += 1;
									break;
								case "leyes":
									sumaLeyes += 1;
									break;
								case "medicina":
									sumaMedicina += 1;
									break;
								case "ocultismo":
									sumaOcultismo += 1;
									break;
								case "politica":
									sumaPolitica += 1;
									break;
								case "pop":
									sumaSabiduriaPop += 1;
									break;
								case "senescal":
									sumaSenescal += 1;
									break;
								case "teologia":
									sumaTeologia += 1;
									break;}}
						vamp.setAcademicismo(sumaAcademicismo);
						vamp.setEnigmas(sumaEnigmas);
						vamp.setInvestigacion(sumaInvestigacion);
						vamp.setLeyes(sumaLeyes);
						vamp.setMedicina(sumaMedicina);
						vamp.setOcultismo(sumaOcultismo);
						vamp.setPolitica(sumaPolitica);
						vamp.setSabiduriaPopular(sumaSabiduriaPop);
						vamp.setSenescal(sumaSenescal);
						vamp.setTeologia(sumaTeologia);
						break;}
					
					System.out.println("¿Que atributo quieres que tenga 5 puntos?");
					String habilidad3 = sc.nextLine();
					
					int i6;
					switch (habilidad3) {
					case "talentos":
						int sumaAl = 0;
						int sumaAt = 0;
						int sumaCons = 0;
						int sumaEm = 0;
						int sumaEx = 0;
						int sumaIn = 0;
						int sumaLid = 0;
						int sumaPe = 0;
						int sumaPre = 0;
						int sumaSub = 0;
						for (i6 = 1; i6 <= 5; i6++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i6 + "? (alerta, atletismo, consciencia, empatia, expresion, intimidacion, lideradgo, pelea, prestidigitacion, subterfugio)");
							punto = sc.nextLine();
							switch (punto) {
							case "alerta":
								sumaAl += 1;
								break;
							case "atletismo":
								sumaAt += 1;
								break;
							case "consciencia":
								sumaCons += 1;
								break;
							case "empatia":
								sumaEm += 1;
								break;
							case "expresion":
								sumaEx += 1;
								break;
							case "intimidacion":
								sumaIn += 1;
								break;
							case "lideradgo":
								sumaLid += 1;
								break;
							case "pelea":
								sumaPe += 1;
								break;
							case "prestidigitacion":
								sumaPre += 1;
								break;
							case "subterfugio":
								sumaSub += 1;
								break;}}
							
						vamp.setAlerta(sumaAl);
						vamp.setAtletismo(sumaAt);
						vamp.setConsciencia(sumaCons);
						vamp.setEmpatia(sumaEm);
						vamp.setExpresion(sumaEx);
						vamp.setIntimidacion(sumaIn);
						vamp.setLideradgo(sumaLid);
						vamp.setPelea(sumaPe);
						vamp.setPrestidigitacion(sumaPre);
						vamp.setSubterfugio(sumaSub);
						break;
					case "tecnicas":
						int sumaAr = 0;
						int sumaCo = 0;
						int sumaEq = 0;
						int sumaEt = 0;
						int sumaInter = 0;
						int sumaPeArmas = 0;
						int sumaSig = 0;
						int sumaSup = 0;
						int sumaTiroArco = 0;
						int sumaTratoAn = 0;
						for (i6 = 1; i6 <= 5; i6++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i6 + "? (artesanía, comercio, equitacion, etiqueta, interpretacion, pelea con armas (poner armas), sigilo, supervivencia, tiro con arco (poner arco), trato con animales (poner animales))");
							punto = sc.nextLine();
							switch (punto) {
								case "artesania":
									sumaAr += 1;
									break;
								case "comercio":
									sumaCo += 1;
									break;
								case "equitacion":
									sumaEq += 1;
									break;
								case "etiqueta":
									sumaEt += 1;
									break;
								case "interpretacion":
									sumaInter += 1;
									break;
								case "armas":
									sumaPeArmas += 1;
									break;
								case "sigilo":
									sumaSig += 1;
									break;
								case "supervivencia":
									sumaSup += 1;
									break;
								case "arco":
									sumaTiroArco += 1;
									break;
								case "animales":
									sumaTratoAn += 1;
									break;
								}}
						vamp.setArtesania(sumaAr);
						vamp.setComercio(sumaCo);
						vamp.setEquitacion(sumaEq);
						vamp.setEtiqueta(sumaEt);
						vamp.setInterpretacion(sumaInter);
						vamp.setPeleaArmas(sumaPeArmas);
						vamp.setSigilo(sumaSig);
						vamp.setSupervivencia(sumaSup);
						vamp.setTiroArco(sumaTiroArco);
						vamp.setTratoAnimales(sumaTratoAn);
						break;
					case "conocimientos":
						int sumaAcademicismo = 0;
						int sumaEnigmas = 0;
						int sumaInvestigacion = 0;
						int sumaLeyes = 0;
						int sumaMedicina = 0;
						int sumaOcultismo = 0;
						int sumaPolitica = 0;
						int sumaSabiduriaPop = 0;
						int sumaSenescal = 0;
						int sumaTeologia = 0;
						for (i6 = 1; i6 <= 5; i6++) {
							String punto;
							System.out.println("¿Donde va a estar el punto " + i6 + "? (academicismo, enigmas, investigacion, leyes, medicina, ocultismo, politica, sabiduria popular (poner pop), senescal, teologia)");
							punto = sc.nextLine();
							switch (punto) {
								case "academicismo":
									sumaAcademicismo += 1;
									break;
								case "enigmas":
									sumaEnigmas += 1;
									break;
								case "investigacion":
									sumaInvestigacion += 1;
									break;
								case "leyes":
									sumaLeyes += 1;
									break;
								case "medicina":
									sumaMedicina += 1;
									break;
								case "ocultismo":
									sumaOcultismo += 1;
									break;
								case "politica":
									sumaPolitica += 1;
									break;
								case "pop":
									sumaSabiduriaPop += 1;
									break;
								case "senescal":
									sumaSenescal += 1;
									break;
								case "teologia":
									sumaTeologia += 1;
									break;}}
						vamp.setAcademicismo(sumaAcademicismo);
						vamp.setEnigmas(sumaEnigmas);
						vamp.setInvestigacion(sumaInvestigacion);
						vamp.setLeyes(sumaLeyes);
						vamp.setMedicina(sumaMedicina);
						vamp.setOcultismo(sumaOcultismo);
						vamp.setPolitica(sumaPolitica);
						vamp.setSabiduriaPopular(sumaSabiduriaPop);
						vamp.setSenescal(sumaSenescal);
						vamp.setTeologia(sumaTeologia);
						break;}
					
					
					vamp.setDisciplinaA(2);
					vamp.setDisciplinaB(1);
					vamp.setDisciplinaC(1);
					System.out.println("El reparto de puntos de experiencia en disciplinas es automatico.");
					/*System.out.println("Ahora hay que repartir 4 puntos en las disciplinas " + vamp.getDisciplina1() + ", " + vamp.getDisciplina2() + " y " + vamp.getDisciplina3());
					for (int i = 1; i <= 4; i++)
						System.out.println("¿Donde quieres poner el siguiente punto?");
					String disciplina = sc.nextLine();
					
					if (disciplina.equalsIgnoreCase(vamp.getDisciplina1())) {
						vamp.setDisciplinaA(vamp.getDisciplinaA() + 1);}
					else if (disciplina.equalsIgnoreCase(vamp.getDisciplina2())) {
						vamp.setDisciplinaB(vamp.getDisciplinaB() + 1);}
					else if (disciplina.equalsIgnoreCase(vamp.getDisciplina2())) {
						vamp.setDisciplinaC(vamp.getDisciplinaC() + 1);}*/
					
					System.out.println("Elegido el reparto de puntos en disciplinas, ahora hay que repartir 7 puntos entre las virtudes.");
					int sumaCon = 0;
					int sumaIns = 0;
					int sumaCor = 0;
					
					for (int i = 0; i <7; i++) {
						System.out.println("Los puntos se repartiran en convicción, instinto y coraje. ¿Donde ira el siguiente punto?");
						
						String aRepartir = sc.nextLine();
						if (aRepartir.equalsIgnoreCase("convicion")) {
							sumaCon += 1;
							}
						if (aRepartir.equalsIgnoreCase("instinto")) {
							sumaIns += 1;
							}
						if (aRepartir.equalsIgnoreCase("coraje")) {
							sumaCor += 1;}}
					vamp.setConcienciaConviccion(sumaCon);
					vamp.setAutocontrolInstinto(sumaIns);
					vamp.setCoraje(sumaCor);
					
					System.out.println("Creadas ya las estadisticas del vastago, ¿cual sera su camino durante la eternidad? (poner solo nombre distintivo Ej: cielo)");
					System.out.println("--Lista de caminos--");
					System.out.println("Camino de la bestia (Via Bestiae)");
					System.out.println("Camino del cielo (Via Caeli)");
					System.out.println("Camino de la humanidad (Via Humanitas)");
					System.out.println("Camino de Lilith (Derech Lilit)");
					System.out.println("Camino de la metamorfosis (Via Mutationis)");
					System.out.println("Camino del pecado (Via Peccati)");
					System.out.println("Camino de los reyes (Via Regalis)");
					vamp.setCamino(sc.nextLine());
					
					vamp.setPuntuacionCamino(sumaCon + sumaIns);
					vamp.setFuerzaVoluntad(sumaCor);
					
					System.out.println("La puntuación en camino de " + vamp.getNombre()  + " es " + vamp.getPuntuacionCamino());
					System.out.println("La fuerza de voluntad de " + vamp.getNombre() + " es " + vamp.getFuerzaVoluntad());
					
					vamp.visualizadorFicha();
			}
	
			else if (tipoFicha.equalsIgnoreCase("d")) {
				DnD3 dnd = new DnD3();
	
				System.out.println("¿Cual es el nombre del jugador?");
				dnd.setNombreJugador(sc.next());
	
				System.out.println("¿Cual sera el nombre del personaje?");
				dnd.setNombrePJ(sc.next());
	
				System.out.println("¿Cual sera la raza del personaje?");
				dnd.setRaza(sc.next());
	
				System.out.println("¿Cual sera la clase?");
				dnd.setClase(sc.next());
				switch (dnd.getClase()) {
				case "barbaro":
					System.out.println("El dado de ataque es: 1d12");
					dnd.Nv1Ataque();
					dnd.Nv1Fortaleza();
					dnd.bonifVelocidad();
					dnd.equipoBarbaros();
					dnd.setDineroOro(ran.nextInt(9) + 2);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "bardo":
					System.out.println("El dado de ataque es: 1d6");
					System.out.println("El bardo a nv 1 conoce 5 trucos y 2 conjuros de nv 1.");
	
					System.out.println("--Lista de trucos--");
					System.out.println("Abrir/cerrar (abre o cierra cosas pequeñas o ligeras)");
					System.out.println("Atontar (una criatura humanoide pierde la siguiente accion)");
					System.out.println("Conocer direccion (indica el norte)");
					System.out.println("Convocar instrumento (convoca tu instrumento)");
					System.out.println("Cuchichear mensaje (funciona a distancia)");
					System.out.println("Detectar mensaje (detecta conjuros y objetos magicos)");
					System.out.println("Leer magia (lectura de libros de conjuros y pergaminos)");
					System.out.println("Llamarada (deslumbra a la criatura)");
					System.out.println("Luces danzantes (crea antorchas que se mueven)");
					System.out.println("Luz (un solo objeto brilla como una antorcha)");
					System.out.println("Mano de mago (telequinesis)");
					System.out.println("Nana (vuelve al objetivo somnoliento)");
					System.out.println("Pestidigitacion (trucos de mano menores)");
					System.out.println("Remendar (repara objetos pequeños)");
					System.out.println("Resistencia (el receptor gana +1 en las tiradas de salvacion)");
					System.out.println("Sonido fantasma (crear sonido)");
					System.out.println("Puedes elegir hasta 5 trucos:");
					dnd.setTruco1(sc.nextLine());
					dnd.setTruco2(sc.nextLine());
					dnd.setTruco3(sc.nextLine());
					dnd.setTruco4(sc.nextLine());
					dnd.setTruco5(sc.nextLine());
	
					System.out.println("--Lista de conjuros--");
					System.out.println("Alarma (guarda un lugar durante 2h)");
					System.out.println("Animar cuerda (anima una cuerda)");
					System.out.println("Aura magica (altera el aura magica de un objeto)");
					System.out.println("Boca magica (hace que un objeto hable una sola vez)");
					System.out.println("Borrar (hace desaparece algo o a alguien)");
					System.out.println("Caída de pluma (caes lentamente y anula el daño por caida)");
					System.out.println("Causar miedo (una criatura huye durante 1d4 turnos)");
					System.out.println("Comprension idiomatica (comprendes todos los idiomas durante un turno)");
					System.out.println("Confusion menor (una criatura queda confusa 1 turno)");
					System.out.println("Convocar monstruo (una criatura lucha por ti)");
					System.out.println("Curar heridas leves (cura 1d8 puntos de vida)");
					System.out.println("Detectar puertas secretas");
					System.out.println("Disfrazarse");
					System.out.println("Dormir (duerme al objetivo)");
					System.out.println("Grasa (un objeto se vuelve resvaladizo)");
					System.out.println("Hechizar persona (se vuelve tu amigo)");
					System.out.println("Hipnotismo (fascina a criaturas)");
					System.out.println("Imagen silenciosa (crea una ilusion menor)");
					System.out.println("Oscurecer objeto (esconde el objeto)");
					System.out.println("Quitar miedo (elimina el miedo en el objetivo y da +4 a las tiradas de salvacion)");
					System.out.println("Retirada expeditiva (tu velocidad obtiene +30");
					System.out.println("Sirviente invisible (crea un sirviente que obedece tus ordenes)");
					System.out.println("Terribles carcajadas de Tasha (el objetivo pierde turno)");
					System.out.println("Ventriloquía (crea voz por un turno)");
					System.out.println("Puedes elegir 2 conjuros:");
					dnd.setConjuro1(sc.nextLine());
					dnd.setConjuro2(sc.nextLine());
	
					dnd.Nv1Reflejos();
					dnd.Nv1Voluntad();
					dnd.equipoBardos();
					dnd.setDineroOro(ran.nextInt(9) + 2);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "clerigo":
					System.out.println("Su dado de ataque es 1d8");
					System.out.println("El clerigo puede usar todos los hechizos que su nivel le permita, mientras los haya preparado antes.");
					System.out.println("El clerigo debe elegir una deidad.");
	
					System.out.println("-- Lista de deidades --");
					System.out.println("Heironeus (dios del valor)");
					System.out.println("Moradin (dios de los enanos)");
					System.out.println("Yondalla (diosa de los medianos)");
					System.out.println("Ehlonna (diosa de los bosques)");
					System.out.println("Garl del Oro luminoso (dios de los gnomos)");
					System.out.println("Pelor (dios del sol)");
					System.out.println("Corellon Laretian (dios de los elfos)");
					System.out.println("Kord (dios de la fuerza)");
					System.out.println("Wee Jas (diosa de la muerte y la magia)");
					System.out.println("San Cuthbert (dios del justo castigo)");
					System.out.println("Boccob (dios de la magia)");
					System.out.println("Fharlanghn (dios de los caminos)");
					System.out.println("Obad-Hai (dios de la naturaleza)");
					System.out.println("Olidammara (dios de los picaros)");
					System.out.println("Hextor (dios de la tirania)");
					System.out.println("Nerull (dios de la muerte)");
					System.out.println("Vecna (dios de los secretos)");
					System.out.println("Erythnul (dios de la naturaleza)");
					System.out.println("Gruumsh (dios de los orcos)");
					System.out.println("¿Cual sera la deidad de " + dnd.getNombrePJ() + "? (Solo nombre)");
					dnd.setDeidad(sc.nextLine());
					System.out.println("La deidad de " + dnd.getNombrePJ() + " será " + dnd.getDeidad());
					
					switch (dnd.getDeidad()) {
					case "obad-hai":
						System.out.println("Los dominios de " + dnd.getDeidad() + " son el agua, el aire, el animal, el fuego, la tierra y lo vegetal");
						break;
					case "ehlonna":
						System.out.println("Los dominios de " + dnd.getDeidad() + " son animal, el bien, el sol y lo vegetal");
						break;
					case "corellon":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el bien, el caos, la guerra, la protección");
						break;
					case "garl":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el bien, la protección y la superchería");
						break;
					case "heironeous":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el bien, la guerra y la ley");
						break;
					case "kord":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el bien, el caos, la fuerza y la suerte");
						break;
					case "moradin":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el bien, la ley, la protección y la tierra");
						break;
					case "pelor":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el bien, la curación, la fuerza, el sol");
						break;
					case "yondalla":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el bien, la ley y la protección");
						break;
					case "erythnul":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el caos, la guerra, el mal y la superchería");
						break;
					case "gruumsh":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el caos, la fuerza, la guerra y el mal");
						break;
					case "olidammara":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el caos, la suerte y la superchería");
						break;
					case "san cuthbert":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son la destrucción, la fuerza, la ley y la protección");
						break;
					case "hextor":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son la destrucción, la guerra y la ley");
						break;
					case "wee jas":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son la ley y la magia");
						break;
					case "boccob":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son la magia, el saber y la superchería");
						break;
					case "vecna":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son la magia, el mal y el saber");
						break;
					case "nerull":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son el mal, la muerte, la superchería");
						break;
					case "fharlanghn":
						System.out.println("Los dominios de " + dnd.getDeidad()  + " son la protección, la suerte y el viaje");
						break;}
	
					dnd.Nv1Fortaleza();
					dnd.Nv1Voluntad();
					dnd.equipoClerigos();
	
					dnd.setDineroOro(ran.nextInt(5) + 1);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "druida":
					System.out.println("El dado de ataque es: 1d8");
					System.out.println("El druida puede usar todos los hechizos que su nivel le permita, mientras los haya preparado antes.");
					
					System.out.println("El animal de compañía será: lobo");
					System.out.println("El animal a nv 1 puede compartir el efecto de los conjuros y tener un vinculo con el druida.");
					
					dnd.Nv1Fortaleza();
					dnd.Nv1Voluntad();
					dnd.bonifSaberNat();
					dnd.bonifSupervivencia();
					dnd.equipoDruida();
					
					dnd.setDineroOro(ran.nextInt(7) + 1);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "explorador":
					System.out.println("El dado de ataque es: 1d8");
					System.out.println("El explorador no puede conjurar hasta nivel 4.");
					
					dnd.Nv1Ataque();
					dnd.Nv1Fortaleza();
					dnd.Nv1Reflejos();
					dnd.equipoExplorador();
					
					dnd.setDineroOro(ran.nextInt(9) + 2);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "guerrero":
					System.out.println("El dado de ataque es: 1d10");
					
					dnd.Nv1Ataque();
					dnd.Nv1Fortaleza();
					dnd.equipoGuerrero();
					
					dnd.setDineroOro(ran.nextInt(17) + 4);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "hechicero":
					System.out.println("El dado de ataque es: 1d4");
					System.out.println("El mago debe preparar los conjuros antes de usarlos.");
					
					dnd.Nv1Voluntad();
					dnd.equipoMago();
					
					dnd.setDineroOro(ran.nextInt(13) + 3);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "mago":
					System.out.println("El dado de ataque es: 1d4");
					System.out.println("El hechicero puede aprender 4 trucos y 2 conjuros nv 1.");
					
					System.out.println("--Lista de trucos--");
					System.out.println("Abrir/Cerrar; abre o cierra cosas pequeñas o ligeras");
					System.out.println("Atontar: una criatura humanoide pierde su siguiente turno");
					System.out.println("Cuchichear mensaje: conversación cuchicheada a distancia");
					System.out.println("Detectar magia: detecta conjuros y objetos mágicos");
					System.out.println("Detectar veneno: detecta veneno en una criatura u objeto pequeño");
					System.out.println("Leer magia: lectura de libros de conjuros y rollos de pergamino");
					System.out.println("Llamarada: deslumbra a una criatura (-1 al ataque)");
					System.out.println("Luces danzantes: antorchas quiméricas y otras luces");
					System.out.println("Luz: un objeto brilla como una antorcha");
					System.out.println("Mano de mago: telequinesis");
					System.out.println("Marca arcana: inscribe una runa personal (visible o invisible)");
					System.out.println("Perturbar muertos vivientes: inflige 1d6 de daño a 1 muerto viviente");
					System.out.println("Prestidigitación: realización de trucos menores");
					System.out.println("Remendar: reparación menor de un objeto");
					System.out.println("Resistencia: el receptor gana +1 en los tiros de salvación");
					System.out.println("Sonido fantasma: sonidos quiméricos");
					System.out.println("Toque de fatiga: ataque de toque que fatiga al objetivo");
					System.out.println("Elige 4 trucos:");
					dnd.setTruco1(sc.nextLine());
					dnd.setTruco2(sc.nextLine());
					dnd.setTruco3(sc.nextLine());
					dnd.setTruco4(sc.nextLine());
					
					System.out.println("--Lista de conjuros--");
					System.out.println("Alarma: guarda un lugar durante 2 horas");
					System.out.println("Escudo: disco invisible que da +4 a la CA y bloquea los proyectiles mágicos");
					System.out.println("Protección contra el bien/el mal/la ley/el caos: +2 a CA y las salvaciones, contrarresta el control mental, mantiene a raya a elementales y ajenos");
					System.out.println("Soportar los elementos: permanecer confortablemente en entornos fríos o calientes");
					System.out.println("Trabar portal: atranca una entrada");
					System.out.println("Comprensión idiomática: comprendes todos los idiomas hablados y escritos");
					System.out.println("Detectar muertos vivientes: revela a estas criaturas");
					System.out.println("Detectar puertas secretas: revela las puertas ocultas");
					System.out.println("Identificar: determina las propiedades de un objeto mágico");
					System.out.println("Impacto verdadero: +20 a tu siguiente tirada de ataque");
					System.out.println("Armadura de mago: concede al receptor un +4 de armadura");
					System.out.println("Convocar monstruo I: trae a un ajeno para que luche por ti");
					System.out.println("Grasa: un objeto o cuadrado de 10' de lado se vuelve resbaladizo");
					System.out.println("Montura: convoca a un caballo de monta durante 2 h");
					System.out.println("Niebla de oscurecimiento: una niebla te rodea");
					System.out.println("Sirviente invisible: crea una fuerza invisible que obedece tus órdenes");
					System.out.println("Dormir: sume a criaturas por un valor de 4 DG en un sueño mágico");
					System.out.println("Hechizar persona: una persona se hace amiga tuya");
					System.out.println("Hipnotismo: fascina a criaturas");
					System.out.println("Contacto electrizante: toque que causa 1d6 de daño por electricidad");
					System.out.println("Disco flotante de tenser: disco horizontal, de 3 cm de diámetro");
					System.out.println("Manos ardientes: 1d4 daño por fuego");
					System.out.println("Proyectil magico: daño 1d4+1");
					System.out.println("Aura mágica de nystul: altera el aura mágica de un objeto");
					System.out.println("Disfrazarse: cambia tu apariencia");
					System.out.println("Imagen silenciosa: crea una ilusión menor diseñada por ti");
					System.out.println("Rociada de color: deja inconscientes, ciegas o aturdidas a 1d6 criaturas débiles");
					System.out.println("Ventriloquía: crea una voz durante 1 mininivel");
					System.out.println("Causar miedo: una criatura huye durante 1d4 asaltos");
					System.out.println("Rayo de debilitamiento: rayo que reduce la Fue en 1d6+1");
					System.out.println("Toque gélido: paraliza a un objetivo, que exuda un gran hedor que indispone a los que estén cerca\r\n");
					System.out.println("Agrandar persona: una criatura humanoide dobla su tamaño");
					System.out.println("Animar una cuerda: hace que una cuerda se mueva a tus órdenes");
					System.out.println("Arma mágica: un arma gana un bonificador de +1");
					System.out.println("Borrar: hace desaparecer escritura mágica o mundana");
					System.out.println("Caída de pluma: objetos o criaturas caen lentamente");
					System.out.println("Reducir persona: una criatura humanoide reduce a la mitad su tamaño");
					System.out.println("Retirada expeditiva: tu velocidad aumenta en 30");
					System.out.println("Salto: el receptor obtiene un bonificadar a las pruebas de Saltar");
					System.out.println("¿Que conjuros escoges?");
					dnd.setConjuro1(sc.nextLine());
					dnd.setConjuro2(sc.nextLine());
					
					dnd.Nv1Voluntad();
					dnd.equipoHechicero();
					
					dnd.setDineroOro(ran.nextInt(19) + 3);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "monje":
					System.out.println("El dado de ataque es: 1d8");
					
					dnd.Nv1Reflejos();
					dnd.Nv1Fortaleza();
					dnd.Nv1Voluntad();
					dnd.equipoMonje();
					
					dnd.setDineroOro(ran.nextInt(9) + 2);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "paladin":
					System.out.println("El dado de ataque es 1d10");
					System.out.println("Los paladines no aprenden conjuros hasta nv 4.");
					
					dnd.Nv1Ataque();
					dnd.Nv1Fortaleza();
					
					System.out.println("El paladín debe elegir una deidad.");
					
					System.out.println("-- Lista de deidades --");
					System.out.println("Heironeus (dios del valor)");
					System.out.println("Moradin (dios de los enanos)");
					System.out.println("Yondalla (diosa de los medianos)");
					System.out.println("Ehlonna (diosa de los bosques)");
					System.out.println("Garl del Oro luminoso (dios de los gnomos)");
					System.out.println("Pelor (dios del sol)");
					System.out.println("Corellon Laretian (dios de los elfos)");
					System.out.println("Kord (dios de la fuerza)");
					System.out.println("Wee Jas (diosa de la muerte y la magia)");
					System.out.println("San Cuthbert (dios del justo castigo)");
					System.out.println("Boccob (dios de la magia)");
					System.out.println("Fharlanghn (dios de los caminos)");
					System.out.println("Obad-Hai (dios de la naturaleza)");
					System.out.println("Olidammara (dios de los picaros)");
					System.out.println("Hextor (dios de la tirania)");
					System.out.println("Nerull (dios de la muerte)");
					System.out.println("Vecna (dios de los secretos)");
					System.out.println("Erythnul (dios de la naturaleza)");
					System.out.println("Gruumsh (dios de los orcos)");
					System.out.println("¿Cual sera la deidad de " + dnd.getNombrePJ() + "? (Solo nombre)");
					dnd.setDeidad(sc.nextLine());
					System.out.println("La deidad de " + dnd.getNombrePJ() + " será " + dnd.getDeidad());
					
					dnd.equipoPaladin();
					
					dnd.setDineroOro(ran.nextInt(25) + 6);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				case "picaro":
					dnd.Nv1Reflejos();
					
					System.out.println("El dado de ataque es 1d6");
					
					dnd.equipoPicaro();
					dnd.setIniciativa(1);
					
					dnd.setDineroOro(ran.nextInt(17) + 4);
					System.out.println("Su dinero es: " + dnd.getDineroOro() + "po");
					break;
				default:
					System.out.println("Esa clase no existe.");
					System.exit(0);}
				
				System.out.println("Creada la clase, pongamos estadisticas a " + dnd.getNombrePJ());
				
				dnd.setFuerza((ran.nextInt(20) + 10));
				System.out.println("La estadistica de fuerza será " + dnd.getFuerza());
				dnd.modificadorFuerza(dnd.getFuerza());
				
				dnd.setDestreza(ran.nextInt(20) + 10);
				System.out.println("La estadistica de destreza será " + dnd.getDestreza());
				dnd.modificadorDestreza(dnd.getDestreza());
				
				dnd.setConstitucion(ran.nextInt(20) + 10);
				System.out.println("La estadistica de cosntitución será " + dnd.getConstitucion());
				dnd.modificadorCons(dnd.getConstitucion());
				
				dnd.setInteligencia(ran.nextInt(20) + 10);
				System.out.println("La estadistica de inteligencia será " + dnd.getInteligencia());
				dnd.modificadorInt(dnd.getInteligencia());
				
				dnd.setSabiduria(ran.nextInt(20) + 10);
				System.out.println("La estadistica de sabiduría será " + dnd.getSabiduria());
				dnd.modificadorSab(dnd.getSabiduria());
				
				dnd.setCarisma(ran.nextInt(20) + 10);
				System.out.println("La estadistica de carisma será " + dnd.getCarisma());
				dnd.modificadorCarisma(dnd.getCarisma());
				
				switch (dnd.getRaza()) {
				case "humano":
					dnd.velocidadGeneral();
					break;
				case "elfo":
					dnd.velocidadGeneral();
					dnd.bonificacionDestreza();
					dnd.penalizacionConstitucion();
					dnd.bonificacionResConjuros();
					dnd.bonificacionAvistar();
					dnd.bonificacionBuscar();
					dnd.bonificacionEscuchar();
					break;
				case "enano":
					dnd.velocidadPequeños();
					dnd.bonificacionResConjuros();
					dnd.bonificacionBuscar();
					dnd.bonificacionConstitucion();
					dnd.penalizacionCarisma();
					dnd.bonificacionEquilibrio();
					break;
				case "gnomo":
					dnd.velocidadPequeños();
					dnd.bonificacionResConjuros();
					dnd.bonificacionEscuchar();
					dnd.bonificacionConstitucion();
					dnd.bonificacionTasar();
					dnd.penalizacionFuerza();
					dnd.bonificacionCA();
					dnd.bonificacionAtaque();
					dnd.bonificacionEsconderse();
					break;
				case "mediano":
					dnd.velocidadPequeños();
					dnd.bonificacionDestreza();
					dnd.bonificacionEscuchar();
					dnd.bonificacionCA();
					dnd.bonificacionAtaque();
					dnd.bonificacionEsconderse();
					dnd.penalizadorFuerza();
					dnd.bonificacionSigilo();
					dnd.bonificacionSaltar();
					dnd.bonificacionTrepar();
					dnd.bonificacionFortaleza();
					dnd.bonificacionReflejos();
					dnd.bonificacionVoluntad();
					break;
				case "semielfo":
					dnd.velocidadGeneral();
					dnd.bonificacionAvistar2();
					dnd.bonificacionBuscar2();
					dnd.bonificacionEscuchar2();
					dnd.bonificacionDiplomacia();
					dnd.bonificacionReunirInfo();
					break;
				case "semiorco":
					dnd.bonificacionFuerza();
					dnd.penalizadorInteligencia();
					dnd.penalizacionCarisma();
					break;}
				
				dnd.setClaseArmadura(dnd.getClaseArmadura() + 10);
				dnd.setIniciativa(dnd.getIniciativa()+ dnd.modificadorDestreza(dnd.getDestreza()));
				
				dnd.visualizadorFicha();}
			
			else if(!tipoFicha.equals("0")){
				System.out.println("Esa opcion no existe.");}
			
			if(tipoFicha.equals("0")) {
				System.out.println("Gracias por usar el programa no oficial de creador de fichas.");
			}
		}while (!(tipoFicha.equalsIgnoreCase("d") || tipoFicha.equalsIgnoreCase("v") || tipoFicha.equals("0")));

		sc.close();
	}
}