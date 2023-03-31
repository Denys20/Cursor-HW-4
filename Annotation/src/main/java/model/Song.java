package model;

public class Song {
    private String name;

    private String performer;

    public Song(String name, String performer) {
        this.name = name;
        this.performer = performer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    @Override
    public String toString() {
        return "Пісня: " + "Назва = '" + name + '\'' + "; Виконавець = '" + performer + '\'';
    }
}
