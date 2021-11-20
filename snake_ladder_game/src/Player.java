class Player {
    String name = "";
    int PlayerNo = 0;

    public Player(String name, int playerNo) {
        this.name = name;
        PlayerNo = playerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNo() {
        return PlayerNo;
    }

    public void setPlayerNo(int playerNo) {
        PlayerNo = playerNo;
    }
}