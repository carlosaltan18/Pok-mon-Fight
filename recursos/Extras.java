package recursos; 
import java.util.Random;
import java.util.Scanner;  
public class Extras {
	Scanner leer = new Scanner(System.in);
	Random vida = new Random(); 
 	Random poder = new Random();
 
 	//variables 
	protected int poderPoke1 = 5 + poder.nextInt(15); 
	protected int vidaPoke1 =  50 + vida.nextInt(50); 
	protected int poderPoke2 = 5 + poder.nextInt(15); 
	protected int vidaPoke2 = 50 + vida.nextInt(50);
	protected int poderPoke3 = 5 + poder.nextInt(15); 
	protected int vidaPoke3 = 50 + vida.nextInt(50);
	protected int poderPoke4 = 5 + poder.nextInt(15); 
	protected int vidaPoke4 = 50 + vida.nextInt(50); 
	protected int count1 = 0, round = 0, opcionContador = 0; 
	protected String player1, player2; 
	protected int pokemon1P1, pokemon2P1, pokemon1P2, pokemon2P2;  
	protected int opci;
	protected int countPika = 0;
	protected int countGrenin = 0;
	protected int countLuca = 0; 
	protected int countGenga = 0; 
	protected int countBlas = 0; 
	protected int countPid = 0; 
	protected boolean salirBatalla = false; 
	protected boolean salirBatallaP1 = false; 
	protected boolean salirBatallaP2 = false; 
	protected String ganador = null; 
	protected int opcionPokemon1, opcionPokemon2 ; 
	protected int countGanadorP1 = 0, countGanadorP2 = 0; 
	
	public Extras(){}
	public Extras(int poderPoke1, int vidaPoke1, int poderPoke2, int vidaPoke2, int poderPoke3, int vidaPoke3, int poderPoke4, int vidaPoke4 ){
		this.poderPoke1 = poderPoke1; 
		this.vidaPoke1 = vidaPoke1; 
		this.poderPoke2 = poderPoke2; 
		this.vidaPoke2 = vidaPoke2; 
		this.poderPoke3 = poderPoke3; 
		this.vidaPoke3 = vidaPoke3; 
		this.poderPoke4 = poderPoke4;
		this.vidaPoke4 = vidaPoke4;
	
	}

	//contadores pokemon
	public int getCountPika(){
		return countPika; 
	}
	public int getCountGrenin(){
		return countGrenin; 
	}
	public int getCountLuca(){
		return countLuca; 
	}
	public int getCountGenga(){
		return countGenga;  
	}
	public int getCountBlas(){
		return countBlas; 
	}
	public int getCountPid(){
		return countPid; 
	}
	//
	public void setopcionPokemon1(int a){
		a = opcionPokemon1; 
	}
	public int getopcionPokemon1(){
		return opcionPokemon1; 
	}
	public int getopcionPokemon2(){
		return opcionPokemon2; 
	}
	public void setopcionPokemon2(int b){
		b = opcionPokemon2; 
	}
	public boolean getSalirBatallaP1(){
		return salirBatallaP1; 
	}
	public boolean getSalirBatallaP2(){
		return salirBatallaP2; 
	}
	//get round y batalla y ganador
	public String getWinner(){
		return ganador; 
	}
	public boolean getSalirBatalla(){
		return salirBatalla; 
	}
	public int getRound(){
		return round; 
	}
	//contadores 
	public void contador1(){
		count1 ++; 
	}
	public int getContador1(){
		return count1; 
	}
	//seleccion de pokemons
	public int getPokemon1P1(){
		return pokemon1P1; 
	}
	public int getPokemon2P1(){
		return pokemon2P1; 
	}
	public int getPokemon1P2(){
		return pokemon1P2; 
	}
	public int getPokemon2P2(){
		return pokemon2P2; 
	}


//pokemon 3
	public void vidaPoke3MenosPoke1(){
		vidaPoke3-=poderPoke1;
	}
	public void vidaPoke3MenosPoke2(){
		vidaPoke3-=poderPoke2;
	}
//pokemon 4
	public void vidaPoke4MenosPoke1(){
		vidaPoke4-=poderPoke1;
	}
	
	public void vidaPoke4MenosPoke2(){
		vidaPoke4-=poderPoke2;
	}
//pokemon 1
	public void vidaPoke1MenosPoke3(){
		vidaPoke1-=poderPoke3; 
	}
	public void vidaPoke1MenosPoke4(){
		vidaPoke1-=poderPoke4; 
	}
//pokemon 2
	
	public void vidaPoke2MenosPoke3(){
		vidaPoke2-=poderPoke3; 
	}
	public void vidaPoke2MenosPoke4(){
		vidaPoke2-=poderPoke4; 
	}
	

//get y sett
	public String getPlayer1(){
		return player1; 
	}
	public String getPlayer2(){
		return player2; 
	}

	public int getVidaPoke1(){
		return vidaPoke1; 
	}

	public int getPoderPoke1(){
		return poderPoke1; 
	}
	public int getVidaPoke2(){
		return vidaPoke2; 
	}

	public int getPoderPoke2(){
		return poderPoke2; 
	}
	public int getVidaPoke3(){
		return vidaPoke3; 
	}

	public int getPoderPoke3(){
		return poderPoke3; 
	}
	public int getVidaPoke4(){
		return vidaPoke4; 
	}

	public int getPoderPoke4(){
		return poderPoke4; 
	}

	//datos


	public void crearRndom(){
	 poderPoke1 = 5 + poder.nextInt(15); 
	  vidaPoke1 =  50 + vida.nextInt(50); 
	  poderPoke2 = 5 + poder.nextInt(15); 
	  vidaPoke2 = 50 + vida.nextInt(50);
	  poderPoke3 = 5 + poder.nextInt(15); 
	  vidaPoke3 = 50 + vida.nextInt(50);
	  poderPoke4 = 5 + poder.nextInt(15); 
	  vidaPoke4 = 50 + vida.nextInt(50);
	}
	public void datosPoke1(){
		System.out.println("datos: " +"vida: "+ getVidaPoke1());
		System.out.println("datos: "+"poder: " +getPoderPoke1());
		if (getVidaPoke1()>0){
			System.out.println("estado: Vivo"); 
		}else{System.out.println("estado: Muerto"); }
	}
	public void datosPoke2(){
		System.out.println("datos: " +"vida: "+ getVidaPoke2());
		System.out.println("datos: "+"poder: " +getPoderPoke2());
		if (getVidaPoke2()>0){
			System.out.println("estado: Vivo"); 
		}else{System.out.println("estado: Muerto"); }
	}
	public void datosPoke3(){
		System.out.println("datos: " +"vida: "+ getVidaPoke3());
		System.out.println("datos: "+"poder: " +getPoderPoke3());
		if (getVidaPoke3()>0){
			System.out.println("estado: Vivo"); 
		}else{System.out.println("estado: Muerto"); }
	}
	public void datosPoke4(){
		System.out.println("datos: " +"vida: "+ getVidaPoke4());
		System.out.println("datos: "+"poder: " +getPoderPoke4());
		if (getVidaPoke4()>0){
			System.out.println("estado: Vivo"); 
		}else{System.out.println("estado: Muerto"); }
	}

//menus 

	public void pedirNames(){
					crearRndom(); 
					System.out.println("porfavor registren sus nombres:");
					System.out.println("Entrenador No.1, ingresa tu nombre: ");
					System.out.println("Presionar enter 1 vez  ");
					leer.nextLine(); 
					player1 = leer.nextLine(); 
					System.out.println("Bienvenido " + player1);
					System.out.println("Entrenador No.2, ingresa tu nombre: "); 
					player2 = leer.nextLine(); 
					System.out.println("Bienvenido " + player2);
					System.out.println(""); 
	}
	public void countpoke(int l){
		opcionContador = l; 
		switch (opcionContador) {
			case 1: 
				countPika ++;
				break; 
			case 2:
				countGrenin ++; 
				break; 
			case 3:
				countLuca ++;
				break;
			case 4: 
				countGenga++; 
				break; 
			case 5: 
				countBlas ++; 
				break; 
			case 6: 
				countPid ++; 
				break; 

		}

	}
	public void selecionarPokemons(){
					System.out.println("Bienvenidos entranadores a la batalla 1vs1");
					pedirNames();
					System.out.println("Es hora de escojer tus pokemons");
					mostrarPokes(); 
					System.out.println(getPlayer1() +" escoje tu primer pokemon");
					pokemon1P1 = leer.nextInt();
					countpoke(pokemon1P1); 
					System.out.println(getPlayer1()  +" escoje tu segundo pokemon");
					pokemon2P1 = leer.nextInt(); 
					countpoke(pokemon2P1); 
					mostrarPokes();
					System.out.println("");
					System.out.println(getPlayer2() +" escoje tu primer pokemon");
					pokemon1P2 = leer.nextInt();
					countpoke(pokemon1P2); 
					System.out.println(getPlayer2() +" escoje tu segundo pokemon");
					pokemon2P2 = leer.nextInt();
					countpoke(pokemon2P2); 
					System.out.println(); 



	}
	public void errorUsuario(){System.out.println("Por favor ingresa un valor dentro del rango solicitado"); }
	public void logoJuego(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,*#*(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/@*@@@@@@**%%#**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 
		System.out.println("@@@@@%,***/((/***/@@@@@@,***(#/**((/#&*.******@@,**(//**%%#*@@@@@.***&@@@@@@@@@@"); 
		System.out.println("@***#%%%%%%%%%%%%(**@@@,,**%%%(/%%%%(**%%%%%%%(/**%%%%#(%%#*&@@@&,*/%%##*,/*/**#"); 
		System.out.println("@,,**%%%%%%%****%%#*@@&((.*#%%%%%%%***%%*@/#%/**.*%%%%#%%%%/***/(/**%%%%(*/%%%/*"); 
		System.out.println("@@@,****%%%%#*@*%%**(%/(%%(/#%%%#**/**%%#%%*(%%#**%%%%%%%%#*%#*%%%&(*&%%#*%%%(*@"); 
		System.out.println("@@@@@@,**%%%%#%%***%%***/*%(*%%(%%%%#(*(%%%%%%***%%%(*%%*#*%%#(**(%%*%#%%%%%#*@@"); 
		System.out.println("@@@@@@@,,*%%%%(*,*(%%%%%%%%**%#*,***#%%%##*.,@.**#%%*****%//%%%%%%%*%%/%%%%#*@@@"); 
		System.out.println("@@@@@@@@.,*%%%#**.**%%%%%***%%#*@@@(,.***#*@@@@@@@/.@,.,*#%##****.*%%#*%%%%/#@@@"); 
		System.out.println("@@@@@@@@@..*%%%#*@@,...,@@.,,.,@@@@@@@@@/,,@@@@@@@@@@@@@#,,,,,*@.,.,***%%%**@@@@"); 
		System.out.println("@@@@@@@@@@..*****%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&.,*/**@(@@@"); 
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"); 
		System.out.println(""); 
	}
	public void menuOpcion(){
		System.out.println("1: Ver el listado de los Pokemon");
		System.out.println("2: Jugar una batalla 1vs1");
		System.out.println("3: Ver el registro de las partidas jugadas");
		System.out.println("4: Ver el listado de pokemons más y menos usados");
		System.out.println("5: Salir");
	}

	public void mostrarPokes(){
		System.out.println("1: Pikachu"); 
		System.out.println("2: Greninja");
		System.out.println("3: Lucario");
		System.out.println("4: Gengar");
		System.out.println("5: Blastoise");
		System.out.println("6: Pidgey");     
	}


	public void despedida(){
				System.out.println("Adios entranadores..."); 
				System.out.println("Esperamos verlos pronto."); 
	}



	public void salirBatalla(){
		if (getVidaPoke1() <= 0 && getVidaPoke2() <= 0){
			ganador = getPlayer2(); 
			System.out.println("el ganador es: " + ganador);
			countGanadorP2 ++; 
			salirBatalla = true; 
			
		}else if (getVidaPoke3() <= 0 && getVidaPoke4() <= 0 ){
			ganador = getPlayer1(); 
			System.out.println("el ganador es: " + ganador); 
			countGanadorP1 ++; 
			salirBatalla = true; 
			 
		}else {
			round++;
			System.out.println("termina el round: " + round); 

		}
	}
	public void historialPartida(){
					System.out.println("partidas jugadas: " + getContador1()); 
					System.out.println("cantidad de round jugados en la ultima partida: " + getRound()); 
					round = 0 ; 
					System.out.println("jugadores: " + getPlayer1() +", " + getPlayer2()); 
					System.out.println("El ganador de la ultima partida fue: " + getWinner()); 
					System.out.println("cantidad de veces que el jugador 1 ganó: " + countGanadorP1 ); 
					System.out.println("cantidad de veces que el jugador 2 ganó: " + countGanadorP2 ); 

	}
	public void salirBatallaP1(){

		 if (getVidaPoke1() <= 0 && getVidaPoke2()<= 0) {
			salirBatallaP1 = false; 
		}else if (getVidaPoke1() > 0 && getVidaPoke2() > 0 ) {
			salirBatallaP1 = false; 
		}else if (getVidaPoke1() <= 0){
			salirBatallaP1 = true; 
			if (opcionPokemon1 != 1) {
				
				salirBatallaP1 = false; 
			}
		}else if (getVidaPoke2() <= 0) {
			 salirBatallaP1 = true; 
			 
			 if (opcionPokemon1 != 2) {
			 		
			 		salirBatallaP1 = false; 		
			 			}			
		}
	}
	public void salirBatallaP2(){
		 if (getVidaPoke3() <= 0 && getVidaPoke4()<= 0) {
			salirBatallaP2 = false; 
		}else if (getVidaPoke3() > 0 && getVidaPoke4() > 0 ) {
			salirBatallaP2 = false; 
		}else if (getVidaPoke3() <= 0){
			salirBatallaP2 = true; 
			 
			if (opcionPokemon2!=  1) {
				
				salirBatallaP2 = false; 
			}
		}else if (getVidaPoke4() <= 0) {
			 salirBatallaP2 = true; 
		 
			 if (opcionPokemon2 != 2) {
			 		
			 		salirBatallaP2 = false; 		
			 			}			
		}
	}

}