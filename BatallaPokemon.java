import recursos.*;
import java.util.Scanner; 
public class BatallaPokemon{
	public static void main(String[] args) { 
		int opci;
		boolean fin = false; 
		//objetos 
		Scanner leer = new Scanner(System.in); 
		Extras menus = new Extras();
		Pokemon2 mostrar = new Pokemon2(); //solo para el inciso 1
		Pokemon pokemons = new Pokemon(); // usar para la batalla
		menus.pedirNames();
		do{ 
			menus.logoJuego(); 
			System.out.println("******/////Bienvenidos a Batalla Pokemón 2022******/////");
			System.out.println(" ¿Que deseas hacer?"); 
			menus.menuOpcion(); 
			opci = leer.nextInt(); 
			switch(opci){
				//mostrar pokemons
				case 1: 
					mostrar.mostarPikachu(); 
					mostrar.mostrarGreninja();
					mostrar.mostrarLucario();
					mostrar.mostrarGengar();
					mostrar.mostrarBlastoise();
					mostrar.mostrarPidgey();
					break; 
					//batalla
				case 2: 
					menus.selecionarPokemons(); 
					System.out.println("pokemons de "+menus.getPlayer1() ); 
					pokemons.mostrarPokemon(menus.getPokemon1P1());//metodo del la clase pokemon, usar las variables de los pokemons creados en esta class
					menus.datosPoke1();
					pokemons.mostrarPokemon(menus.getPokemon2P1());
					menus.datosPoke2(); 
					System.out.println("pokemons de "+menus.getPlayer2()); 
					pokemons.mostrarPokemon(menus.getPokemon1P2());
					menus.datosPoke3(); 
					pokemons.mostrarPokemon(menus.getPokemon2P2());
					menus.datosPoke4(); 
					System.out.println(" es hora de iniciar la batalla: ");
					do{ do{
						System.out.println("Turno de: " + menus.getPlayer1() ); 
						System.out.println("con cual pokemon quires atacar, el pokemon 1 o el pokemon 2 ?"); 
						opci = leer.nextInt();
						menus.setopcionPokemon1(opci); 
						if( opci == 1){
							if ( menus.getVidaPoke1() > 0){
								
								System.out.println(" a que pokemon quieres atacar el 1 o el 2");
								opci = leer.nextInt(); 
								if (opci == 1){
										if( menus.getVidaPoke3() > 0){
											System.out.println("Atacando al pokemon	1 de " + menus.getPlayer2()); 
											pokemons.mostrarPokemon(menus.getPokemon1P1());
											menus.datosPoke1();
											System.out.println("ahora la vida del pokemon 1 de "+  menus.getPlayer2() + " es: "+ (menus.getVidaPoke3() - menus.getPoderPoke1())); 
											menus.vidaPoke3MenosPoke1();
										}else {System.out.println("este pokemon ya esta muerto, tienes que elegir  a otro"); }
										
								} else {
									if (menus.getVidaPoke4() > 0){
										System.out.println("Atacando al pokemon	2 de " + menus.getPlayer2()); 
										pokemons.mostrarPokemon(menus.getPokemon1P1());
										menus.datosPoke1();
										System.out.println("ahora la vida del pokemon 2 de "+  menus.getPlayer2() + " es: "+ (menus.getVidaPoke4() - menus.getPoderPoke1())); 
										menus.vidaPoke4MenosPoke1();
									}else {System.out.println("este pokemon ya esta muerto, tienes que elegir a otro"); }
										
								}
							
							}else { System.out.println("tu pokemon esta muerto, elige otra opción. ");  }


						} else {
							if (menus.getVidaPoke2() > 0){
								
								System.out.println(" a que pokemon quieres atacar el 1 o el 2");
								opci = leer.nextInt();
								if (opci == 1){
									if (menus.getVidaPoke3() > 0 ){
										System.out.println("Atacando al pokemon	1 de " + menus.getPlayer2());
									pokemons.mostrarPokemon(menus.getPokemon2P1());
									menus.datosPoke2(); 
									System.out.println("ahora la vida del pokemon 1 de "+  menus.getPlayer2() + " es: "+ (menus.getVidaPoke3() - menus.getPoderPoke2())); 
									menus.vidaPoke3MenosPoke2(); 
									}else {System.out.println("este pokemon ya esta muerto, tienes que elegir a otro");}
									
								}else {
									if (menus.getVidaPoke4() > 0){
										System.out.println("Atacando al pokemon	2 de " + menus.getPlayer2());
									pokemons.mostrarPokemon(menus.getPokemon2P1());
									menus.datosPoke2(); 
									System.out.println("ahora la vida del pokemon 2 de "+  menus.getPlayer2() + " es: "+ (menus.getVidaPoke4() - menus.getPoderPoke2())); 
									menus.vidaPoke4MenosPoke2(); 
									}else {System.out.println("este pokemon ya esta muerto, tienes que elegir al otro");}
								}
							
							}else {System.out.println("tu pokemon esta muerto, elige otra opción."); }
						}
						 menus.salirBatallaP1(); 
						}while(menus.getSalirBatallaP1() != false);     //FIN PLAYER 1

						do{
						System.out.println("turno de: " + menus.getPlayer2()); 
						System.out.println("con cual pokemon quires atacar, el pokemon 1 o el pokemon 2 ?"); 
						opci = leer.nextInt();
						menus.setopcionPokemon2(opci); 
						if (opci == 1){
							if ( menus.getVidaPoke3() > 0){
								System.out.println(" a que pokemon quieres atacar el 1 o el 2");
								opci = leer.nextInt(); 
								if (opci == 1){
									if (menus.getVidaPoke1() > 0) {
										System.out.println("Atacando al pokemon	1 de " + menus.getPlayer1() ); 
									pokemons.mostrarPokemon(menus.getPokemon1P2());
									menus.datosPoke3();
									System.out.println("ahora la vida del pokemon 1 de "+  menus.getPlayer1()  + " es: "+ (menus.getVidaPoke1() - menus.getPoderPoke3())); 
									menus.vidaPoke1MenosPoke3();
									}else{System.out.println("este pokemon esta muerto, elige otro "); }
									

								}else {
									if (menus.getVidaPoke2() > 0) {
										System.out.println("Atacando al pokemon	2 de " + menus.getPlayer1() ); 
									pokemons.mostrarPokemon(menus.getPokemon1P2());
									menus.datosPoke3();
									System.out.println("ahora la vida del pokemon 2 de "+  menus.getPlayer1()  + " es: "+ (menus.getVidaPoke2() - menus.getPoderPoke3())); 
									menus.vidaPoke2MenosPoke3();
									}else{System.out.println("este pokemon esta muerto, elige otro "); }
									
								}

							}else { System.out.println("tu pokemon esta muerto, elige otra opción "); }

						}else{
							if (menus.getVidaPoke4() > 0){
								System.out.println(" a que pokemon quieres atacar el 1 o el 2");
								opci = leer.nextInt();
								if (opci == 1){
									if (menus.getVidaPoke1() > 0) {
										System.out.println("Atacando al pokemon	1 de " + menus.getPlayer1() );
									pokemons.mostrarPokemon(menus.getPokemon2P2());
									menus.datosPoke4(); 
									System.out.println("ahora la vida del pokemon 1 de "+  menus.getPlayer1()  + " es: "+ (menus.getVidaPoke1() - menus.getPoderPoke4())); 
									menus.vidaPoke1MenosPoke4();

									}else{System.out.println("este pokemon esta muerto, elige otro "); }
									

								}else {
									if (menus.getVidaPoke2() > 0) {
										System.out.println("Atacando al pokemon	2 de " + menus.getPlayer1() );
									pokemons.mostrarPokemon(menus.getPokemon2P2());
									menus.datosPoke4(); 
									System.out.println("ahora la vida del pokemon 2 de "+  menus.getPlayer1()  + " es: "+ (menus.getVidaPoke2() - menus.getPoderPoke4())); 
									menus.vidaPoke2MenosPoke4();
									} else{System.out.println("este pokemon esta muerto, elige otro "); }
								}

							}else{System.out.println("tu pokemon esta muerto, elige otra opción ."); }

						}
						menus.salirBatallaP2(); 
						}while(menus.getSalirBatallaP2() != false); 
						
						menus.salirBatalla(); 

					}while(menus.getSalirBatalla() != true); 
					//while(menus.getVidaPoke1() > 0 || menus.getVidaPoke2() > 0  && menus.getVidaPoke3() > 0 ||  menus.getVidaPoke4()> 0); puede funcionar o no puede funcionar
					//while(menus.getVidaPoke1() > 0  && menus.getVidaPoke2()  > 0  || menus.getVidaPoke3()  > 0 &&  menus.getVidaPoke4() > 0 ); , funciona pero con error.
				  
					menus.contador1(); 

				break; 
					//Historial
				case 3: 
					menus.historialPartida(); 
					break; 
					//pokemons más y menos utilizados
				case 4: 
					
					System.out.println("veces usadas de Pikachu en batalla : " + pokemons.getCountPika()); 
					System.out.println("cantidad de veces que se eligio Pikachu: " + menus.getCountPika()); 
					System.out.println("veces usadas de Greninja en batalla : " + pokemons.getCountGreninja()); 
					System.out.println("cantidad de veces que se eligio Greninja: " + menus.getCountGrenin()); 	
					System.out.println("veces usadas de Lucario en batalla : " + pokemons.getCountLucario()); 
					System.out.println("cantidad de veces que se eligio Lucario: " + menus.getCountLuca()); 	
					System.out.println("veces usadas de Gengar en batalla : " + pokemons.getCountGengar()); 
					System.out.println("cantidad de veces que se eligio Gengar: " + menus.getCountGenga()); 	
					System.out.println("veces de Blastoise en batalla : " + pokemons.getCountBlastoise());
					System.out.println("cantidad de veces que se eligio Blastoise: " + menus.getCountBlas()); 	
					System.out.println("veces usadas de Pidgey en batalla : " + pokemons.getCountPidgey()); 
					System.out.println("cantidad de veces que se eligio Pidgey: " + menus.getCountPid()); 

					break; 
					//salir 
				case 5: 
					fin = true; 
					menus.despedida(); 
					break; 
				default: 
				menus.errorUsuario(); 	

			}
		} while (fin != true); 
	}
}