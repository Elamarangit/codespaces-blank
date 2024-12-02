
class PlayerStat {

    private String playerName;
    private String position;
    private String age;
    private String rebound;
    private String points;
    private String assists;
    private String fieldGoalPercentage;
    private String threePointPercentage;
    private String steals;
    private String blocks;
    private String turnovers;
    

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return Integer.parseInt(age);
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getRebound() {
        return Double.parseDouble(rebound);
    }

    public void setRebound(String rebound) {
        this.rebound = rebound;
    }

    public double  getPoints() {
        return Double.parseDouble(points);
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public double getAssists() {
        return Double.parseDouble(assists);
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public double getFieldGoalPercentage() {
        return Double.parseDouble(fieldGoalPercentage);
    }

    public void setFieldGoalPercentage(String fieldGoalPercentage) {
        this.fieldGoalPercentage = fieldGoalPercentage;
    }

    public double getThreePointPercentage() {
        return Double.parseDouble(threePointPercentage);
    }

    public void setThreePointPercentage(String threePointPercentage) {
        this.threePointPercentage = threePointPercentage;
    }

    public double getSteals() {
        return Double.parseDouble(steals);
    }

    public void setSteals(String steals) {
        this.steals = steals;
    }

    public double getBlocks() {
        return Double.parseDouble(blocks);
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    public double getTurnovers() {
        return Double.parseDouble(turnovers);
    }

    public void setTurnovers(String turnovers) {
        this.turnovers = turnovers;
    }


}
