package musicband;

/**
 * Лейбл
 */
public class Label {
    private String name;

    /**
     * @return Название лейбла
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Название лейбла
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Label label = (Label) o;
        return this.getName().equals(label.getName());
    }

}
