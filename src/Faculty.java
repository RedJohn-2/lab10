import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Institute> institutes;

    public Faculty(String name) {
        this.name = name;
        institutes = new ArrayList<>();
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public void setInstitutes(List<Institute> institutes) {
        this.institutes = institutes;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", institutes=" + institutes +
                '}';
    }
}
