class Player {
    String PlayerName = "";

    char PlayerSymbol = '0';

    int PlayerPosition = 1;

    public Player(String playerName, char playerSymbol) {
        PlayerName = playerName;
        PlayerSymbol = playerSymbol;
    }

    public int getPlayerPosition() {
        return PlayerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        PlayerPosition = playerPosition;
    }



    public char getPlayerSymbol() {
        return PlayerSymbol;
    }

    public void setPlayerSymbol(char playerSymbol) {
        PlayerSymbol = playerSymbol;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

}