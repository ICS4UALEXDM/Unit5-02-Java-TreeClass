class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree(2, 600, 1, "Spruce", 1);
        System.out.println(output(tree1));
        System.out.println("Grow.");
        tree1.grow();
        System.out.println(output(tree1));
        System.out.println("Grow Slowly.");
        tree1.growSlow();
        System.out.println(output(tree1));
        System.out.println("Lose All leaves.");
        tree1.loseAllLeaves();
        System.out.println(output(tree1));
    }

    public static String output(Tree tree) {
        return "Tree: " + tree.id + " | Height: " + tree.feetTall + "ft | age: "
            + tree.age + " | Leaves: " + tree.numberOfLeaves + " | Breed: "
            + tree.type;
    }
}