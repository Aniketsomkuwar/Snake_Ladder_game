class Player {
    String PlayerName = "";



    int PlayerPosition = 1;

    public Player(String playerName) {
        PlayerName = playerName;

    }

    public int getPlayerPosition() {
        return PlayerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        PlayerPosition = playerPosition;
    }


    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

}