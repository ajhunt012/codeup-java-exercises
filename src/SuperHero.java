class SuperHero extends Person {
    private String alterEgo;
    public SuperHero(String name, String alterEgo) {
        super(name);
        //this.name = name;
        this.alterEgo = alterEgo;
    }
    public String getName() {
        return alterEgo;
    }
    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");
        SuperHero theDarkKnight = new SuperHero("Bruce Wayne", "Batman");
        //Person clark = new Person("");

        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"
        System.out.println(theDarkKnight.getName()); // "Superman"
        System.out.println(theDarkKnight.getSecretIdentity()); // "Clark Kent"
    }
}