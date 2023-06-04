
public class Tree {
    // Field declaration
    int numberOfLeaves;
    int feetTall;
    int age;
    String type;
    int id;

    public Tree(int feet, int leaves, int years, String breed, int mainId) {
        this.numberOfLeaves = leaves;
        this.feetTall = feet;
        this.age = years;
        this.type = breed;
        this.id = mainId;
    }

    public void grow() {
        this.feetTall += 5;
        this.numberOfLeaves += 10000;
    }

    public void growSlow() {
        this.feetTall += 2;
        this.numberOfLeaves += 4000;
    }

    public void loseAllLeaves() {
        this.numberOfLeaves = 0;
        this.age += 1;
    }
}
