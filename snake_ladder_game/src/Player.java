class Player {
    String PlayerName = "";

    char PlayerSymbol = '0';

    int PlayerPosition = 1;
    int PLayerX = 0;
    int PlayerY = 0;

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

    public int getPLayerX() {
        return PLayerX;
    }

    public void setPLayerX(int PLayerX) {
        this.PLayerX = PLayerX;
    }

    public int getPlayerY() {
        return PlayerY;
    }

    public void setPlayerY(int playerY) {
        PlayerY = playerY;
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