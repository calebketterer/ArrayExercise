import java.util.Random;

public class PieceSelector {

    public static String Data(int faction, int type){

        String FactionName;
        String[][] piece = new String[5][5];

        if(faction==-1||type==-1){
            Random rand = new Random();
            faction = rand.nextInt(5);
            type = rand.nextInt(5);
        }

        FactionName = switch (faction) {
            case 0 -> "Traditional Chess";
            case 1 -> "Melee Combat";
            case 2 -> "Dark Sorcery";
            case 3 -> "Conspiracy";
            case 4 -> "Pacifist";
            default -> "Error";
        };

        // Traditional Pieces
        piece[0][0] = "King and Queen";
        piece[0][1] = "Rook";
        piece[0][2] = "Knight";
        piece[0][3] = "Bishop";
        piece[0][4] = "Pawn";

        // Melee Combat
        piece[1][0] = "Warlord";
        piece[1][1] = "Barracks";
        piece[1][2] = "Heavy Cavalry";
        piece[1][3] = "Berserker";
        piece[1][4] = "Infantry";

        // Dark Sorcery
        piece[2][0] = "Abomination";
        piece[2][1] = "Haunted Manor";
        piece[2][2] = "Phantom Rider";
        piece[2][3] = "Conjurer";
        piece[2][4] = "Spectre";

        // Conspiracy
        piece[3][0] = "Usurper";
        piece[3][1] = "Torture Chamber";
        piece[3][2] = "Emissary";
        piece[3][3] = "Informant";
        piece[3][4] = "Scout";

        // Pacifism
        piece[4][0] = "Peacekeeper";
        piece[4][1] = "Citadel";
        piece[4][2] = "Courier";
        piece[4][3] = "Squire";
        piece[4][4] = "Agent";

        return "The " + piece[faction][type] + " pieces belong to the " + FactionName + " faction.";
    }
}