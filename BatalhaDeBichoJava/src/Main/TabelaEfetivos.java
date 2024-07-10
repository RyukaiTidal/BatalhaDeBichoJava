package Main;

public class TabelaEfetivos {
	
	public double Tabela(String ataque, String defesa){
		String tipo = ataque;
		switch (tipo) {
		case "Normal":
			
			if (defesa == "Rock")
				return 0.5;
			else if (defesa == "Ghost")
				return 0;
			else
				return 1;
			
		case "Fight": 
			
			if (defesa == "Normal" || defesa == "Ice")
				return 2;
			else if (defesa == "Flying" || defesa == "Poison" 
					|| defesa == "Bug" || defesa == "Psychic")
				return 0.5;
			else if (defesa == "Ghost")
				return 0;
			else
				return 1;
			
		case "Flying":
			
			if (defesa == "Fight" || defesa == "Bug"|| defesa == "Grass")
				return 2;
			else if (defesa == "Rock" || defesa == "Eletric")
				return 0.5;
			else
				return 1;
			
		case "Poison":
			
			if (defesa == "Bug" || defesa == "Grass")
				return 2;
			else if (defesa == "Poison" || defesa == "Ground" || defesa == "Rock"
					||defesa == "Ghost")
				return 0.5;
			else
				return 1;
		
		case "Ground":
			if (defesa == "Poison" || defesa == "Rock" 
				|| defesa == "Fire" || defesa == "Eletric")
				return 2;
			else if (defesa == "Bug" || defesa == "Grass")
				return 0.5;
			else if (defesa == "Flying")
				return 0;
		
		case "Rock":
			if (defesa == "Flying" || defesa == "Bug"|| defesa == "Fire" || defesa == "Ice")
				return 2;
			else if (defesa == "Fight" || defesa == "Ground")
				return 0;
			else
				return 1;
			
		case "Bug":
			if(defesa == "Poison" || defesa == "Grass" || defesa == "Psychic")
				return 2;
			else if (defesa == "Fight" || defesa == "Flying" || defesa == "Ghost" || defesa == "Fire")
				return 0.5;
			else
				return 1;
		case "Ghost":
			if (defesa == "Ghost")
				return 0;
			else if(defesa == "Normal" || defesa == "Psychic")
				return 0;
			else
				return 1;
		case "Fire":
			if(defesa == "Bug" || defesa == "Grass" || defesa == "Ice")
				return 2;
			else if (defesa == "Rock" || defesa == "Fire" || defesa == "Water" || defesa == "Dragon")
				return 0.5;
			else
				return 1;
		case "Water":
			if(defesa == "Ground" || defesa == "Rock" || defesa == "Fire")
				return 2;
			else if(defesa == "Water" || defesa == "Grass" || defesa == "Dragon")
				return 0.5;
			else
				return 1;
		case "Grass":
			if(defesa == "Ground" || defesa == "Rock" || defesa == "Water")
				return 2;
			else if (defesa == "Flying" || defesa == "Poison" || defesa == "Bug" || defesa == "Fire" || defesa == "Grass" || defesa == "Dragon")
				return 0.5;
			else
				return 1;
		case "Eletric":
			if(defesa == "Flying" ||defesa == "Water")
				return 2;
			else if(defesa == "Grass" || defesa == "Eletric" || defesa == "Dragon")
				return 0.5;
			else if(defesa == "Ground")
				return 0;
			else
				return 1;
		case "Psychic":
			if(defesa == "Fight" || defesa == "Poison")
				return 2;
			else if (defesa == "Psychic")
				return 0.5;
			else
				return 1;
		case "Ice":
			if(defesa == "Flying" || defesa == "Ground" || defesa == "Grass" || defesa == "Dragon")
				return 2;
			else if (defesa == "Water" || defesa == "Ice")
				return 0.5;
			else
				return 1;
		case "Dragon":
			if(defesa == "Dragon")
				return 2;
			else
				return 1;
		}
	}
}
