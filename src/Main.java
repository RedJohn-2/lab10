public class Main {

    public static void main(String[] args) {
        University university = new University("ВГУ");
        Faculty faculty = new Faculty("ФКН");
        Institute institute = new Institute("ИСиТ", "Университетская площадь, 1");
        Employee dean = new Dean(1, "Крыловецкий А.А.", "aakryl@sc.vsu.ru");
        Employee researchAssociate = new ResearchAssociate(4, "Петров А. В.", "petro@yandex.ru");
        Employee personal = new AdministrativePersonal(2, "Корчагин Д.П.", "SNiperNewMEta@yandex.ru");

        university.addFaculty(faculty);
        faculty.addInstitute(institute);
        university.addEmployee(dean);
        university.addEmployee(researchAssociate);
        university.addEmployee(personal);

        System.out.println(university);
        System.out.println(faculty);
        System.out.println(institute);
        System.out.println(dean);
        System.out.println(researchAssociate);
        System.out.println(personal);

        for (Employee e: university.getEmployees()) {
            e.work();
        }
    }
}
