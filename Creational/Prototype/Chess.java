public class Chess implements Prototype {

    private String name;
    private int grid;
    private String[] colors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Chess() {
    }

    public Chess(Chess c) {
        this.colors = c.colors;
        this.grid = c.grid;
        this.name = c.name;
    }

    public Chess(String name, int grid, String[] colors) {
        this.name = name;
        this.grid = grid;
        this.colors = colors;
    }

    public Chess getClone() {
        return new Chess(this);
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grid: " + grid);
        System.out.println("Colors: ");
        for (String color : colors) {
            System.out.println("- " + color);
        }
    }

}
