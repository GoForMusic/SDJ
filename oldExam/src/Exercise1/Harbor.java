package Exercise1;

import java.util.Objects;

public class Harbor {
    private String name;
    private String town;

    public Harbor(String name, String town)
    {
        this.name=name;
        this.town=town;
    }

    public String getName() {
        return name;
    }

    public String getTown(){
        return town;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Harbor harbor = (Harbor) o;
        return Objects.equals(name, harbor.name) && Objects.equals(town, harbor.town);
    }
}
