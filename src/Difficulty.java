public enum Difficulty {
    EASY(10),
    MEDIUM(5),
    HARD(3);

    private final int chances;

    Difficulty(int chances) {
        this.chances = chances;
    }

    public int getChances() {
        return chances;
    }
}