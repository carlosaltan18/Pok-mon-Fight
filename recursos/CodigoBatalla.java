package recursos; 
import recursos.*; 
import java.util.Scanner; 
public class CodigoBatalla{
		protected int opci;
		Scanner leer = new Scanner(System.in); 
		Extras menus = new Extras();
		Pokemon pokemons = new Pokemon();

		public void inicioBatalla() {
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
		}
		public void pokemo1Ataca(){
			System.out.println("Atacando al pokemon	1 de " + menus.getPlayer2()); 
			pokemons.mostrarPokemon(menus.getPokemon1P1());
			menus.datosPoke1();
			System.out.println("ahora la vida del pokemon 1 de "+  menus.getPlayer2() + " es: "+ (menus.getVidaPoke3() - menus.getPoderPoke1())); 
			menus.vidaPoke3MenosPoke1();
		}

}